package per.wsk.study02.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 2:32 下午
 * @description
 *
 *
 * Spring 有两种类型 bean，一种普通 bean，另外一种工厂 bean（FactoryBean）
 * 下面的Mybean这个类，不实现FactoryBean接口，就是普通bean，实现FactoryBean接口就是工厂 bean
 */
//public class Mybean {
public class Mybean implements FactoryBean<Course> {


    //定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

}
