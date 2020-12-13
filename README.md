# chins-mall

+ mysql：

```
sudo docker run -d --name mysql -v /home/ubuntu/volumes/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -p 3316:3306 mysql
```
+ nacos：
```
vim example/standalone-mysql-8.yaml
## 避免和mysql容器名冲突
container_name: nacos-mysql
## 避免wls2中路径权限问题，都使用wls2中的目录，不使用Windows的目录
volumes:
  - /home/ubuntu/volumes/nacos-mysql:/var/lib/mysql

vim env/nacos-standlone-mysql.env
MYSQL_SERVICE_HOST=nacos-mysql

## 启动
docker-compose -f example/standalone-mysql-8.yaml up
```

| 服务    | 端口 |
| ------- | ---- |
| member  | 5000 |
| order   | 6000 |
| product | 7000 |
| coupon  | 8000 |
| ware    | 9000 |

