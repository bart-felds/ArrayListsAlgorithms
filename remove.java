import java.util.ArrayList;

public class remove {
    public static void main(String[] args) {
        ArrayList<String> ltrs = new ArrayList<>();
        ltrs.add("A");
        ltrs.add("B");
        ltrs.add("B");
        ltrs.add("C");
        ltrs.add("D");

        System.out.println("Original list: " + ltrs);


        for (int i = ltrs.size() - 1; i >= 0; i--) {
            if (ltrs.get(i).equals("B")) {
                ltrs.remove(i); 
        }
        
        System.out.println("List after removing 'B's: " + ltrs);
    }

    }
}