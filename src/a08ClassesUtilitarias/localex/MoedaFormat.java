package a08ClassesUtilitarias.localex;

import java.text.NumberFormat;
import java.util.Locale;

public class MoedaFormat {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt", "BR");
        Locale localeJp = Locale.JAPAN;
        Locale localeIT = Locale.ITALIAN;
        NumberFormat[] nb = new NumberFormat[4];
        nb[0] = NumberFormat.getCurrencyInstance();
        nb[1] = NumberFormat.getCurrencyInstance(localeJp);
        nb[2] = NumberFormat.getCurrencyInstance(localePt);
        nb[3] = NumberFormat.getCurrencyInstance(localeIT);
        
        double valor = 1000000.222;
        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
    }
}
