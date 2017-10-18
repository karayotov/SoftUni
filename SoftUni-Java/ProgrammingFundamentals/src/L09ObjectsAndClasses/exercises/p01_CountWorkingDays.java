package L09ObjectsAndClasses.exercises;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class p01_CountWorkingDays {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());

        Date fromDate = dateFormat.parse(scanner.nextLine());
        Date toDate = dateFormat.parse(scanner.nextLine());

        Calendar start = Calendar.getInstance();
        start.setTime(fromDate);
        Calendar end = Calendar.getInstance();
        end.setTime(toDate);
        int workdaysCounter = 0;

//        Calendar holidayCal = Calendar.getInstance();
//        Date holidayDay = new Date();
//        holidayCal.setTime(holidayDay);
//
//        holidayCal.set(Calendar.HOUR_OF_DAY, 0);
//        holidayCal.set(Calendar.MINUTE, 0);
//        holidayCal.set(Calendar.SECOND, 0);
//        holidayCal.set(Calendar.MILLISECOND, 0);
//        holidayDay = holidayCal.getTime();

        List<Date> holiday = new ArrayList<>();


        for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
            if (!date.equals(Calendar.SATURDAY) || !date.equals(Calendar.SUNDAY)){
                holiday.add(0, dateFormat.parse("01-01-1970"));
                holiday.add(1, dateFormat.parse("03-03-1970"));
                holiday.add(2, dateFormat.parse("01-05-1970"));
                holiday.add(3, dateFormat.parse("06-05-1970"));
                holiday.add(4, dateFormat.parse("24-05-1970"));
                holiday.add(5, dateFormat.parse("06-09-1970"));
                holiday.add(6, dateFormat.parse("22-09-1970"));
                holiday.add(7, dateFormat.parse("01-11-1970"));
                holiday.add(8, dateFormat.parse("24-12-1970"));
                holiday.add(8, dateFormat.parse("25-12-1970"));
                holiday.add(8, dateFormat.parse("26-12-1970"));

                if (holiday.contains(start.getTime())){

                }
            }
        }
    }
}