import java.util.*;

import javax.xml.transform.stax.StAXResult;
public class ArraytoArrayList
{
    public static void main(String[] args) {
        String[] array=new String[] {"Android","JSP","Java","Struts","Hadoop"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        String[] array1=new String[list.size()];
        list.toArray(array1);
        for(String str:array1)
        {
            System.out.println(str);
        }
    }
}