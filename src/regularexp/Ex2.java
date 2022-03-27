package regularexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

    public static void main(String[] args) {

        //Ex1
//        String text1 = "Łukasz";
//        Pattern pattern1 = Pattern.compile("[A-Z][a-z]+",Pattern.UNICODE_CHARACTER_CLASS);
//        System.out.println(pattern1.matcher(text1).matches());

        //Ex2
//        String text2 = "123,56";
//        Pattern pattern2 = Pattern.compile("-?[0-9]+(,[0-9]+)?");
//        System.out.println(pattern2.matcher(text2).matches());


        //Ex3
        String text3 = "aaa5zjjj";
        Pattern pattern3 = Pattern.compile("a{4}[0-9]+z*j{3,5}[xyz]");
        System.out.println(pattern3.matcher(text3).matches());
        System.out.println(pattern3.matcher(text3).find());

        //Ex4
//        String text4 = "jjj";
//        Pattern pattern4 = Pattern.compile("j{3,5}");
//        System.out.println(pattern4.matcher(text4).matches());

        //Ex5
//        String text5 = "123Ax";
//        Pattern pattern5 = Pattern.compile(".*[xyz]");
//        System.out.println(pattern5.matcher(text5).matches());
    }
}
