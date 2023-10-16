//Parametresi ile aldığı int türden bir sayının negaƟf mi, 0(sıķr) mı, poziƟf mi olduğunu test eden
//signum isimli metodu yazınız ve test ediniz. Metot poziƟf için 1(bir), negaƟf için -1(eksi bir) ve sıķr için
//0(sıfır) döndürecektir.
import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        //Sayıları ekrana yazdırma işlemi
        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen uc sayi giriniz: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        input.close();

        int sonuc1 = signum(x);
        int sonuc2 = signum(y);
        int sonuc3 = signum(z);

        System.out.println(x + " icin sonuc: " + sonuc1);
        System.out.println(y + " icin sonuc: " + sonuc2);
        System.out.println(z + " icin sonuc: " + sonuc3);
    }

    public static int signum(int sayi) {
        if (sayi > 0) {
            return 1;
        } else if (sayi < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}