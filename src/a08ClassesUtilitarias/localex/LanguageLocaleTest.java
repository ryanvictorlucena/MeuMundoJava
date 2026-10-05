package a08ClassesUtilitarias.localex;

import java.util.Locale;

public class LanguageLocaleTest {
    
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }

        System.out.println("\n--------------------------\n");

        for (String isoCountrie : isoCountries) {
            System.out.print(isoCountrie + " ");
        }
    }
}
