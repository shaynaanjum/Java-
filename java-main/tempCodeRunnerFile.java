import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartA {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("java","python","apple","javascript","Avagodo");
        List<Integer> count = list.stream().filter(a->a.startsWith(a)).map(a->a.length()).collect(Collectors.toList());
        System.out.println(count);
    }
}
