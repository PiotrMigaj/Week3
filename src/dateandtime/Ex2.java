package dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Wprowadź datę w formacie YYYY-MM-DD");
        Scanner scanner = new Scanner(System.in);
        String myDate = scanner.nextLine();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate = LocalDate.parse(myDate,df);
        System.out.println(df.format(localDate));

    }
}
