package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.wsk.study01.Book;
import per.wsk.study01.Orders;
import per.wsk.study01.User;

/**
 * @Author wb_weishaokang
 * @date 2021/6/18 6:04 下午
 * @description
 */
public class TestSpring5 {


    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        User user = context.getBean("beanUser", User.class);

        System.out.println(user);
        user.add();

    }


    @Test
    public void testBook(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Book book = context.getBean("beanBook", Book.class);

        System.out.println(book);
        book.testBook();

    }


    @Test
    public void testOrder(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Orders order = context.getBean("beanOrder", Orders.class);

        System.out.println(order);

        order.testOrder();

    }


    @Test
    public void testBook2(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Book book = context.getBean("beanBook02", Book.class);

        System.out.println(book);

        book.testBook();

    }



}
