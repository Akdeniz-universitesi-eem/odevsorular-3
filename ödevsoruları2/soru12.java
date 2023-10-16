import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        // Çift sayiyi ekrana yazdirdim
        Scanner scanner = new Scanner(System.in);
        System.out.print("cift sayiniz: ");
        //Cift sayiyi bulmak için 2'ye bölümünden kalanın sıfır olmasını ve 2'den büyük olması gerektiğini yazdım.
        int ciftSayi = scanner.nextInt();

        if (ciftSayi % 2 == 0 && ciftSayi > 2) {
            findGoldbach(ciftSayi);
        }
        else {
            System.out.println("cift bir sayi degil veya 2'den kucuk");
        }

        scanner.close();
    }

    public static void findGoldbach(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}