package com.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created on 2018/3/15.
 */
public class ChannelCopy {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        String inFile = "data.txt";
        String outFile = "data_out.txt";
        FileChannel in = new FileInputStream(inFile).getChannel();
        FileChannel out = new FileOutputStream(outFile).getChannel();
        ByteBuffer bf = ByteBuffer.allocate(BSIZE);
        while (in.read(bf) != -1) {
            bf.flip();
            out.write(bf);
            bf.clear();
        }
    }
}
