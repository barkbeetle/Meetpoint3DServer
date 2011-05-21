#!/bin/sh

kill -9 `lsof -w -n -i tcp:63387 | grep java | awk '{print $2}'`
