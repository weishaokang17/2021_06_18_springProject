package per.wsk.study01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import per.wsk.study01.dao.UserDao;

/**
 * @Author wb_weishaokang
 * @date 2021/6/25 9:08 下午
 * @description
 */
@Service
/*@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ
,timeout = -1,readOnly = false,rollbackFor = {NullPointerException.class,ClassNotFoundException.class},
noRollbackFor = {NoSuchMethodException.class,NumberFormatException.class})*/
//事务隔离级别 可重复读
public class UserService {

    /**
     1、事务添加到 JavaEE 三层结构里面 Service 层（业务逻辑层）
     2、在 Spring 进行事务管理操作
     （1）有两种方式：编程式事务管理和声明式事务管理（使用）
     编程式事务管理，即用手写代码的方式，将事务代码，用try catch，在catch里面回滚整个操作。
     声明式事务管理，通过xml配置或者注解的方式。
     通常都采用声明式，不是编程式。

     声明式事务管理分xml配置和注解两种实现方式，一般都用注解
     */


    //注入 dao
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
