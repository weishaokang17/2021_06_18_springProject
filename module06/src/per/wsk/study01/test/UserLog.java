package per.wsk.study01.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author wb_weishaokang
 * @date 2021/7/1 4:23 下午
 * @description
 */
public class UserLog {

    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }

}
