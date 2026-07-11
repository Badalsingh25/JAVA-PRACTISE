// package mypack2;

// public class B{
//     public void show2(){
//         System.out.println("Inside B..");
//     }
// }

package mypack2;
import mypack1.A;

public class B extends A{
    @Override 
    public void show(){
        super.show();
        System.out.println("Inside Y..");
    }
}