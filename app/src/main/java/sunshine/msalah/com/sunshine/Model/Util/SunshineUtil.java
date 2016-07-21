package sunshine.msalah.com.sunshine.Model.Util;

/**
 * Created by user on 7/15/16.
 */

public class SunshineUtil {

    public static String getUrl(int numberOfDays, String city){

        city = String.format(SunshineConstants.CITY_ID, city);
        String days = String.format(SunshineConstants.NUMBER_OF_DAYS, numberOfDays);

        return String.format(SunshineConstants.URL_FORMAT,
                SunshineConstants.URL_BASE,
                SunshineConstants.API_KEY,
                city,
                days);
    }

}
