public class TotalPoints {
    public static int points(String[] games){
        int goals = 0;
        for (int i = 0; i < games.length; i++) {
            if(games[i].charAt(0) > games[i].charAt(2))
                goals += 3;
            else if(games[i].charAt(0) == games[i].charAt(2))
                goals += 1;
        }
        return goals;
    }
}
