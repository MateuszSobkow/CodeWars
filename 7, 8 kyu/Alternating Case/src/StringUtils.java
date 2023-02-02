public class StringUtils {
    public static String toAlternativeString(String string){
        StringBuilder resultBuilder = new StringBuilder();
        for (char character:string.toCharArray()) {
            if(!Character.isLetter(character))
                resultBuilder.append(character);
            if(Character.isLowerCase(character))
                resultBuilder.append(Character.toUpperCase(character));
            else if(Character.isUpperCase(character))
                resultBuilder.append(Character.toLowerCase(character));

        }
        return resultBuilder.toString();
    }
}
