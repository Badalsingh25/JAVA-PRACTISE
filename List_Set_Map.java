
/*
import java.util.ArrayList;

class List{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Badal");
        arr.add("Ram");
        arr.add("Shyam");
        arr.add("Ram");
        arr.add("Hari");
        arr.add("Ram");

        // arr.remove("Shyam");
        // arr.add(1,"Madhu");
        // arr.set(3,"Haria");

        // int s =arr.lastIndexOf("Ram");
        // int s =arr.indexOf("Ram");
        // System.out.println(s);

        // boolean isPresent = arr.contains("Badal");
        // System.out.println(isPresent);

        System.out.println(arr);
        System.out.println("--------------------------------------");

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        System.out.println("============================");
        for(String obj:arr){
            System.out.print(obj + " ");
        }
        // System.out.println();
    }

}
 */
 /*
import java.util.*;
class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Badal");
        ll.add("Ram");
        ll.add("Shyam");
        ll.add("Ram");
        ll.add("Hari");

        // ll.remove("Hari");
        // ll.add(4,"Radha");
        // ll.set(3, "Haria");
        // int i =ll.indexOf("Ram");
        // System.out.println(i);

        // int j =ll.lastIndexOf("Ram");
        // System.out.println(j);

        System.out.println(ll);
        System.out.println("---------------------------");

        for(int i =0;i<ll.size(); i++){
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
 System.out.println("---------------------------");
        for(String S:ll){
            System.out.print(S + " ");
        }

        System.out.println();

        boolean isPresent = ll.contains("Badal");
        System.out.println(isPresent);
    }
}
 */
 /*
import java.util.*;
class HashSetExample{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Badal");
        hs.add("Radha");
        hs.add("Ram");
        hs.add("Shyam");
        hs.add("Hari");

        // hs.remove("Hari");

        System.out.println(hs);
        System.out.println("---------------------------");

        for(String S:hs){
            System.out.print(S + " ");
        }

        System.out.println();

        boolean isPresent = hs.contains("Badal");
        System.out.println("Is Badal Present ?: " + isPresent);
    }
}
 */
 /* 
import java.util.*;
class LinkedHashSetExample{
    public static void main(String[] args) {
        LinkedHashSet<String> ts = new LinkedHashSet<>();

        ts.add("Radha");
        ts.add("Badal");
        ts.add("Ram");
        ts.add("Shyam");
        ts.add("Hari");

        ts.remove("Hari");

        System.out.println(ts);
        System.out.println("---------------------------");

        for(String S:ts){
            System.out.print(S + " ");
        }

        System.out.println();

        boolean isPresent = ts.contains("Badal");
        System.out.println("Is Badal Present ?: " + isPresent);
    }
}
 */
/* 
import java.util.*;
class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Radha");
        ts.add("Badal");
        ts.add("Ram");
        ts.add("Shyam");
        ts.add("Hari");

        // System.out.println(ts.remove("Hari"));

        // System.out.println(ts);
        // System.out.println("---------------------------");

        // System.out.println("First value: " + ts.first());
        // System.out.println("Last value: " + ts.last());

        // System.out.println("Higher value: " + ts.higher("Ram"));
        // System.out.println("Lower value: " + ts.lower("Ram"));

        // 

        // System.out.println("--------------------------------");

    //     Iterator<String> itr = ts.iterator();
    //     while(itr.hasNext()){
    //         System.out.print(itr.next() + " ");
    //     }
    //     System.out.println("--------------------------------");

        // boolean isPresent = ts.contains("Badal");
        // System.out.println("Is Badal Present ?: " + isPresent);

        List<String> list = new ArrayList<>(ts);

        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        // ts.forEach(n->System.out.println(n));

        // for(String S:ts){
        //     // System.out.print(S + " ");
        //     System.out.println(S);
        // }
    }
}
 */
 /*
import java.util.*;
class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

   public int compareTo(Student s){
        return this.name.compareToIgnoreCase(s.name);
    }

    public String toString(){
        return id + "." + name;
    }
}

 class Demo {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student(1, "Alice"));  // 💥 Boom! ClassCastException
        set.add(new Student(2, "Sushree")); 
        set.add(new Student(3, "Rai")); 
        set.add(new Student(4, "Bob"));
        set.add(new Student(3, "charlie"));

        // System.out.println(set);

        for(Student str:set){
            System.out.println(str);
        }
    }
}
 */
/* 
import java.util.*;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "." + name;
    }
}

class StudentNameCompare implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // return s1.name.compareTo(s2.name);
        // return s1.name.compareToIgnoreCase(s2.name);
        // return s1.id - s2.id;
        // return Integer.compare(s1.id, s2.id);

        int nameCompare = s1.name.compareToIgnoreCase(s2.name);
        int idCompare = Integer.compare(s1.id, s2.id);

        if(idCompare == 0){
            return s1.name.compareToIgnoreCase(s2.name);
        }

        if(nameCompare == 0){
            return Integer.compare(s1.id,s2.id);
        }

        if(nameCompare == 0 && idCompare == 0){
            return System.identityHashCode(s1) - System.identityHashCode(s2);
        }
        return nameCompare;

        // int idCompare = Integer.compare(s1.id, s2.id);
        // // int idCompare = s1.id - s2.id;
        // if(idCompare == 0){
        //     return s1.name.compareToIgnoreCase(s2.name);
        // }
        // return idCompare;
    }
}

class Demo {

    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new StudentNameCompare());
        set.add(new Student(1, "Blice"));
        set.add(new Student(1, "Alice"));
        set.add(new Student(2, "Sushree"));
        set.add(new Student(3, "Rai"));
        set.add(new Student(4, "Bob"));
        set.add(new Student(5, "Charlie"));
        set.add(new Student(6, "Charlie"));
        set.add(new Student(5, "charlie"));
        set.add(new Student(5, "charlie"));

        // System.out.println(set);
        for (Student str : set) {
            System.out.println(str);
        }
    }
}
*/
/* 
import java.util.*;
class HastmapExample{
    public static void main(String[] args) {
        
        Hastmap<String, Integer> tm = new Hastmap<>();
    
        tm.put("Navin", 56);
        tm.put("Harsh", 23);
        tm.put("Susil", 67);
        tm.put("Kiran", 42);

        tm.remove("Kiran");

        // System.out.println("Result:" + "\n" + tm);

        System.out.println("Name" + "\t" + "Mark");
        for(Map.Entry<String,Integer> e : tm.entrySet()){
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    
    }
}
*/
/* 
import java.util.*;
class LinkedHashMapExample{
    public static void main(String[] args) {
        
        LinkedHashMap<String, Integer> tm = new LinkedHashMap<>();
    
        tm.put("Navin", 56);
        tm.put("Harsh", 23);
        tm.put("Susil", 67);
        tm.put("Kiran", 42);

        // tm.remove("Kiran");

        // System.out.println("Result:" + "\n" + tm);

        System.out.println("Name" + "\t" + "Mark");
        for(Map.Entry<String,Integer> e : tm.entrySet()){
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    
    }
}
*/
/* 
import java.util.*;
class TreeMapExample{
    public static void main(String[] args) {
        
        TreeMap<String, Integer> tm = new TreeMap<>();
    
        tm.put("Navin", 56);
        tm.put("Harsh", 23);
        tm.put("Susil", 67);
        tm.put("Kiran", 42);

        // tm.remove("Kiran");

        // System.out.println("Result:" + "\n" + tm);

        System.out.println("Name" + "\t" + "Mark");
        for(Map.Entry<String,Integer> e : tm.entrySet()){
            System.out.println(e.getKey() + "\t" + e.getValue());
        }
    
    }
}
*/



import java.util.*;
class TreeSetExample{
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Radha");
        ts.add("Badal");
        ts.add("Ram");
        ts.add("Shyam");
        ts.add("Hari");

        // java.util.List<String> list = new java.util.ArrayList<>(ts);
        // for(int i = 0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        Object[] arr = ts.toArray();

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // ts.forEach(n->System.out.println(n));

        // for(String S:ts){
        //     // System.out.print(S + " ");
        //     System.out.println(S);
        // }
    }
}
 