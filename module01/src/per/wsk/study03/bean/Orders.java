package per.wsk.study03.bean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 4:03 下午
 * @description
 */
public class Orders {

    private String oname;
    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调用 set 方法设置属性值");
    }



    //无参数构造
    public Orders() {
        System.out.println("第一步 执行无参数构造创建 bean 实例");
    }

    //创建执行的初始化的方法
    public void initOrdersMethod() {
        System.out.println("第三步 执行初始化的方法");
    }
    //创建执行的销毁的方法
    public void destroyOrdersMethod() {
        System.out.println("第五步 执行销毁的方法");
    }

}
