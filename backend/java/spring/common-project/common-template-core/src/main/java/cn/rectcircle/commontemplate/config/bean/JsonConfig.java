package cn.rectcircle.commontemplate.config.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.rectcircle.commontemplate.config.AppConfig;

/**
 * @author Rectcircle
 */
@Configuration
public class JsonConfig {

    @Autowired
    private AppConfig appConfig;

    /**
     * 在此统一配置 FastJson。尽管JSON序列化应该只发生在 `web` 模块。 但是现实情况 `core` 模块有时不得不手动处理
     * JSON，因此在此配置
     * 
     * @return
     */
    @Bean
    public FastJsonConfig fastJsonConfig() {
        // FastJson SerializeConfig.globalInstance 的原因是希望对 `com.alibaba.fastjson.JSON`
        // 生效
        SerializeConfig serializeConfig = SerializeConfig.globalInstance;
        // 将 Long 类型 序列化为 String 类型（解决 JavaScript Number 精度问题）
        serializeConfig.put(Long.class, ToStringSerializer.instance);
        serializeConfig.put(Long.TYPE, ToStringSerializer.instance);

        // FastJson 配置
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        // 配置序列化
        fastJsonConfig.setSerializeConfig(serializeConfig);
        // 开发环境启用输出格式化
        if (appConfig.isDev()) {
            // 希望对 `com.alibaba.fastjson.JSON` 生效
            JSON.DEFAULT_GENERATE_FEATURE |= SerializerFeature.PrettyFormat.getMask();
            fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        }
        // ! 禁用循环检测，需保证不出现循环引用
        // 希望对 `com.alibaba.fastjson.JSON` 生效
        JSON.DEFAULT_GENERATE_FEATURE |= SerializerFeature.DisableCircularReferenceDetect.getMask();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);

        return fastJsonConfig;
    }
}
