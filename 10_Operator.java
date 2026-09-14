// 10_RelationalOperator.java
/* 
class RelationalOperator{

    public static void main(String []args){

        // Relational Operators: ==, !=, >, <, >=, <=
        int a = 10;
        int b = 10;

        // Equal to
        boolean isEqual = (a == b);
        System.out.println("Is a equal to b? " + isEqual);

        // Not equal to
        boolean isNotEqual = (a != b);
        System.out.println("Is a not equal to b? " + isNotEqual);

        // Greater than
        boolean isGreaterThan = (a > b);
        System.out.println("Is a greater than b? " + isGreaterThan);

        // Less than
        boolean isLessThan = (a < b);
        System.out.println("Is a less than b? " + isLessThan);

        // Greater than or equal to
        boolean isGreaterThanOrEqual = (a >= b);
        System.out.println("Is a greater than or equal to b? " + isGreaterThanOrEqual);

        // Less than or equal to
        boolean isLessThanOrEqual = (a <= b);
        System.out.println("Is a less than or equal to b? " + isLessThanOrEqual); 
    }
}

 */

 /* 
class LogicalOperator {

    public static void main(String[] args) {
        // int a=7;
        // int b=5;

        // int x=8;
        // int y=4;
        // // Logical AND
        // boolean AND=((x>y) & ((a>b)));
        // System.out.println(AND);
        // boolean OR=((x>y) | ((a>b)));
        // System.out.println(OR);
        // boolean NOT=!true;
        // System.out.println(NOT);

        int a = 5, b = 3;

// Using | (checks both)
        boolean res1 = (a > b) | (++b > 3);
        System.out.println(res1); // true
        System.out.println(b);    // 4 (increment happened)

// Using || (skips second if first is true)
        b = 3;
        boolean res2 = (a > b) || (++b > 3);
        System.out.println(!res2); // false
        System.out.println(b);    // 3 (increment skipped)

    }
}

*/

/*
import java.util.*;
class ConditionalOperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age=sc.nextInt();

    //if-else  statement
        // if(age>=18){
        //     System.out.println("You are eligible to vote.");
        // }
        // else if(age < 18 && age >= 0) {
        //     System.out.println("You are not eligible to vote.");
        // }
        // else{
        //     System.out.println("You have entered an invalid age.");
        //     System.out.println("Thank you for using our service.");

        // }

// Ternary Operator
        // Syntax: condition ? expression1 : expression2

        System.out.println("You are " + (age>=18 ? "eligible" : " not ligible") + " to vote.");

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.println("This is " + (n%2 == 0 ? "Even" : "Odd")+ " number.");

        
    }
}

 */


 //Switch statement

 import java.util.*;
class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter your age : ");
        int age=sc.nextInt();

        int category;
        if(age>=18){
            category = 1; // Eligible to vote
        } else if(age<18 && age>=0) {
            category = 2; // Not eligible to vote
        } else {
            category = 3; // Invalid age
        }
 
        switch(category){
            case 1->System.out.println("You are eligible to vote.");
            case 2->System.out.println("You are not eligible to vote.");
            case 3->System.out.println("You have entered invalid age.");
            default->System.out.println("Thankyou for using our service.");
        }
    }
}
}}}}}}