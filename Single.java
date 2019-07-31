package assignment3;

class A {

    public void display() {
        System.out.println("From A");
    }
}

class B extends A {

    public void show() {
        System.out.println("From B");
    }
}

public class Single {

    public static void main(String[] arguments) {
        B ob = new B();
        ob.display();
        ob.show();
    }
}
