package per.wsk.study02;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 3:21 下午
 * @description
 */
@Component
@Aspect
@Order(10)
public class PersonProxy {

    @Before(value = "execution(* per.wsk.study02.User.add(..))")
    public void beforeMethod() {
        System.out.println(" PersonProxy  before......");
    }

}
