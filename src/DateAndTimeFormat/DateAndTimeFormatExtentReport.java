/*
 * Creation : 06-Jan-2019
 */
package DateAndTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatExtentReport {
    String date = null;

    public String getDateAndTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
        LocalDateTime now = LocalDateTime.now();
        date = dtf.format(now);
        return date;
    }
}
