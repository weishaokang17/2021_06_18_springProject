package per.wsk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import per.wsk.dao.CartDao;
import per.wsk.dao.UserDao;

import javax.annotation.Resource;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 7:20 下午
 * @description
 */


/**
 用这四个注解都可以，但一般按照规范，@Service用于service层，@Repository用于持久层
 （1）@Component
 （2）@Service
 （3）@Controller
 （4）@Repository


 //在注解里面 value 属性值可以省略不写，
 //默认值是类名称，首字母小写
 //UserService -- userService
 */

@Service(value = "userService")   //  等同于 <bean id="userService" class=".."/>
public class UserService {


    //定义 dao 类型属性
    //不需要添加 set 方法
    //添加注入属性注解

    /*
    @Autowired等同于下面的autowire=byType
    <bean id="emp02" class="per.wsk.study04.bean.Emp" autowire="byType">
         <property name="dept" ref="dept"></property>
    </bean>
    如果UserService中的userDao这个属性，属性所属类型UserDao有多个实现类，且多个实现类上
    都有@Repository这种注解，此时相当于bean容器中有两个UserDao类型的bean，用autowire=byType会报异常
    */

    /**
     * @Qualifier是根据名称注入，大概等同于autowire="byName"，但依然不能省掉@Autowired注解，
     * @Autowired是根据类型找，根据两个实现类的注解，找到下面两个实现类，@Qualifier再在两个实现类里面根据名称找一个。
     */
    @Autowired
    @Qualifier(value="userDaoImpl")
    private UserDao userDao;

    @Autowired
    private CartDao cartDao;

    /**
     * @Resource既可以根据类型注入，也可以根据名称注入
     * @Resource注解是jdk里面的，不是spring里面的
     * @Resource注解，后面没有name属性时，就是根据类型注入，如果后面有name属性，就是同时根据类型和名称注入
     */
    @Resource
    private CartDao cartDao2;

    @Resource(name="userDaoImpl")
    private UserDao userDao2;

    /**
     * @Value：注入普通类型属性
     */
    @Value(value="47")
    private int num;
    @Value(value = "abc")
    private String name;

    public void add() {
        System.out.println("service add.......");
        userDao.add();
        cartDao.add();

        cartDao2.add();
        userDao2.add();

        System.out.println(num);
        System.out.println(name);
    }

}
