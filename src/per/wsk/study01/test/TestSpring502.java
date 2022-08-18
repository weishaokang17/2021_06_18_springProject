package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.wsk.study01.service.UserService;

/**
 * @Author wb_weishaokang
 * @date 2021/6/20 11:02 下午
 * @description
 */
public class TestSpring502 {

    @Test
    public void testService(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);

        userService.add();

    }
}
