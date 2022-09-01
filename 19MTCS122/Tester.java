import java.io.*;
class Emp
{
    public Emp() throws IOException,RuntimeException
    {
        System.out.println("Employee");
    }
}
class Project extends Emp {
    public Project() throws IOException,RuntimeException 
    {
        super();
    }
}

public class Tester
{
    public static void main(String[] args) throws IOException
    {
        new Emp();
    }
}