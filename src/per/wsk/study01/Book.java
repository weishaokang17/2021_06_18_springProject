package per.wsk.study01;

/**
 * @Author wb_weishaokang
 * @date 2021/6/19 9:26 下午
 * @description
 */
public class Book {

    //创建属性
    private String bname;
    private String bauthor;
    //创建属性对应的 set 方法
    public void setBname(String bname) {
        this.bname = bname;
    }
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }


    public void testBook(){
        System.out.println(bname + " :: " + bauthor);
    }


}
