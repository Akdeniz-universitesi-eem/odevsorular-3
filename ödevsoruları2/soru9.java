
import java.util.Scanner;
public class soru9 {

    public static void main(String[] args) {

    //Girilen saniyeyi ekrana yazdırdım
        Scanner scanner = new Scanner(System.in);

        System.out.println("Girilen saniye : ");
        int girilenSaniye = scanner.nextInt();
    //Girilen saniyeyi, saat, dakika ve saniyeye çevirmek için gerekli işlemleri yaptım.
        int saniye, dakika, saat;
        saniye = girilenSaniye % 60;
        saat = (girilenSaniye / 60) / 60;
        dakika = (girilenSaniye / 60) % 60;
        System.out.println("Saat : " +saat);
        System.out.println("Dakika : " +dakika);
        System.out.println("Saniye : " + saniye);
    }
}


