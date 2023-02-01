import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        int oldLength = arr.length;
        int newLength = 0;
        while(oldLength != newLength){
            oldLength = arr.length;
            arr = reduce(arr);
            newLength = arr.length;
        }
        return arr;
    }

    public static String[] reduce(String[] arr){
        ArrayList<String> reducedListOfDir = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(i != arr.length - 1 && ((arr[i].equals("NORTH") && arr[i+1].equals("SOUTH")) || (arr[i].equals("SOUTH") && arr[i+1].equals("NORTH")))){
                i++;
            } else if(i != arr.length-1 && ((arr[i].equals("WEST") && arr[i+1].equals("EAST")) || (arr[i].equals("EAST") && arr[i+1].equals("WEST")))){
                i++;
            } else{
                reducedListOfDir.add(arr[i]);
            }
        }
        return reducedListOfDir.toArray(new String[0]);
    }

    public static String[] dirReduc2(String[] arr){
        ArrayList<String> dirs = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < dirs.size() - 1; i++) {
            if("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains((dirs.get(i) + dirs.get(i + 1)))){
                dirs.remove(i+1);
                dirs.remove(i);
                i = -1;
            }
        }
        return dirs.toArray(new String[dirs.size()]);

    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(dirReduc2(new String[]{ "EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));
    }
}
