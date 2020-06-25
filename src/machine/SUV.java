
package machine;

import java.text.SimpleDateFormat;


public class SUV extends Car{
    
    //---------------------------------
    // Class variables and constants
    //---------------------------------
    private static final String CLASSIFICATION  = "SUV";
    private static final String CODE = "S";
    
    //---------------------------------
    // Instance variables 
    //---------------------------------   
    // refinement 
    protected boolean hasAllWheelDrive;
    
    //---------------------------------
    // Constructor
    //---------------------------------
    
    public SUV(){
        
        super();
        id = CODE + "-" + id;
        hasAllWheelDrive = false;
        
        System.out.println("Executing SUV class - SUV()");
    }
    
    public SUV(String color, String engineType, boolean hasAllWheelDrive){
        
        super(color, engineType);
        this.hasAllWheelDrive = hasAllWheelDrive;
        
        System.out.println("Executing SUV class -SUV(String color, String engineType, boolean hasAllWheelDrive)");
    }
    
    // uses Car's stop and go methods
    
    //----------------------------------------------------
    // Instance methods that may be overridden or overload
    //----------------------------------------------------
    // this is not overridden because it is not inheritance from Vehicle
    private void displayHeader(){
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("SUV Info");
        System.out.println("======================================");
    }
    
    // overriden methed
    @Override
    public void displayInfo(){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
        
        displayHeader();
  
         // what am I doing here and why
         super.setSeeHeader(false);
       
         // what is running here 
         super.displayInfo();
        
         System.out.println("All-Wheel-Drive:\t" + hasAllWheelDrive);
        
         // why I am doing this
         if(!(super.getSeeHeader() ) ){
            super.setSeeHeader(true);
         }//end if   
    }
    
    
    
    public  void go(){
         System.out.println("SUV instance is running its go()");
     }
     
     public  void stop(){
        System.out.println("SUV instance is running its stop()");
     }
     
     
     
     
    
    
    //----------------------------------------------------
    // Instance methods refinment in SUV
    //----------------------------------------------------
    public void engageAllWheelDrive(){
        if(hasAllWheelDrive){
            System.out.println("Engaging All-Wheel-Drive in the  SUV");
        }else{
            System.out.println("Sorry All-Wheel-Drive cannot be engaged in the SUV ");
        }//end if-else
    }
    
}//end class



