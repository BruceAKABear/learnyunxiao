BUILD_ID=DONTKILLME
#!/bin/bash
#获取你想运行jar包的进程号
pid=`ps -ef | grep learnyunxiao-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}'`
#如果存在则把该进程杀掉
if [ -n "$pid" ]
then
   echo "kill -9 的pid:" $pid
   kill -9 $pid
fi
echo "启动jar包"
#启动项目，指定配置为开发环境
nohup java -jar learnyunxiao-0.0.1-SNAPSHOT.jar &