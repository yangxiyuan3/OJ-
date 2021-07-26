package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BranchWriter {
    public static void main(String[] args) {
        String filePath = "E:\\JavaStudy\\src\\com\\word2.txt";
        File file = new File(filePath);
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0;i<100;i++){
                bw.write("Java交互管道——IO流".toCharArray());
                bw.newLine();
                bw.flush();
            }
            System.out.println("成功写入数据");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
