package com.quang.androidh264;

public class H264Decoder {

    static {
        System.loadLibrary("androidh264");
    }

    public native int initDecoder(int width, int height);

    public native int uninitDecoder();

    public native int decoderNal(byte[] in, int insize, byte[] out);
}
