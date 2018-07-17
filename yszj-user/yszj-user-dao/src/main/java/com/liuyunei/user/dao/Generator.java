package com.liuyunei.user.dao;

import com.liuyunei.common.util.MybatisGeneratorUtil;
import com.liuyunei.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成类
 * Created by liuyunei on 2018/2/10.
 */
/**
 * 根据模板生成generatorConfig.xml文件
 * jdbc_driver   驱动路径
 * dbc_url      链接
 * jdbc_username 帐号
 * jdbc_password 密码
 * module        项目模块
 * database      数据库
 * table_prefix  表前缀
 * package_name  包名
 */
public class Generator {

	// 根据命名规范，只修改此常量值即可
	private static String MODULE = "yszj-user";
	private static String DATABASE = "yszj";
	private static String TABLE_PREFIX = "uc_";
	private static String PACKAGE_NAME = "com.liuyunei.user";
	private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
	private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
	private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
	private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");
	// 需要insert后返回主键的表配置，key:表名,value:主键名
	private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
	static {
	}

	/**
	 * 自动代码生成
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
	}

}
