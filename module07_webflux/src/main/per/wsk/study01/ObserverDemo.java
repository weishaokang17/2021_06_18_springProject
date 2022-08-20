package per.wsk.study01;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author wb_weishaokang
 * @date 2021/7/2 3:15 下午
 * @description
 */
public class ObserverDemo extends Observable {


    public static void main(String[] args) {
        ObserverDemo instance = new ObserverDemo();
        //添加观察者
        instance.addObserver((o,arg) -> {
            System.out.println("发生变化");
        });

        instance.addObserver((o,arg)->{
            System.out.println("手动被观察者通知，准备改变");
        });
        instance.setChanged();//数据变化
        instance.notifyObservers();//通知


    }


}
