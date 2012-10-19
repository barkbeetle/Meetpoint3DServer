#!/bin/sh

pid=`lsof -w -n -i tcp:63387 | grep java | awk '{print $2}'`
if [ -n "$pid" ]
then
	echo "Meetpoint3DServer is running with process id $pid."
	echo "Trying to kill process $pid..."
	kill -9 $pid
	
	pid=`lsof -w -n -i tcp:63387 | grep java | awk "{print $2}"`
	if [ -z "$pid" ]
	then
		echo "Meetpoint3DServer has been stopped."
	else
		echo "Could not stop Meetpoint3DServer."
	fi
else
	echo 'Meetpoint3DServer has not been started.'
fi
