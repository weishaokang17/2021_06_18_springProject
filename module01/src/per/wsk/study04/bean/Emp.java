package per.wsk.study04.bean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/22 4:58 下午
 * @description
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println("Emp 对象的test方法");
    }
}
