

/* 
class A{
    public void show(){
        System.out.println("Inside A");
    }
}
class B extends A{
    @Override public void show(){
        System.out.println("Inside B");
    }
}
class C extends A{
    @Override public void show(){
        System.out.println("Inside C");
    }
}
class Execute{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;
        ref=a;
        ref.show();

        ref = b;
        b.show();

        ref = c;
        c.show();

    }
}
/* 
final class Calc{
    public void show(){
        System.out.println("Inside calculator..");
    }
}
class AdvCalc extends Calc{
    @Override public void show(){
        super.show();
        System.out.println("Inside AdvCalculator..");
    }
}
class Execute{
    public static void main(String[] args) {
        AdvCalc c =new AdvCalc();
        c.show();
    }
}
 */
/* 
 class Animal{
    void makeSound(){
        System.out.println("Animal is making sound..");
    }
    void fetch1(){
        System.err.println("Fetch1 is running..");
    }
 }
 class Dog extends Animal{
    @Override void makeSound(){
        super.makeSound();
             System.out.println("Dog is barking..");
   
    }
    void fetch2(){
        System.err.println("Fetch2 is running..");
    }
 }
 class Test{
    public static void main(String[] args) {
     
     Animal a =new Dog();

     a.makeSound();
     a.fetch1();
    }
}
    */
/*
class Animal{
    void makeSound(){
        System.out.println("Animal is making sound..");
    }
    void fetch1(){
        System.err.println("Fetch1 is running..");
    }
 }
 class Dog extends Animal{
    @Override void makeSound(){
        super.makeSound();
             System.out.println("Dog is barking..");
   
    }
    void fetch2(){
        System.err.println("Fetch2 is running..");
    }
 }
 class Test{
    public static void main(String[] args) {
     
    Animal a;
    a= new Dog();

     Dog d = (Dog) a;

     d.makeSound();
     d.fetch2();
     d.fetch1();

     
    }
}
     */

/* 
class Demo{
    public static void main(String[] args) {

        // Integer num=5;
        // int num1=num;

        // String S="5";
        // int i=Integer.parseInt(S);
        // int j=i*2;


        // String S="5";
        int S=7;
        Integer i=S;
        int j=i;

        System.out.println(S);
        System.out.println(i);
        System.out.println(j);
    }
}
    */
/* 
    class Parent {
    int num = 10;
}

class Child extends Parent {
    int num = 20;

    void display() {
        System.out.println(num);
    }
}

 class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}*/
/* 
class GFG
{
    int a, b;
     
    GFG()
    {
        a = 10;
        b = 20;
    }
     
    public void print()
    {
        System.out.println ("a = " + a + " b = " + b);
    }
}
class Test
{
 
    public static void main(String args[])
    {
        GFG obj1 = new GFG();
        GFG obj2 = obj1;
 
        obj1.a += 1;
        obj1.b += 1;
 
        System.out.println ("values of obj1 : ");
        obj1.print();
        System.out.println ("values of obj2 : ");
        obj2.print();
 
    }
}
    */
/* 
    interface MyInt {
    default void fun1() {
        System.out.println("fun1()");
    }

    static void fun2() {
        System.out.println("fun2()");
    }

    void fun3();
}

class Test implements MyInt {
    public void fun3() {
        System.out.println("fun3()");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.fun1();
        MyInt.fun2();
        t.fun3();
    }
}
    */
/* 
   abstract class Vehicle{
    
    abstract void car1();
    abstract void car2();
    abstract void car3();
    abstract void car4();
     void car5(){
        System.out.println("car5 is running...");
     }
   }

   abstract class Car extends Vehicle{
    @Override 
    void car1(){
        System.out.println("car is running...");
    }
   }
   class Bus extends Car{
    void car2(){
        System.out.println("car is running...");
    }
    void car3(){
        System.out.println("car is running...");
    }
    void car4(){
        System.out.println("car is running...");
    }
   }
   class Main{
    public static void main(String[] args) {
       Bus b =new Bus();

        b.car1();
        b.car2();
        b.car3();
        b.car4();
        b.car5();
    }
   }

   */
/* 
 abstract class Geeks{
    Geeks(){
        System.out.println("parent constructor called...");
    }
    abstract class Geeks2{
        Geeks2(){
            System.out.println("Inner constructor called..");
        }
        abstract public void show2();
        abstract public void show3();
    }
    abstract public void tvTurnOn();
    abstract public void tvTurnOff();
    final void data(){

        System.out.println("data method called");
    }
    void display(){
        System.out.println("This Is display methiod");
    }
    static void putData(){
        System.out.println("static method called");
    }
    static {
        System.out.println("ststic block called..");
    }
   }

   class TvRemote extends Geeks{
    public TvRemote() {
        System.out.println("Child constructor called..");
    }
    class TvRemote2 extends Geeks2{

        public TvRemote2() {
            System.out.println("innerconstructor2 constructor..");
        }
        public void show2(){
            System.out.println("This is Show 2 method");
            
        }
        public void show3(){

             System.out.println("This is Show 3 method");
        }
        
    }

    @Override
    public void tvTurnOn(){

        System.out.println("Tv is on..");
    } 
    @Override
    public void tvTurnOff(){

        System.out.println("Tv is off..");
    } 
    void show(){
        System.out.println("This is show method");
    }
   }
class Main{
    public static void main(String[] args) {
        TvRemote t=new TvRemote();
        TvRemote.TvRemote2 t2=t.new TvRemote2();
        t.tvTurnOn();
        t.tvTurnOff();
        t.display();
        t.show();
        t.data();
        Geeks.putData();
        t2.show2();
        t2.show3();
    }
}
*/
/* 
abstract class Shape{
    String color;
    abstract double area();
    public abstract String toString();
    Shape(String color){
        System.out.println("Shape constructor called..");
        this.color=color;
    }
    String getColor(){
        return color;
    }
}
class Circle extends Shape{
    double radius;
    Circle(String color,double radius){
        super(color);
        System.out.println("Circle constructor called..");
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Circle color:" + super.getColor() + " and Radius:" + area();
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(String color,double length,double width){
        super(color);
        System.out.println("Rectangle constructor called..");
        this.length=length;
        this.width=width;
    }
    public double area(){
          return length*width;
    }
    public String toString(){
         return "Rectangle color:" + super.getColor() + " and Radius:" + area();
    }
}
class Main{
    public static void main(String[] args) {
        Circle c=new Circle("Red",5.4);
        Rectangle r=new Rectangle("Black",4.5,5.6);

        System.out.println(c.toString());
        System.out.println(r.toString());

    }
}
*/
/* 
 interface Shape{
    final double PI=3.14;
    public double area();
    public String toString();
}

class Circle implements Shape{
    String color;
    double radius;

    Circle(String color,double radius){
        System.out.println("Circle constructor called..");
        this.color=color;
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String toString(){
    
        return "Circle Color:" + color + " Area:" + area();
         
    }

}
class Rectangle implements Shape{
    String color;
    double length;
    double width;
    Rectangle(String color,double length,double width){
        System.out.println("Rectangle constructor called..");
        this.color=color;
        this.length=length;
        this.width=width;
    }
    public double area(){
          return length*width;
    }
    public String toString(){
         return "Rectangle Color:" + color + " Area:" + area();
    }
}
class Main{
    public static void main(String[] args) {
        Circle c=new Circle("Red",5.4);
        Rectangle r=new Rectangle("Black",4.5,5.6);

        System.out.println(c.toString());
        System.out.println(r.toString());

    }
}
*/
/* 
class A{
    void show(){
        System.out.println("in a show..");
    }
    static class B{
       static void display(){
            System.out.println("in a Display");
        }
    }
}
class Main{
    public static void main(String[] args) {
        // A obj =new A();
        // A.B obj1 =obj.new B();
        // obj.show();
        // obj1.display();
        // A.B.display();
        A.B obj = new A.B();
        obj.display();
    }
}
 */
/* 
class A{
    public void show(){
        System.out.println("In A show..");
    }
}
class B extends A{
    public void show1(){
        System.out.println("In B show..");
    }
}
class Main{
    public static void main(String[] args) {
        B obj =new B(){
           @Override
            public void show(){
        System.out.println("In C show..");
    } 
    @Override
    public void show1(){
        System.out.println("In D show..");
    }
        };
        obj.show();
        obj.show1();

    }
}
*/
/* 
abstract class A{
    // public void show(){
    //     System.out.println("In A show..");
    // }
    double radius;
    abstract public double area();
}
// class B extends A{
//     public void show1(){
//         System.out.println("In B show..");
//     }
// }
class Main{
    public static void main(String[] args) {
        A obj =new A(){
           @Override
            public double area(){
        return (Math.PI * radius * radius);
    } 
    // @Override
    // public void show1(){
    //     System.out.println("In D show..");
    // }
        };
        obj.radius=5;
        System.out.println("Radius:"+ obj.area());
        // obj.show1();

    }
}
    */
    /* 
abstract class A{
    double radius;
    public void show(){
        System.out.println("In A show..");
    }
    abstract public double area();
}
class B extends A{
    public void show1(){
        System.out.println("In B show..");
    }
        @Override
         public double area(){
        return (Math.PI * radius * radius);
    
    }
}
class Main{
    public static void main(String[] args) {
        A obj =new B(){

            @Override
         public double area(){
        return Math.PI * radius;
    
    }
        };
    // @Override
    // public void show1(){
    //     System.out.println("In D show..");
    // }
        
        obj.radius=5;
        System.out.println("Radius:"+ obj.area());
        // obj.show1();

    }

    private static void add(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
*/