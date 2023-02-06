import java.time.LocalDate;
//import java.util.Calendar;
import java.util.Scanner;
import java.time.Period;

public class JavaCalculator {
    public static void main(String[] args) {
        try {
            int months = 12;
            int days = 30;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the birth year:");
            int year = sc.nextInt();
            System.out.println("Enter the birth month:");
            int month = sc.nextInt();
            System.out.println("Enter the birth day:");
            int day = sc.nextInt();

            LocalDate d = LocalDate.now();
            System.out.println("Today date year:" + d + ".");

            LocalDate birthdate = LocalDate.of(year, month, day);
            LocalDate now = LocalDate.now();
            Period age = Period.between(birthdate, now);

            System.out.println("Your age is: " + age.getYears() + " year " + age.getMonths() + " month " + age.getDays()
                    + " days.");

        } catch (Exception e) {
            System.out.println("Something went wrong<<<>>>");

        }

    }

}
