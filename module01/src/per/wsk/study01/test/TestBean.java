package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study01.bean.Emp;

/**
 * @Author wb_weishaokang
 * @date 2021/6/21 10:13 上午
 * @description
 */
public class TestBean {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);


        Emp beanEmp = context.getBean("beanEmp", Emp.class);
        System.out.println(beanEmp);


        Emp beanEmp2 = context.getBean("beanEmp2", Emp.class);
        System.out.println(beanEmp2);

    }
}
