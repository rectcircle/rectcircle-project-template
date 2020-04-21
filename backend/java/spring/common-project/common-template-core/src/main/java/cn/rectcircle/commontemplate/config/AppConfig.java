package cn.rectcircle.commontemplate.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Rectcircle
 */
@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {

    private static final String DEV_PREFIX = "dev";

    @Value("${spring.profiles.active:dev}")
    private String activeProfile;

    private String region;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getActiveProfile() {
        return activeProfile;
    }

    public void setActiveProfile(String activeProfile) {
        this.activeProfile = activeProfile;
    }

    public boolean isDev() {
        if (activeProfile != null && activeProfile.startsWith(DEV_PREFIX)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AppConfig [activeProfile=" + activeProfile + ", region=" + region + "]";
    }
}
