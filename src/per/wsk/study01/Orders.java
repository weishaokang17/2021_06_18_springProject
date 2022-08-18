package per.wsk.study01;

/**
 * @Author wb_weishaokang
 * @date 2021/6/20 3:20 下午
 * @description
 */
public class Orders {


    //属性
    private String oname;
    private String address;
    //有参数构造
    public Orders(String oname,String address) {
        this.oname = oname;
        this.address = address;
    }


    public void testOrder(){
        System.out.println(oname + " :: " + address);
    }

}
