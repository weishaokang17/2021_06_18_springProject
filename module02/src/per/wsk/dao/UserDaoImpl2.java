package per.wsk.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 11:45 上午
 * @description
 */
@Repository
public class UserDaoImpl2 implements UserDao{


    @Override
    public void add() {
        System.out.println("UserDaoImpl2 的add 方法");
    }
}
