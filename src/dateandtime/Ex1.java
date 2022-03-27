package dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.withNano(0).withSecond(0));

        LocalTime localTime2 = LocalTime.of(22,43,4);
        System.out.println(localTime2);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate localDate = LocalDate.parse("07/12/1993",dateTimeFormatter);
        System.out.println(dateTimeFormatter.format(localDate));

        Period period = Period.between(LocalDate.now(),localDate);
        System.out.println(period.getDays());

        //LocalTime localTime3 = LocalTime.parse(dateTimeFormatter.format("26--26--36"));

    }
}
