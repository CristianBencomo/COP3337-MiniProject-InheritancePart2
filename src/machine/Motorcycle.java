
package machine;

import java.text.SimpleDateFormat;

public class Motorcycle extends Vehicle{
    
    //---------------------------------
    // Class variables and constants
    //---------------------------------
    private static final String CLASSIFICATION  = "Motorcycle";
    private static final String CODE = "M";
    
    //---------------------------------
    // Instance variables 
    //---------------------------------   
    // refinement 
    protected String color;
    protected String engineType;
    protected double mileage;

    //---------------------------------
    // Constructor
    //---------------------------------
    
    public Motorcycle(String color){
        super();
        
        System.out.println("Executing Motorcycle class - Motorcycle(String color)");
        
        // look this carefully... where is the id coming from 
        // where is it declared
        id = CODE + "-" + id;
        
        this.color = color;
        this.engineType = "Gasoline";
        mileage = 0.0;
        
    }
    
    
    //----------------------------------------------------
    // Instance methods that may be overridden or overload
    //----------------------------------------------------
    private void displayHeader(){
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("Motorcycle Info");
        System.out.println("======================================");
    }
    
   
    
     public void displayInfo(){
         
         System.out.println("Executing Motorcyle Class displayInfo()");
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        
         displayHeader();
         System.out.println("Classification:\t\t" + CLASSIFICATION);
       
        
        System.out.println("ID:\t\t\t" + id);
        System.out.println("Factory:\t\t" + factory);
        System.out.println("Build Time\t\t" + dateFormat.format(super.getBuildTime()) );
    }
     
     
    public void go(){
        System.out.println("");
        System.out.println("Motorcycle instance is running go()");
    }
    
    
     public void stop(){
        System.out.println("");
        System.out.println("Motorcycle instance is running stop() ");
    }
     
    //----------------------------------------------------
    // Instance methods refinment in Motorcycle
    //----------------------------------------------------
    public void wheelie(){
        System.out.println("Motorcyle's wheelie() executed");
    }
    
}//end class




