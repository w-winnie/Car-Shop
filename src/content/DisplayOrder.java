/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */ 
package content;

import java.text.DecimalFormat;

public class DisplayOrder 
{
    /**
     * Method to display time in hours and minutes
     * @param time time taken for the service(s)
     * @return formatted time
     */
    public static String displayTime(int time)
    {
        if (time>60)
        {
          int hours = time/60;
          int minutes = time%60;
          return hours + " hours and " + minutes + " minutes";
        }
        else
        return time + " minutes";
    }
    
    /**
     * Method to display price
     * @param price cost of the service(s)
     * @return formatted price
     */
    public static String displayPrice(int price)
    {
        DecimalFormat d = new DecimalFormat("$###0.00");
        return d.format(price);
    }
}
