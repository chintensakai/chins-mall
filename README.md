# chins-mall

```
sudo docker run -d --name mysql -v /home/ubuntu/volumes/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=123456 -p 3316:3306 mysql
```
| 服务    | 端口 |
| ------- | ---- |
| member  | 5000 |
| order   | 6000 |
| product | 7000 |
| coupon  | 8000 |
| ware    | 9000 |

