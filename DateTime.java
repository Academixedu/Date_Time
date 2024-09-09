
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime{
    public static void main(String[] args) {
LocalDate currentDate = LocalDate.now();
System.out.println("Current Date: " + currentDate);

LocalDate specificDate = LocalDate.of(2024, Month.AUGUST, 26);
System.out.println("Specific Date: " + specificDate);

int year = currentDate.getYear();
Month month = currentDate.getMonth();
int day = currentDate.getDayOfMonth();

LocalTime currentTime = LocalTime.now();
System.out.println("Current Time: " + currentTime);

LocalTime specificTime = LocalTime.of(14, 30, 0);
System.out.println("Specific Time: " + specificTime);

LocalDateTime currentDateTime = LocalDateTime.now();
System.out.println("Current Date and Time: " + currentDateTime);

LocalDateTime specificDateTime = LocalDateTime.of(2024, Month.AUGUST, 26, 14, 30);
System.out.println("Specific Date and Time: " + specificDateTime);

LocalDate futureDate = currentDate.plusDays(10);
System.out.println(futureDate);
LocalDate pastDate = currentDate.minusMonths(3);
System.out.println(pastDate);

boolean isBefore = currentDate.isBefore(specificDate);
boolean isAfter = currentDate.isAfter(specificDate);

Period period = Period.of(1, 2, 3); // 1 year, 2 months, 3 days
LocalDate dateAfterPeriod = currentDate.plus(period);
System.out.println(dateAfterPeriod);

DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
String formattedDate = currentDate.format(dateFormatter);
System.out.println(formattedDate);


String dateString = "26-08-2024"; // The date string to parse
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // S

try{
LocalDate parsedDate = LocalDate.parse(dateString, formatter);
System.out.println(parsedDate);

}catch(Exception e){
    System.out.println(e);
}
  
}
}
