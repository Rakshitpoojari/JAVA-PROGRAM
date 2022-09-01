interface Emp
{
    int salary();
    default void meth()
    {
        System.out.println("Method 1");
    }
    default void meth2()
    {
        System.out.println("Method 2");
    }
}
class Project1 implements Emp
{
    @Override
    public int salary()
    {
        return 55000+5000;
    }
}
class Project2 implements Emp
{
    @Override
    public int salary()
    {
        return 65000+6000;
    }
}

public class Pr1 {
    public static void main(String[] args) {
        Emp c;
        
        Project1 p1=new Project1();
        c=p1;
        System.out.println("Project 1 Salary :"+p1.salary());
     
        Project2 p2=new Project2();
        c=p2;
        
        System.out.println("Project 2 Salary :"+p2.salary());
        c.meth();
        c.meth2();
    }
}
