package interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingValues {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Eve", "Bob", "Ava", "David", "Charlie");

        Collections.sort(names);

        System.out.println(names);
    }
}
