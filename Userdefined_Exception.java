// Userdefined_Exception.java
/* 
import java.util.*;
class StringMismatchException extends Exception{

    public StringMismatchException(String message) {
        super(message);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first word:");
        String str1 = sc.next();
        System.out.print("Enter a second word:");
        String str2 = sc.next();
        
        try {
            if(str1.equalsIgnoreCase(str2)){
                System.out.println("Both Strings are same/matched.. " + "\n" + "Good Job");
            }
            else{
                throw new StringMismatchException("Both Strings are not same..");
            }
        } catch (Exception e) {
            System.out.println("Try Again!..");
            System.out.println(e.getMessage());
        }
    }
}
*/
/* 
import java.util.*;
class UserIdentityCheck extends Exception{
    public UserIdentityCheck(String message) {
        super(message);
    }    
}

class User{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name="";
        String password="";
        String repassword="";
        int attempt = 0;

        while (true) { 
            System.out.print("Enter User name:");
             name = sc.next();
            attempt++;
            if(name.length() >= 6){
                break;
            }else{
                System.out.println("Invalid User name.User name should be 6 character");
                if(attempt >= 4){
                    try {
                        throw new UserIdentityCheck("Something went wrong!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                }
            }
        }
        while (true) { 
            System.out.print("Enter User password:");
            password = sc.next();
            System.out.print("Re-enter User password:");
            repassword = sc.next();
            attempt++;
            if(password.length() >= 6 && password.equals(repassword)){
                break;                
            }else{
                System.out.println("Password and Re-enter password must be same and atleast 6 character.");
                if(attempt >= 4){
                    try {
                        throw new UserIdentityCheck("Something went wrong!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return;
                    }
                }
            }
        }
        
        try {
            if(name.length() >= 6  && password.length() >= 6 && password.equals(repassword)){
                System.out.println("User registered successfully.");
            }
            else{
                throw new UserIdentityCheck("User doesn't registered.");
            }
        } catch (Exception e) {
            System.out.println("Try again !.");
            System.out.println(e.getMessage());
        }

        
    }
}
*/
import java.util.*;
class LibraryManagementSystem extends Exception{
  public LibraryManagementSystem(String message) {
        super(message);
    }
}

class User{
    public static void main(String[] args) {
        
        String[] books={"Java","C","C++","Springboot","English","Odia","Math","Physics"};
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Search Book: ");
        String book = sc.next();

        if(Arrays.asList(books).contains(book)){
            System.out.println("Book found: " + book);
        }
        else{
            try {
                throw new LibraryManagementSystem("Book not found.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

