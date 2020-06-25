
package machine;

import interfaces.Processor;
import interfaces.Publisher;
import java.text.SimpleDateFormat;
import java.util.Random;


public class Car extends Vehicle  implements Processor, Publisher{
    
    //---------------------------------
    // Class variables and constants
    //---------------------------------
    private static final String CLASSIFICATION  = "Car";
    private static final String CODE = "C";
    
    //---------------------------------
    // Instance variables 
    //---------------------------------   
    // refinement instance variables
    protected String color;
    protected String engineType;
    protected double mileage;
    private boolean seeHeader;
    
    //---------------------------------
    // Constructor
    //---------------------------------
    public Car(){
        this("Black", "Gasoline");
        System.out.println("Executing Car class - Car()");
        
        System.out.println("Executing Car class - Car()");
    }
    
    public Car (String color, String engineType){
        super();
        
        // look this carefully... where is the id coming from 
        // where is it declared
        id = CODE + "-" + id;
        
        this.color = color;
        this.engineType = engineType;
        mileage = 0.0;
        seeHeader = true;
        
        System.out.println("Executing Car class - Car (String color, String engineType)");
        
    }
    
    
    //----------------------------------------------------
    // Instance methods that may be overridden or overload
    //----------------------------------------------------
    // this is not overridden because it is not inheritance from Vehicle
    private void displayHeader(){
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("Car Info");
        System.out.println("======================================");
    }
    
    // overriden methed
    @Override
    public void displayInfo(){
        
        System.out.println("Executing Car Class displayInfo()");
        
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        
        if(seeHeader){
            displayHeader();
            System.out.println("Classification:\t\t" + CLASSIFICATION);
            
            // what am I doing here and why
            super.setSeeHeader(false);
        }
        
        super.displayInfo();
        System.out.println("Color:\t\t\t" + color);
        System.out.println("Engine Type:\t\t" + engineType);
        
        // why am I using a printf here
        System.out.printf("Mileage:\t\t%-10.1f\n", mileage);
        
        // why I am doing this
        if(!(super.getSeeHeader() ) ){
            super.setSeeHeader(true);
        }//end if   
    }
    
     //---------------------------------------------------
    // abstract  methods being implement 
    //----------------------------------------------------
     public  void go(){
         System.out.println("Car instance is running its go()");
     }
     
     public  void stop(){
        System.out.println("Car instance is running its stop()");
     }
     
     
    //-------------------------------------------------
    // Publisher Interface methods
    //-------------------------------------------------
     
     public void info(){
          System.out.println("Executing Car Class info() - Publisher Interface method)");
      }


    
     public void showRandonData(){
         System.out.println("Executing Car Class showRandonData()  - Publisher Interface method)");
         
         String[] letters ={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
         Random ranGen =  new Random();
         
         for(int i=0; i< 10 ; i++){
             System.out.print(letters[ranGen.nextInt(10)] + "\t");
          }
         System.out.println("");
     }

    //-------------------------------------------------
    // Process Interface methods
    //-------------------------------------------------
    public void process(Processor processor) {
        System.out.println("Executing Car Class process()  - Process Interface method)");
    }
         
     
     
}//end class


