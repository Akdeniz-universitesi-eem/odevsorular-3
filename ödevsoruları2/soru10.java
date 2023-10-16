//Bir sayının asal çarpanlarını yazdıran programı yazınız

import java.util.Scanner;

public class soru10 {

    public static void main(String[] args) {
        // Kullanicidan sayi aldım
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tane sayı gir");

        int sayi = scanner.nextInt();

        boolean cond = true;

        while (cond) {
            for (int i = 2; i <= sayi; i++) {
                if (sayi % i == 0) {
                    System.out.println(i);
                    sayi = sayi / i;
                    i = i - 1;
                }
            }
            if (sayi < 2) {
                cond = false;
            }

        }

    }
}