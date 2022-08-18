package per.wsk.study01;

/**
 * @Author wb_weishaokang
 * @date 2021/6/18 5:54 下午
 * @description
 */
public class User {


    private String name;

    public void setName(String name){
        this.name = name;
    }

    public User(String name){
        this.name = name;
    }

    public User(){

    }

    public void add(){
        System.out.println("add方法.......");
    }
}
