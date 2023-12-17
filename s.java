import java.util.ArrayList;
import java.util.List;

public class s {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("hello");
        l.add("hello");
        l.add("hello");
        for (String string : l) {
            System.out.println(string);
        }
    }
}
