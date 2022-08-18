package per.wsk2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wb_weishaokang
 * @date 2021/6/23 3:34 下午
 * @description
 */
@Configuration //作为配置类，替代 xml 配置文件
@ComponentScan(basePackages = {"per.wsk2"}) //扫描per.wsk2下面的注解
public class SpringConfig {



}
