public class ZywOo {
    public static String warnTheSheep(String[] array){
        if(array[array.length - 1].equals("wolf"))
            return "Pls go away and stop eating my sheep";
        int wolfInQueue = 0;
        for(int i = array.length - 2; i >= 0 ; i--){
            if(array[i].equals("wolf"))
                wolfInQueue = array.length - (i + 1);
        }
        return String.format("Oi! Sheep number %d! You are about to be eaten by a wolf!", wolfInQueue);
    }

    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
    }

}
