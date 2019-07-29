package com.tavisca.training.stream.dataStream;

import java.io.*;

public class DataOutputStream {

    public  void writeData(String fileName,String data) throws FileNotFoundException {

       FileOutputStream writer =new FileOutputStream(fileName);
       java.io.DataOutputStream dataOutputStream=new java.io.DataOutputStream(writer);
        try(dataOutputStream) {
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(5);
            dataOutputStream.writeFloat(2.34f);
            dataOutputStream.write(data.getBytes());
            dataOutputStream.flush();
        } catch (IOException e) {

            System.out.println("Exception occurred:"+e.getMessage());
            e.printStackTrace();
        }
    }


}
