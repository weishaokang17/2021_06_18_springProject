package per.wsk.study02.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study02.bean.Course;
import per.wsk.study02.bean.Mybean;
import per.wsk.study02.bean.Student;

/**
 * @Author wb_weishaokang
 * @date 2021/6/21 11:15 上午
 * @description
 */
public class BeanTest {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student01 = context.getBean("student01", Student.class);

        System.out.println(student01);


    }



    @Test
    public void test02(){
        //下面注释的这段代码，Mybean没有实现FactoryBean接口
        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Mybean mybean = context.getBean("mybean", Mybean.class);
        System.out.println(mybean);
        */

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Course mybean = context.getBean("mybean", Course.class);
        System.out.println(mybean);
    }


}
