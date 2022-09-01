import java.util.*;
public class Duplicateleatstring
{
    public static void main(String[] args) {
        String[] s=new String[] {"Andriod","","","Java","Struts","Fab"};
        ArrayList<String> str=new ArrayList<>(Arrays.asList(s));
        System.out.println("Empty String :"+(int)str.stream().filter(String->String.isEmpty()).count());
    }
}