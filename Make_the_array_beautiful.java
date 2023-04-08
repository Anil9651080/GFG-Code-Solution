import java.util.ArrayList;

public class Make_the_array_beautiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (list.size() == 0)
                list.add(num);
            else if ((list.get(list.size() - 1) >= 0 && num < 0) || (list.get(list.size() - 1) < 0 && num >= 0))
                list.remove(list.size() - 1);
            else
                list.add(num);
        }
        return list;
    }
}
