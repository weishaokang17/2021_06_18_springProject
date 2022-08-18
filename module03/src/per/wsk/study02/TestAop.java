package per.wsk.study02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 2:52 下午
 * @description
 */
public class TestAop {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
