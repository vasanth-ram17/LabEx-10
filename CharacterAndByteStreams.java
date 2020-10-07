/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Vasanth
 */
public class CharacterAndByteStreams {
     public static void main(String[] args) throws FileNotFoundException, IOException {
         //ByteStream
        FileInputStream input=new FileInputStream("C:\\Users\\Vasanth\\Documents\\NetBeansProjects\\worksheet\\src\\WIN_20191128_17_04_18_Pro.jpg");
        FileOutputStream output= new FileOutputStream("C:\\Users\\Vasanth\\Documents\\NetBeansProjects\\worksheet\\src\\WIN_20191128_17_04_18_Pro.jpg");
        int read;
        while((read= input.read())!=-1) 
        output.write(read); 
        input.close();
        output.close();
        
        //CharacterStream
        FileReader Read=new FileReader("C:\\Users\\Vasanth\\Documents\\NetBeansProjects\\worksheet\\src\\WIN_20191128_17_04_18_Pro.jpg");
        FileWriter Write = new FileWriter("C:\\Users\\Vasanth\\Documents\\NetBeansProjects\\worksheet\\src\\WIN_20191128_17_04_18_Pro.jpg");
        int i = Read.read();
        do{
        Write.write(i); 
        Read.close();
        Write.close();
        } while(i != (-1));
}
}
