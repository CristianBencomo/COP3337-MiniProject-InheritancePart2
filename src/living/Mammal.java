package living;

import interfaces.Processor;

public abstract class Mammal extends Organism implements Processor{
    
    
   //-----------------------------------------------
   // class variables 
   //-----------------------------------------------
    private static int mammalCounter = 0;
    
    
   //-----------------------------------------------
   // instance variables 
   //-----------------------------------------------
    protected boolean hasFur;
    
    //-----------------------------------------------
   // constructor  
   //-----------------------------------------------

    public Mammal() {
        super();
        hasFur = true;
        
        System.out.println("Executing Mammal Class Mammal()");
        mammalCounter++;
    }
    
   //-----------------------------------------------
   // class methods
   //-----------------------------------------------

    public static int getMammalCounter() {
       

        return mammalCounter++;
    }
    
    
   //-----------------------------------------------
   // instance methods
   //-----------------------------------------------

    public boolean getHasFur() {
        
        System.out.println("");
        System.out.println("Executing Mammal Class getHatFur()");
        
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        
        System.out.println("");
        System.out.println("Executing Mammal ClasssetHatFur()");
        
        this.hasFur = hasFur;
    }
    
    
    private void displayHeader(){
        System.out.println("----------------------------------------------------");
        System.out.println(this.getClass().getSimpleName() + " Info");
        System.out.println("----------------------------------------------------");    
    }
    
    
    public void dispalyInfo(boolean showHeader){
        
        if(showHeader){
            displayHeader();
            super.dispalyInfo(!(showHeader));
        }
        
        System.out.println("Has Fur:\t\t" + hasFur);
        
    }

    //-------------------------------------------------
    // implementing a abstract method for Organism
    //-------------------------------------------------

     public  void stimulus(String input){
       
       System.out.println("Executing Mammal Class stimulus()");
       
       if(input.equals("food")){
            System.out.println("Mammals response positive to:\t\t" + input);
       } else{
           System.out.println("Mammals is non-responsive  to:\t\t" + input);
       }//end if-else
       
     }
     
     // IMPORTANT NOTICE THAT WE DID NOT IMPLEMENT THE OTHER TWO ABSTRACT METHOD
     // FROM THE CLASS ORGANISM
     // THIS IS THE REASON THIS CLASS IS STILL ABSTRACT
     // YOU NEED TO IMPLEMENT ALL ABSTRACT METHODS FOR THE CLASS NOT TO BE ABSTRACT
     
     //-------------------------------------------------
     // new abstract method that mammal is defining 
     //-------------------------------------------------
     
     public abstract void breathe();
     
     public abstract void sleep();
     
     
    //-------------------------------------------------
    // Processor Interface methods
    //-------------------------------------------------

     public void process(Processor processor){
         System.out.println("Excuting Mammal process(Processor processor) - Interface Method");
     }
     
}// end class
