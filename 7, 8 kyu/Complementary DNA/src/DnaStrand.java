import java.util.Arrays;
import java.util.stream.Collectors;

public class DnaStrand {

    public static String makeComplement(String dna){
        if (dna == null || dna.length() == 0)
            return dna;
        String str = "";
        for (String c:dna.split("")) {
            switch (c) {
                case "A" -> c = "T";
                case "T" -> c = "A";
                case "G" -> c = "C";
                case "C" -> c = "G";
            }
            str += String.join("", c);
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
