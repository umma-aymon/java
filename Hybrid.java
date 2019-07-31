
package assignment3;

class Student
{
    int rollNumber;
    void getNumber(int n)
    {
        rollNumber=n;
    }
    void putNumber()
    {
        System.out.println("Roll No : "+rollNumber);
    }
}
class Test extends Student
{
    float part1,part2;
    void getMarks(float m1,float m2)
    {
        part1=m1;
        part2=m2;
    }
    void putMarks()
    {
        System.out.println("Marks Obtained ");
        System.out.println("Part 1 = "+part1);
        System.out.println("Part 2 = "+part2);
    }
}
interface Sports
{
    float sportWt=6.0F;
    void putwt();
}
    class Results extends Test implements Sports
    {
        float total;
        public void putwt()
        {
            System.out.println("Sports Wt = "+sportWt);
        }
        void diplay()
        {
            total=part1+part2+sportWt;
            putNumber();
            putMarks();
            putwt();
            System.out.println("Total score = "+total);
        }
    }
public class Hybrid {
    public static void main(String args[])
    {
        Results student1=new Results();
        student1.getNumber(1234);
        student1.getMarks(27.5F, 33.0F);
        student1.diplay();
    }
}
