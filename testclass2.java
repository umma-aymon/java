
package javaapplication21;
interface in3
{
    void display();
}
interface in4
{
    void display1();
}
interface in5
{
    void display2();
}
class sample implements in3,in4,in5
{
    public void display()
    {
        System.out.println("first");
    }
    public void display1()
    {
        System.out.println("second");
    }
    public void display2()
    {
        System.out.println("third");
    }
}
public class testclass2 {
    public static void main(String ar[])
    {
        sample t=new sample();
        t.display();
        t.display1();
        t.display2();
    }
}
