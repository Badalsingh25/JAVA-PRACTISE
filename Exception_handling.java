/* 
class ExceptionDemo{
    public static void main(String[] args) {
        int n = 10;
        int m = 0;

        try {
            
            int result = n/m ;
            System.out.println("Answer:" + result);

        } catch (ArithmeticException e) {
            System.out.println("Sorry ! Divided by zero problem");
            System.out.println(e);

        }
         System.out.println("Good bye..");
    }
}
*/
/* 
class NestedTryCatchBlock{
    public static void main(String[] args) {
        try {
             System.out.println("Outer try block..");
            try {
                int z = 10;
                int result = 10 / 0;
                System.out.println("Result:" + result);
            } catch (ArithmeticException e) {
                System.out.println("Sorry ! Divided by Zero problam..");
                System.out.println(e);
            }
            String str = null;
            System.out.println("Length:" + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointer Exception caught!");
            System.out.println(e);
        }
        System.out.println("Good Bye..");
    }
}
*/
/* 
class NestedTryCatchBlock{
    public static void main(String[] args) {
        int l = 0 ;
        int[] arr = new int[5];

        try {
            // System.out.println("Outer try block..");
            //     int z = 10 / l;
            //     System.out.println("Result:" + z);

                // int i = arr[8];

                throw new ArrayIndexOutOfBoundsException();

                // String str = null;
                // System.out.println("Length:" + str.length());
        
        } 
            // catch (ArithmeticException e) {
            //         System.out.println("Sorry ! Divided by Zero problam..");
            //         System.out.println(e);
                // } catch (NullPointerException e) {
                //        System.out.println("NullPointer Exception caught!");
                //        System.out.println(e);

                // } catch (NumberFormatException e) {
                //        System.out.println("NumberFormat Exception caught!");
                //        System.out.println(e);
                 // }
                 catch (ArrayIndexOutOfBoundsException e) {
                       System.out.println("Bad Index !");
                       System.out.println(e);
                   }
                //  catch (ArrayIndexOutOfBoundsException f) {
                //        System.out.println("Bad Index !");
                //        System.out.println(f);
                //    }
                //  catch (ArrayIndexOutOfBoundsException g) {
                //        System.out.println("Bad Index !");
                //        System.out.println(g);
                //    }
            finally{
                    System.out.println("Finally Bloack executed..");
                   }
            
            
        System.out.println("Good Bye..");
    }
}
*/

/* 
class Geeks{
    public static void main(String[] args) {

         int n = 7;
         int m = 0;
        if(m == 0){
        throw new ArithmeticException("Divided by Zero problem..");
    }
    else{
        System.out.println((n / m));
    }
    }
}
*/
/* 
class Geeks{
    public static void main(String[] args){

        try {
            Thread.sleep(3000);
        System.out.println("This is thread method......");
        } catch (Exception e) {
            System.out.println("Thread was interrupted!");
        }
        
    }
}
*/
/*
class Geek{
    public static void main(String[] args)throws InterruptedException{

        Thread.sleep(3000);
        System.out.println("This is thread method......");
            
    }
}
 */
/*
class MyException extends Exception{
    private static int accNo[]={1001, 1002,1003,1004,1005};
    private static String name[]={"Badal", "Hari","Madhu","Ram","Shruti"};
    private static double bal[]={1250.7 , 4445.8 , 55245, 5512,85288};

    public MyException(){
      super("Balance is less than 1000");
    }
    public static void main(String[] args) {
        try{
            System.out.println("AccountNo" + "\t" + "Customer" + "\t"+ "Balance" );

            for(int i =0;i<5;i++){
                System.out.println(accNo[i] + "\t\t" + name[i] + "\t\t" + bal[i] );

                if(bal[i]<1000){
                
                    throw new MyException();
                     
            }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

}
 */
/* 
import java.io.*;
class Geeks {

    public static void main(String[] args) throws IOException {

        // Getting the current root directory
        String root = System.getProperty("user.dir");
        System.out.println("Current root directory: " + root);

        // Adding the file name to the root directory
        String path = root + "\\message.txt";
        System.out.println("File path: " + path);

        // Reading the file from the path in the local directory
        try {
            FileReader f = new FileReader(path);

            // Creating an object as one of the ways of taking input
            BufferedReader b = new BufferedReader(f);

            // Printing the first 3 lines of the file
            for (int counter = 0; counter < 5; counter++)
                System.out.println(b.readLine());

            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
*/
/*
class Base extends Exception {
}
class Derived extends Base {
}
 class Main {
    public static void main(String args[])
    {
        try {
            throw new Base();
        }
        catch (Derived d) {
        }
        catch (Base b) {
        }
    }
}
*/

class BaseException extends Exception {
    public BaseException() {
        super("Base exception");
    }

        public BaseException(String msg) {
        super(msg);
        }
    }


class DerivedException extends BaseException {
    public DerivedException() {
        super("Derived Exception");
    }
}

 class ExceptionExample {
     public static void main(String[] args) {
        try {
            // code that might throw exceptions
            throw new DerivedException();
        } 
        catch (DerivedException e) {
            System.out.println("Caught derived exception: " + e.getMessage());
                        System.out.println("jay shree Krishna....");

        }
        catch (BaseException e) {
            System.out.println("Caught base exception: " + e.getMessage());
            System.out.println("jay shree Ram");
        } 


    }
}