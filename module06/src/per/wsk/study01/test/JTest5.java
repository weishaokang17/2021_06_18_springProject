package per.wsk.study01.test;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import per.wsk.study01.service.UserService;

@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
