
package living;

import interfaces.Processor;
import interfaces.Publisher;
import java.util.Random;


public class Human extends Mammal implements Publisher{
    
    private static int humanCounter = 0;
    
    private String name;
    private int age;

   //-----------------------------------------------
   // constructor
   //-----------------------------------------------
    public Human() {
        super();
        hasFur = false;
        
        System.out.println("Executing Human Class Human()");
        humanCounter++;        
    }
    
    public Human(String name, int age){
        this();
        this.name = name;
        this.age = age;
        
        System.out.println("Executing Human Class Human(String name, int age)");
    }
    
   //-----------------------------------------------
   // class methods
   //-----------------------------------------------

    public static int getHumanCounter() {
        return humanCounter;
    }
    
    
   //-----------------------------------------------
   // instamce methods
   //-----------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        
        System.out.println("Name:\t\t\t" + name);
        System.out.println("Age:\t\t\t" + age);
        
    }
    
    
    //-------------------------------------------------
    // implementing abstract methods from organism 
    //-------------------------------------------------
    public  void growth(){
        System.out.println("");
        System.out.println("Executing Human Class growth()");
     }
    
    
    //-------------------------------------------------
    // implementing abstract methods from mammal 
    //-------------------------------------------------
    
     public  void breathe(){
         System.out.println("");
         System.out.println("Executing Human Class breathe()");
     }
     
     public  void sleep(){
         System.out.println("");
         System.out.println("Executing Human Class sleep()");
     }
     
     
    //-------------------------------------------------
    // new method instance method
    //-------------------------------------------------
    public void publicTalk(){
         System.out.println("");
          System.out.println("Executing Human Class publicTalk()");
        talk();
    }
     
     protected void talk(){
          System.out.println("Executing Human Class talk()");
     }


    
    //-------------------------------------------------
    // Publisher Interface methods
    //-------------------------------------------------
    
      public void info(){
          System.out.println("Executing Human Class info() - Publisher Interface method)");
      }


    
     public void showRandonData(){
         System.out.println("Executing Human Class showRandonData()  - Publisher Interface method)");
         Random ranGen =  new Random();
         
         for(int i=0; i< 10 ; i++){
             System.out.print(ranGen.nextInt() + "\t");
          }
         System.out.println("");
         
         
     }
     
    
}//end class
