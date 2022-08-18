package per.wsk.study02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 2:18 下午
 * @description
 */
//增强的类
@Component
@Aspect //生成代理对象
@Order(4)
public class UserProxy {

    //相同切入点的抽取
    @Pointcut(value = "execution(* per.wsk.study02.User.add(..))")
    public void pointDemo(){

    }



    //@Before 注解表示作为前置通知
    @Before(value = "execution(* per.wsk.study02.User.add(..))") //add方法里面的..表示参数列表
    public void beforeMethod() {
        System.out.println("before......");
    }

    //最终通知 (类似于finally，不论是否被增强的方法有没有异常都会调用)
    @After(value = "pointDemo()")
    public void afterMethod() {
        System.out.println("最终通知......");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "pointDemo()")
    public void afterReturnMethod() {
        System.out.println("后置通知......");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowingMethod() {
        System.out.println("异常通知......");
    }

    //环绕通知
    @Around("execution(* per.wsk.study02.User.add(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕之前.........");

        joinPoint.proceed();//被增强的方法执行

        System.out.println("环绕之后.........");
    }


    /**
     如果被增强方法没异常：

     执行顺序：
     环绕之前.........
     前置通知
     被增强的方法
     后置通知
     最终通知
     环绕之后.........


     如果被增强方法有异常：

     环绕之前.........
     前置通知
     被增强的方法
     异常通知
     最终通知......

     */

}
