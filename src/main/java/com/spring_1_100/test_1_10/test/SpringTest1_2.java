package com.spring_1_100.test_1_10.test;

import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SpringTest1_2 {


    private static final Map<String, String> wellKnownSimplePrefixes = new HashMap<String, String>(4);

    static {
        wellKnownSimplePrefixes.put("}", "{");
        wellKnownSimplePrefixes.put("]", "[");
        wellKnownSimplePrefixes.put(")", "(");
    }

    public static String placeholderPrefix = "${";

    public static String placeholderSuffix = "}";

    public static  String simplePrefix = "{";

    public static String valueSeparator = ":";

    public static boolean ignoreUnresolvablePlaceholders  = false;


    public static void main(String[] args) {
        String text = "${${user}}";
       String a =  parseStringValue(text, new PropertyPlaceholderHelper.PlaceholderResolver() {
            @Override
            public String resolvePlaceholder(String placeholderName) {
                if(placeholderName.equals("user")){
                    return "zhansan";
                }else if (placeholderName.equals("{user}")){
                    return "xxx";
                }else if(placeholderName.equals("zhansan")){
                    return "lisi";
                }
                return "";
            }
        },new HashSet<String>());
        System.out.println(a);
    }


    public static String parseStringValue(String strVal, PropertyPlaceholderHelper.PlaceholderResolver placeholderResolver, Set<String> visitedPlaceholders) {
        StringBuilder result = new StringBuilder(strVal);
        int startIndex = strVal.indexOf(placeholderPrefix);
        while (startIndex != -1) {
            // 查找和当前前缀的相匹配的后缀index
            int endIndex = findPlaceholderEndIndex(result, startIndex);
            if (endIndex != -1) {
                String placeholder = result.substring(startIndex + placeholderPrefix.length(), endIndex);
                String originalPlaceholder = placeholder;
                if (!visitedPlaceholders.add(originalPlaceholder)) {
                    throw new IllegalArgumentException(
                            "Circular placeholder reference '" + originalPlaceholder + "' in property definitions");
                }
                // Recursive invocation, parsing placeholders contained in the placeholder key.
                placeholder = parseStringValue(placeholder, placeholderResolver, visitedPlaceholders);
                // Now obtain the value for the fully resolved key...
                String propVal = placeholderResolver.resolvePlaceholder(placeholder);
                if (propVal == null && valueSeparator != null) {
                    int separatorIndex = placeholder.indexOf(valueSeparator);
                    if (separatorIndex != -1) {
                        String actualPlaceholder = placeholder.substring(0, separatorIndex);
                        String defaultValue = placeholder.substring(separatorIndex + valueSeparator.length());
                        propVal = placeholderResolver.resolvePlaceholder(actualPlaceholder);
                        if (propVal == null) {
                            propVal = defaultValue;
                        }
                    }
                }
                if (propVal != null) {
                    propVal = parseStringValue(propVal, placeholderResolver, visitedPlaceholders);
                    result.replace(startIndex, endIndex + placeholderSuffix.length(), propVal);
                    startIndex = result.indexOf(placeholderPrefix, startIndex + propVal.length());
                }
                else if (ignoreUnresolvablePlaceholders) {
                    startIndex = result.indexOf(placeholderPrefix, endIndex + placeholderSuffix.length());
                }
                else {
                    throw new IllegalArgumentException("Could not resolve placeholder '" +
                            placeholder + "'" + " in string value \"" + strVal + "\"");
                }
                visitedPlaceholders.remove(originalPlaceholder);
            }
            else {
                startIndex = -1;
            }
        }
        return result.toString();
    }


    public static int findPlaceholderEndIndex(CharSequence buf, int startIndex) {
        int index = startIndex + placeholderPrefix.length();
        int withinNestedPlaceholder = 0;
        while (index < buf.length()) {
            if (StringUtils.substringMatch(buf, index, placeholderSuffix)) {
                if (withinNestedPlaceholder > 0) {
                    withinNestedPlaceholder--;
                    index = index + placeholderSuffix.length();
                }
                else {
                    return index;
                }
            }
            else if (StringUtils.substringMatch(buf, index, simplePrefix)) {
                withinNestedPlaceholder++;
                index = index + simplePrefix.length();
            }
            else {
                index++;
            }
        }
        return -1;
    }



}
