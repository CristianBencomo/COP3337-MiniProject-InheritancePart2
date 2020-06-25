
package machine;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public abstract class Vehicle {
    
    //---------------------------------
    // Class variables and constants
    //---------------------------------
    private static final String CLASSIFICATION = "Vehicle";
    private static final String CODE = "V";
    private static String[] factories = {"MIAMI", "AUSTIN", "LOGAN", "CHARLOTTE"};
    private static int nextID = 5000;
    private static int numberOfVehiclesBuild = 0;
    public static int x = 5;
    
    //---------------------------------
    // Instance variables 
    //---------------------------------                  
    protected String id;
    protected String factory;    
    private Date buildTime;
    private boolean seeHeader;
    
    //---------------------------------
    // Constructor
    //---------------------------------
    public Vehicle(){
        
        System.out.println("Executing Vehicle class - Vehicle()");
        
        Random rndGen = new Random();
        
        int index = rndGen.nextInt(4);
        
        String letters = factories[index].substring(0, 3);
        id = CODE + "-" + letters + "-" + nextID;
        
        factory = factories[index];
        buildTime = new Date();
        
        seeHeader = true;
        
        nextID++;
        numberOfVehiclesBuild++;

    }
    
    //---------------------------------
    // Class methods
    //---------------------------------
    public static String getClassification() {
        return CLASSIFICATION;
    }

    public static String[] getFactories() {
        return factories;
    }

    public static int getNumberOfVehiclesBuild() {
        return numberOfVehiclesBuild;
    }

   //-------------------------------------
   // Instance methods setter and getters
   //-------------------------------------

    public boolean getSeeHeader() {
        return seeHeader;
    }

    public void setSeeHeader(boolean seeHeader) {
        this.seeHeader = seeHeader;
    }
    
    
    // LOOK CARFULLY AT THIS METHOD
    // SEE SOMETHING DIFFERENT
    // WHAT IS THE FINAL DOING
    public final Date getBuildTime() {
        System.out.println("Executing Vehicle class -> Date getBuildTime()");
        return buildTime;
    }
    


    //----------------------------------------------------
    // Instance methods that may be overridden or overload
    //----------------------------------------------------
    private void displayHeader(){
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("Vehicle Info");
        System.out.println("======================================");
    }
    
   
    
     public void displayInfo(){
         
        System.out.println("Executing Vehicle Class displayInfo()");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        
        if(seeHeader){
            displayHeader();
            System.out.println("Classification:\t\t" + CLASSIFICATION);
        }
        
        System.out.println("ID:\t\t\t" + id);
        System.out.println("Factory:\t\t" + factory);
        System.out.println("Build Time\t\t" + dateFormat.format(buildTime));
    }
     
    //----------------------------------------------------
    // abstract methods
    //----------------------------------------------------
     
    public abstract void go();
    public abstract void stop();
     
     
}//end class









