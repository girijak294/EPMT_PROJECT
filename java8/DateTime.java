import java.time.*;
import java.util.function.*;

public class DateTime {

    public static void main(String[] args) {
        
        // Predicate to check if a date is yesterday
        Predicate<LocalDate> isYesterday = date -> LocalDate.now().minusDays(1).isEqual(date);
        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Is yesterday: " + isYesterday.test(yesterday));

        // Supplier to get the date of next Thursday
        Supplier<LocalDate> nextThursday = () -> {
            LocalDate today = LocalDate.now();
            return today.with(java.time.temporal.TemporalAdjusters.next(DayOfWeek.THURSDAY));
        };
        System.out.println("Next Thursday is: " + nextThursday.get());

        // Supplier to get current time in EST timezone
        Supplier<ZonedDateTime> currentTimeInEST = () -> ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in EST: " + currentTimeInEST.get());

        // Function to calculate the age based on date of birth
        Function<LocalDate, Integer> calculateAge = birthDate -> {
            return Period.between(birthDate, LocalDate.now()).getYears();
        };
        LocalDate birthDate = LocalDate.of(1990, 9, 15);
        System.out.println("Age: " + calculateAge.apply(birthDate));
    }
}
