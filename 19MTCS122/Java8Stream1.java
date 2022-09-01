import java.util.*;
import java.util.stream.Stream;
public class Java8Stream1
{
    public static void main(String[] args) {
        Stream<Integer> s=Stream.of(1,2,3,4,54,6,7);
        s.forEach(p->System.out.println(p));
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("ArraySize");
        for(int i=1;i<10;i++)
        {
            list.add(i);
        }
        s=list.stream();
        s.forEach(p->System.out.println(p));
    }
}