package assignment3;

class AA {

    public void display() {
        System.out.println("From A");
    }
}

class BB extends AA{

    public void show() {
        System.out.println("From B");
    }
}
class C extends BB{

    public void result() {
        System.out.println("From C");
    }
}
public class Multilevel {

    public static void main(String[] arguments) {
        C ob = new C();
        ob.display();
        ob.show();
        ob.result();
    }
}
