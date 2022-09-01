import java.io.*;
public class Prg5
{
    public static void main(String[] args)
    {
        
        System.out.println(meth());
        }
    static int meth()
    {
        try 
        {
            int i=Integer.parseInt("123");
            return 20;
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return 25;
        }
        finally{
            return 50;
        }
      //  System.out.println("44");
    }
}