public class Sid {
    public static String howMuchILoveYou(int nb_petals){
        int result = nb_petals % 6;
        if(result == 0)
            return "not at all";
        if(result == 1)
            return "I love you";
        if(result == 2)
            return "a little";
        if(result == 3)
            return "a lot";
        if(result == 4)
            return "passionately";
        if(result == 5)
            return "madly";
        return "idk";

    }

    public static void main(String[] args) {
        System.out.println(howMuchILoveYou(158));
    }
}
