import java.util.*;

public class removeme
{
    public static ArrayList<Integer> removeMe(ArrayList<Integer> list)
    {
        for (int i = list.size() - 1; i >= 0; i--)
        {
            if (list.get(i) == 3)
            {
                list.remove(i);
            }
        }
        return list;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 1, 3, 5, 3, 6, 7, 3, 9, 3));
        removeMe(nums);
        System.out.println(nums);
    }
}
