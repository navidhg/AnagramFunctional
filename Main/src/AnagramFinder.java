import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by navidhg on 09/07/2014.
 */
public class AnagramFinder {

    public static void main (String[] args) {

        List<String> names = Arrays.asList("john", "david", "peter", "sarah", "anna");
        Collections.sort(names, (a, b) -> b.compareTo(a));

        for (String s : names) System.out.println(s);

        System.out.println("testing IntelliJ's Git integration");

    }

}
