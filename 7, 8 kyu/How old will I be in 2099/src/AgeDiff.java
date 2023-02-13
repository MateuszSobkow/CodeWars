public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo){
        if(yearTo - birth == -1)
            return "You will be born in 1 year.";
        if(yearTo - birth < 0)
            return String.format("You will be born in %d years.", birth - yearTo);
        else if(yearTo - birth == 0)
            return "You were born this very year!";
        else if(yearTo - birth == 1)
            return "You are 1 year old.";

        return String.format("You are %d years old.", yearTo - birth);
    }
}
