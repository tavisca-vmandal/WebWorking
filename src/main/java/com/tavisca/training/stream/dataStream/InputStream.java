package com.tavisca.training.stream.dataStream;

import java.io.*;

public class DataInputStream {

    public  String readFile(String fileName) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(fileName);
        DataInputStream dataInputStream=new DataInputStream(fileInputStream);

        try(dataInputStream) {
         boolean b=dataInputStream.readBooolean();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
