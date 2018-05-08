# server
服务提供者

# 冲突
由于spring-boot-starter-web依赖jackson-databind包，而spring-cloud-starter-archaius也依赖jackson-databind，因此会出现包冲突问题，需要排除一个依赖，或者直接明确指定jackson-databind版本

# 端口
9999

# 访问
http://localhost:9999/getInfo