/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


class CSVReader {
    
     String [] bookNum = ReadCol(0 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database.csv",",");
     String [] bookName = ReadCol(1 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database.csv",",");
     String [] genre = ReadCol(2 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database.csv",",");
     String [] author = ReadCol(3 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database.csv",",");
     String [] price = ReadCol(4 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database.csv",",");
     String [] rentPrice = ReadCol(4 ,"C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\Bookstore Database (rent).csv",",");
      
      public void all(char letter) throws IOException {
         if(letter == 'B'){
             System.out.println("---------------------------------------------------------------------------------------------");
             System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 1; i <= 50; i++) {
             System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
          }
             System.out.println("---------------------------------------------------------------------------------------------");
         }
         else if(letter == 'R'){
             System.out.println("---------------------------------------------------------------------------------------------");
             System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
          for (int i = 1; i <= 50; i++) {
             System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , rentPrice[i]);
            }
             System.out.println("---------------------------------------------------------------------------------------------");
         }
  
         
   }
   public void horror()throws IOException {
            System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 1; i <= 10; i++) {
            System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
         }
  
         
   }
   public void bio ()throws IOException {
       System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 11; i <= 21; i++) {
            System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
         }
   }
      public void scif ()throws IOException {
           System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 22; i <= 31; i++) {
           System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
         }
   }
      public void tc ()throws IOException {
           System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 32; i <= 41; i++) {
           System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
         }
   }
     public void novel ()throws IOException {
           System.out.printf(" Book Number    Book Name\t\tGenre\t\t\tAuthor\t\t\tPrice\n");
         for (int i = 42 ; i <= 50; i++) {
           System.out.printf("\t%-6s\t%-23s\t%-20s\t%-16s\t$%-6s\n" , bookNum[i] , bookName[i] , genre[i] , author[i] , price[i]);
         }
   }
     public static String [] ReadCol(int col, String filepath,String delimiter) {
        String data[];
        String currentLine;
        ArrayList<String>colData = new ArrayList<String>();
        
        try{
            
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            
            while ((currentLine = br.readLine()) != null)
            {
                data = currentLine.split(delimiter);
                colData.add(data[col]);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    
        return colData.toArray(new String [0]);
    }
} 
