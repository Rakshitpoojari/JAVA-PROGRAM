import java.util.*;
public class PrgHashmap
{
    public static void main(String[] args) {
        HashMap map=new HashMap<>();
        map.put(10, "value");
        map.put(20, 200000);
        map.put(30, 300.50);
        map.put(40, 'M');
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
    }
}