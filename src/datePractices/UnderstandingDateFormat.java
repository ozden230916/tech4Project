package datePractices;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println(currentDate);//Sat Apr 30 11:13:48 EDT 2022

        //MM/dd/yyyy  04/30/2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("Today is = " + sdf2.format( currentDate));


        //Print date in the format of Sat hh: mm PM
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEE h:mm a");
        System.out.println(sdf3.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate));
    }
}
