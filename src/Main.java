import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        HashSet<String> dayOfWeek =new HashSet<>();
        dayOfWeek.add("lunedi");
        dayOfWeek.add("martedi");
        dayOfWeek.add("mercoledi");
        dayOfWeek.add("giovedi");
        dayOfWeek.add("venerdi");
        dayOfWeek.add("sabato");
        dayOfWeek.add("domenica");

        System.out.println(dayOfWeek);

        boolean isTheFirstSetEqualToTheSecondOne = dayOfWeek.equals(dayOfWeek);
        System.out.println(isTheFirstSetEqualToTheSecondOne);
    }
}
