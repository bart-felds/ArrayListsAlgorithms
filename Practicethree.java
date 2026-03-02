public class Practicethree {
    static String[][] names = {
    {"Jack", "Jill", "Jane", "Joey"},
    {"Maura", "Molly", "Mason", "Maureen"},
    {"Emma", "Eileen", "Elizabeth", "Emma"}
};
public static String[][] shortenme(String[][] names){
    int rows = names.length;
    String[][] shortened = new String[rows][];

    for(int row = 0; row<names.length; row++){
        for(int col = 0; col<names[row].length; col++){
            shortened[row] = new String[col];
            if(names[row][col].length() >= 3){
                String name = names[row][col];
                shortened[row][col] = name.substring(0,3);
                
            }
           
        }
    }
    
    return shortened;
    
}



public static void main(String[] args) {
    String[][] shortenedNames = shortenme(names);

        
        for (int i = 0; i < shortenedNames.length; i++) {
            for (int j = 0; j < shortenedNames[i].length; j++) {
                System.out.print(shortenedNames[i][j]);
            }
            System.out.println();
}
}
}



