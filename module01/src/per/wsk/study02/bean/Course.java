package per.wsk.study02.bean;

/**
 * @Author wb_weishaokang
 * @date 2021/6/21 11:26 上午
 * @description
 */
public class Course {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
