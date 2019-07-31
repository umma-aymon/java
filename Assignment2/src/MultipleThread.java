
class A extends Thread {

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("From A:" + i);
        }
    }
}

class B extends Thread {

    public void run() {
        for (int j = 200; j <= 300; j++) {
            System.out.println("From B:" + j);
        }
    }
}

class C extends Thread {

    public void run() {
        for (int k = 400; k <= 500; k++) {
            System.out.println("From C:" + k);
        }
    }
}

public class MultipleThread {

    public static void main(String ar[]) {
        A obA = new A();
        B obB = new B();
        C obC = new C();
        obA.start();
        obB.start();
        obC.start();
    }
}
