package per.wsk.study04.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.wsk.study04.bean.Emp;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 5:03 下午
 * @description
 */
public class BeanTest {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);


    }



}
