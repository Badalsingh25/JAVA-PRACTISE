



/*
interface Runnable{
    final int x=10;

    public abstract void area();//public method

    static void show(){
        System.out.println("This is static method..");//static method
        data();
        
    }
    default void display(){
        System.out.println("This is final method..");//default method
        data();

    }
    static private void data(){
      System.out.println("This is private method..");//private methos
    }
}
class Y implements  Runnable{
    public void area(){
        System.out.println("This is public interface method..");
    }
}
class Main{
    public static void main(String[] args) {
        Y y = new Y();
        y.area();
        y.display();
        Runnable.show();
    }
}

/* 
interface Addition{
    public int add(int a,int b);
}
interface Substraction{
    public int sub(int a,int b);
}
interface Multiplication{
    public int mul(int a,int b);
}
interface Division{
    public int div(int a,int b);
}
class Calculator implements  Addition,Substraction,Multiplication,Division{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition:"+ calc.add(5,4));
        System.out.println("Substraction:" + calc.sub(5,4));
        System.out.println("Multiplication:" + calc.mul(5,4));
        System.out.println("Division:" + calc.div(5,4));




    }
}*/

// interface GFG {
//     static  void display() {
//         System.out.println("jay shree Ram");
//     }

//     public static void main(String[] args) {
//         GFG.display();
//     }
// }

/* 
interface Runnable{
    final int x=10;

    public abstract void area();//public method

    static void show(){
        System.out.println("This is static method..");//static method
        data();
        
    }
    default void display(){
        System.out.println("This is final method..");//default method
        data();

    }
     private static void data(){
      System.out.println("This is private method..");//private methos
    }
}
class Y implements  Runnable{
    public void area(){
        System.out.println("This is public interface method..");
    }
}
class Main{
    public static void main(String[] args) {
        Y y = new Y();
        y.area();
        y.display();
        Runnable.show();
    }
}
*/
/* 
interface Computer{
    public void code();
}

abstract class Laptop implements Computer{
    public void code(){
        System.out.println("Code,compile,run as faster...");
    }
}   
abstract class Desktop implements Computer{
    public void code(){
        System.out.println("Code,compile,run ..");
    }
}
class Developer{
    void config(){
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        Laptop lap = new Laptop();


    }
}
*/
/* 
 interface Vehicle{

    void start();
    void stop();
    void fuelType();
 }
 abstract class FourWheeler implements Vehicle{
    @Override
    public void start(){
        System.out.println("Vehicle is starting..");
    }
    @Override
    public void stop(){
        System.out.println("Vehicle has stopped..");
    }
    @Override
    public abstract void fuelType();
 }

 class Car extends FourWheeler{
    @Override
    public void fuelType(){
      System.out.println("Fuel Type: Petrol.");
    }
    void feature(){
        System.out.println("Car has Ac and Music System.");
    }
    
 }
 class Truck extends FourWheeler{
    @Override
    public void fuelType(){
        System.out.println("Fuel Type: Diesel.");
    }
    void loadCapacity(){
        System.out.println("Truck has Max load Capacity");
    }
 }
 class Main{
    public static void main(String[] args) {
        
        // Vehicle car = new Car();
        // car.start();
        // car.fuelType();
        // car.stop();
        // System.out.println("--------------------------------");

        // Vehicle truck = new Truck();
        // truck.start();
        // truck.fuelType();
        // truck.stop();

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car();
        vehicles[1] = new Truck();

        for(Vehicle v:vehicles){
            v.start();
            v.fuelType();
            v.stop();
            System.out.println("--------------------");
        }

        Car car = (Car) new Car();
        car.feature();

        Truck truck = (Truck) new Truck();
        truck.loadCapacity();

    }
 }
*/

/* 
class Test{

    enum Status{
        RED,YELLOW,GREEN,BLUE;
    }
    public static void main(String[] args) {
        // Status s1 =Status.RED;
        // Status s2 =Status.YELLOW;
        // Status s3 =Status.GREEN;
        // Status s4 =Status.BLUE;

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);

        for(Status s:Status.values()){
            System.out.println(s + ":" + s.ordinal());
        }
    }
}
*/
/*
enum TrafficRule{
    RED("stop"),
    YELLOW("wait"),
    GREEN("Go");

    private String action;

    private TrafficRule(String action) {

        this.action =action;
    }
    public String getAction(){
        return action;
    }

    public static void main(String []args){
        
        for(TrafficRule t:TrafficRule.values()){
            System.out.println(t + " means " + t.getAction());
        }
    }
}
*/
/* 
enum StatusCode{
    OK(200,"Success"),
    NOT_FOUND(404,"Resource not found"),
    INTERNAL_SERVER(500,"Internal Servre error");

    private int code;
    private String message;

    private StatusCode(int code,String message) {
       this.code=code;
       this.message=message;
    }
    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }

    public static void main(String []args){

        for(StatusCode S:StatusCode.values()){
            System.out.println(S.getCode() + ":" + S.getMessage() );
        }
    } 
}
*/
/* 
import java.util.*;

enum GameState {
     START, PAUSE, GAME_OVER, WIN;
    }

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the Game state:");
        String state = sc.next();

        int category;

    //   GameState state = GameState.START;

        if(state.equalsIgnoreCase("START")){
            category = 1;
        }
        else if(state.equalsIgnoreCase("PAUSE")){
            category = 2;
        }
        else if(state.equalsIgnoreCase("GAME_OVER")){
            category = 3;
        }
        else if(state.equalsIgnoreCase("WIN")){
            category = 4;
        }
        else{
            category = 5;
        }

        switch (category) {
            case 1:System.out.println("Game Started!");
                break;
            case 2:System.out.println("Game Paused.");
                break;
            case 3:System.out.println("Game Over!");
                break;
            case 4:System.out.println("You Win!");
                break;
            case 5:System.out.println("Invalid state !");
                break;
            default:System.out.println("Something went wrong !");
        }
    }
}
*/
/*
@FunctionalInterface
interface A{
    public int add(int i,int j);
}
class Main{
    public static void main(String[] args) {
        A obj  = (i,j) -> i + j;

        System.out.println( "Result = " + obj.add(5,7));
    }
} */


@FunctionalInterface
interface A {
     int operation(int i, int j);
}

class Main {
    public static void main(String[] args) {
        A obj = (i,j) -> i + j;
        A obj1 = (i,j) -> i - j;

        System.out.println("Addition = " + obj.operation(5, 7));
        System.out.println("Substraction = " + obj1.operation(7,5));
        
    }
}


 class CommandLineExample {
    public static void main(String[] args) {
        // Print all command line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}

 class SumAllNumbers {
    public static void main(String[] args) {
        // Check if at least 1 argument is provided
        if (args.length == 0) {
            System.out.println("Please provide one or more integers as command line arguments.");
            return;
        }

        int sum = 0;

        try {
            // Loop through all arguments
            for (String arg : args) {
                int num = Integer.parseInt(arg); // convert string to int
                sum += num;
            }

            // Display result
            System.out.println("The sum of given numbers is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
        }
    }
}
