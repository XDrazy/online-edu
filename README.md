# 在线教育平台 (Spring Boot + Vue)

## 项目简介

该项目是一个基于 **Spring Boot** 和 **Vue.js** 的在线教育平台，数据库使用 **MySQL**，并结合了 **MyBatis-Plus** 进行数据访问层的实现。平台包括学生与教师的不同功能模块，学生可以选择课程、提交作业，并参与实时问答；教师可以创建课程、上传内容并进行成绩评定。

## 技术栈

- **前端**：Vue.js
- **后端**：Spring Boot
- **数据库**：MySQL
- **持久层框架**：MyBatis-Plus

### 前端部分 (`/frontend`)

- **/frontend/src**：Vue.js 项目源代码
  - **/assets**：存放静态资源，如图片、字体、样式等。
  - **/components**：Vue 组件，包含各种页面模块和通用组件。
  - **/router**：Vue Router 配置，用于路由管理，定义页面跳转。
  - **/store**：Vuex 状态管理，管理全局状态。
  - **/views**：视图页面，包含具体的功能页面，如学生面板、教师面板等。
  - **/utils**：工具类，存放常用的工具函数。
  - **/public**：公共文件夹，包含一些公共静态资源和 `index.html` 页面。

### 后端部分 (`/backend`)

- **/backend/src/main/java/com/onlineedu**：后端 Java 源代码
  - **/config**：配置类，包括数据库配置、Spring Security 配置等。
  - **/controller**：控制器层，处理前端请求和返回数据。
  - **/entity**：实体类，定义数据库表结构。
  - **/repository**：数据访问层，使用 MyBatis-Plus 进行数据库交互。
  - **/service**：服务层，包含具体的业务逻辑。
  - **/service/impl**：服务实现层，业务逻辑的具体实现。
  - **/utils**：工具类，包含常用的辅助方法，如文件上传、日期处理等。
  - **/exception**：自定义异常类，用于处理后端异常。

- **/backend/src/main/resources**：资源文件
  - **/static**：静态文件夹，存放不需要经过处理的静态资源文件。
  - **/templates**：模板文件夹，用于 Thymeleaf 等模板引擎的视图渲染。
  - **/application.yml**：Spring Boot 配置文件，包含数据库连接配置等。
  - **/mybatis-config.xml**：MyBatis 配置文件，配置 MyBatis 的相关信息。


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

