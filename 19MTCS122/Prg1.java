
import java.io.*;
 class Prg1
{
    public static void main(String[] args)
    {
        try 
        {
            int a=10/0;
            System.out.println(a);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}