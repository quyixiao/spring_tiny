package com.spring_101_200.test_111_120.test_115_custom_label;

import com.utils.StringUtils;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.w3c.dom.Element;

public class UserBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {


    // 从 Elment 中找到相应的类
    protected Class getBeanClass(Element element){
        return User.class;
    }

    // 从 element 中解析并提取出对应的元素
    protected  void doParse(Element element, BeanDefinitionBuilder bean){
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        //将提取的数据放到 BeanDefinitionBuilder 中，待完成所有的 bean 注册后，统一注册到 beanFactory 中
        if(StringUtils.isNotBlank(userName)){
            bean.addPropertyValue("userName",userName);
        }
        if(StringUtils.isNotBlank(email)){
            bean.addPropertyValue("email",email);
        }
    }

}
