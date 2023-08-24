/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstore;

import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int choice1 , line , nextBook , booksNumber = 0 , bookInfo = 0 ;
        char letter;
        boolean complete = false;
        
        File file = new File("Cart.csv");
        PrintWriter pw = new PrintWriter(file);
        
        System.out.println("Welcome To The BookStore");
     do{
        printMenu();
        choice1 = scan.nextInt();

        switch (choice1) {

            case 1:
                System.out.println("Please Choose One Genre : ");
                CSVReader buyBook = new CSVReader();
                letter = 'B';
                do{
                buyBook.all(letter);
                System.out.println("Which Book Do You Want To Buy?");
                System.out.print("Please Enter The Number Of The Book: ");
                line = scan.nextInt();
                
                if(bookInfo == 0){
                pw.println(Files.readAllLines(Paths.get("C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\\\Bookstore Database.csv")).get(0));
                }
                
                while(line >50 || line<1) {
                    System.out.print("Please Enter A Vaild Number: ");
                    line = scan.nextInt();
                }
                
                if(line<=50 && line>=1){
                bookInfo++;
                pw.println(Files.readAllLines(Paths.get("C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\\\Bookstore Database.csv")).get(line) );
                System.out.println("Book has been added to cart!\n"
                                 + "Want to Purchase Another Book?\n"
                                 + "1-Yes\n"
                                 + "2-No");
                
                nextBook = scan.nextInt();
                
                if(nextBook == 1){
                complete = true;
                }
                
                else{
                complete = false;    
                } 
                
                booksNumber++;
                
                while(nextBook != 1 && nextBook != 2){
                System.out.println("Please Enter a Vaild Number!");
                System.out.println("1-Yes\n"
                                  +"2-No");
                nextBook = scan.nextInt();
                    if(nextBook == 1)
                    complete = true;
                    }
                  }
                }while(complete == true);   
                break;
                
            case 2:
                CSVReader rentBook = new CSVReader();
                letter = 'R';
                
                do{
                rentBook.all(letter);
                System.out.println("Which Book Do You Want To Rent?");
                System.out.print("Please Enter The Number Of The Book: ");
                line = scan.nextInt();
                
                if(bookInfo == 0){
                pw.println(Files.readAllLines(Paths.get("C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\\\Bookstore Database.csv")).get(0));
                }
                
                while(line >50 || line<1) {
                    System.out.print("Please Enter A Vaild Number: ");
                    line = scan.nextInt();
                }
                if(line <=50 && line>=1){
                bookInfo++;
                pw.println(Files.readAllLines(Paths.get("C:\\Users\\AzizK\\OneDrive\\Desktop\\Final Project OOP1\\\\Bookstore Database (rent).csv")).get(line) );
                System.out.println("Book has been added to cart!\n"
                                 + "Book Must Be Returned After 1 Month!\n"
                                 + "Want to Rent Another Book?\n"
                                 + "1-Yes\n"
                                 + "2-No");
                
                nextBook = scan.nextInt();
                
                if(nextBook == 1){
                complete = true;
                }
                
                else{
                complete = false;    
                } 
                
                booksNumber++;
                
                while(nextBook != 1 && nextBook != 2){
                    System.out.println("Please Enter a Vaild Number!");
                    System.out.println("1-Yes\n"
                                       +"2-No");
                    nextBook = scan.nextInt();
                    if(nextBook == 1)
                    complete = true;
                    }
                 }
                }while(complete == true);
                break;

            case 3:
                System.out.println("Please Choose One Genre :");
                System.out.println("1-Horror\n" +
                                   "2-Biography\n" +
                                   "3-Science Fiction\n" +
                                   "4-True Crime\n" +
                                   "5-Novel");
                                   
                int genreChoice = scan.nextInt() ;
                switch(genreChoice) {
                    case 1:
                        CSVReader h1 = new CSVReader();
                        h1.horror();
                        break;
                    case 2:
                        CSVReader b1 = new CSVReader();
                        b1.bio();
                        break;

                    case 3:
                        CSVReader s1 = new CSVReader();
                        s1.scif();
                        break;
                    case 4:
                        CSVReader t1 = new CSVReader();
                        t1.tc();
                        break;
                    case 5:
                        CSVReader n1 = new CSVReader();
                        n1.novel();
                        break;
                }
                break;
            case 4:
                pw.close();
                Receipt output = new Receipt();
                output.receiptOutput(booksNumber);
                break ;
                
            default:
                System.out.println("Please Enter A Valid Choice");
                break;
        }

                }while(choice1!=4);
    }
     
    public static void printMenu(){
        System.out.println("Please Choose One Option:");
        System.out.println("1-Buy A New Book");
        System.out.println("2-Rent A Book");
        System.out.println("3-Explore Books Genres");
        System.out.println("4-Exit");
        System.out.print("--> ");
    }
}

