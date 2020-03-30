package com.designMode.realize.DecoratorPattern.stringModel;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 09:43
 **/

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char) c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for(int i=off; i<off+result; i++){
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
