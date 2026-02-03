import javax.xml.stream.events.EndElement;

//Barrington Fields; 2/2/2026 \\ Wrapper Class
//Create an integer I, capital I for integer. Assign it to 30, double D, assign it to 40.3
import java.util.*;
public class practice {
    public static void main(String[] args) {
     
        Integer I = 30;
        Double D = 40.3;

     
        System.out.println("Integer I = " + I);
        System.out.println("Double D = " + D);

          int iPrimitive = I;
        double dPrimitive = D; 
     
        System.out.println("Primitive int iPrimitive = " + iPrimitive);
        System.out.println("Primitive double dPrimitive = " + dPrimitive);
        double area = iPrimitive*dPrimitive;
        System.out.println(area);

        ArrayList <String> list = new ArrayList<String> ();
        list.add("Michael");
        list.add("Jessica");
        list.add("Lee");
        list.add(1,"Sarah");
        System.out.println(list);
        String store = list.set(2,"Mary");
        String store2 = list.get(3);
    }

}






















