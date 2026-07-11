// class Demo{

//     // var num = 8;

//     public void show(){
//             System.out.println("Hey ! how are you???");
//             var e="Badal";
//             System.out.println(" Normal Method: " + e);
//         }
//     public static void main(String []args){
//         int a = 8;
//         var b = 9;     
        
//         int c;

//         Demo d = new Demo();
//         d.show();


//     }
// }




import java.lang.*;

sealed class Human permits Manish, Vartika, Anjali
{   
    public void printName()
    {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human
{
    public void printName()
    {
        System.out.println("Manish Sharma");
    }
}

non-sealed  class Vartika extends Human
{
    public void printName()
    {
        System.out.println("Vartika Dadheech");
    }
}

final class Anjali extends Human
{
    public void printName()
    {
        System.out.println("Anjali Sharma");
    }
}

 class Main
{
    public static void main(String[] args)
    {   
        Human h1 = new Anjali();
        Human h2 = new Vartika();
        Human h3 = new Manish();
        
        h1.printName();
        h2.printName();
        h3.printName();
    }
}