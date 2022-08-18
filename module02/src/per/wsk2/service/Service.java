package per.wsk2.service;

import org.springframework.beans.factory.annotation.Autowired;
import per.wsk2.dao.OrderDao;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 3:30 下午
 * @description
 */
@org.springframework.stereotype.Service(value = "serviceBean")
public class Service {

    @Autowired
    private OrderDao orderDao;


    public void addMethod(){
        System.out.println("Service的addMethod方法，orderDao对象" + orderDao);
    }
}
