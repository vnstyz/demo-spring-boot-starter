# demo-spring-boot-starter

这是一个基于 Spring Boot 3.5.x 的多模块学习与实验仓库，覆盖自定义 Starter、JDBC、MyBatis/MyBatis-Plus、Spring MVC 与 Thymeleaf 等常见开发场景，方便在同一工程里对比与演练。

## 技术栈与版本

- Java 21
- Spring Boot 3.5.10
- Maven 多模块聚合
- MyBatis / MyBatis-Plus
- Thymeleaf
- MySQL 驱动

根聚合与依赖管理配置位于 `D:\Project\Java\demo-spring-boot-starter\pom.xml`。

## 模块清单

- `diy-spring-boot-starter`：自定义 Starter 示例（对外暴露依赖与入口）。
- `diy-spring-boot-starter-autoconfigure`：自动配置模块（AutoConfiguration 与属性绑定）。
- `springboot-single-app`：单体 Spring Boot 应用示例。
- `jdbc-study`：JDBC + MyBatis-Plus 的基础示例。
- `01-jdbc-study`：JDBC/MyBatis 入门练习。
- `02-jdbc-study`：JDBC/MyBatis 进阶练习。
- `03-mybatisplus-study`：MyBatis-Plus 示例。
- `DemoTest`：并发/基础测试类示例。

下面两个目录存在于仓库中，但当前未加入根聚合模块列表，需单独构建或按需加入根 `pom.xml` 的 `<modules>`：

- `04-springmvc-study`：Spring MVC + Thymeleaf + MyBatis-Plus 示例。
- `05-kuangstudy-thymeleaf`：Thymeleaf + MyBatis-Plus 示例。

## 运行方式

推荐在仓库根目录运行，按模块启动：

```bash
mvn -pl springboot-single-app -am spring-boot:run
```

也可以进入对应模块目录后启动：

```bash
cd springboot-single-app
mvn spring-boot:run
```

如果使用 Maven Wrapper：

```bash
./mvnw -pl springboot-single-app -am spring-boot:run
```

## 数据库配置说明

涉及数据库的模块请先修改各自的 `application.yml`，示例位置如下：

- `D:\Project\Java\demo-spring-boot-starter\03-mybatisplus-study\src\main\resources\application.yml`
- `D:\Project\Java\demo-spring-boot-starter\04-springmvc-study\src\main\resources\application.yml`
- `D:\Project\Java\demo-spring-boot-starter\05-kuangstudy-thymeleaf\src\main\resources\application.yml`

请根据你的本地 MySQL 账号、密码与库名进行调整。

## 目录结构

- `.mvn`：Maven Wrapper 配置
- `diy-spring-boot-starter`：自定义 Starter
- `diy-spring-boot-starter-autoconfigure`：自动配置模块
- `springboot-single-app`：单体应用示例
- `jdbc-study`：JDBC/MyBatis-Plus 示例
- `01-jdbc-study`：JDBC/MyBatis 基础
- `02-jdbc-study`：JDBC/MyBatis 进阶
- `03-mybatisplus-study`：MyBatis-Plus 示例
- `04-springmvc-study`：Spring MVC + Thymeleaf 示例
- `05-kuangstudy-thymeleaf`：Thymeleaf 示例
- `DemoTest`：测试与并发示例
