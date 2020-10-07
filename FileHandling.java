/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class FileHandling {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.print("Enter the file name : "); 
        String file=input.next();
        File F = new File(file);
        boolean a = F.exists();
        String filename = F.getName();
        long length =  F.length();
        boolean read = F.canRead();
        boolean write = F.canWrite();
        if(a == true) 
            System.out.println("The file exists");
        else 
        {
            System.out.println("The File doesn't exists");
            return;
        }
       
        System.out.println("File name is " + filename); 
        System.out.println("File length is " + length ); 
        System.out.println("Readable boolean value is " + read);  
        System.out.println("Writable boolean value is "+ write); 
    }
}
