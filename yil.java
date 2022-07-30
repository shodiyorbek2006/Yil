package Date;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.util.Scanner;

public class yil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime= LocalDateTime.now();
        System.out.println("year: ");
        int year = scanner.nextInt();
        Year year1 = Year.of(year);
        LocalDateTime Date= LocalDateTime.now();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("O'zbekiston  vaqti && yili"+Date);
        System.out.println("Hafta kuni"+dayOfWeek);
        ZoneId zoneId = ZoneId.of("America/New_York");
        LocalDateTime time = LocalDateTime.now(zoneId);
        System.out.println("New_York  vaqti"+time);
        System.out.println("Davlat "+zoneId);
    }
}
