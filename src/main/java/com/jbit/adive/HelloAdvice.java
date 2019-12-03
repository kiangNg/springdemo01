package com.jbit.adive;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.concurrent.ExecutionException;

public class HelloAdvice {
    //前置增强
    public void before(){
        System.out.println("前置增强被执行");
    }

    //后置增强
    public void after(){
        System.out.println("后置增强被执行");
    }

    //异常增强
    public void trowing(Exception e){
        System.out.println("异常增强被执行"+e.getMessage());
    }

    //返回增强
    public void returning(Object obj){
        System.out.println("后置返回增强被执行"+obj);
    }
    //环绕增强
    public Object around(ProceedingJoinPoint pro){
        System.out.println("前置增强被执行");
        Object obj = null;
        try{
            obj = pro.proceed(); //调用执行目标方法
            System.out.println("后置返回增强被执行"+obj);
        }catch (Throwable ex){
            ex.printStackTrace();
            System.out.println("异常增强被执行"+ex.getMessage());
        }finally {
            System.out.println("后置增强被执行");
        }
        return obj;
    }
}
