import java.util.*;
import java.io.*;
public class Prg3 {
    public static void main(String[] args) {
       try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        if(age>=120)
        {
            throw new Exception("Invalid Age");
        }
        else
        {
            System.out.println("Age is :"+age);
        }
       }

catch(Exception ex)
{
    System.out.println(ex.getMessage());
}
       

    }
}