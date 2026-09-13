


//     public static void main(String[] args) {
        
//         String name="Navin";
//         // name=name.concat(" Reddy");
//         // name="Raj";
//         System.out.println("Hello "+name);
//         // System.out.println(name.hashCode());
//         // System.out.println(name.charAt(1));
//         // System.out.println(name[0]);
//     }
// }

/* 
class TestBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");         // add text at the end
        sb.insert(5, " Java");       // insert at index 5
        sb.replace(0, 5, "Hi");      // replace characters from 0–4
        sb.delete(2, 6);             // delete characters from 2–5
        sb.reverse();                // reverse the whole string

        System.out.println(sb);
    }
}
    */

/*
class TestBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Navin");

        sb.setCharAt(0, 'R');        // change 'N' → 'R'
        sb.append(" Reddy");         // add at the end
        sb.insert(5, " Kumar");      // insert at index 5
        sb.delete(0, 2);             // delete characters from 0–1
        sb.reverse();                // reverse string

        System.out.println(sb);
    }
}
*/

/* 
class TestBuffer{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Badal");

        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
     
        sb.append(" Singh");//Badal Singh
        sb.delete(2, 6);
        sb.insert(7," gkh");
        sb.replace(0,3,"jay");
        sb.reverse();
        System.out.println(sb);

        // String str=sb.toString();
        // System.out.println(str);
    }
}

*/
/* 

//Static datamember and method
class Mobile{
    String brand;
    int price;
    static String name="SmartPhone";
    Mobile(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    static void show(Mobile obj){

        System.out.println("Brand:" + obj.brand + "\n" + "Price:" + obj.price + "\n" + "Name:" + name + "\n");
    }
}

class Demo{
    public static void main(String[] args) {

        Mobile obj1=new Mobile("Apple",20000);
       
        Mobile obj2=new Mobile("Samsung",22000);
        
        Mobile.show(obj1);
        Mobile.show(obj2);

        Mobile.name="CellPhone";
        Mobile.show(obj1);
        Mobile.show(obj2);
    } 
}

*/
/* 
class Database {
    public static void main(String[] args) {
        System.out.println("Jay Shree Ram");
    }
    static {
        System.out.println("Loading DB driver...");
    }
  static { 
        System.out.println("Block 2"); 
    }
    static 
    { 
        System.out.println("Block 1"); 
    }
}


class config{
    int x=5;
    static {
        System.out.println("This is static block");
        config c=new config();
        System.out.println("X:" + c.x);
    }
    public static void main(String[] args) {
        System.out.println("This is Main method");
    }
}
*/
/* 
class Student{
    private String name;
    private int age;

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
}

class main{
    public static void main(String[] args) {
        Student s=new Student();
        
        s.setName("Navin");
        s.setAge(55);

        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());
    }
}
/* 
import java.util.*;

class Student {
    String name;
    int rollNo;
    String grade;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void sub(int math, int java, int science, int aws) {
        float avg = (math + java + science + aws) / 4.0f; 

        System.out.println("\n--- Student Report ---");
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + avg);

        if (avg >= 90) {
            grade = "A";
        } else {
            grade = "B";
        }
        System.out.println("Grade: " + grade);
    }
}

class Execute {
    public static void main(String[] args) throws Exception{ 
        try {
            
        } catch (Exception e) {
        }Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nEnter details for Student " + i);

        
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Math mark: ");
            int math = sc.nextInt();

            System.out.print("Enter Java mark: ");
            int java = sc.nextInt();

            System.out.print("Enter Science mark: ");
            int science = sc.nextInt();

            System.out.print("Enter AWS mark: ");
            int aws = sc.nextInt();
            sc.nextLine();

            Student s = new Student(name, rollNo);
            s.sub(math, java, science, aws);
        }
        sc.close();
    }
}
*/ 
/* 
class Student{
    private String name;
    private int age;

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
}

class main{
    public static void main(String[] args) {
        Student s=new Student();
        
        s.setName("Navin");
        s.setAge(55);

        System.out.println("Name:" + s.getName());
        System.out.println("Age:" + s.getAge());
    }
}

*/
/* 
class A{
    public A(){
        System.out.println("Object created..");
    }
    void show(){
        System.out.println("In a show..");
    }
}
class main{
    public static void main(String a[]){
        // A obj;
    //    new A();
    //    new A().show();
        // obj.show();

        A obj=new A();
        obj.show();
        obj.show();
        new A().show();
    }
}

*/
/* 
class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;

    }
    void show(){
        System.out.println("Name:" + name +"\n"+ "RollNO:" + rollNo);
    }
}
class StudentInfo extends Student{
    double height;
    double weight;

    public StudentInfo(String name,int rollNo,double height, double weight) {
        super(name,rollNo);
        this.height = height;
        this.weight = weight;
    }
    void StudentDetails(){
        System.out.println("Height:"+height+"cm"+"\n"+ "Weight:" + weight+"Kg");
    }
    
}
class SIDemo{
    public static void main(String[] args) {
        StudentInfo S = new StudentInfo("Sobhit",45,170,90);
        S.show();
        S.StudentDetails();
    }
}

*/
/* 
class Student{
    String name;
    int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
class main{
    public static void main(String[] args) {
        Student S1=new Student();

        S1.setName("Soubhik");
        S1.setRollNo(20);
        System.out.println("Name:"+S1.getName()+"\n"+"RollNO:"+S1.getRollNo());
    }
}

*/
/* 
class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void show(){
        System.out.println("Name:"+name + "\n" + "RollNo:" + rollNo);
    }
}
class Mark extends Student{
    int math;
    int physics;
    int chemistry;

    public Mark(String name,int rollNo,int chemistry, int math, int physics) {
        super(name,rollNo);
        this.chemistry = chemistry;
        this.math = math;
        this.physics = physics;
    }
    public int markInfo(){
        System.out.println("Chemistry:"+ chemistry + "\n" +  "Math:" + math + "\n" + "Physics:" + physics);
        return 0;
    }
}
class Result extends Mark{
    int total;

    public Result(String name,int rollNo,int chemistry, int math, int physics) {
        super(name,rollNo,chemistry,math,physics);
    }
    public void resultInfo(){
        total=(chemistry+physics+math);
        System.out.println("Total:" + total);
    }
}
class MLDemo{
    public static void main(String[] args) {
        Result r=new Result("Visal",50,80,85,93);

        r.show();
        r.markInfo();
        r.resultInfo();
    }
}
*/
/*
import java.util.*;
class Student{
    String name;
    int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    void show(){
        System.out.println("Name:"+name + "\n" + "RollNo:" + rollNo);
    }
}
class ArtStudent extends Student{
    int english;
    int economics;
    int odia;

    public ArtStudent(String name, int rollNo,int economics, int english, int odia) {
        super(name, rollNo);
        this.economics = economics;
        this.english = english;
        this.odia = odia;
    }
    public int artMark(){
        System.out.println("Economics:" + economics + "\n" + "English:" + english + "\n" + "Odia:" + odia);
        return 0;
    }
}
class Engineering extends Student{
    int physics;
    int chemistry;
    int math;

    public Engineering( String name, int rollNo,int chemistry, int math, int physics) {
        super(name, rollNo);
        this.chemistry = chemistry;
        this.math = math;
        this.physics = physics;
    }
    public void engineeringMark(){
        System.out.println("Chemistry:" + chemistry + "\n"+ "Physics:" + physics + "\n" + "Math:" + math);
    }

}
class Medical extends Student{
    int botany;
    int zoology;

    public Medical(String name, int rollNo,int botany, int zoology) {
        super(name, rollNo);
        this.botany = botany;
        this.zoology = zoology;
    }
    public void medicalMark(){
        System.out.println("Botany:" + botany + "\n" + "Zoology:" + zoology);
    }
}
class Mechanical extends Engineering{
    int robotics;
    int mechatronics;

    public Mechanical(String name, int rollNo, int chemistry, int math, int physics,int mechatronics, int robotics) {
        super(name, rollNo,chemistry, math, physics);
        this.mechatronics = mechatronics;
        this.robotics = robotics;
    }
    void mechanicalMark(){
        System.out.println("Robotics:" + robotics + "\n" + "Mechatronics:" + mechatronics);
    }
}
class Electrical extends Engineering{
    int iot;
    int iiot;

    public Electrical(String name, int rollNo, int chemistry, int math, int physics,int iiot, int iot) {
        super(name, rollNo,chemistry, math, physics);
        this.iiot = iiot;
        this.iot = iot;
    }
    void electricalMark(){
        System.out.println("IOT:" + iot + "\n" + "IIOT:" + iiot);
    }
}
class Cse extends Engineering{
    int java;
    int python;
    int springBoot;

    public Cse(String name, int rollNo, int chemistry, int math, int physics,int java, int python, int springBoot) {
        super(name, rollNo,chemistry, math, physics);
        this.java = java;
        this.python = python;
        this.springBoot = springBoot;
    }
    void cseMark(){
        System.out.println("Java:" + java + "\n" + "Python:" + python + "\n" + "Springboot:" + springBoot);
    }
}
    */
/* 
class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your Stream[Arts/Electrical/Medical]");
        char c=sc.next().charAt(0);

        if(c == 'A' || c == 'a'){
            ArtStudent A =  new ArtStudent("Susil",1,50,60,76);
            A.show();
            A.artMark();
        }
        if( c== 'E'  || c == 'e'){
            System.out.println("Enter your Branch[Mechanical/Electrical/CSE]");
            char c1=sc.next().charAt(0);

            if(c1 == 'M'|| c1 == 'm' ){

                Mechanical M = new Mechanical("Ram",2,80,40,95,85,95);
                M.show();
                M.engineeringMark();
                M.mechanicalMark();
            }
            if(c1 == 'E'|| c1 == 'e' ){

                Electrical E = new Electrical("Ram",2,80,40,95,85,95);
                E.show();
                E.engineeringMark();
                E.electricalMark();

        }
        if(c1 == 'C'|| c1 == 'c' ){

                Cse C = new Cse("Ram",2,80,40,95,85,95,55);
                C.show();
                C.engineeringMark();
                C.cseMark();
    }
  }
        if(c == 'M' || c == 'm'){
            Medical M=new Medical("Asish",3,85,85);
            M.show();
            M.medicalMark();
        }    
  }
}
*/
/* 
class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your Stream[Arts/Engineering/Medical]");
        String stream=sc.next();

        if(stream.equalsIgnoreCase("Arts")){
            ArtStudent A =  new ArtStudent("Susil",1,50,60,76);
            A.show();
            A.artMark();
        }
        if( stream.equalsIgnoreCase("Engineering")){
            System.out.println("Enter your Branch[Mechanical/Electrical/CSE]");
            String Branch =sc.next();

            if(Branch.equalsIgnoreCase("Mechanical") ){

                Mechanical M = new Mechanical("Ram",2,80,40,95,85,95);
                M.show();
                M.engineeringMark();
                M.mechanicalMark();
            }
            if(Branch.equalsIgnoreCase("Electrical")){

                Electrical E = new Electrical("Ram",2,80,40,95,85,95);
                E.show();
                E.engineeringMark();
                E.electricalMark();

        }
        if(Branch.equalsIgnoreCase("Cse")){

                Cse C = new Cse("Ram",2,80,40,95,85,95,55);
                C.show();
                C.engineeringMark();
                C.cseMark();
    }
  }
        if(stream.equalsIgnoreCase("Medical")){
            Medical M=new Medical("Asish",3,85,85);
            M.show();
            M.medicalMark();
        }    
  }
}
  */
  /* 

  class main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your Stream[Arts/Engineering/Medical]: ");
        String stream=sc.next();

        if(stream.equalsIgnoreCase("Arts")){
            System.out.print("Enter Your Name:");
            String n=sc.next();
            System.out.print("Enter Your RollNo:");
            int r=sc.nextInt();
            System.out.print("Enter your Economics Mark:");
            int e1=sc.nextInt();
            System.out.print("Enter your Odia Mark:");
            int o=sc.nextInt();
            System.out.print("Enter your English Mark:");
            int e2=sc.nextInt();
            System.out.println("<---------------------"+" Student Report of " + n + "  ---------------------->");

            ArtStudent A =  new ArtStudent(n,r,e1,o,e2);
            A.show();
            A.artMark();
        }
        if( stream.equalsIgnoreCase("Engineering")){
            System.out.print("Enter your Branch[Mechanical/Electrical/CSE]: ");
            String Branch =sc.next();

            if(Branch.equalsIgnoreCase("Mechanical") ){

            System.out.print("Enter Your Name:");
            String n=sc.next();
            System.out.print("Enter Your RollNo:");
            int r=sc.nextInt();
            System.out.print("Enter your Chemistry Mark:");
            int c=sc.nextInt();
            System.out.print("Enter your Math Mark:");
            int m=sc.nextInt();
            System.out.print("Enter your Physics Mark:");
            int p=sc.nextInt();
            System.out.print("Enter your Mechatronics Mark:");
            int m1=sc.nextInt();
            System.out.print("Enter your Robotics Mark:");
            int r1=sc.nextInt();
            System.out.println("<---------------------"+" Student Report of " + n + "  ---------------------->");

                Mechanical M = new Mechanical(n,r,c,m,p,m1,r1);
                M.show();
                M.engineeringMark();
                M.mechanicalMark();
            }
            if(Branch.equalsIgnoreCase("Electrical")){

            System.out.print("Enter Your Name:");
            String n=sc.next();
            System.out.print("Enter Your RollNo:");
            int r=sc.nextInt();
            System.out.print("Enter your Chemistry Mark:");
            int c=sc.nextInt();
            System.out.print("Enter your Math Mark:");
            int m=sc.nextInt();
            System.out.print("Enter your Physics Mark:");
            int p=sc.nextInt();
            System.out.print("Enter your IOT Mark:");
            int i1=sc.nextInt();
            System.out.print("Enter your IIOT Mark:");
            int i2=sc.nextInt();
            System.out.println("<---------------------"+" Student Report of " + n + "  ---------------------->");

                Electrical E = new Electrical(n,r,c,m,p,i1,i2);
                E.show();
                E.engineeringMark();
                E.electricalMark();

        }
        if(Branch.equalsIgnoreCase("Cse")){

            System.out.print("Enter Your Name:");
            String n=sc.next();
            System.out.print("Enter Your RollNo:");
            int r=sc.nextInt();
            System.out.print("Enter your Chemistry Mark:");
            int c=sc.nextInt();
            System.out.print("Enter your Math Mark:");
            int m=sc.nextInt();
            System.out.print("Enter your Physics Mark:");
            int p=sc.nextInt();
            System.out.print("Enter your Java Mark:");
            int j=sc.nextInt();
            System.out.print("Enter your Python Mark:");
            int p2=sc.nextInt();
            System.out.print("Enter your Springboot Mark:");
            int s=sc.nextInt();
            System.out.println("<---------------------"+" Student Report of " + n + "  ---------------------->");

                Cse C = new Cse(n,r,c,m,p,j,p2,s);
                C.show();
                C.engineeringMark();
                C.cseMark();
    }
  }
        if(stream.equalsIgnoreCase("Medical")){
            System.out.print("Enter Your Name:");
            String n=sc.next();
            System.out.print("Enter Your RollNo:");
            int r=sc.nextInt();
            System.out.print("Enter your Botany Mark:");
            int b=sc.nextInt();
            System.out.print("Enter your Zoology Mark:");
            int z=sc.nextInt();
            System.out.println("<---------------------"+" Student Report of " + n + "  ---------------------->");

            Medical M=new Medical(n,r,b,z);
            M.show();
            M.medicalMark();
        }    
  }
}

 */
/* 
class Student implements Cloneable{
    String name;
    int age;
 // parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        // normal object creation
        Student s1 = new Student("Ram",18);
        s1.display();

        // object creation using newInstance()
        // Student s2 = Student.class.getDeclaredConstructor().newInstance();  // calls default constructor
        Student s2=(Student) s1.clone();
        s2.display();
    }
}
*/
/* 
class X{
    X(){
        super();
        System.out.println("From default constructor x..");
    }
    public X(int n){
        this();
       System.out.println("From parameterized constructor x...");
    }
}
class Y extends X{
    Y(){
        super(5);
        System.out.println("From default constructor y..");
    }
    public Y(int n){
        this();
       System.out.println("From parameterized constructor y...");
    }
}
class main{
    public static void main(String[] args) {
        Y y1=new Y(2);
    }
}
*/
 /*
class X{
     void show(){
        System.out.println("Inside X");
    }
}
class Y extends X{
    @Override void show(){
        super.show();
        System.out.println("Inside Y");
    }

    // void display2() {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }
}
class main{
    public static void main(String[] args) {
        Y y1 = new Y();
        y1.show();
    }
}
*/


// Example of Overriding in Java
class Animal {
    // Base class
    void move() { System.out.println(
      "Animal is moving."); }
    void eat() { System.out.println(
      "Animal is eating."); }
}

class Dog extends Animal {
    @Override void move()
    { // move method from Base class is overriden in this
      // method
      super.move();
        System.out.println("Dog is running.");
    }
    void bark() { System.out.println("Dog is barking."); }
}

class Geeks { 
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.move(); // Output: Animal is moving. Dog is running.
        d.eat(); // Output: Animal is eating.
        d.bark(); // Output: Dog is barking.
    }
}