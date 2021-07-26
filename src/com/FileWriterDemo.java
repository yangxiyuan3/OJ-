package com;

import java.io.*;
/**
 * FileWrierDemo class
 * @author yangtenglong
 * @data 2021/5/21
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("E:\\JavaStudy\\src\\com\\word2.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            FileReader fr =new FileReader("E:\\JavaStudy\\src\\com\\word.txt");
            FileWriter fw = new FileWriter(file);
            int length = 0;
            while((length = fr.read())!=-1){
                fw.write(length);
            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
