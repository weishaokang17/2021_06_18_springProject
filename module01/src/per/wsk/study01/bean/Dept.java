package per.wsk.study01.bean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/21 9:48 上午
 * @description
 */
public class Dept {

    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
