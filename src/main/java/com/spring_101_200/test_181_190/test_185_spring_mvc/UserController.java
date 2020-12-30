package com.spring_101_200.test_181_190.test_185_spring_mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//处理登录请求的后端控制器

//注意：@RequestParam注解中的required注解对表单提交中的属性是没有用的，就算不填它也会默认为空字符串，它只对GET请求中
//在url后加的key-value的属性有限制作用

@Controller
@RequestMapping(value = {"/test"})
public class UserController {




    //如果是GET方法请求的话，就直接给用户返回登录的页面，此页面表单请求的方法为POST
    @RequestMapping(value = {"/login"},method = {RequestMethod.GET})
    public ModelAndView LoginGet(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }



    private static final String CURRENT_USER = "Now_user";
    // http://localhost:8080/test/login.htm?userName=zhangsan&password=lizi
    @RequestMapping(value = {"login"},method = {RequestMethod.POST})
    //让请求的url后面必须跟上一个叫做userName的属性，是用户的用户名
    public ModelAndView LoginPost(@RequestParam(value = "userName") String userName,
                                  //请求的url后必须跟上password属性，为用户当前的密码
                                  @RequestParam(value = "password") String password,
                                  //Spring MVC框架集成了Servlet请求响应等一系列参数，可以在有需要的时候使用
                                  HttpServletRequest request, HttpServletResponse response,
                                  HttpSession session, RedirectAttributes redirectAttributes) {

        //这里是和后端交互的代码，如果是用户登录的话就在数据库中查找对应的用户信息
        if (userName.isEmpty() || password.isEmpty()) {
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("error", "用户名或密码为空");
            modelAndView.setViewName("index");
            return modelAndView;
        }


        //到了这里就说明用户登录成功了
        System.out.println("===========================：" + userName + "密码是：" + password);
        //使用session进行会话跟踪
        session.setAttribute(CURRENT_USER, userName);

        //创建模型与视图类，返回给前端控制器
        ModelAndView modelAndView = new ModelAndView();

        //重定向的时候，因为是客户端重新的请求，所以参数是不会被传到重定向页面的

        //所以使用此方法，可以把属性放到一个叫做FlashMap的Map中
        redirectAttributes.addFlashAttribute("userName", userName);
        redirectAttributes.addFlashAttribute("password", password);


        redirectAttributes.addAttribute("uname", userName);
        redirectAttributes.addAttribute("pwd", password);

        //使用重定向的时候不能写jsp的名字，要写url映射的路径
        modelAndView.setViewName("redirect:/test/main");
        return modelAndView;
    }

}
