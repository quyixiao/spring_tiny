package com.spring_1_100.test_51_60.test59;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.*;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

public class ObscenityRemovingBeanFactoryPostProcessor  implements BeanFactoryPostProcessor {

    private Set<String> obscenties;


    public ObscenityRemovingBeanFactoryPostProcessor() {
        this.obscenties = new HashSet<String>();
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String [] beanNames = beanFactory.getBeanDefinitionNames();
        for(String beanName:beanNames){
            BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
            StringValueResolver valueResolver = new StringValueResolver() {
                @Override
                public String resolveStringValue(String strVal) {
                    if(isObscene(strVal)){
                        return "*****";
                    }
                    return strVal;
                }
            };
            BeanDefinitionVisitor visitor = new BeanDefinitionVisitor(valueResolver);
            visitor.visitBeanDefinition(bd);
        }
    }

    public boolean isObscene(Object value){
        String potentialObscenity = value.toString().toUpperCase();
        return this.obscenties.contains(potentialObscenity);
    }

    public void setObscenties(Set<String> obscenties){
        this.obscenties.clear();
        for(String ob:obscenties){
            this.obscenties.add(ob.toUpperCase());
        }
    }
}
