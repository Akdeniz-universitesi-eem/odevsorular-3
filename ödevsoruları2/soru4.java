import javax.swing.*;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class soru4 {
    public static void main(String[] args) {

                String sayi1 = JOptionPane.showInputDialog("Birinci Sayıyı Giriniz !");
                String sayi2 = JOptionPane.showInputDialog("İkinci Sayıyı Giriniz !");

                double num1 = Double.parseDouble(sayi1);
                double num2 = Double.parseDouble(sayi2);
                //Aşağıda görülen tip camelCase
                String[]  operations = {"Toplama","Çıkarma","Çarpma","Bölme"};

                int userChoice = JOptionPane.showOptionDialog(null, "İşlem Seç", "İşlem",
                        0, 0, null, operations,operations[0]);

                double result = 0;

                switch (userChoice)
                {
                    case 0: {
                        result =num1+num2;
                    }
                    case 1: {
                        result =num1-num2;
                    }
                    case 2: {
                        result =num1*num2;
                    }
                    case 3: {
                        if(num2 != 0)
                        {
                            result =num1/num2;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Tanımsız sayi");
                            return;
                        }

                    }

                }
                System.out.println(result);
            }


        }

