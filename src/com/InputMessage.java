package com;

import java.io.IOException;
import java.io.InputStream;

public class InputMessage {
    public static void main(String[] args) {
        InputStream inp =System.in;
        byte[] bytes = new byte[1024];
        try{
            while(inp.read()!=-1){
                String str = new String(bytes).trim();
            }
            inp.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
