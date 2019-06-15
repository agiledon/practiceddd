# Pratice DDD

这是我自己写作的DDD原创书籍《领域驱动设计实践》的代码库。本代码库提供了多个案例Demo，体现了多种实现方式，并按照实现方式建立不同的模块。内容包括：
* 数据建模方式：目录为data-style，示例项目：
	* 培训管理系统
* 领域建模方式：目录为domain-style，示例项目：
	* EAS

## 培训管理系统

本项目以数据模型驱动设计的方法进行设计。包括如下业务功能：
* 添加课程到期望列表
* 从期望列表中移除课程
* 预订课程
* 取消课程预订
* 购买课程

### 技术选型

数据库：MySQL
ORM：MyBatis
IoC：Spring
数据迁移：flyway

### 环境准备

#### MySQL数据库

默认配置为localhost:3306。用户名为root，密码无。
数据库名为training。

要运行代码库的测试，需要先创建training数据库，并保证MySQL的数据库配置是正确的。数据库的配置在data-style/src/main/resources/development.properties:

```
jdbc.driver = com.mysql.cj.jdbc.Driver
jdbc.url = jdbc:mysql://localhost:3306/training
jdbc.user = root
jdbc.password =
```

**初始化数据库**

通过flyway执行数据库脚本。需要在data-style/training/pom.xml中配置flyway的数据库配置：

```xml
<plugin>
    <groupId>org.flywaydb</groupId>
    <artifactId>flyway-maven-plugin</artifactId>
    <version>${flyway.version}</version>
    <configuration>
        <driver>com.mysql.cj.jdbc.Driver</driver>
        <url>jdbc:mysql://localhost:3306/training</url>
        <user>root</user>
        <password></password>
    </configuration>
</plugin>
```

切换到data-style/training目录下，执行命令：

```
mvn flyway:migrate
```

即可创建对应的表，并初始化需要的测试数据。

#### 运行测试

在项目主目录practiceddd下，执行命令：

```
mvn test
```

执行之前，请确保mysql的服务已经启动，如果没有启动，请运行命令：

```
mysql.server start
```




