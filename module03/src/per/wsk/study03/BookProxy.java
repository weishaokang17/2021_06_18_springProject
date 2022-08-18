package per.wsk.study03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 3:52 下午
 * @description
 */

public class BookProxy {


    public void beforeMethod(){
        System.out.println("beforeMethod...");
    }

    public void afterMethod(){
        System.out.println("afterMethod...");
    }
}
