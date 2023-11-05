#!/bin/sh
set -e

FILES=$(find $1 -name "*.txt")
FILESNUM=$(find $1 | grep -c ".txt")
echo "$FILES" | wc -l 
echo $FILESNUM