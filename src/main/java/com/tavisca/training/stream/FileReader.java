package com.tavisca.training.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

    public  String readFile(String fileName) throws FileNotFoundException {

        StringBuilder contents=new StringBuilder();
        FileInputStream fileInputStream=new FileInputStream(fileName);


        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);

        try(bufferedInputStream) {
            byte[] buffer=new byte[8];

            while(bufferedInputStream.read(buffer)>0){

                contents.append(new String((buffer)));
                buffer=new byte[8];
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents.toString();
    }
}
