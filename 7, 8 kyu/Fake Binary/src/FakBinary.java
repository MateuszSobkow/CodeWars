
public class FakBinary {
    public static String fakebin(String numberString) {
        StringBuilder sb = new StringBuilder();
        char[] tabOfString = numberString.toCharArray();
        for (char c : tabOfString) {
            if (c < '5')
                sb.append('0');
            else
                sb.append('1');
        }
        return sb.toString();
    }

    public static String fakebin2(String numberString) {
        return numberString.replaceAll("[1-4]", "0").replaceAll("[5-9]", "1");
    }
}
