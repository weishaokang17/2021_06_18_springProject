package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study01.service.UserService;

/**
 * @Author wb_weishaokang
 * @date 2021/6/25 9:09 下午
 * @description
 */
public class TestTranscation {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }



}
