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

        double area = iPrimitive * dPrimitive;
        System.out.println(area);

        ArrayList<String> list = new ArrayList<String>();
        list.add("Michael");
        list.add("Jessica");
        list.add("Lee");
        list.add(1, "Sarah");
        System.out.println(list);

        String store = list.set(2, "Mary");
        String store2 = list.get(3);
        String store3 = list.remove(1);
        int s = list.size();

        ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
// ENHANCED FOR LOOP
        for (String name : names) {
            System.out.println(name + "<- new code");
        }
// NORMAL FOR LOOP
          for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));

    if (names.get(i).substring(0,1).equals("C")) {
        names.set(i, "Sue"); 
    }
}

         
// WHILE LOOP

int index = 0;
while (index < names.size()) {
    System.out.println(names.get(index) + "<- new code");
    if (names.get(index).indexOf("Charlie") >= 0) {
        System.out.println(names.get(index));
    }
    index++; 

  }
}
}