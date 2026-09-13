// package Java-practise;

 class Base {
    Base() {
        System.out.println("Base class constructor");
    }
}
class Derived extends Base {
    Derived() {
        System.out.println("Derived class constructor");
    }
}
class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}
