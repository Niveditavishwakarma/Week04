package junit.dateformatter;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatter {

        public String formatDate(String inputDate) {
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
                Date date = inputFormat.parse(inputDate);
                return outputFormat.format(date);
            } catch (Exception e) {
                return null;
            }
        }
    }


