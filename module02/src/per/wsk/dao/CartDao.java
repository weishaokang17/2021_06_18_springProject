package per.wsk.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 11:27 上午
 * @description
 */
//@Repository
//@Service
    @Component
public class CartDao {

    private int num;

    public void add(){
        System.out.println("cartDao 的 add 方法....");
    }

    public CartDao() {
    }

    public CartDao(int num) {
        this.num = num;
    }
}
