#!/bin/sh

ln -sf /usr/share/zoneinfo/Asia/Taipei /etc/localtime
echo "This is Holystone demo" | tee /dev/ttyS0
