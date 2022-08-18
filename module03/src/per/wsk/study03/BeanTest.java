package per.wsk.study03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 4:25 下午
 * @description
 */
public class BeanTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
