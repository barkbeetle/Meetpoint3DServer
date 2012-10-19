#!/bin/sh

basedir=`dirname "$0"`
nohup java -cp "$basedir/out/production/MeetpointServer" net.ropelato.meetpoint.server.Server > "$basedir/log.txt" &
