import java.io.*;
class Prg4
{
    public static void main(String[] args)
    {
        try
        {
            int x=10/0;
            System.out.println(x);
        }
        catch(Exception ex)
        {
            System.out.println("Catch Block");
        }
        finally
        {
            System.out.println("After try and catch");
        }
        //System.out.println("After try and catch");
    }
}