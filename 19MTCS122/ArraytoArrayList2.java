import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.transform.stax.StAXResult;
public class ArraytoArrayList2
{
    public static void main(String[] args) {
        String[] array=new String[] {"Android","JSP","Java","Struts","Hadoop"};
        List<Object> list=Arrays.stream(array).collect(Collectors.toList());
        System.out.println(list);
    }
}