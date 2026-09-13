
/* 
class A extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("From thread A,i=" + i);
        }
        System.out.println("Exist from thread A...");
    }
}
class B extends Thread{
    @Override
    public void run(){
        for (int j = 1; j <= 5; j++) {
            
            System.out.println("From thread B,j=" + j);
        }
        // sleep(3000);
        System.out.println("Exist from thread B...");
    }
}
class C extends Thread{
    @Override
    public void run(){
        for (int k = 1; k <= 5; k++) {
            
            System.out.println("From thread C,k=" + k);
        }
        System.out.println("Exist from thread C...");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        try {
        a.start();
        Thread.sleep(3000);

        b.start();
        Thread.sleep(5000);

        c.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
 */


/* 
class A implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println("From thread A,i=" + i);
        }
        System.out.println("Exist from thread A...");
    }
}

class B implements Runnable {

    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {

            System.out.println("From thread A,j=" + j);
        }
        System.out.println("Exist from thread B...");
    }
}

class C implements Runnable {

    @Override
    public void run() {
        for (int k = 1; k <= 5; k++) {

            System.out.println("From thread A,k=" + k);
        }
        System.out.println("Exist from thread C...");
    }
}

class ThreadDemo {

    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();
        Runnable c = new C();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(c);
        // Thread t1 = new Thread(new A());
        // Thread t2 = new Thread(new B());
        // Thread t3 = new Thread(new C());
        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
*/


/* 
class A extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {       
            System.out.println("From thread A,i=" + i);
        }
        System.out.println("Exist from thread A...");
    }
}
class B extends Thread{
    @Override
    public void run(){
        for (int j = 1; j <= 5; j++) {
            
            System.out.println("From thread B,j=" + j);
        }
        // sleep(3000);
        System.out.println("Exist from thread B...");
    }
}
class C extends Thread{
    @Override
    public void run(){
        for (int k = 1; k <= 5; k++) {
            
            System.out.println("From thread C,k=" + k);
        }
        System.out.println("Exist from thread C...");
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.start();
        b.start();
        c.start();
        
    }
}
 */
 /* 
class ThreadImplement extends Thread{
    @Override
    public void run(){
        for(int i =1;i<=5;i++){
            System.out.println("From Thread ThreadImple, i = " + i);
        }
    }
}
class RunnableImplement implements  Runnable{
    @Override
    public void run(){
        for(int j =1;j<=5;j++){
            System.out.println("From Thread Runnable, j = " + j);
        }
    }
}

class ThreadDemo{
    public static void main(String[] args) {
        
        ThreadImplement t1 = new ThreadImplement();
        

        Thread t2 = new Thread(new RunnableImplement());
        

        try {
            t1.start();
            t1.join();
            
            t2.start();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
 */
 /* 
class ThreadStatesDemo {

    private static final Object lock = new Object();

    public static void main(String[] args) throws Exception {

        // 1. NEW
        Thread t1 = new Thread(() -> {
            System.out.println("t1 running...");
        });
        System.out.println("t1 state (NEW): " + t1.getState());

        // 2. RUNNABLE
        Thread t2 = new Thread(() -> {
            while (true) {
                // busy loop to keep it RUNNABLE
                if (Thread.currentThread().isInterrupted()) break;
            }
        });
        t2.start();
        Thread.sleep(100); // give it time
        System.out.println("t2 state (RUNNABLE): " + t2.getState());

        // 3. TIMED_WAITING (sleep)
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(2000); // goes into TIMED_WAITING
            } catch (InterruptedException e) {}
        });
        t3.start();
        Thread.sleep(100);
        System.out.println("t3 state (TIMED_WAITING): " + t3.getState());

        // 4. WAITING (join with no timeout)
        Thread t4 = new Thread(() -> {
            try {
                t3.join(); // waits for t3 indefinitely
            } catch (InterruptedException e) {}
        });
        t4.start();
        Thread.sleep(100);
        System.out.println("t4 state (WAITING): " + t4.getState());

        // 5. BLOCKED (waiting for lock)
        Thread t5a = new Thread(() -> {
            synchronized (lock) {
                try { Thread.sleep(2000); } catch (Exception e) {}
            }
        });
        Thread t5b = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t5b acquired lock");
            }
        });
        t5a.start();
        Thread.sleep(100); // let t5a grab lock
        t5b.start();
        Thread.sleep(100);
        System.out.println("t5a state (TIMED_WAITING inside lock): " + t5a.getState());
        System.out.println("t5b state (BLOCKED waiting for lock): " + t5b.getState());

        // 6. TERMINATED
        t1.start(); // run t1 so it can finish
        t1.join();
        System.out.println("t1 state (TERMINATED): " + t1.getState());

        // cleanup
        t2.interrupt();
    }
}
 */

 /* 
class CookingTask extends Thread{
    String task;
    CookingTask(String task){
       this.task = task;
    }
    public void run(){
        System.out.println(task + " is being prepared by "+ Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread t1 = new CookingTask("Rice");
        Thread t2 = new CookingTask("Dal");
        Thread t3 = new CookingTask("Chicken");
        Thread t4 = new CookingTask("Salad");

        try{
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            t4.start();
            t4.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
 */

 /* 
class ThreadPriorityDemo{
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running with priority :" + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        System.out.println("t1 shared priority:"+t1.getPriority());
        System.out.println("t2 shared priority:"+t2.getPriority());
        System.out.println("t3 shared priority:"+t3.getPriority());

        t1.setPriority(2);
        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(7);

        System.out.println("After changing Priority is:");
        System.out.println("t1 shared priority:"+t1.getPriority());
        System.out.println("t2 shared priority:"+t2.getPriority());
        System.out.println("t3 shared priority:"+t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
 */
 /* 
class A extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }
            System.out.println("From thread A, i=" + i);
        }
        System.out.println("Exist from thread A..");
    }
}

class B extends Thread {

    public void run() {
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                interrupt();
            }
            System.out.println("From thread B, j=" + j);
        }
        System.out.println("Exist from thread B..");
    }
}

class C extends Thread {

    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("Exception caught!");
                }
            }
            System.out.println("From thread C, k=" + k);
        }
        System.out.println("Exist from thread C..");
    }
}

class ThreadDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.setPriority(Thread.NORM_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.MAX_PRIORITY);

        try {
            a.start();
            a.join();

            b.start();
            b.join();

            c.start();
            c.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(a.getName() + " Priority: " + a.getPriority());
        System.out.println(b.getName() + " Priority: " + b.getPriority());
        System.out.println(c.getName() + " Priority: " + c.getPriority());

    }
}
 */
/* 
class App {

    private static int counter = 0;

    public synchronized void increment() {
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    
}

    public static void main(String[] args) throws Exception {
        App app = new App();
         var threadOne = new Thread(app::increment);
         var threadTwo = new Thread(app::increment);

         threadOne.start();
         threadTwo.start();
         threadOne.join();
         threadTwo.join();

        System.out.println("Value : " + counter);
    }
}
*/ 

 /* 
class RaceCondition{
    int counter = 0;
    public void increment(){
        for(int i=1;i<=100000;i++){
            synchronized (this) {
                
                counter++;
            }
        }
    }
    public int getCounter(){
        return counter;
    }
}
class RaceDemo{
    public static void main(String[] args) throws Exception{
        RaceCondition demo = new RaceCondition();
        Runnable task = demo::increment;

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(100);

        System.out.println("Counter:" + demo.getCounter());
    }
}
 */
 /*
class RaceCondition {

    int counter = 0;
    private final Object lock = new Object();

    public void increment() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (lock) {

                counter++;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}

class RaceDemo {

    public static void main(String[] args) throws Exception {
        RaceCondition demo = new RaceCondition();
        Runnable task = demo::increment;

        // Thread t1 = new Thread(demo);
        // Thread t2 = new Thread(demo);
        // Thread t3 = new Thread(demo);
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Counter:" + demo.getCounter());
    }
}
 */

 /* 
class Geeks{
    public static void main(String[] args) {
        
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    
        map.put(1,"java");
        map.put(2,"python");
        map.put(5,"HTML");
        map.put(3,"c++");
    
        // System.out.print(map.get(1));

        map.putIfAbsent(4,"DBMS");
        
        System.out.print(map);
    }
}
 */
 /* 
import java.util.ArrayList;
class Geeks{
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        // ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        for(String fruit:list){
            System.out.println(fruit);
            // list.add("Rice");
        }

        System.out.println(list);
    }
}

 */

 /* 
import java.util.concurrent.ConcurrentSkipListMap;

 class Geeks{
    public static void main(String[] args) {
        // Creating a ConcurrentSkipListMap
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        // Adding elements
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(4, "Cherry");
        map.put(2, "Mango");

        // Displaying map (sorted order by key)
        System.out.println("ConcurrentSkipListMap: " + map);

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2));

        // Removing an element
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Checking navigation features
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        // SubMap example
        System.out.println("SubMap(2 to 4): " + map.subMap(2, true, 4, true));
    }
}
 */
 /* 
class EvenOdd {

    public void evenCheck() {
        System.out.println("Even NUmber");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public void oddCheck() {
        System.out.println("Odd NUmber");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}

class Main {

    public static void main(String[] args) throws Exception {
        EvenOdd e = new EvenOdd();
        Runnable even = e::evenCheck;
        Runnable odd = e::oddCheck;

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t1.join();
        t2.start();

        t2.join();
    }
}
 */


/* 
class ThreadDemo {

    public long printFact() {
        System.out.println("Factorial of 1 to 10:");
        long fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
            System.out.println(i+ " ! =" +fact);
        }
        return 0;
    }

    public void printPrime() {
        System.out.println("Prime Numbers between 50 and 100:");

        for (int i = 50; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public  boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}

class Main {

    public static void main(String[] args) throws Exception {
        ThreadDemo e = new ThreadDemo();
        Runnable fact = e::printFact;
        Runnable prime = e::printPrime;

        Thread t1 = new Thread(fact);
        Thread t2 = new Thread(prime);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

    }
}
*/
