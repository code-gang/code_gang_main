import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Example08 {
    static Collection<String> intersection(Collection<String> c1, Collection<String> c2) {
        Set<String> c = new HashSet<>();
        for(String s : c1){
            if(c2.contains(s))
                c.add(s);
        }
        return c;
    }

    public static void main(String[] args) {
        Collection<String> c1 = Arrays.asList("a", "b", "c", "d");
        Collection<String> c2 = Arrays.asList("b", "d", "e", "f");
        Collection<String> c3 = intersection(c1, c2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }

}
