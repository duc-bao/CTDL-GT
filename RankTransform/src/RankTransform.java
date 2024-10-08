import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RankTransform {
    public static void main(String[] args) {
        int array[] = {100, 20, 30, 40};
        int result[] = transform(array);
        for (int s :
                result) {
            System.out.println(s);
        }
    }

    private static int[] transform(int[] array) {
        Set<Integer> arraySet = new TreeSet<>();
        for (int a :
                array) {
            arraySet.add(a);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int n:
             arraySet) {
            map.put(n, rank++);
        }
        int result[] = new int[array.length];
        for (int i = 0; i < array.length; i++){
            result[i] = map.get(array[i]);
        }
        return result;
    }
}
