# 在线教育平台 (Spring Boot + Vue)

## 项目简介

该项目是一个基于 **Spring Boot** 和 **Vue.js** 的在线教育平台，数据库使用 **MySQL**，并结合了 **MyBatis-Plus** 进行数据访问层的实现。平台包括学生与教师的不同功能模块，学生可以选择课程、提交作业，并参与实时问答；教师可以创建课程、上传内容并进行成绩评定。

## 技术栈

- **前端**：Vue.js
- **后端**：Spring Boot
- **数据库**：MySQL
- **持久层框架**：MyBatis-Plus

## 项目结构

- **前端部分**：
  - **/frontend/src**：Vue.js 项目源码
    - **components**：Vue 组件
    - **views**：页面视图
    - **store**：Vuex 状态管理
    - **router**：路由管理
    - **assets**：静态资源
  
- **后端部分**：
  - **/backend/src/main/java**：Java源代码
    - **com.controller**：控制器层，处理前端请求
    - **com.service**：服务层，处理业务逻辑
    - **com.repository**：数据访问层，使用 MyBatis-Plus 进行数据交互
    - **com.entity**：实体类，映射数据库表
    - **com.config**：配置类，如数据库配置等
  
- **资源文件**：
  - **/backend/src/main/resources**：包括数据库配置、静态文件和模板
  - **/frontend/public**：前端静态资源

## 数据库配置

本项目使用 MySQL 数据库，并结合 MyBatis-Plus 进行数据库操作。请注意，仓库中没有上传数据库配置文件。请根据您的实际环境修改数据库连接配置，并确保数据库结构和表格与项目中的实体类一致。

## 配置文件

由于本仓库仅上传了代码文件，**配置文件未包含**，因此请根据实际运行环境创建和配置以下文件：

- 数据库连接配置：`application.properties` 或 `application.yml`
- 前端 API 接口地址的配置

## 运行说明

1. **数据库设置**：在 MySQL 中创建一个新的数据库，并根据项目中的实体类设计相应的数据表。
2. **配置文件**：根据实际的数据库设置，修改 `application.properties` 或 `application.yml` 中的数据库连接信息。
3. **构建项目**：
   - 使用 Maven 构建后端：`mvn clean install`
   - 启动 Spring Boot 项目：`mvn spring-boot:run`
4. **前端设置**：
   - 安装 Node.js 和 npm。
   - 进入前端项目目录，运行 `npm install` 安装依赖。
   - 运行前端项目：`npm run serve`
5. 打开浏览器，访问 `http://localhost:8080` 查看平台运行效果。

## 注意事项

- 实际运行效果见实验报告的第三部分，里面详细展示了平台的功能和操作。
- 请根据自己的需求进行相关配置，确保项目能够顺利启动并运行。

