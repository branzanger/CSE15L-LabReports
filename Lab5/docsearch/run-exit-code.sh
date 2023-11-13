#!/bin/sh
#set -e
javac ExitCode.java
java ExitCode 0
echo $?
java ExitCode 1
echo $?
java ExitCode 2
echo $?
java ExitCode 3
echo $?
java ExitCode 259
echo $?