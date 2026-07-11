// //Variable
// class Hello{

//     static int m=100;
//     void show(){
//         int n =50;
//     }
//     public static void main(String[] args) {
//         // System.out.println("Jay Shree Ram1");
//         // System.out.println("Jay Shree Ram2");
//         // System.out.println("Jay Shree Ram3");
//         int p=55;
        
//     }
// }

// Demonstrating variable types
// class Hello {

//     static int m = 100; // Static variable (class-level)
//     int x = 200;        // Instance variable

//     void show() {
//         int n = 50; // Local variable
//         System.out.println("Local variable n = " + n);
//         System.out.println("Instance variable x = " + x);
//         System.out.println("Static variable m = " + m);
//     }

//     public static void main(String[] args) {
//         Hello obj = new Hello(); // Create object to access instance members
//         obj.show();

//         int p = 55; // Local variable in main
//         System.out.println("Local variable p = " + p);

//     }
// }




//Datatypes in Java

// class Hello{
//     public static void main(String[] args) {
//         byte data= 127; // 1 byte
//         double data2=8553.89585121542024214215115122;
//         long l=9938569962l;
//         int i=2038569962;
//         char ch = '\u2665'; 
//         char ch2 = 'k'; 
//         System.out.println("Data:" + data);
//         System.out.println("Data2:" + data2);
//         System.out.println("Long:" + l);
//         System.out.println("Int:" + i);
//         System.out.println("Heart: " + ch);
//         System.out.println("Char: " + ch2);

//     }
// }

//Literals in Java


// class Hello{
//     public static void main(String[] args) {
//         int num=10_00_00_00_00; // Integer literal
//         System.out.println("Number:" + num);
//         float f=56f;
//         System.out.println("Float:" + f);
//         double l=56;
//         System.out.println("Double:" + l);



//     }
// }

class x{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;

    public static void main(String[] args) {
        x obj = new x();
        System.out.println("Byte: " + obj.b); // Default value 0
        System.out.println("Short: " + obj.s); // Default value 0
        System.out.println("Int: " + obj.i); // Default value 0
        System.out.println("Long: " + obj.l); // Default value 0
        System.out.println("Float: " + obj.f); // Default value 0.0
        System.out.println("Double: " + obj.d); // Default value 0.0
        System.out.println("Char: '" + obj.c +""); // Default value '\u0000'
        System.out.println("Boolean: " + obj.bool); // Default value false
        System.out.println("String: " + obj.str); // Default value null
    }
}