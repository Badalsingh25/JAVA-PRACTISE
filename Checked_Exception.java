


// Checked_Exception.java

// 1.ClassNotFoundException

//  class harry {
//     public void sayHello() {
//         System.out.println("Hello from class1!");
//     }
// }

/* 
class ClassNotFoundExceptionDemo extends Exception{
    public static void main(String[] args)  {
        try {
           Class<?> c =  Class.forName("harry");
            System.out.println("Class loaded .." + c.getName());
            
            Object obj = c.getDeclaredConstructor().newInstance();
            c.getMethod("sayHello").invoke(obj);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid class or class not found..");
            System.out.println(e);
            // e.printStackTrace();
        }
        catch (Exception e) {
            // Catch all other reflection exceptions here
            e.printStackTrace();
        }
    }
}
*/
/* 
//FileNotFoundException and IOException

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundExceptionDemo{
    public static void main(String[] args) {
        File file = new File("message.txt");
        BufferedReader br = null;
        try {
             br=new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } 
        catch(IOException e){
           System.out.println("An I/O error occured..");
           System.out.println(e);
        }
        finally{
            try {
                if(br !=null){
                    br.close();
                }
            } 
            catch(IOException e){
                System.out.println("Error while closing file." + e);
            }
        }
    }
}
*/

/* 
// InterruptedException
class InterruptedExceptionDemo{
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Jay Shree Krishna");
        Thread.sleep(3000);
        System.out.println("Jay Shree Ram");   
    }
}
*/

/* 
class Student {
    public String name = "Alice";
}

class NoSuchFieldExceptionDemo{
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class<?> c = Class.forName("Student");

             java.lang.reflect.Field field = c.getDeclaredField("age");
            System.out.println(field);
        } catch(NoSuchFieldException e){
            System.out.println("Variable is not Declared..");
            e.printStackTrace();
        }
    }
}
*/

/* 
import java.lang.reflect.Method;

 class ReflectionExample {
    private void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = ReflectionExample.class;

        // ❌ This will throw NoSuchMethodException (method is private)
        // Method m = clazz.getMethod("greet", String.class);

        // ✅ Correct way
        Method m = clazz.getDeclaredMethod("greet", String.class);
        m.setAccessible(true); // allow access to private method
        m.invoke(new ReflectionExample(), "Alice");
    }
}
*/
/* 
class FinallyDemo extends Exception{
    static void proA(){
        try {
            System.out.println("Inside Pro A...");
            throw new RuntimeException("Demo");
        } finally {
            System.out.println("Inside Pro A's finally..");
        }
    }
    static void proB(){
        try {
            System.out.println("Inside Pro B...");
            return;

        } finally {
            System.out.println("Inside Pro B's finally..");
        }
    }
    static void proC(){
        try {
            System.out.println("Inside Pro C...");
            return;

        } finally {
            System.out.println("Inside Pro C's finally..");
        }
    }
    public static void main(String[] args) {
        System.out.println("Inside main..");
        try {
            proA();
        } catch (Exception e) {
            System.out.println("Exception caught!..");
        }
        proB();
        proC();
    }
   
}
*/
import java.util.*;
class NegativeAgeExceptionDemo extends Exception{
    NegativeAgeExceptionDemo(){
           System.out.println("Invalid age..");
        }
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age:");
        int age = sc.nextInt();

        try {
            if(age >0){
                System.out.println("valid Age.");
                
            }
            else{
                 throw new NegativeAgeExceptionDemo();
            }
        } catch (Exception e) {
            System.out.println("Negative age entered." + e);
        }
    }

    }



