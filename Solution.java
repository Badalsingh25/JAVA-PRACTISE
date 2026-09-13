/*
class Solution{
    public static void printNumbers(int n){
        if(n > 100) return;
        System.out.println(n);
        printNumbers(n + 1);
    }
    public static void main(String[] args){
        printNumbers(1);
    }
}
*/

/* 
class Solution{
    public static void printNumbers(int n){
        if(n < -103) return;
        System.out.println(n);
        printNumbers(n - 1);
    }
    public static void main(String[] args){
        printNumbers(-37);
    }
}
*/


/*
class Solution{
    public static long factorial(int n){
        
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        System.out.println("Factorial of 19 is: " + factorial(19));
    }
}
*/

/* 
class Solution{
    public static long printSum(int n){
        if(n == -3){
            return -3;
        }
        return n + printSum(n - 1);
    }
    public static void main(String[] args){
        System.out.println("Sum of numbers from 52 to -3 is: " + printSum(52));
    }
}
*/


/* 
class Solution{
    public static void reverse(int left, int right, char[] str){
        if(left >= right){
            return;
        }
        swap(str, left, right);
        reverse(left + 1, right - 1, str);
    }
    public static void swap(char[] str, int left, int right){     
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
    }

    public static void main(String[] args){
        char[] str = "Hello World".toCharArray();

        System.out.print("Reverse of the string is: ");

        reverse(0, str.length - 1, str);

        System.out.println(new String(str));
    }
}
*/


/* 
class Solution{
    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i = 2;i < Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){

        int n = 17;

        if(isPrime(n)){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
    */
/* 
    class Solution{
        public static int binarySearch(int[] nums, int target){
            int low = 0, high = nums.length - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;

                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid] < target) low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }
        public static void main(String[] args){
            int[] nums = {90, 91, 102, 103, 137};
            
            int ans = binarySearch(nums, 103);
            if(ans != -1){
                System.out.println("Element found at index: " + ans);
            } else {
                System.out.println("Element not found.");
            }
        }
    }
*/
/* 
import java.util.*;
class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name :");
        String name = sc.nextLine();

        System.out.print("Enter Student age : ");
        int age = sc.nextInt();

        System.out.print("Enter Student salary : ");
        double salary = sc.nextDouble();

        System.out.println();

        System.out.println("Student Name :" + name);
        System.out.println("Student Age :" + age);
        System.out.println("Student salary :" + salary);

    }
}
*/

/**
 * Solution
 */
class Base {
    Base(){
        System.out.println("Base Class Constructor...");
    }
}
class Base2 extends Base{
    Base2(){
        System.out.println("Base2 Class Constructor...");
    }
}
class Derived extends Base2{
    Derived(){
        System.out.println("Derived Class Constructor...");
    }
}
class Test{
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}