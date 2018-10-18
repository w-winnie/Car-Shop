/**
 * Programmer: Winnie Winnie
 * Program: Car Shop
 * Date: 19 Feb,2018
 */
package content;

public class Shop {
    
    /** Price of the service*/
    private int price;
    /** Time taken by the service*/
    private int time;
    /** Service requested*/
    private String service;
    
    /**
     * Method to display the price 
     * @return price of the service
     */
    public int getPrice()
    {
        return this.price;
    }
    
    /**
     * Method to display time
     * @return time taken by the service
     */
    public int getTime()
    {
        return this.time;
    }
    
    /**
     * Method to take the service requested
     * @param service the service requested by the user
     */
    public void setService(String service)
    {
        this.service = service;
    }
    
    /**
     * Method to calculate price based on service requested
     */
    public void calculatePrice()
    {
        if(this.service.equals("oil change"))
            this.price += 40;
        else if (this.service.equals("tune up"))
            this.price += 50;
        else if (this.service.equals("wheel alignment"))
            this.price += 60;
        
    }
    
    /**
     * Method to calculate time based on service requested
     * @param service service requested by the user 
     */
    public void calculateTime(String service)
    {
        if(service.equals("oil change"))
            this.time += 20;
        else if (service.equals("tune up"))
            this.time += 30;
        else if (service.equals("wheel alignment"))
            this.time += 40;   
    }
    
    
}
