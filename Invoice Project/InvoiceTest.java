/**
 * Project 3 Part (A)
 * 
 * Completed by (name redacted)
 * 
 * Last Modified 18 10 2016
 * 
 * This class tests our Invoice.class, initially showing an invoice with set parameters. The user is then
 * prompted to create their own invoice (Invoice2) and the invoice details are displayed using a toString
 * method with the total being called with a get method.
 */

import java.util.Scanner; // import Scanner util

public class InvoiceTest // start of class InvoiceTest
{
    public static void main(String[] args ) // main method begins execution
    {
        //create an invoice object
        Invoice invoice1 = new Invoice(
            "GHRTJ", "MS Office 365", 1, 99.99, 23.00 ); // create invoice1 object with set parameters
        
        // display values of invoice1 using get methods
        System.out.printf ( "Item Code: %s\n",
            invoice1.getCode() );
        System.out.printf ( "Item Description: %s\n",
            invoice1.getDescription() );
        System.out.printf ( "Quantity: %d\n",
            invoice1.getQuantity() );
        System.out.printf ( "Price: %.2f\n",
            invoice1.getPrice() );
        System.out.printf ( "VAT Rate: %.2f\n",
            invoice1.getVatRate() );
        System.out.printf ( "Total is: %.2f\n",
            invoice1.getInvoiceAmount() );
        
        Scanner input = new Scanner( System.in ); // create a scanner for keyboard
        
        Invoice invoice2 = new Invoice(); // create a new invoice object for user to set
        
        System.out.println( "\nEnter the item code:" ); // prompt user to enter part code
        String partcode = input.nextLine(); // look for string input
        invoice2.setCode(partcode); // use input to setCode
        System.out.println();
        
        System.out.println( "Enter item description:" ); // prompt user to enter description
        String partdesc = input.nextLine(); // look for string input
        invoice2.setDescription(partdesc); // use to setDescription
        System.out.println();
        
        System.out.println( "Enter quantity:" ); // prompt to enter quantity
        int quant = input.nextInt(); // look for next integer
        invoice2.setQuantity(quant); // use integer to setQuantity
        System.out.println();
        
        System.out.println( "Enter the price in decimal form:" ); // prompt user to enter price
        double cost = input.nextDouble(); // look for next double
        invoice2.setPrice(cost); // use double to setPrice
        System.out.println();
        
        System.out.println( "Enter the VAT Rate in decimal form:" ); // prompt user to enter the VAT
        double vat = input.nextDouble(); // look for next double
        invoice2.setVatRate(vat); // use double to setVatRate
        System.out.println();
        
        System.out.printf( invoice2.toString() ); // prints the toString method for invoice2
        
        System.out.printf( "Total is: %.2f\n",
            invoice2.getInvoiceAmount() ); // prints the getInvoiceAmount method for invoice2
        
        
    } // end main method
} // end class
