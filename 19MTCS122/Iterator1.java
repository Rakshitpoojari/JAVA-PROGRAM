import java.util.*;
public class Iterator1
{
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        aList.add("5");
        Iterator i=aList.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}