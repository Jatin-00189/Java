import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);

        //Time

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // Both

        LocalDateTime date_time = LocalDateTime.now();
        System.out.println(date_time);

        //Formatter

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = date_time.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);



    }
}


