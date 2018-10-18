/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */
package carShop;

import content.CheckOrder;
import content.DisplayOrder;
import content.Shop;

/**
 * Class containing the main method for the car shop 
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Shop one = new Shop();
        
        try
        {
            //checking if user id is valid
            CheckOrder.checkID(Integer.parseInt(args[0]));
            
            //checking which service is requested
            for (int sub=1; sub<args.length; sub++)
            {
                 one.setService(CheckOrder.checkService(args[sub]));
                 
                 //calculate price for the service(s)
                 one.calculatePrice();
                 //calculate time for the service(s)
                 one.calculateTime(CheckOrder.checkService(args[sub]));
            }
        
        //Display formatted time
        System.out.println("The total time is: " 
                 + DisplayOrder.displayTime(one.getTime()));
        //Display formatted price
        System.out.println("The total price is: " 
                 + DisplayOrder.displayPrice(one.getPrice()));
       
        }
        
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        finally
        {
            System.out.println("End of the program");
        }     
    } 
}
