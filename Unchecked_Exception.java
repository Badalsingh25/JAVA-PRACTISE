// Unchecked_Exception.java

// 1.ArithmeticException
/* 
class ArithmeticExceptionDemo{
    public static void main(String[] args) {
        int n= 5;
        int m= 0;
        try {
            int result = n / m ;
            System.out.println("Result" + result);
        } catch (ArithmeticException e) {
            System.out.println("Sorry ! Divided by Zero problem..");
            System.out.println(e);
        }
    }
}
*/

/* 
// 2.ArrayIndexOutOfBoundsException

class ArrayIndexOutOfBoundsExceptionDemo{
    public static void main(String[] args) {
        int[] arr=new int[5];
        try{
            arr[5]=7;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Bad index..");
            System.out.println(e);
        }
    }
}
*/

/* 
// 3.NullPointerException

class NullPointerExceptionDemo{
    public static void main(String []args){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception caught !");
            System.out.println(e);
        }
    }
}
*/

/*
// 4.NumberFormatException

class NumberFormatExceptionDemo{
    public static void main(String []args){
        String str = "abc";
        System.out.println(str);
        try{
             int a = Integer.parseInt(str);
             System.out.println(a);
        }
        catch(NumberFormatException e){
            System.out.println("Cann't convert this type of String to Integer..");
            System.out.println(e);
        }
    }
}
*/

/* 
// 5.StringIndexOutOfBoundException

class StringIndexOutOfBoundExceptionDemo{
    public static void main(String []args){
        String str = "abcd efgh ij";
        try{
            char c= str.charAt(17);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e){
              System.out.println("String is out of Index...");
              System.out.println(e);
        }
    }
}
*/

/* 

// 6.IllegalArgumentException

import java.util.*;
class IllegalArgumentExceptionDemo{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        
        try{
            if(age>= 18){
                System.out.println("Age:" + age + "\n" +"You are eligible for voting");
                }
             else{
                throw new IllegalArgumentException("Age is less than 18.");
             }
            }
        catch(IllegalArgumentException e){
            System.out.println("You are not eligible for voting..");
            System.out.println(e);
        }
      
    }
}
*/



/* 
// 7.IllegalStateException

import java.util.*;
class IllegalStateExceptionDemo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a:");
        int a = sc.nextInt();
        System.out.print("Enter value of b:");
        int b = sc.nextInt();

        try{
            if(a > 0 && b > 0){
              System.out.println("Addition:" + (a+b));
            }
            else{
                throw new IllegalStateException("Both value have to positive..");
            }
        }
        catch(IllegalStateException e){
            System.out.println("Addition is not possible");
            System.out.println(e);
        }
    }
}
*/



/* 
// 8.RuntimeException
import java.util.*;
class RuntimeExceptionDemo{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        
        try{
            if(age>= 18){
                System.out.println("Age:" + age + "\n" +"You are eligible for voting");
                }
             else{
                throw new RuntimeException("Age is less than 18.");
                // throw new ArithmeticException("Age is less than 18.");
             }
            }
        catch(RuntimeException e){
        // catch(ArithmeticException e){
            System.out.println("You are not eligible for voting..");
            System.out.println(e);
        }
      
    }
}
*/