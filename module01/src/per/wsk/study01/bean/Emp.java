package per.wsk.study01.bean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/21 9:48 上午
 * @description
 */
public class Emp {

    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;


    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept.toString() +
                '}';
    }
}
