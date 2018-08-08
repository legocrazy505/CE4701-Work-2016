/**
 * Project 3 Part (A)
 * 
 * Completed by (name redacted)
 * 
 * Last Modified 18 10 2016
 * 
 * This class creates an invoice. The first constructor initialises the instance variables with no paramters.
 * The second contstructor uses set and get methods to create an invoice object. Set methods quantity, price and
 * VAT all have checks using if statements. A getInvoiceAmount calculates the total of the invoice object. A toString
 * method outputs the various details of the invoice (code, description, quantity, price, VAT)
 */

public class Invoice // start of class Invoice
{
    private String code; // part code for this Invoice
    private String description; // description for this Invoice
    private int quantity; // quantity of items in Invoice
    private double price; // price of Invoice
    private double vatRate; // VAT on Invoice
    
    // constructor initialises five instance variables with no parameters
    public Invoice( )
    {
        code = null;
        description = null;
        quantity = 0;
        price = 0.0;
        vatRate = 0.0;
    } // constructor ends
    
    // constructor with parameters set
    public Invoice( String partcode, String partdesc, int quant, double cost, double vat )
    {
        code = partcode;
        description = partdesc;
        quantity = quant;
        price = cost;
        vatRate = vat;
    } // constructor end
    
    // method to set code
    public void setCode( String partcode )
    {
        code = partcode; // store the part code
    } // end method setCode
    
    // method to set Description
    public void setDescription( String partdesc )
    {
        description = partdesc; // store the description
    } // end method setDescription
    
    // method to set Quantity
    public void setQuantity( int quant)
    {
        if (quant < 0) // adjusts quantity to 0 if less than 0
        {
             quant = 0;
        } // end if statement
        
        quantity = quant; //store the quantity
    } // end method setQuantity
    
    // method to set Price
    public void setPrice( double cost )
    {
        if (cost < 0.0) // adjusts price to 0 if less than 0
        {
            cost = 0.00;
        } // end if statement
        
        price = cost; // store the price
    } // end method setPrice
    
    // method to set VAT
    public void setVatRate( double vat )
    {
        if (vat !=23.00 && vat !=13.50 && vat !=0.00) // if vat rate is not a valid rate set to 0
        {
            vat = 0.00;
        } // end if statement
        
        vatRate = vat; // store the vat rate
    } // end method setVatRate
    
    // method to get the part code
    public String getCode()
    {
        return code;
    } // end method getCode
    
    // method to get the description
    public String getDescription()
    {
        return description;
    } // end method getDescription
    
    // method to get the quantity
    public int getQuantity()
    {
        return quantity;
    } // end method getQuantity
    
    // method to get the price
    public double getPrice()
    {
        return price;
    } // end method getPrice
    
    // method to get the VAT
    public double getVatRate()
    {
        return vatRate;
    } // end method getVatRate
    
    // begin method getInvoiceAmount
    public double getInvoiceAmount()
    {
        double totalexclvat; // total excluding vat
        double totalvat; // total vat
        double total; // total including vat
        
        totalexclvat = price * quantity;
        totalvat = totalexclvat/100 * vatRate;
        total = totalexclvat + totalvat;
        return total;
    } // end method getInvoiceAmount
    
    public String toString() // toString method to display invoice details
    {
        return "Item Code: " +code +"\n"
               +"Item Description: " +description +"\n"
               +"Quantity: " +quantity +"\n"
               +"Price: " +price +"\n"
               +"VAT Rate: " +vatRate +"\n";
    } // end toString method   
}// end class
    