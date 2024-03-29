package com.t2022.t01.t15.t1712;

public class KMPTest {


    public  static  int ViolentMatch(char s[], char p[]) {
        int sLen = s.length;
        int pLen = p.length;
        int i = 0;
        int j = 0;
        while (i < sLen && j < pLen) {
            if (s[i] == p[j]) {
                //①如果当前字符匹配成功（即S[i] == P[j]），则i++，j++
                i++;
                j++;
            } else {
                //②如果失配（即S[i]! = P[j]），令i = i - (j - 1)，j = 0
                i = i - j + 1;
                j = 0;
            }
        }
        //匹配成功，返回模式串p在文本串s中的位置，否则返回-1
        if (j == pLen)
            return i - j;
        else
            return -1;

    }


    public static void main(String[] args) {
        String a = "BBC ABCDAB ABCDABCDABDE";
        String b  = "ABCDABD";
        System.out.println(ViolentMatch(a.toCharArray(),b.toCharArray()));

    }


}
