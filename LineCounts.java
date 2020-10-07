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
public class LineCounts {
     public static void main(String[] A) throws FileNotFoundException {
         for (String a : A) {
             System.out.print(a + ":  ");
             count(a);
         }
   } 
      static void count(String File) throws FileNotFoundException { 
      int LC = 0; 
      BufferedReader i;  
      i = new BufferedReader( new FileReader(File) );
     
      try {
         String l = i.readLine(); 
         do{
             LC++;              
             l = i.readLine();     
         } while (l != null) ;
      }
      catch (IOException e) {
         System.out.println(e);
      }
      System.out.println(LC + " lines");    
   } 
}
