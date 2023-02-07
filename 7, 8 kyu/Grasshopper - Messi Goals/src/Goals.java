public class Goals {
    private static int laLigaGoals = 43;
    private static int championsLeagueGoals = 10;
    private static int copaDelReyGoals = 5;
    public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;

    public Goals() {}
    public Goals(int laLigaGoals, int championsLeagueGoals, int copaDelReyGoals) {
        Goals.laLigaGoals = laLigaGoals;
        Goals.championsLeagueGoals = championsLeagueGoals;
        Goals.copaDelReyGoals = copaDelReyGoals;
    }


    public static int getLaLigaGoals() {
        return laLigaGoals;
    }

    public static void setLaLigaGoals(int laLigaGoals) {
        Goals.laLigaGoals = laLigaGoals;
    }

    public static int getChampionsLeagueGoals() {
        return championsLeagueGoals;
    }

    public static void setChampionsLeagueGoals(int championsLeagueGoals) {
        Goals.championsLeagueGoals = championsLeagueGoals;
    }

    public static int getCopaDelReyGoals() {
        return copaDelReyGoals;
    }

    static void setCopaDelReyGoals(int copaDelReyGoals) {
        Goals.copaDelReyGoals = copaDelReyGoals;
    }

    public static void main(String[] args) {

        Goals.setLaLigaGoals(43);
        Goals.setChampionsLeagueGoals(10);
        Goals.setCopaDelReyGoals(5);
        System.out.println(Goals.totalGoals);
        Goals goals2 = new Goals(43, 10, 5);
        System.out.println(goals2.totalGoals);
    }
}
