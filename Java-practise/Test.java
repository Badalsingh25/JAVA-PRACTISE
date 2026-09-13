
 class A {
    void m1() {
        System.out.println("m1 method of class A");
    }
}
class B extends A {
    void m2() {
        System.out.println("m2 method of class B");
    }
    public static void main(String[] args) {

        A a = new A();
        a.m1();

        B b = new B();
        b.m1();
        b.m2();

        B b2 = new B();
        b2.m1();
        b2.m2();
    }
}
