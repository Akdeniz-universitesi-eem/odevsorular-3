//Bir sayının asal çarpanlarını yazdıran programı yazınız

import java.util.Scanner;

public class soru10 {

    public static void main(String[] args) {
        // Kullanicidan sayi aldım
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tane sayı gir");

        int sayi = scanner.nextInt();
        // bölen değişkeni oluşturdum
        int bolen = 2;
        // Girilen sayıya kadar bir for döngüsü oluşturdum
        for (int i = 1; i < sayi; i++) {
            if (sayi % bolen == 0) {
                System.out.println(bolen);
                sayi = sayi / bolen;
            }
            // Eğer bölen sayılar girilen sayıya tam bölünmüyorsa kalan sıfır olmaz
            // Bu yüzden bir tane else yapısı oluşturdum
            else {
                bolen++;


            }

        }
    }
}