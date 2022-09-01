import java.util.*;
public class ArrayList21
{
    public static void main(String[] args) {
        ArrayList<Object> mixed =new ArrayList<>();
        ArrayList<String> lststr=new ArrayList<>();
        ArrayList<Integer> lstint=new ArrayList<>();
        lststr.add("John");
        lststr.add("Kim");
        lststr.add("peter");
        lstint.add(100);
        lstint.add(200);
        lstint.add(300);
        mixed.add(lststr);
        mixed.add(lstint);
        System.out.println(mixed);
    }
}