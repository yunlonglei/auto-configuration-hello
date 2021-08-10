package com.lei.hello.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author leiyunlong
 * @version 1.0
 * @since 2021/8/10 3:15 下午
 */
@ConfigurationProperties("lei.hello")
public class Helloproperties {

    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }



}
