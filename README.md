# <img src="src/docs/spring-framework.png" width="80" height="80"> Spring Framework 5.3.3 [![Build Status](https://ci.spring.io/api/v1/teams/spring-framework/pipelines/spring-framework-5.3.x/jobs/build/badge)](https://ci.spring.io/teams/spring-framework/pipelines/spring-framework-5.3.x?groups=Build") [![Revved up by Gradle Enterprise](https://img.shields.io/badge/Revved%20up%20by-Gradle%20Enterprise-06A0CE?logo=Gradle&labelColor=02303A)](https://ge.spring.io/scans?search.rootProjectNames=spring)

本项目纯粹用于Spring 5.3.3源码调试学习使用

## ## gradle 构建Spring源代码

 Spring源码下载 ： <a href="https://github.com/spring-projects/spring-framework" title="spring-framwork">spring-framwork</a>

1. spring用的5.3.3,里面会有一个下载的gradle版本（6.7.1），建议自己下载的gradle版本与之一致，不然会有很多问题；

   ![image-20220811230059373](C:\Users\37650\AppData\Roaming\Typora\typora-user-images\image-20220811230059373.png)

2. 根据 gradle/gradle-wrapper 查看gradle版本

3. spring源文件，设置build.gradle 的maven阿里云仓库

   ```
   maven { url 'https://maven.aliyun.com/nexus/content/groups/public/' }
   maven { url 'https://maven.aliyun.com/nexus/content/repositories/jcenter'}
   ```

   ![image-20220811230234584](C:\Users\37650\AppData\Roaming\Typora\typora-user-images\image-20220811230234584.png)

4. spring源文件，修改setting-gradle的maven阿里云仓库

   ```
   maven { url "https://maven.aliyun.com/repository/public" }
   ```

   ![image-20220811230339264](C:\Users\37650\AppData\Roaming\Typora\typora-user-images\image-20220811230339264.png)

5. 用idea打开，并选择jdk11

