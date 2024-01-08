import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        Calendar birthCalendar = Calendar.getInstance();
        int age;

        System.out.print("Enter your birth year, month, day: ");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();

        calendar.setTime(now);
        birthCalendar.set(year, month - 1, day);

        System.out.println(calendar.getTime());
        System.out.println(birthCalendar.getTime());

        age = calendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
        if (calendar.get(Calendar.MONTH) < birthCalendar.get(Calendar.MONTH)) {
            age--;
        } else if (calendar.get(Calendar.MONTH) == birthCalendar.get(Calendar.MONTH)) {
            if (calendar.get(Calendar.DAY_OF_MONTH) <= birthCalendar.get(Calendar.DAY_OF_MONTH)) {
                age--;
            }
        }

        System.out.println("You are " + age + " years old");
        in.close();
    }
}
