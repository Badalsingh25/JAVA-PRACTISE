

// class loop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Value of N(for i):");
//         int n1 = sc.nextInt();

//         // System.out.println("Enter Value of N((for j)):");
//         // int n2 = sc.nextInt();

//         // int i = 1;
//         // while (i <= n1) {
//         //     System.out.println("Hii " + i);

//         //     int j = 1;
//         //     while (j <= n2) {
//         //         System.err.println("Hello " + j);
//         //         j++;
//         //     }
//         //     i++;
//         // }

//         // for(int i=5;i>=n1;i--){
//         //     System.out.println("Hllo "+ i);
//         // }

//         for(int i=1;i<=n1;i++){
//             System.out.println("Day-"+ i);

//             // for(int j=1;j<=n2;j++){
//             //     System.out.println( (j+8) +".O'clock" +" - " + (j+9)+".O'clock");
//             // }
//         }

//         // int i=1;
//         // do { 
//         //     System.out.println("jay Jagannath");
//         //     i++;
//         // } while (i<=n);
//     }
// }



/* 

class Calculator{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public double add(double n1,int n2)
    {
        return n1+n2;
    }
    public double add(int n1,double n2)
    {
        return n2+n1;
    }
    
}

public class Loop{
    public static void main(String[] args) {
        Calculator obj = new Calculator();

       System.out.println( obj.add(5,4));
       System.out.println( obj.add(5,8,4));
       System.out.println( obj.add(5.5,4));
       System.out.println( obj.add(5,4.8));
        
    }
}

*/

//Method Overloading
/* 
class Demo {
    
    public void show(int x)
    {
        System.out.println("In int" + x);
    }
    public void show(String s)
    {
        System.out.println("In String" + s);
    }
    public void show(byte b)
    {
        System.out.println("In byte" + b);
    }
}

class Loop{
    
    public static void main(String[] args)
    {
        Demo obj = new Demo();

        obj.show(25);

        obj.show("hello");

        byte a=20;
        obj.show(a);

        obj.show('A');

        obj.show("A");
    }
}

*/

//Array

class Array{
    public static void main(String[] args) {
        // int nums[][][]=new int [3][4][5]; //jagged Array
        // nums[0]=new int[3];
        // nums[1]=new int[4];
        // nums[2]=new int[2];

        // int nums[][] = {
        //     {1, 2, 3},
        //     {5, 6, 7, 8},
        //     {9, 10}
        // };
       
        // for (int i = 0; i <=2; i++) {
            
        //    for(int j=0;j<4;j++){
        //     System.out.print(nums[i][j]+" ");
        //    }
        //    System.out.println();
        // }


        int nums[]=new int[4];

        nums[0]=1;
        nums[1]=5;
        nums[2]=3;
        nums[3]=4;

        for(int n:nums){
            System.out.print(n + " ");
        }
    }
}