import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Program23 {
    public static void main(String[] args) {

        /*
         * Date dt = Calendar.getInstance();
         * DateFormat Formatter = new SimpleDateFormat("MM/DD/YYY");
         * String str = Formatter.format(dt);
         * System.out.println(str);
         */
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);
    }

}
