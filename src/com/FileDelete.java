package com;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {
        String filePath = "E:\\JavaStudy\\src\\com\\word.txt";

        File file = new File(filePath);
        delFile(file);
    }

    public static void delFile(File file) {
        if (!file.exists()) {
            System.out.println("文件不存在！");
            return;
        }
        boolean rs = file.delete();
        if (rs) {
            System.out.println("文件删除成功！");
        } else {
            System.out.println("文件删除失败！");
        }
    }
}


