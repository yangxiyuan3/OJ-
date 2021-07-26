package com;

import java.io.IOException;
import java.io.OutputStream;

public class OutputData {
    public static void main(String[] args){
        OutputStream output = System.out;
        byte[] bytes = "使用OutputStream输出流在控制台输出字符串\n".getBytes();
        try{
            output.write(bytes);
            bytes = "输出内容：\n".getBytes();
            output.write(bytes);
            bytes = "Java数据交互管道——IO流 \n".getBytes();
            output.write(bytes);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
