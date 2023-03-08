import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class day {
    public static String days(int month, int date,int year){
        LocalDate Date = LocalDate.of(year, month, date);
        return Date.format(DateTimeFormatter.ofPattern("EEEE")).toUpperCase();

    }
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter month");
        int month = nr.nextInt();
        System.out.println("Enter date");
        int date = nr.nextInt();
        System.out.println("Enter year");
        int year = nr.nextInt();
        String Day = days(month, date, year);
        System.out.println("the day :- "+Day);
    }
}
