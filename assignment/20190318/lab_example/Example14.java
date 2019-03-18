import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Example14 {
    static void sort(int[] a) {
        Arrays.sort(a);
    }

    static boolean contains(int[] a, int value) {
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(a).boxed().collect(Collectors.toSet()));
        return set.contains(value);
    }

    public static void main(String[] args) {
        int[] a = { 3, 8, 1, 2, 4, 5, 7 };

        sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(contains(a, 2));
        System.out.println(contains(a, 6));
    }

}
