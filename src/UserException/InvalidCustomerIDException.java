/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */
package UserException;

public class InvalidCustomerIDException extends Exception 
{
    /**
     * Exception for Invalid customer id
     */
    public InvalidCustomerIDException()
    {
        super("Invalid Customer ID");
    }
    
}
