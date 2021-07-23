
#! /bin/bash

echo "Wait 5 Sec for Redis to Start"
sleep 5

redis-cli -h redis -a 'redis' < /movies.redis
