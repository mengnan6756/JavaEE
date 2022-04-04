package HomeWork.HW2022_03_14.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Wei
 * @create 2022/03/12  10:32
 * @Description 该类为切面类，定义了若干个增强方法(也称为通知)
 */

@Aspect
@Component
public class MyAspect {

    //定义切入点
    @Pointcut("execution(* HomeWork.HW2022_03_14.dao.TestDaoImpl.save(..) )")
    public void myPointCut(){

    }

    @Before("myPointCut()")
    public void before(){
        System.out.println("这是一个前置通知！");
    }

//    @AfterReturning("myPointCut()")
//    public void afterRunning(){
//        System.out.println("这是一个后置通知");
//    }
//
//    @After("myPointCut()")
//    public void after(){
//        System.out.println("这是一个最终通知");
//    }
//
//    @Around("myPointCut()")
//    public Object arount(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//
//        System.out.println("环绕前");
//
//        Object proceed = proceedingJoinPoint.proceed();
//
//        System.out.println("环绕后");
//
//        return proceed;
//    }

}
