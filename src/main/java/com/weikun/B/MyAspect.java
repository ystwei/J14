package com.weikun.B;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2016/12/7.
 */
@Aspect
public class MyAspect {

//    @Before("execution(* com.weikun.B.*.*(..))")
//    public void mark(){
//        System.out.println("Before");
//    }
//
//    @After("execution(* com.weikun.B.*.*(..))")
//    public void park(){
//        System.out.println("After");
//    }


//    @AfterReturning(value = "execution(* com.weikun.B.*.*(..))",returning = "rvt")
//    public void result(Object rvt){
//        System.out.println("Returning:"+rvt);
//    }

    @Around("execution(* com.weikun.B.*.*(..))")
    public void arround(ProceedingJoinPoint jp){
        System.out.println("arround:before:");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("arround:after:");
    }
    @AfterThrowing(pointcut="execution(* com.weikun.B.*.*(..))"
            , throwing="ex")
    public void error(Throwable ex){
        System.out.println("目标方法中抛出的异常:" + ex);
    }


}
