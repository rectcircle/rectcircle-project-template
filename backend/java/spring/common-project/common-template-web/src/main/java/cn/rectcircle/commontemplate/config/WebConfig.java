package cn.rectcircle.commontemplate.config;

import java.util.List;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author Rectcircle
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    /**
     * @see cn.rectcircle.commontemplate.config.bean.JsonConfig#fastJsonConfig
     */
    @Autowired
    private FastJsonConfig fastJsonConfig;

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        // 1、定义一个convert转换消息的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        // 3、在convert中添加配置信息
        fastConverter.setFastJsonConfig(this.fastJsonConfig);
        // 4、将convert添加到converters中
        converters.add(fastConverter);
        // 5、追加默认转换器
        super.addDefaultHttpMessageConverters(converters);
    }

}
