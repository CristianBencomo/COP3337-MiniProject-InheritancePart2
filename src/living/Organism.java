
package living;


public abstract class Organism {
    
   private static int numberOfOgramism = 0;
   
   protected double metabolicRate;
   
   
   //-----------------------------------------------
   // constructor
   //-----------------------------------------------
   public Organism(){
       
       System.out.println("Executing Organism Class Organism()");
       
       metabolicRate = 0.5;
       
       numberOfOgramism++;
   }
   
   //-----------------------------------------------
   // class methods
   //-----------------------------------------------
   
    public static int getNumberOfOgramism() {
        return numberOfOgramism;
    }

   //-----------------------------------------------
   // instance methods
   //-----------------------------------------------
    public double getMetabolicRate() {
        return metabolicRate;
    }

    public void setMetabolicRate(double metabolicRate) {
        this.metabolicRate = metabolicRate;
    }
    
    
    private void displayHeader(){
        System.out.println("----------------------------------------------------");
        System.out.println(this.getClass().getSimpleName() + " Info");
        System.out.println("----------------------------------------------------");
        
    }
    
    
    protected void dispalyInfo(boolean showHeader){
        
        if(showHeader){
            displayHeader();
        }
        
        System.out.println("Metabolic Rate:\t\t" + metabolicRate);
        
    }
    
   //-----------------------------------------------
   // abstract method
   //-----------------------------------------------
   public abstract void growth();
    
    
   public abstract void stimulus(String input);
    
    
}// end class
