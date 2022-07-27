import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TexteForEach {
    public static void main(String[] args) {

        List<String> palavra = new ArrayList<>();

        String palavra1 = "Ana";
        String palavra2 = "Paralelepípedo";
        String palavra3 = "Histerosalpingográfico";
        String palavra4 = "Inconstitucionavelmente";
        String palavra5 = "Otorrinolaringologista";

        palavra.add(palavra1);
        palavra.add(palavra2);
        palavra.add(palavra3);
        palavra.add(palavra4);
        palavra.add(palavra5);

        palavra.sort((s1, s2) -> s2.length() - s1.length());
        //Collections.sort(palavra);

        palavra.forEach(p -> System.out.println(p));

    }
}
