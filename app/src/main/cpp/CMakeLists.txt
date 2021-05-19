cmake_minimum_required(VERSION 3.10.2)

project("androidh264")

add_library(
        androidh264
        SHARED
        cabac.c
        common.c
        dsputil.c
        golomb.c
        h264.c
        h264utils.c
        mpegvideo.c
        H264Android.c)

find_library(
        log-lib
        log)

target_link_libraries(
        androidh264

        ${log-lib})