package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingString {

    public static void main(String[] args) {

        String eka = "alphabets";
        String toka = "alphabets";

        int tulos = eka.compareTo(toka);

        System.out.println(tulos);

        List<String> sanat = new ArrayList<>();
        sanat.add("yksi");
        sanat.add("kaksi");
        sanat.add("kolme");
        sanat.add("sauna");

        List<Integer> numerot = new ArrayList<>();
        numerot.add(100);
        numerot.add(10);
        numerot.add(50);

        Collections.sort(sanat);
        Collections.sort(numerot);

        System.out.println(sanat);
        System.out.println(numerot);
    }
}
