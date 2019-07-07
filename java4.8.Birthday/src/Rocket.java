import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Rocket {
    public static void main(String[] args) {

//        Samples
//        0 ­- 13.02.1989 ­- Mon
//        1 ­- 13.02.1990 -­ Tue

        DateFormat dateFormat = new SimpleDateFormat(" -- dd.MM.yyyy -- E", Locale.US);
        Calendar birthday = Calendar.getInstance();
        for (int year = 0; year < 100; year++){
            birthday.set(1986, Calendar.JUNE, 22);
            //Для наглядности
            birthday.add(Calendar.YEAR, year);
            Date date = birthday.getTime();
            System.out.println(year + dateFormat.format(date));
        }
    }
}
