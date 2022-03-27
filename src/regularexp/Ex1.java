package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {
        String input = "abcde";
        Pattern pattern = Pattern.compile("[a-z]+",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.matches());
    }

}
