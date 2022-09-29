package com.centit.www;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectXml {


   /* @Pointcut("@annotation(Action)")
    public void pointcut(){

    }*/



  /*  @Pointcut("execution(* com.centit.www.service.*.*(..))")
    public void pointcut(){

    }*/
    /**
     * 前置通知，在目标方法之前执行
     * @param joinPoint
     */
   // @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法开始执行了。。。。。");
    }

    /**
     * 后置通知，在目标方法之前执行
     * @param joinPoint
     */
   // @After(value = "pointcut()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法执行结束了。。。。。");
    }


    /**
     * 返回通知，在目标方法之前执行
     * @param joinPoint
     */
    //@AfterReturning(value = "pointcut()",returning = "r")
    public void afterReturn(JoinPoint joinPoint,Integer r){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法返回通知。。。。。"+r);
    }


    /**
     * 异常通知，在目标方法之前执行
     * @param joinPoint
     */
    //@AfterThrowing(value = "pointcut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"异常通知。。。。。"+e.getMessage());

    }

    //@Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object proceed = pjp.proceed();
        return proceed;
    }
}
