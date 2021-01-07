package com.spring_101_200.test_181_190.test_185_spring_mvc;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@ControllerAdvice
public class MyControllerAdvice {


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Double.class, new DoubleEditor());
    }



    @ModelAttribute("xxx")
    protected String modelattr() {

        return "bbb";
    }




    @ExceptionHandler(value = Exception.class)
    public void exceptionHandler(Exception e, HttpServletResponse response) throws IOException {
        e.printStackTrace();
        StringBuffer msg = new StringBuffer();
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        System.out.println("=================" + msg.toString());
        out.write(msg.toString());
        out.flush();
        out.close();
    }


}