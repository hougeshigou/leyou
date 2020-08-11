package com.leyou.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * description
 * 网关白名单配置属性类
 */
@ConfigurationProperties(prefix = "leyou.filter")
public class FilterProperties {

    //允许放行的请求路径
    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }

}
