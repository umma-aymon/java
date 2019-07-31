
package javaapplication21;
interface in1
{
    final int a=10;
    void display();
}
interface in2 extends in1
{
    final int b=20;
    void display1();
}
public class testclass {
    public void display()
    {
        System.out.println("1st interface");
    }
     public void display1()
    {
        System.out.println("2nd interface");
    }
     public static void main(String ar[])
     {
         testclass t=new testclass();
         t.display();
         t.display1();
         System.out.println("a="+in1.a);
       System.out.println("b="+in2.b);
     }
}
