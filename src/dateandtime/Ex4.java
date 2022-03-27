package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex4 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();

        LocalDateTime localDateTime = myLocalDateTime(localTime,localDate);
        System.out.println(localDateTime);

    }

    public static LocalDateTime myLocalDateTime(LocalTime localTime, LocalDate localDate){

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        return localDateTime;

    }
}
