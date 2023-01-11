
public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        return   String.format("%s.%s", name.toUpperCase().charAt(0), name.toUpperCase().charAt(name.indexOf(" ")+ 1));

    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}

