package examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;
//saab teha ka wildcardina a-la java.time.* (ehk võtab kõik .time packaaged)
//sama saab teha ka java.util.* (LOOGISH ONJU)
/**
 * Package Examples
 *
 * @author Joozepp
 *
 */

public class PackageExample {
    public static void main(String[] args) {
        Random random =  new Random();

        System.out.println(random.nextInt());

        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate myBirthday = LocalDate.of(1996, 8, 9);
        System.out.println(myBirthday);

    }
}
