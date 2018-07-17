# yszj
一个使用ssm基础框架，集成了安全框架的一个项目
　　基于Spring+SpringMVC+Mybatis分布式敏捷开发系统架构，整套公共微服务服务模块：内容管理、用户管理（包括第三方）、配置中心、日志分析、任务和通知等。
组织结构
``` lua
yszj
├── yszj-common -- SSM框架公共模块
├── yszj-admin -- 后台管理模板
├── yszj-upms -- 用户权限管理系统
|    ├── yszj-upms-common -- upms系统公共模块
|    ├── yszj-upms-dao -- 代码生成模块
|    ├── yszj-upms-client -- 集成upms依赖包，提供单点认证、授权、统一会话管理
|    ├── yszj-upms-rpc-api -- rpc接口包
|    ├── yszj-upms-rpc-service -- rpc服务提供者
|    └── yszj-upms-server -- 用户权限系统及SSO服务端端口[1111]
├── yszj-cms -- 合同管理系统
|    ├── yszj-cms-common -- cms系统公共模块
|    ├── yszj-cms-dao -- 代码生成模块
|    ├── yszj-cms-rpc-api -- rpc接口包
|    ├── yszj-cms-rpc-service -- rpc服务提供者
|    ├── yszj-cms-search -- 搜索服务
|    ├── yszj-cms-admin -- 后台管理
|    ├── yszj-cms-job -- 消息队列、任务调度等
|    └── yszj-cms-web -- 网站前台
├── yszj-user-- 个人中心系统
     ├── yszj-user-common -- ucser系统公共模块
     ├── yszj-user-dao -- 代码生成模块，
     ├── yszj-user-rpc-api -- rpc接口包
     ├── yszj-user-rpc-service -- rpc服务提供者
     └── yszj-user-web -- 网站前台
```