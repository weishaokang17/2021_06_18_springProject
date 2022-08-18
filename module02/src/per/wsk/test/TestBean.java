package per.wsk.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.wsk.dao.CartDao;
import per.wsk.service.UserService;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 7:25 下午
 * @description
 */
public class TestBean {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService bean = context.getBean("userService", UserService.class);

        System.out.println(bean);
        bean.add();
    }

    /**
     * @Comp
     */
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        CartDao bean = context.getBean("cartDao", CartDao.class);

        System.out.println(bean);
        bean.add();
    }

}
