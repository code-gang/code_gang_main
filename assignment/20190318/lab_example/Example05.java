import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example05 {
    static void removeEvenNumbers(Collection<Integer> c) {
        List<Integer> list = (List<Integer>) c;
        for(int k = 0; k < list.size(); k++){
            if(list.get(k) % 2 == 0)
                list.remove(k);
        }
    }

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; ++i)
            c.add(i);
        removeEvenNumbers(c);
        System.out.println(c.toString());
    }

}
