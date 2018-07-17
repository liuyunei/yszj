package com.liuyunei.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * 启动解压liuyuneiAdmin-x.x.x.jar到resources目录
 * Author: 刘兴
 * Date: Created in 2018/4/23
 */
public class yszjAdminUtil implements InitializingBean, ServletContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(yszjAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        LOGGER.info("===== 开始解压yszj-admin =====");
        String version = PropertiesFileUtil.getInstance("yszj-admin-client").get("yszj.admin.version");
        LOGGER.info("yszj-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/yszj-admin-" + version + ".jar");
        LOGGER.info("yszj-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/yszj-admin";
        LOGGER.info("yszj-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        LOGGER.info("===== 解压yszj-admin完成 =====");
    }

}
