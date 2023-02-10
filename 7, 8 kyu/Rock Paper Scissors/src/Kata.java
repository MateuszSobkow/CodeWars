public class Kata {
    public static String rps(String p1, String p2){

        String p1Won = "Player 1 won!";
        String p2Won = "Player 2 won!";


        if(p1.equals("rock")){
            if(p2.equals("paper"))
                return p2Won;
            else if(p2.equals("scissors"))
                return p1Won;
        }
        if(p1.equals("paper")){
            if(p2.equals("scissors"))
                return p2Won;
            else if(p2.equals("rock"))
                return p1Won;
        }
        if(p1.equals("scissors")){
            if(p2.equals("rock"))
                return p2Won;
            else if(p2.equals("paper"))
                return p1Won;
        }
        return "Draw!";

    }
    public static String rps2(String p1, String p2){
        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1:2;
        return String.format("Player %d won!", p);
    }
}
