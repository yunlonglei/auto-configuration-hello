# auto-configuration-hello
自定义的SpringBoot(starter)启动器
## 创建启动器
1.新建空工程  
2.往空工程中创建module  
3.其中 [hello-spring-boot-starter](https://github.com/yunlonglei/auto-configuration-hello/tree/master/lei-hello-spring-boot-starter) 是**启动器**，是空的maven项目，只在pom文件中引入了`lei-hello-spring-boot-starter-autoconfigure`模块  
4.在 [lei-hello-spring-boot-starter-autoconfigure](https://github.com/yunlonglei/auto-configuration-hello/tree/master/lei-hello-spring-boot-starter-autoconfigure) **自动配置包**中删除**配置文件**和**启动类**  
5.在`lei-hello-spring-boot-starter-autoconfigure`的`resources`目录下创建`META-INF/spring.factories`文件，写入需要自动配置的Bean  
```properties
# Auto Configure
org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
com.lei.hello.auto.HelloServiceAutoConfiguration
```
## 打包
* 先`mvn clean`和`mvn install` 自动配置包，然后再先`mvn clean`和`mvn install`启动包
* 有修改的话只需要`mvn clean`和`mvn install` 自动配置包
## 使用启动器
[测试使用自定义的SpringBoot(strater)启动器](https://github.com/yunlonglei/lei-hello-autoconfigure-test)