package com.designMode.realize.decoratorPattern;

import com.designMode.realize.decoratorPattern.stringModel.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @program: designMode-learn&realize
 * @description:
 * @author: liuguohu
 * @create: 2020-03-30 11:48
 **/

public class StringTest {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/main/resources/test.txt");
        LowerCaseInputStream input = new LowerCaseInputStream(inputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(input);
        FileOutputStream outputStream = new FileOutputStream("src/main/resources/ouput.txt");
        byte[] bytes = new byte[1024];
        int line;
        while(true){
            line = bufferedInputStream.read(bytes,0,1024);
            if(line == -1){
                break;
            }
            outputStream.write(bytes);
        }
    }
}
