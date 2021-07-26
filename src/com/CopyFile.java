package com;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFolder = "E:\\JavaStudy\\src\\com\\word.txt";
        String copyFolder = "E:\\JavaStudy\\src\\com\\word2.txt";
        File sourceFile = new File(sourceFolder);
        if(!sourceFile.isDirectory() || !sourceFile.exists()){
            System.out.println("源文件不存在！");
        }else{
            File desFile = new File(copyFolder);
            desFile.mkdir();

            copy(sourceFile.listFiles(),desFile);
            System.out.println("文件夹复制成功！");
        }
    }
    /**
     * 创建copy方法，该方法接收文件数组和目标文件两个参数，如果目标文件不存在，则调用mkdir()方法创建文件夹，然后在循环中将
     * 文件数组中农的每个文件对象写到目标文件内。
     * @param fl
     * @param file
     */
    public static void copy(File[] fl,File file){
        if(!file.exists()){
            file.mkdir();
            //文件不存在就创建新的文件夹
        }

        for(int i=0;i<fl.length;i++){
            if(fl[i].isFile()){
                try{
                    FileInputStream fis = new FileInputStream(fl[i]);
                    FileOutputStream out = new FileOutputStream(new File(file.getPath()+file.separator+fl[i].getName()));
                    int count = fis.available();
                    byte[] data = new byte[count];
                    if((fis.read(data))!= -1){
                        out.write(data);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fl[i].isDirectory()){
                //该IF用来判断是不是文件夹类型
                File des = new File(file.getPath() + File.separator
                        + fl[i].getName());
                des.mkdir();
                //在目标文件夹中创建相同的文件夹
                copy(fl[i].listFiles(),des);
                //递归调用方法本身
            }
        }
    }
}
