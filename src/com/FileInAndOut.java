package com;

import java.io.File;
import java.io.FileReader;

public class FileInAndOut {
    public static void main(String[] args) {
        File file = new File("E:\\JavaStudy\\src\\com\\word.txt");
        if(!file.exists()){
            System.out.println("对不起，不包含指定路径的文件");
        }else{
            //路径是对的用File对象创建FileReader对象
            try{
                FileReader fr = new FileReader(file);
                char[] data = new char[23];
                int length = 0;
                while((length = fr.read(data))>0){
                    String str = new String(data,0,length);
                    System.out.println(str);
                }
                fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
