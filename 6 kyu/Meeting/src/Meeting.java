import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Meeting {
    public static String meeting(String s){
        List<String> meetingList = new ArrayList<>();

        for (String str :s.toUpperCase().split(";")) {
            String[] arr = str.split(":");
            meetingList.add("(" + arr[1] + ", " + arr[0]+ ")");
        }
        StringBuilder resultBuilder = new StringBuilder();

        for (String str : meetingList.stream().sorted().toList()) {
            resultBuilder.append(str);
        }

        return resultBuilder.toString();
    }
    public static String meeting2(String s){
        return Arrays.stream(s.toUpperCase().split(";"))
                .map(names -> names.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining(""));
    }



    public static void main(String[] args) {
        System.out.println(meeting2("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
    }
}
