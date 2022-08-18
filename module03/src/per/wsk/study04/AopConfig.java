package per.wsk.study04;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author wb_weishaokang
 * @date 2021/6/24 4:36 下午
 * @description
 *
 * AOP完全注解开发
 * 这个配置类就相当于spring的aop配置文件了。
 *
 */
@Configuration
@ComponentScan(basePackages = {"per.wsk.study04"})
@EnableAspectJAutoProxy(proxyTargetClass = true) //proxyTargetClass 默认是false，这行相当于 <aop:aspectj-autoproxy></aop:aspectj-autoproxy>  开启 Aspect 自动生成代理对象
public class AopConfig {
}
