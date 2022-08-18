package per.wsk.study03.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study03.bean.Dog;
import per.wsk.study03.bean.Orders;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 4:03 下午
 * @description
 */
public class BeanTest2 {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Orders orders = context.getBean("orders", Orders.class);

        System.out.println("orders对象可以使用了");
        System.out.println(orders);

        ((ClassPathXmlApplicationContext) context).close();
    }




}
