
import java.util.Objects;

// Sealed_Record_Classes.java

/* 
import java.util.*;

sealed class Student permits ArtStudent, Engineering, Medical {

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void show() {
        System.out.println("Name:" + name + "\n" + "RollNo:" + rollNo);
    }
}

non-sealed class ArtStudent extends Student {

    int english;
    int economics;
    int odia;

    public ArtStudent(String name, int rollNo, int economics, int english, int odia) {
        super(name, rollNo);
        this.economics = economics;
        this.english = english;
        this.odia = odia;
    }

    public int artMark() {
        System.out.println("Economics:" + economics + "\n" + "English:" + english + "\n" + "Odia:" + odia);
        return 0;
    }
}

final class Engineering extends Student {

    int physics;
    int chemistry;
    int math;

    public Engineering(String name, int rollNo, int chemistry, int math, int physics) {
        super(name, rollNo);
        this.chemistry = chemistry;
        this.math = math;
        this.physics = physics;
    }

    public void engineeringMark() {
        System.out.println("Chemistry:" + chemistry + "\n" + "Physics:" + physics + "\n" + "Math:" + math);
    }

}

final class Medical extends Student {

    int botany;
    int zoology;

    public Medical(String name, int rollNo, int botany, int zoology) {
        super(name, rollNo);
        this.botany = botany;
        this.zoology = zoology;
    }

    public void medicalMark() {
        System.out.println("Botany:" + botany + "\n" + "Zoology:" + zoology);
    }
}

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Stream[Arts/Engineering/Medical]: ");
        String stream = sc.next();

        if (stream.equalsIgnoreCase("Arts")) {
            System.out.print("Enter Your Name:");
            String n = sc.next();
            System.out.print("Enter Your RollNo:");
            int r = sc.nextInt();
            System.out.print("Enter your Economics Mark:");
            int e1 = sc.nextInt();
            System.out.print("Enter your Odia Mark:");
            int o = sc.nextInt();
            System.out.print("Enter your English Mark:");
            int e2 = sc.nextInt();
            System.out.println("<---------------------" + " Student Report of " + n + "  ---------------------->");

            ArtStudent A = new ArtStudent(n, r, e1, o, e2);
            A.show();
            A.artMark();
        }
        if (stream.equalsIgnoreCase("Engineering")) {

            System.out.print("Enter Your Name:");
            String n = sc.next();
            System.out.print("Enter Your RollNo:");
            int r = sc.nextInt();
            System.out.print("Enter your Chemistry Mark:");
            int c = sc.nextInt();
            System.out.print("Enter your Math Mark:");
            int m = sc.nextInt();
            System.out.print("Enter your Physics Mark:");
            int p = sc.nextInt();
            System.out.println("<---------------------" + " Student Report of " + n + "  ---------------------->");

            Engineering E = new Engineering(n, r, c, m, p);
            E.show();
            E.engineeringMark();

        }
        if (stream.equalsIgnoreCase("Medical")) {
            System.out.print("Enter Your Name:");
            String n = sc.next();
            System.out.print("Enter Your RollNo:");
            int r = sc.nextInt();
            System.out.print("Enter your Botany Mark:");
            int b = sc.nextInt();
            System.out.print("Enter your Zoology Mark:");
            int z = sc.nextInt();
            System.out.println("<---------------------" + " Student Report of " + n + "  ---------------------->");

            Medical M = new Medical(n, r, b, z);
            M.show();
            M.medicalMark();
        }
    }
}
*/


// Record classes in java

/* 
class Student{
    private final String name;
    private final int rollNo;

    public Student(String name,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", rollNo=").append(rollNo);
        sb.append('}');
        return sb.toString();
    }
}
*/ 


class Demo{
    public static void main(String[] args) {
        Student S = new Student("Badal", 85);

        System.out.println(S);
        
    }
}
record Student(String name,int rollNo){}