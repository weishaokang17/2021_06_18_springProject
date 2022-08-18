package per.wsk.study01.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.wsk.study01.service.UserService;

/**
 * @Author wb_weishaokang
 * @date 2021/7/2 9:11 上午
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean1.xml")
public class JTest4 {


    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }





}
