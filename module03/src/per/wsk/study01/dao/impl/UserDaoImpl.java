package per.wsk.study01.dao.impl;

import per.wsk.study01.dao.UserDao;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 4:28 下午
 * @description
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法被执行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法被执行了");
        return id;
    }
}
