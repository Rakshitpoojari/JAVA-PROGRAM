import java.util.*;
import java.util.stream.Stream;
public class Java8Stream2
{
    public static void main(String[] args) {
        
    
        List<Integer> list=new ArrayList<>();
        System.out.println("ArraySize");
        for(int i=1;i<10;i++)
        {
            list.add(i);
        }
        Stream<Integer> s=list.stream();
        Integer[] e=s.filter(i->i%2==0).toArray(Integer[]::new);
        for(int i:e)
        {
                System.out.println(" "+i);
        }
    }
}