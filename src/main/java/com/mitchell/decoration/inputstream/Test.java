package com.mitchell.decoration.inputstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author xin5
 * @date 2021年03月18日 22:58:25
 */
public class Test {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowcaseInpustream(new BufferedInputStream(new FileInputStream("test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
