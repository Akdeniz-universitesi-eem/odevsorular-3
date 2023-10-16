
import java.util.Scanner;

public class soru5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Üç tane sayı gir boşluk bırakarak");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        //Bubble Sort implement edilebilir.
        // a < b < c  c bizim için num3 olsun
        if(num1> num2)
        {
            int temp = num1;
            num1 = num2;
            num2= temp;
        }

        if(num2>num3)
        {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if(num1 > num2)
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        String signn1 = (num1 == num2) ?"=": "<";
        String signn2 = (num2 == num3) ?"=": "<";


        String sign1 = "";
        // a işaret b işaret
        if(num1 == num2)
        {
            sign1 = "=";
        }
        else
        {
            sign1= "<";
        }

        String sign2 = "";
        if(num2 == num3)
        {
            sign2 = "=";
        }
        else
        {
            sign2= "<";
        }
        System.out.println(num1+signn1+num2+signn2+num3);
    }


}
