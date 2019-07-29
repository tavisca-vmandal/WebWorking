package com.tavisca.training.stream;

import java.io.FileNotFoundException;


public class FileHandler {

    public static  void main(String[] args)
    {
        writeFileContents();
        readFileContents();
    }

    private static void writeFileContents() {
        FileWriter myFileWriter=new FileWriter();
        String data="Hello! How are you?";
        try {
            myFileWriter.writeFile("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name");
            e.printStackTrace();
        }
    }

    private static void readFileContents(){

        FileReader fileReader=new FileReader();
        String data="";
        try {
             data = fileReader.readFile(("DataFile.txt"));
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name");
            e.printStackTrace();
        }
    }
}
