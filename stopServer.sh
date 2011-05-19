#!/bin/sh

kill -9 `lsof -w -n -i tcp:1024 | grep java | awk '{print $2}'`
