// COP3337 - Inheritance Mini-Project

package app;

import interfaces.Publisher;
import living.Human;
import living.Organism;
import living.Reptile;
import machine.Car;
import machine.Motorcycle;
import machine.SUV;
import machine.Vehicle;



public class Controller {

 
    public static void main(String[] args) {
       
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE MOTORCYCLE CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        
        System.out.println("=========================================");
        System.out.println("Section 1 - MOTORCYCLE CLASS");
        System.out.println("=========================================");
        
        // UNDERSTAND THIS
        // public abstract class Vehicle 
        
        // Cannot create a instance of Vehicle because Vehicle is an abstract class
        // Vehicle vehicle = new Vehicle(); <- NOT VALID
        
        //--------------------------------------------------------------
        System.out.println("1.1 - Creating a Motorcycle -> Motorcycle motorcycle1 = new Motorcycle(\"Blue\")\n");
        // Motorcycle extends Vehicle and is not an abstract class
        // because it implemented all the abstract method with the Vehicle class
        
        // note motor can be two types
        // motorcycle and vehicle because inheritance
        
        // public class Motorcycle extends Vehicle
        
        Motorcycle motorcycle1 = new Motorcycle("Blue");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //--------------------------------------------------------------
        System.out.println("1.2 - Creating a Motorcycle -> Vehicle motorcycle2 = new Motorcycle(\"Red\")\n");
         // UNDERSTAND THIS AND WHY
        // this is valid because of Object Oriented inheritance
        // you need to now the side effects
        // this will behave like a motorcyle object in the runtime system.
        // the IDE cannot see the methods of Vehicle class when using the
        // . operator if you which to see the motrcycle method you need to cast the 
        // object for example:  ((Motorcycle)motorcycle2).    <- now the IDE 
        // will see all the methods
        Vehicle motorcycle2 = new Motorcycle("Red");
        
        //try it ...
        // motorcycle2
        // ((Motorcycle)motorcycle2
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
       
        //--------------------------------------------------------------
        System.out.println("1.3 -> motorcycle1.displayInfo()");
        // notice this will NOT run the Vehicle class displayInfo()
        // but instead the Motorcycle class displayInfo()
        // IT IS IMPORTANT YOU UNDERSTAND THIS AND WHY THIS IS THE CASE
        motorcycle1.displayInfo();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //--------------------------------------------------------------
        System.out.println("1.4 -> motorcycle1.displayInfo()");
        motorcycle2.displayInfo();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

        // UNDERSTAND THE OUTPUT FROM THE CODE ABOVE
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE CAR CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 2 - CAR CLASS");
        System.out.println("=========================================");
        
        // types the Car class take on due to inheritance
        // Vehicle and Car
        
        // public class Car extends Vehicle  implements Processor, Publisher
        
        System.out.println("2.1 - Creating a Car instance -> Car car = new Car()\n");
        // a car instance can be two types: Car and Vehicle because of inheritance 
        Car car = new Car();     
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        System.out.println("2.2 -> car.getBuildTime();  \n");
        // running a method that is inherited but NOT OVERRIDE in the car class
        // hence the code will run out of the vehicle class
        // study this output
        car.getBuildTime();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        System.out.println("2.3 -> car.displayInfo()  \n");
        // running a method that is inherited  OVERRIDE in the car class
        // REMEMBER THAT AT OVERRIDE METHOD THE METHOD MUST HAVE THE 
        // SAME SIGNATURE -> same name and input parameters
        // example ->  public void displayInfo()
        // signature ->  displayInfo()
        
        //---------------------------------------------------
        // IF TWO METHODS HAVE THE SAME NAME BUT DIFFERENT INPUT PARAMETERS
        // HENCE THEY HAVE DIFFERENT SIGNATURES
        // THE METHODS ARE DIFFERENT AND THIS IS CALL OVERLOADING THE METHOD
        //---------------------------------------------------
        // example -> displayInfo()
        // example -> displayInfo(String date)
        
        // Note this code will run out of the car class not the Vehicle class
        // study this output
        car.displayInfo();
        
        // LOOK AT THE OUTPUT AND TRY TO FIGURE OUT WHERE THE VARIABLE DATA
        // IS COMING FROM --- IMPORTANT
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
         
         
         //--------------------------------------------------------------
        System.out.println("2.4 -> car.displayInfo()  \n");
        // IMPLEMENTING VEHICLE ABSTRACT METHOD
        // the vehicle class is an abstract class because is has two abstract methods
        // public abstract void go()
        // public abstract void stop()
        
        // because of this reason the class is not completely defined so you cannot 
        // create an instance of the vehicle class
        // example (not valid) -> Vehicle myVehicle = new Vehicle()
        
        // the car class is not abstract because it implement both these methods.
        // a class that extends an abstract class can stay abstract by not implementing  
        // the abstract methods or definig new abstract methods
        
        car.go();
        car.stop();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
         
         
        //--------------------------------------------------------------
        
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE SUV CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 3 - SUV CLASS");
        System.out.println("=========================================");
        // the SUV class extends the Car class an is not abstract
        // rememeber you extend a class to establish a refinement in the class
        // the SUV adds hasAllWheelDrive instance variable... suv may have 
        // all wheel drive 
        // Also the SUV class overrides the few methods of the car class
        // these refinements in the methods are more suited for an SUV 
        // study the output and look at the difference in the Vehicle, Car and SUV
        // classes
        
        // possible  types the Car class take on due to inheritance
        // Vehicle, Car and SUV
        
        // public class SUV extends Car
        
        
        SUV suv = new SUV();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //--------------------------------------------------------------
        System.out.println("3.1 -> suv.displayInfo()  \n");
        // refinement of the methods
        suv.displayInfo();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //--------------------------------------------------------------
        System.out.println("3.2 -> suv.go() and suv.stop()  \n");
        // refinement of the methods
        suv.go();
        suv.stop();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        System.out.println("3.3 -> scar.getBuildTime()  \n");
        // Notice that the SUV did not override the getBuildTime()
        // since car did not refine it and SUV did not 
        // this code will run for the Vehicle
        // MAKE USE YOU UNDERSTAND THIS ...
        // TRACE THE CODE
        
        car.getBuildTime();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // CASTING IN THIS HIERARCHY
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        
        
        // Look at the UML Diagram you will see that
        
        // Vehicle <- Car - SUV
        //     \
        //      <-Motorcycle
        
        // Notice at Car, SUV, and the Motorcycle extends Vehicle class
        // Types of a Vehicle Instance <- only vehicle
        // Type of a Car Instance <- Vehicle and Car
        
        // YOU CANNOUT CAST SUV AS A MOTORCYCLE 
        // ((Motorcycle)suv).  <- this is not allowed becuase it is not in the hierarchy
        // line
        
        // YOU CAN DOWN CAST BUT NOT UP CAST
        // Example Down cast (THIS IS OK)
        // ((Vehicle)suv).
        // ((Car)suv).
        // ((Vehicle)motorcyle).
        
        // Example Up cast (THIS IS NOT OK) Runtime error not complie time error
        // ((SUV)vehicle).
        // ((SUV)car).
        // ((SUV)car).displayInfo();   <- try it
         
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE ORGANISM CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 4 - ORGANISM CLASS");
        System.out.println("=========================================");
        // Look at the UML diagram you will notice that the Organism class and its 
        // subclasses are not related to the Vehicle class and its subclasses through 
        // inheritance.
        
        
        //  Organism is an abstract class because it defines two abstract methods:
        //  public abstract void growth();
        //  public abstract void stimulus(String input);
        
        // So you can not create a instance of this class
        
        // Organism organism = new Organism();  <- NOT VALID
        // Organism organism = new Organism();  <- try it
        
        // but you can communicate with the Organism Class entity 
        
        // public abstract class Organism
        
         //--------------------------------------------------------------
        System.out.println("4.1 -> Organism.getNumberOfOgramism()  \n");
        // but you can communicate with Organism Class entities 
        // Commiunciate Class entity (static)

        System.out.println("Number of Ogramism:\t" + Organism.getNumberOfOgramism());
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE MAMMAL CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 5 - MAMMAL CLASS");
        System.out.println("=========================================");
        
        // LOOK AT THIS
        
        // public abstract class Mammal extends Organism implements Processor
        
        // the Mammal class extends the Organism class BUT is still ABSTRACT
        // Mammal class implement the two abstract method from Orgranism
        /*
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
        */
        // but defines two  new abstract methods 
        // public abstract void breathe();
        // public abstract void sleep();
        
        // this is the reason the Mammal class is abstract still
        // therefore you cannot create an instance of it
        // Mammal mammal = new Mammal(...) <- not valid
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE Human CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 6 - HUMAN CLASS");
        System.out.println("=========================================");
        
        // The Human class extends the Mammal class and it is not abstract  
        // so you can create an instance of this class
        
        // public class Human extends Mammal implements Publisher
        
        
         //--------------------------------------------------------------
        System.out.println("6.1 -> Human human =  new Human(\"Bill\", 20)  \n");
        // the class has two constructors
        
        // public Human(String name, int age) and public Human()
        
        // LOOK AT THE OUTPUT OF THIS STEP AN SEE HOW EACH SUPER CONSTRUCTOR 
        // IS BEING EXECUTED
        Human human =  new Human("Bill", 20);
        
        System.out.println("--------------------------------------------------------");        
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        System.out.println("6.2 -> protected void publicTalk() \n");
        // this overrides methods and add new method 
        // implements abstract methods from organism 
        // public  void growth(){
   

        // implements abstract methods from Mammal class
        // public  void breathe(){
        // public  void sleep(){
    
        // new method instance method
        // protected void talk() and  public void publicTalk()
        // BUT WE HAVE A PROBLEM WE CANNOT CALL talk() FROM  HERE
        // BECAUSE OF THE ACCESS MODIFIER (protected)
        // Controller class can not see the talk method of a Human instance
        // reason is that we are not in the inheritance chain
        // controller is not related to Human via inheritance
        
        // human.talk()  <- error in the IDE (try it)
        
        // solution -> call the publicTalk() of the  Human class which calls talk()
        human.publicTalk();
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // WORKING WITH THE REPTILE CLASS
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("=========================================");
        System.out.println("Section 7 - REPTILE CLASS");
        System.out.println("=========================================");
        // the R eptile class extends Organism class
        
        // public class Reptile extends Organism 
        
        // there is nothing special about this class that we have not covered already
        // the refinement of this class is that it does implement the abstract methods
        // of Organism and adds the color instance variable
        
         //--------------------------------------------------------------
        System.out.println("7.1 -> Reptile reptile = new Reptile(\"Bule\") \n");
        
        Reptile reptile = new Reptile("Blue");
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

//----------------------------------------------------------------------------------- 
//-----------------------------------------------------------------------------------        
// IT IS SUPER  IMPRTORTANT YOU UNDERSTAND THE NEXT SECTIONS       
// BIG PICTURE -> HOW IT ALL WORKS TOGETHER
//----------------------------------------------------------------------------------- 
//----------------------------------------------------------------------------------- 

        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // PASSING OBJECTS TO METHODS
        // THIS IS SUPER IMPORTANT TO UNDERSTAND
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("====================================================");
        System.out.println("Section 8 - PASSING OBJECT TO METHOD - INHERITANCE");
        System.out.println("====================================================");
        
        // each class Motorcycle, Car and SUV are not abstract we can create an 
        // instance of each of these classes
        
         //--------------------------------------------------------------
        System.out.println("8.1 -> Creating objects \n");
        
        Motorcycle motorcycle3 = new Motorcycle("White");
        Car car3 = new Car();
        SUV suv3 = new SUV("White", "Deisel", true);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");

         //--------------------------------------------------------------
        System.out.println("8.2 -> Calling processMotorcycle(motorcycle3) \n");
        
        processMotorcycle(motorcycle3);

        // processMotorcycle(car3);  ,- not valid wrong type 
        
         System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
         //--------------------------------------------------------------
        System.out.println("8.2 -> Calling processCar(car3) \n");
        
        processCar(car3);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //--------------------------------------------------------------
        System.out.println("8.3 -> Calling processSUV(car3) \n");
        processSUV(suv3);
        
        // processSUV(car3);   <- this is not valid
        
        processCar(suv3);   //  <- THIS IS VAILD
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
        
        //----------------------------------------------------------------
        // BIG IDEA 
        // YOUR COULD REPLACE ALL THESE METHOD WITH JUST ONE
        //----------------------------------------------------------------
        
      
        System.out.println("8.4 -> Calling processVehicle((.... ) \n");
        processVehicle(motorcycle3);
        processVehicle(car3);
        processVehicle(suv3);
        
       // UNDERSTAND THIS
       // processVehicle(human);  // <- not valid human is not an instance of Vehicle
                                  // human can not cast itself into a vehicle
        System.out.println("--------------------------------------------------------");
        System.out.println("\n");
     
        
        
        
        
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        // PASSING OBJECTS TO METHODS
        // THIS IS SUPER IMPORTANT TO UNDERSTAND
        //--------------------------------------------------------------
        //--------------------------------------------------------------
        System.out.println("====================================================");
        System.out.println("Section 9 - PASSING OBJECT TO METHOD - INTERFACES");
        System.out.println("====================================================");
        
        // we have a problem if we wish to have object that are not related
        // through inheritance go through a method
        // Example:
        // processVehicle(human);  // <- not valid human is not an instance of Vehicle
                                   // human get not cast itself into a vehicle
                                   
        // a solution to this problem is interfaces
        // BIG IDEA
        // IF A CLASS IMPLEMENTS AN INTERFACE AN INSTANCE OF THE CLASS CAN TAKE
        // THE TYPE OF THE INTERFACE
        
        // IMPORTANT MAKE SURE YOU UNDERSTAND THIS
        
        // public class Car extends Vehicle  implements Processor, Publisher
        // public class SUV extends Car{
        // public class Human extends Mammal implements Publisher
        
        /*
           public interface Publisher {
                public void info();
                public void showRandonData();
    
           }
         */
        
        processPublisher(car3);
        
        // look at the output of this method call carefully
        // understand where this code is running from
        processPublisher(suv);  // this works through inheritance of Car
                                // that implements Publisher
                                // all method in the interface are public
                                
                      
        processPublisher(human);
        
        // processPublisher(motorcycle3); <- NOT VALID the motorcycle class does
                                             // not implement the Publisher Interface   
        
       // YOU TRY SO CODING
       //=========================================================
       
       // create this method below
       // public static void processProcessor(Processor processor)
       
       // and create instances that can be pass to this method to run the 
       // process(Processor processor) method
        
    }// end main
    
    
    public static void processMotorcycle( Motorcycle motorcylce){
        motorcylce.go();
    }
    
    public static void processCar( Car car){
        car.go();
    }
     
    public static void processSUV( SUV suv){
        suv.go();
    }
      
      
    public static void processVehicle( Vehicle vehicle){
        
        //notice the the input to this method is of type Vehicle
        // but you are pass 
        
        
        // polymorphism will figure out which go method to run
        // CHECK THE OUTPUT
        vehicle.go();
    }
    
    public static void processPublisher(Publisher publisher){
        
        // polymorphism will figure out which go method to run
        // CHECK THE OUTPUT
        publisher.showRandonData();
        System.out.println("");
               
    }

}//end class


