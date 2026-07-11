import java.util.*;

class ArrayListDemo{

   static Scanner sc = new Scanner(System.in);

    static void create(int[] a,int n){
        System.out.println("Enter "+ n + " elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    }

    static int insert(int[] a,int n,int item,int pos){
        for(int i =n-1;i>=pos-1;i--){
            a[i+1]=a[i];
        }
        a[pos-1]=item;
        return n + 1;
    }

    static int delete(int[] a,int n,int pos){
        int i,item=a[pos-1];
        for(i=pos-1;i<n;i++){
            a[i]= a[i+1];
        }
        return n-1;
    }

    static void traverse(int[] a,int n){
        System.out.print("Elements in array are: ");
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }  
        System.out.println();
    }
    
}

class ArrayList{
    public static void main(String[]args){

        int[] arr = new int[10];
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array size: ");
         n = sc.nextInt();
        ArrayListDemo.create(arr,n);

         System.out.println("Enter Elements to insert: ");
         int item = sc.nextInt();

         System.out.println("Enter the position of Array: ");
         int pos = sc.nextInt();
        
        n= ArrayListDemo.insert(arr,n,item,pos);
       ArrayListDemo.traverse(arr,n);

        System.out.println("Enter the position of element to delete:");
        int posDel =sc.nextInt();
        n=ArrayListDemo.delete(arr, n, posDel);
       ArrayListDemo.traverse(arr,n);

        sc.close();
    }
}