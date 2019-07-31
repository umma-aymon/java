package assignment3;

class Aa extends Thread {

    public void run() {
        System.out.println("threadA started");
        for (int i = 1; i <= 4; i++) {
            System.out.println("\tFrom Thread A : i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class Bb extends Thread {

    public void run() {
        System.out.println("threadB started");
        for (int j = 1; j <= 4; j++) {
            System.out.println("\tFrom Thread B : j = " + j);
        }
        System.out.println("Exit from B");
    }
}

class Cc extends Thread {

    public void run() {
        System.out.println("threadC started");
        for (int k = 1; k <= 4; k++) {
            System.out.println("\tFrom Thread C : k = " + k);
        }
        System.out.println("Exit from C");
    }
}

public class ThreadPriority {

    public static void main(String args[]) {
        Aa threadA = new Aa();
        Bb threadB = new Bb();
        Cc threadC = new Cc();
        threadC.setPriority(Thread.MAX_PRIORITY);
       // threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start thread A");
        threadA.start();

        System.out.println("Start thread B");
        threadB.start();

        System.out.println("Start thread C");
        threadC.start();

        System.out.println("End of main thread");
    }
}
