package per.wsk.study03.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.study03.bean.Cat;
import per.wsk.study03.bean.Dog;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 3:25 下午
 * @description
 */
public class BeanTest {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Dog beanDog = context.getBean("beanDog", Dog.class);
        Dog beanDog2 = context.getBean("beanDog", Dog.class);

        System.out.println(beanDog == beanDog2);//默认是单例模式
    }


    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Cat beanCat = context.getBean("beanCat", Cat.class);
        Cat beanCat2 = context.getBean("beanCat", Cat.class);

        System.out.println(beanCat == beanCat2);//
    }




}
