package cn.rectcircle.commontemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 入口类
 * 
 * @author Rectcircle
 */
@SpringBootApplication
@EnableScheduling
public class BatchApplication {

    public static void main(final String[] args) {
        SpringApplication.run(BatchApplication.class, args);
    }

}
