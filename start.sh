#!/bin/bash

appname="SpringBoot_Full.jar"

rm -f tpid

#启动

nohup /data/jdk1.8.0_112/bin/java -jar SpringBoot_Full.jar --spring.profiles.active=pro > /dev/null 2>&1 &
echo $! > tpid 
echo Start Success!
