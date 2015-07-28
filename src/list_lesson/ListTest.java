package list_lesson;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add(12);
        myList.add("Hello");
        Object a = myList.get(1);
        Integer b = (Integer)myList.get(0);
        System.out.println(b);
        System.out.println(a);
        System.out.println(myList);
    }

}
