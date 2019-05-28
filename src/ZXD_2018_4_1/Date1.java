package ZXD_2018_4_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 通过时间秒毫秒数判断两个时间的间隔
 * @param date1
 * @param date2
 * @return
 */

public class Date1 {
    public static void main(String[] args){
        String dateStr1 = "2008-1-1 1:21:28";
        String dateStr2 = "2010-1-2 1:21:28";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try
        {
            Date date2 = format.parse(dateStr2);
            Date date1 = format.parse(dateStr1);

            System.out.println("两个日期的差距：" + differentDaysByMillisecond(date1,date2) +"天");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static int differentDaysByMillisecond(Date date1, Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }
}

