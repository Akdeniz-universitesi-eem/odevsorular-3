/*
 1-100 arasında rastgele sayı türeten ve kullanıcı tarafından tahmin edilmeye çalışan
programı java programı yazınız. Kullanıcı girişlerini Joptionpane.showmessagedialog,
joptionpane.showinputdialog yapılarını kullanınız. (try-catch yapısını kullanınız)
 */
/*
1 -100 arasında rastgele sayı türeten ve kullanıcı tarafından tahmin edilmeye çalışan
programı java programı yazınız. Kullanıcı girişlerini Joptionpane.showmessagedialog,
joptionpane.showinputdialog yapılarını kullanınız. (try-catch yapısını kullanınız)
*/
import javax.swing.JOptionPane;
import java.util.Random;

public class odev3Soru3 {

    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;

        JOptionPane.showMessageDialog(null, "1 ile 100 arasında bir sayı tutuldu. Sayıyı bulmaya çalışın.");

        do {
            String tahminStr = JOptionPane.showInputDialog("Lutfen tahmininizi girin: ");
            guess = Integer.parseInt(tahminStr);

            if (guess < randomNumber) {
                JOptionPane.showMessageDialog(null, "Daha büyük bir sayı girin.");
            } else if (guess > randomNumber) {
                JOptionPane.showMessageDialog(null, "Daha küçük bir sayı girin.");
            } else {
                JOptionPane.showMessageDialog(null, "Tebrikler doğru tahmin ettiniz!");
            }
        } while (guess != randomNumber);
    }
}