
package living;


public class Reptile extends Organism {
    
   //-----------------------------------------------
   // class variable
   //-----------------------------------------------
    private static int reptileCounter = 0;
    
    private String color;
   //-----------------------------------------------
   // constructors
   //-----------------------------------------------

    public Reptile() {
        super();
        System.out.println("Executing Reptile Class Reptile()");
        color = "Red";
        
        reptileCounter++;
    }
    
    
    public Reptile(String color){
        this();
        
        System.out.println("Executing Reptile Class Reptile(String)");
        
        this.color = color;
        
    }

   //-----------------------------------------------
   // class methods
   //-----------------------------------------------
    public static int getReptileCounter() {
        return reptileCounter;
    }
    

    //-------------------------------------------------
    // implementing a abstract method for Organism
    //-------------------------------------------------
    
    public  void growth(){
        System.out.println("Executing Reptile Class growth()");
    }
    
    
   public void stimulus(String input){
       
       System.out.println("Executing Reptile Class stimulus()");
       if(input.equals("sun")){
            System.out.println("Mammals response positive to:\t\t" + input);
       } else{
           System.out.println("Mammals is non-responsive  to:\t\t" + input);
       }//end if-else
   }
    
}//end class
