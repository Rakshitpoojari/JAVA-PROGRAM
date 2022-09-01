import java.io.*;
public class Prg6 {
    public static void main(String[] args) {
        try
        {
            int a[]={5,10,20};
            int b=100/10-a[1];
            System.out.println(b);

        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
       /* catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Not in range");

        }
        catch (Exception ex)
        {
            System.out.println("Other types of exception");
        } */
    }
}