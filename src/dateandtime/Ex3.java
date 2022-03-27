package dateandtime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex3 {
    public static void main(String[] args) {

        LocalTime localTime1 = myTime(12,12,12);
        LocalTime localTime2 = myTime(12,13,12);

        Duration duration = Duration.between(localTime1,localTime2);

        System.out.println(duration.getSeconds());

        //System.out.println(myTime(12,12,12));

    }

    public static LocalTime myTime(int hour, int minute, int second){

        LocalTime localTime;
        localTime = LocalTime.of(hour,minute,second);

        return localTime;

    }
}
