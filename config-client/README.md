# config-client
配置客户端

# 端口
7799

# 手动刷新

## 配置方式

### 依赖
```
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
        <version>2.1.3.RELEASE</version>
    </dependency>
```

### 注解

```
@RefreshScope
```


客户端可以执行如下命令进行手动刷新Server修改后的配置，由于自动刷新需要配置mq等依赖工具，故暂时完成手动刷新配置
```
curl -X POST http://localhost:7799/actuator/refresh
```