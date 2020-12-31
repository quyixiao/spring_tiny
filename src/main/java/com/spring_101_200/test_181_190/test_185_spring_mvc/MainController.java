package com.spring_101_200.test_181_190.test_185_spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping(value = {"/test"})
public class MainController {

    @RequestMapping(value = {"/main"}, method = {RequestMethod.GET})
    public ModelAndView GetMain(
            HttpServletRequest request, HttpSession session) {

        ModelAndView modelAndView = new ModelAndView();

        //对FlashMap中的参数进行提取，有两种方法
        //第一种，使用RequestContextUtils（请求工具包），因为在重定向后FlashMap会把表单中的属性
        //放在重定向新的请求中，所以可以获得请求中的FlashMap
        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
        //把FlashMap直接放入模型，传给前端控制器
        modelAndView.addAllObjects(map);
        //视图名传入
        modelAndView.setViewName("test/main");
        System.out.println("==========================get ");

        return modelAndView;

    }

    //第二种：使用@ModelAttribute注解
    //因为FlashMap是处理这个url的初始化数据模型，所以可以通过这个注解拿到FlashMap的属性
    @RequestMapping(value = {"/main"}, method = {RequestMethod.POST})
    public String PostMain(@ModelAttribute(value = "userName") String userName,
                           @ModelAttribute(value = "password") String password) {
        System.out.println("userName:" + userName + ",password:" + password);
        return "test/main";
    }
}