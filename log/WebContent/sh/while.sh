#!/bin/bash

old_log=$1
export short_log=short_log.log
while :
do

sleep 1

tail -n 500 $old_log > $short_log 2>&1

done
