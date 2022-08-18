package per.wsk.study01.test;

import org.junit.Test;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;
import per.wsk.study01.dao.UserDao;
import per.wsk.study01.dao.impl.UserDaoImpl;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 4:31 下午
 * @description
 */
public class JDKProxy {

    @Test
    public void test01() {
        //创建接口实现类的代理对象

        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        //返回代理对象
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));

        int result = dao.add(1, 2);
        System.out.println(result);
    }

}


//创建代理对象代码
class UserDaoProxy implements InvocationHandler{

    //1 把创建的是谁的代理对象，把谁传递过来

    //有参数构造传递
    private Object obj;
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //方法之前
        System.out.println("方法之前执行...."+method.getName()+" :传递的参数..."+ Arrays.toString(objects));
        //被增强的方法执行
        Object res = method.invoke(obj, objects);
        //方法之后
        System.out.println("方法之后执行...."+obj);
        return res;
    }


}





