import java.util.ArrayList;


public class reverse {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");


        System.out.println(reversethis(words));
    }

   
    public static ArrayList<String> reversethis(ArrayList<String> list) {
      
        for(int i = list.size()-1; i>=list.size()-list.size(); i-- )
            System.out.println(list.get(i));
        return list;
        
    }
}
