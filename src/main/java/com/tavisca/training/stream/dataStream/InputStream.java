package com.tavisca.training.stream.dataStream;

import java.io.*;

public class InputStream {

    public  void readData(String fileName) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(fileName);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        try(dataInputStream) {
         boolean b=dataInputStream.readBoolean();
         int i=dataInputStream.readInt();
         float f=dataInputStream.readFloat();

         System.out.println(" boolean : "+b);
         System.out.println(" int : "+i);
         System.out.println(" float : "+f);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
