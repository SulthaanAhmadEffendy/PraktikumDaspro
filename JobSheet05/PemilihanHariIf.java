package JobSheet05;
import java.util.Scanner;
public class PemilihanHariIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day;
        String dayType;
        System.out.print("Input Day (1-7): ");
        day = sc.nextInt();
        if (day >= 1 && day <= 5) {
            dayType = "Weekday";
        } else if (day == 6 || day == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }
        System.out.println(day + " is " + dayType);
    }

}
