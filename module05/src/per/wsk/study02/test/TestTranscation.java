package per.wsk.study02.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import per.wsk.study02.service.UserService;
import per.wsk.study02.config.txConfig;

/**
 * @Author wb_weishaokang
 * @date 2021/6/30 6:34 下午
 * @description
 */
public class TestTranscation {


    @Test
    public void test01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(txConfig.class);

        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.accountMoney();
    }

}
