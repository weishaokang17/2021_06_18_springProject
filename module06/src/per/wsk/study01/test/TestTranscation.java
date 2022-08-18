package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import per.wsk.study01.bean.User;
import per.wsk.study01.service.UserService;

/**
 * @Author wb_weishaokang
 * @date 2021/6/25 9:09 下午
 * @description
 */
public class TestTranscation {

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void test02(){
        //1. 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2. 调用context的方法注册对象
        context.refresh();
        /*context.registerBean(User.class,() -> new User());
        //3. 获取在spring注册的对象
        User user = (User) context.getBean("per.wsk.study01.bean.User");*/
        context.registerBean("userBean",User.class,() -> new User());
        User user = (User) context.getBean("userBean");
        System.out.println(user);

    }


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();
    }






}
