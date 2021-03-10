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
| search    | 10000 |

+ elasticsearch

```
# 创建数据卷目录
sudo mkdir -p /home/ubuntu/volumes/elasticsearch/config
sudo mkdir -p /home/ubuntu/volumes/elasticsearch/data

# 允许任意主机访问 k-v之间有空格
sudo echo "http.host: 0.0.0.0" >> /home/ubuntu/volumes/elasticsearch/config/elasticsearch.yml

docker run --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" -e ES_JAVA_OPTS="-Xms512m -Xmx512m" -v /home/ubuntu/volumes/elasticsearch/config/elasticsearch.yml:/usr/share/elasticsearch/config/elasticsearch.yml -v /home/ubuntu/volumes/elasticsearch/data:/usr/share/elasticsearch/data -v /home/ubuntu/volumes/elasticsearch/plugins:/usr/share/elasticsearch/plugins -d elasticsearch:7.4.2
```

+ kibana

```
# 查看elasticsearch容器的IP
docker inspect 03b7f9574290 | grep IP
docker run -d --name kibana -e ELASTICSEARCH_HOSTS=http://172.17.0.2:9200 -p 5601:5601 -d kibana:7.4.2
```



