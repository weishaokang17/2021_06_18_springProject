package per.wsk2.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import per.wsk2.config.SpringConfig;
import per.wsk2.service.Service;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 3:36 下午
 * @description
 */
public class BeanTest {

    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Service serviceBean = context.getBean("serviceBean", Service.class);

        serviceBean.addMethod();
    }

}
