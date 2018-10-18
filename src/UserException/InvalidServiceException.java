/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */
package UserException;

public class InvalidServiceException extends Exception 
{
    /**
     * Exception for invalid service requested
     */
    public InvalidServiceException(){
        super("Invalid service requested");
    }
}
