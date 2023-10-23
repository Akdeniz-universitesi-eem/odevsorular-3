/*
   abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
   koşul 1 cba > abc olacak
   koşul 2 abc asal sayı olacak
   koşul 3 cba asal sayı olacak
   koşul 4 ab asal sayı olacak
   koşul 5 bc asal sayı olacak
   koşul 6 cb asal sayı olacak
   koşul 7 ba asal sayı olacak
   Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız
    */
/*
abc üç basamaklı bir tamsayıdır ve aşağıdaki koşulları sağlamaktadır:
koşul 1 cba > abc olacak
koşul 2 abc asal sayı olacak
koşul 3 cba asal sayı olacak
koşul 4 ab asal sayı olacak
koşul 5 bc asal sayı olacak
koşul 6 cb asal sayı olacak
koşul 7 ba asal sayı olacak
Yukarıdaki koşulların hepsini sağlayan tüm abc sayılarını bulan programı yazınız.
*/
public class odev3Soru4 {

    public static void main(String[] args) {

        for(int i = 100 ; i <=999; i++)
        {
            if(Test(i))
            {
                System.out.println(i);
            }
        }
    }


    public static boolean Test (int abc)
    {
        int a = abc /100;
        //123/10 = 23
        int b = (abc/10) % 10;
        int c = abc %10;

        int cba = (c*100) + (b*10)+a;
        int ab = (a*10) + b;
        int bc = (b*10) + c;
        int cb = (c*10) + b;
        int ba = (b*10) + a;

        return cba > abc
                && IsPrime(abc)
                && IsPrime(cba)
                && IsPrime(ab)
                && IsPrime(bc)
                && IsPrime(cb)
                && IsPrime(ba);
    }

    public static boolean IsPrime(int value)
    {
        boolean cond = false;
        for(int i =2 ; i < value; i++)
        {
            if(value % i == 0)
            {
                cond = true;
                break;
            }
        }
        return !cond;
    }
}
