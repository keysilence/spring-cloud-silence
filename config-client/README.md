# config-client
配置客户端

# 端口
7799

# 手动刷新
客户端可以执行如下命令进行手动刷新Server修改后的配置，由于自动刷新需要配置mq等依赖工具，故暂时完成手动刷新配置
```
curl -X POST http://localhost:7799/actuator/refresh
```