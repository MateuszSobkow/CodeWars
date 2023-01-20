public class Banjo {

    public static String areYouPlayingBanjo(String name){
        if(name == null || name.length() == 0)
            return name;
        if(name.charAt(0) == 'r' || name.charAt(0) == 'R')
            return String.format("%s plays banjo", name);
        return String.format("%s does not play banjo", name);
    }
    public static String areYouPlayingBanjo2(String name){
        return name.toUpperCase().startsWith("R") ? String.format("%s plays banjo", name) : String.format("%s does not play banjo", name);
    }
}
