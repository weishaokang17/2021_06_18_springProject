package per.wsk.study04;

import org.springframework.stereotype.Component;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 3:47 下午
 * @description
 */
@Component
public class Book {

    @Avoid
    public void buy(){
        System.out.println("buy方法被执行");
    }

}
