package per.wsk.study04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 4:41 下午
 * @description
 */
public class AopTest {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        Book book = context.getBean("book", Book.class);
        book.buy();
    }

}
