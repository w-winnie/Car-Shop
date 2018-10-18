/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */
package content;

import UserException.InvalidCustomerIDException;
import UserException.InvalidServiceException;
import java.util.Arrays;


public class CheckOrder 
{
    /** Valid customer IDs */
    private static int[] customerIDs = {101, 104, 108, 109, 111};
    
    /**
     * Method to check if the ID is valid 
     * @param id ID of the customer
     * @return true if the ID is valid
     * @throws InvalidCustomerIDException
     */
    public static boolean checkID(int id) throws InvalidCustomerIDException
    {
            if (Arrays.binarySearch(customerIDs, id) != -1)
               return true;
            else
               throw new InvalidCustomerIDException();
    }
    
    /**
     * Method to check if the service is valid
     * @param service service requested by the user
     * @return oil change / tune up / wheel alignment
     * @throws InvalidServiceException 
     */
    public static String checkService(String service) 
            throws InvalidServiceException
    {
        if (service.charAt(0) == 'o' || service.charAt(0) == 'O')
            return "oil change";
        else if (service.charAt(0) == 't' || service.charAt(0) == 'T')
            return "tune up";
        else if (service.charAt(0) == 'w' || service.charAt(0) == 'W')
            return "wheel alignment";
        else
            throw new InvalidServiceException();
    }
}
