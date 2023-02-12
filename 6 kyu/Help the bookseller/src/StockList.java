import java.util.Arrays;
import java.util.HashMap;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter){
        if(lstOfArt == null || lstOf1stLetter == null || lstOfArt.length == 0 || lstOf1stLetter.length == 0)
            return "";
        
        String result = "";
        HashMap<String, Integer> mapOfArt = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int[] lstOfArtAmount =Arrays.stream(Arrays.toString(lstOfArt).replaceAll("[^\\d \\s]", "").trim().split("\\s\\s"))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();

        for (int i = 'A'; i <= 'Z'; i++) {
            mapOfArt.put(String.valueOf((char) i), 0);
        }


        for (int i = 0; i < lstOfArt.length ; i++) {
                mapOfArt.put(String.valueOf(lstOfArt[i].charAt(0)), mapOfArt.get(String.valueOf(lstOfArt[i].charAt(0))) + lstOfArtAmount[i]);
            }

        for (String str:lstOf1stLetter) {

            sb.append(String.format("(%s : %d)", str, mapOfArt.get(str)));
            sb.append(" - ");

        }
        result = (sb.substring(0, sb.length() - 3));


        return result;
    }

    public static void main(String[] args) {
        System.out.println(stockSummary(new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[]{"A", "B"}));
    }
}
