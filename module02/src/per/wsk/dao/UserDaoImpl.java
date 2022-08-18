package per.wsk.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 9:42 上午
 * @description
 */
@Repository(value="userDaoImpl")//默认就是userDaoImpl
public class UserDaoImpl implements UserDao{


    @Override
    public void add() {
        System.out.println("UserDao add ....");
    }
}
