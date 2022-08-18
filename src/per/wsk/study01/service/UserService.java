package per.wsk.study01.service;

import per.wsk.study01.dao.UserDao;

/**
 * @Author wb_weishaokang
 * @date 2021/6/20 9:19 下午
 * @description
 */
public class UserService {

    //创建 UserDao 类型属性，生成 set 方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add() {
        System.out.println("service add...............");
        userDao.update();
    }




}
