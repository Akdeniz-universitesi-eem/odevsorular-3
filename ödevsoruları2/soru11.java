
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

        public class soru11 {

            public static void main(String[] args) {

                String height=JOptionPane.showInputDialog("Height Değerini giriniz.");
                String width=JOptionPane.showInputDialog("Width Değerini giriniz.");

                int h1 = Integer.parseInt(height);
                int w1 = Integer.parseInt(width);

                int position = 0;
                boolean forward = true;
                for(int i = 0 ; i<h1; i++)
                {
                    System.out.print("|");
                    for(int j = 0 ; j<w1 ; j++)
                    {
                        if(j == position)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("|");

                    if(forward)
                    {
                        position++;
                    }
                    else
                    {
                        position--;
                    }
                    if(position == w1-1 || position == 0)
                    {
                        forward = ! forward;
                    }
                }
            }
        }
