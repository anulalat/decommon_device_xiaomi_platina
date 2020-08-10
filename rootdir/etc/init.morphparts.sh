#!/system/bin/sh

if [ ! -f /data/property/persist.tcp.profile ]; then
    setprop persist.tcp.profile 0
fi

if [ ! -f /data/property/persist.cpucore.profile ]; then
    setprop persist.cpucore.profile 0
fi

if [ ! -f /data/property/persist.lkm.profile ]; then
    setprop persist.lkm.profile 0
fi

if [ ! -f /data/property/persist.cpuboost.profile ]; then
    setprop persist.cpuboost.profile 1
fi

if [ ! -f /data/property/persist.gpuboost.profile ]; then
    setprop persist.gpuboost.profile 0
fi
