package per.wsk.study04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//指定该注解在运行时可以获取
@Target(ElementType.METHOD)//该注解执行当前注解可以作用的范围
public @interface Avoid {
}
