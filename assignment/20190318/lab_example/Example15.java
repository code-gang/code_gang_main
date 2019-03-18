import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example15 {
    static void sort(int[] a) {
        Arrays.sort(a);
    }

    static int[] insert(int[] a, int value) {
        Set<Integer> set = new TreeSet<>();
        set.add(value);
        set.addAll(Arrays.stream(a).boxed().collect(Collectors.toSet()));
        return set.stream().mapToInt(Number::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        a = insert(a, 2);
        a = insert(a, 6);
        System.out.println(Arrays.toString(a));
    }

}
