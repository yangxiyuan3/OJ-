package com;
import java.io.*;
public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/File/","text.txt");
        //创建文件对象
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            FileOutputStream output = new FileOutputStream(file);
            byte[] bytes = "Java数据交流管道——IO流".getBytes();
            output.write(bytes);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            FileInputStream input = new FileInputStream(file);
            byte[] bytes2 = new byte[1024];
            int len = input.read(bytes2);
            System.out.println("文件中的信息是：" + new String(bytes2, 0, len));
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
