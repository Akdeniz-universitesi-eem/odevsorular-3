//JOpƟonPane.showMessageDialog(), JOpƟonPane.showInputDialog() yapılarını kullanarak
//ekrandan girilen iki sayının kullanıcının secimine göre toplama, çarpma, bölme, çıkarma sonucu
//“JOpƟonPane.showMessageDialog()” gösteren programı yazınız.

// JOptionPane kütüphanesi
import javax.swing.JOptionPane;

public class soru4 {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı aldım
        String sayi1 = JOptionPane.showInputDialog(" Sayi1 : ");
        String sayi2 = JOptionPane.showInputDialog(" Sayi2 : ");

        // Alınan sayıyı bilgilendirme ekranıyla gösteriyoruz.
        JOptionPane.showMessageDialog(null, sayi1 , "Girilen Sayı", JOptionPane.OK_OPTION);
    }
}


