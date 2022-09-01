import java.util.*;
public class Collection_Framework {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
       // HashSet l=new HashSet<>();
        l.add(1);
        l.add("mite");
        l.add('M');
        l.add(new Integer(1));
        l.add('M');
        l.add("Mite");
        System.out.println(l);
    }
}
//program to add more than one datatype to single object