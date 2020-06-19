package com.test2.cn21;

import com.LogUtils;
import org.springframework.stereotype.Component;


@Component
public class Woman implements Person {
    @Override
    public void hair() {
        LogUtils.info("长");
    }
}
