package bookstore;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * 
 * 
 *
 * @author Turki
 */


public class Receipt {
    
    public void receiptOutput(int booksNumber) throws FileNotFoundException, IOException{
    double total = 0;
    System.out.println("-------------------------------------------------------");
    System.out.println("\t\t\tReceipt");
    System.out.println("Book Number\tBook Name\t\tPrice");
    String [] bookNum = ReadCol(0 ,"C:\\Users\\AzizK\\OneDrive\\Documents\\NetBeansProjects\\BookStore\\Cart.csv",",");
    String [] bookName = ReadCol(1 ,"C:\\Users\\AzizK\\OneDrive\\Documents\\NetBeansProjects\\BookStore\\Cart.csv",",");
    String [] price = ReadCol(4 ,"C:\\Users\\AzizK\\OneDrive\\Documents\\NetBeansProjects\\BookStore\\Cart.csv",",");
    for(int i=1 ; i<=booksNumber ; i++){
        System.out.printf("\t%-7s\t%-24s$%s\n" , bookNum[i] , bookName[i] , price[i]);
         total+=Double.parseDouble(price[i]);
            }
    System.out.println(" ");
    System.out.printf("\t\t    Total is $%.1f\n" , total);
    System.out.println(" ");
    System.out.println("\t*Rented books must be returned within 30 days*\n "
            + "\t\tfrom the date of purchasing");
    SimpleDateFormat time = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    System.out.print("\tPurchasing Time : ");
    System.out.println(time.format(date));
    System.out.println("");
    System.out.println("\t\tThank You For Purchasing!\n");
    System.out.println("\t\t\t\t\t     *BookStore");
    System.out.println("-------------------------------------------------------");
    }
    
        public static String [] ReadCol(int col, String filepath,String delimiter) {
            
        String data[];
        String currentLine;
        ArrayList<String> colData = new ArrayList<String>();
        
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
 
