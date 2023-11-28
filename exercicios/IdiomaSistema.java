package exercicios;

import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault();

        String idioma = local.getLanguage();
        String pais = local.getCountry();

        System.out.println("Idioma: " +idioma);
        System.out.println("País: " +pais);
    }
}
