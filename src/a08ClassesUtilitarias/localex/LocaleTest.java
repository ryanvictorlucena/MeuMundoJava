package a08ClassesUtilitarias.localex;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    
    public static void main(String[] args) {
        Locale localeItalia = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Calendar c = Calendar.getInstance();
        DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
        DateFormat d2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat d3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat d4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat d5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        System.out.println("Itália " + d1.format(c.getTime()));
        System.out.println("Suíça " + d2.format(c.getTime()));
        System.out.println("India " + d3.format(c.getTime()));
        System.out.println("Japão " + d4.format(c.getTime()));
        System.out.println("Holanda " + d5.format(c.getTime()));

        System.out.println("----------------------------------");
        System.out.println(localeItalia.getDisplayCountry());
        System.out.println(localeItalia.getDisplayCountry(localeHolanda));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry(localeHolanda));
    }
}
