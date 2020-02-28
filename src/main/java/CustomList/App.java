package CustomList;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        List<Integer> l = new DemoList<Integer>(1,2,3,4,5,6,7,9,0,1);
        l.add(10);
        l.add(20);
        System.out.println(l.get(1));
        System.out.println(l);
    }
}
