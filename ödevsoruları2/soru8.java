//Klavyeden bir n sayısı okuyunuz ve aşağıdaki deseni oluşturan programı yazınız
public class soru8 {
    public static void main(String[] args) {
// Hem satır hem sütun olacağı için iç içe for dögüleri yaptım
// Ayrıca println yerine print yazarsak alt alta değil yan yana yazmış oluruz.
        for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

// Oluşturduğumuz görüntünün tam tersini elde etmek için for içini değiştirdim
        System.out.println();
        }
// Oluşturduğumuz görüntünün tam tersini elde etmek için for içini değiştirdim
// i=4 demememin sebebi 5 dediğim zaman 5 yıldızı iki kez yapmasıydı.
        for (int i = 4; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}