package per.wsk.study02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import per.wsk.study02.dao.UserDao;

/**
 * @Author wb_weishaokang
 * @date 2021/6/30 6:18 下午
 * @description
 */
@Service
@Transactional
public class UserService {



    @Autowired
    private UserDao userDao;


    //转账的方法
    public void accountMoney() {
        //lucy 少 100
        userDao.reduceMoney();
        int i = 1/0;
        //mary 多 100
        userDao.addMoney();
    }

}
