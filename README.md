# Elysia：spring-cloud-alibaba学习项目

## 项目简介
基于spring-cloud-alibaba的微服务项目，主要是学习spring-cloud-alibaba的各个组件，以及spring-cloud-alibaba的整合。

## 项目结构
```json5
{
  "elysia-market-parent": {
    "java.version": "17",
    "spring.boot.version": "3.2.0",
    "spring-cloud.version": "2023.0.0",
    "spring-cloud-alibaba.version": "2022.0.0.0-RC2",
    "mysql": "8.0.11",
    "packages": {
      "elysia-market-config": "",
      "elysia-market-gateway": "",
      "elysia-market-api": "",
      "elysia-market-order": "",
      "elysia-market-stock": ""
    },
  }
}
```

### 已整合：
```
spring-boot
spring-cloud-alibaba-nacos-discovery
spring-cloud-alibaba-nacos-config
spring-cloud-alibaba-sentinel
spring-cloud-alibaba-seata
spring-cloud-ribbon
spring-cloud-openFeign
spring-cloud-gateway
rocketmq
```

### 未整合：
```
spring-cloud-alibaba-dubbo
redis
kafka
zookeeper
```

### 部署方式：
```
docker-compose
```

### 未来计划：
```
netty
kubernetes
devops
```