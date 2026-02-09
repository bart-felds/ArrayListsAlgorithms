import java.util.ArrayList;
import java.util.PrimitiveIterator.OfLong;
import java.util.zip.CRC32C;

import javax.print.event.PrintJobListener;


public class example {

 
    public static ArrayList<Integer> doubleListElements(ArrayList<Integer> originalList) {
        ArrayList<Integer> doubledList = new ArrayList<>();

        for (Integer element : originalList) {
            doubledList.add(element);
            doubledList.add(element); 
        }

        return doubledList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original list: " + list);

        ArrayList<Integer> doubledList = doubleListElements(list);
        System.out.println("Doubled list:  " + doubledList);
   
    }
}


