package com.jbit.test;

import com.jbit.printer.Printer;
import com.jbit.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TSpring {
    @Autowired
    private HelloService helloService;

    @Test
    public  void test(){
        helloService.show();
    }
    public static void main(String[] args) {
        /*HelloService helloService = new HelloService();
        helloService.show();*/

        //组件化；单例
        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*HelloService hello = app.getBean("hello", HelloService.class); //
        hello.show();*/

        /*Printer printer = app.getBean("printer", Printer.class);
        printer.print("HelloWord");*/

        //HelloService hello = app.getBean("hello", HelloService.class);
        //hello.show();


    }
}
