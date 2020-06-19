package com.test2.cn21;

import com.LogUtils;
import org.springframework.stereotype.Component;


@Component
public class TestController {


    public void test() {
        LogUtils.info("test test test ");
    }
}
