package per.wsk.study04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 3:52 下午
 * @description
 */
@Component
@Aspect
public class BookProxy {

    @Before(value = "execution(* per.wsk.study04.Book.buy(..))")
    public void beforeMethod(){
        System.out.println("beforeMethod...");
    }

    @After(value = "execution(* per.wsk.study04.Book.buy(..))")
    public void afterMethod(){
        System.out.println("afterMethod...");
    }
}
