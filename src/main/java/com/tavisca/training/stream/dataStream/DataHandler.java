package com.tavisca.training.stream.dataStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DataHandler {

    public static  void main(String[] args)
    {
        DataOutputStream outputStream= new DataOutputStream();
        InputStream inputStream=new InputStream();
        try {
            outputStream.writeData("Data2.txt","Hello");
            inputStream.readData("Data2.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

