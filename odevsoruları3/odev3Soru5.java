/*
Soru 5- Aşağıda açıklanan isPrimeX isimli metodu yazınız
 */
/*
Aşağıda açıklanan isPrimeX isimli metodu yazınız:
isPrimeX metodu içerisinde, gönderilen argumanın asal olup olmadığı test edilecek, eğer
sayı asal ise bu kez sayının basamak değerleri toplanarak elde edilen sayının asal olup
olmadığı test edilecektir. Bu işlem sonuçta tek basamaklı bir sayı kalana kadar devam
edilecektir. Eğer en son elde edilen tek basamaklı sayı dahil tüm sayılar asal ise isPrimeX
metodu true değerine geri dönecektir. Eğer herhangi bir kademede asal olmayan bir sayı
elde edilirse metot false değerine geri dönecektir
*/
public class odev3Soru5 {

    public static void main(String[] args) {

        for(int i =2; i< 10000;i++)
        {
            boolean cond =isPrimeX(i);
            if(cond)
            {
                System.out.println(i);
            }
        }
    }

    //2957
    private static boolean isPrimeX(int number)
    {
        while(number > 9)
        {
            if(!checkPrime(number))
            {
                return false;
            }

            number = getSum(number);
        }

        return checkPrime(number);
    }

    private static int getSum(int number)
    {
        int sum = 0;
        while(number >0)
        {
            sum += number%10;
            number = number /10;
        }

        return sum;
    }
    private static boolean checkPrime(int number)
    {
        boolean cond = false;
        for(int i =2 ; i<number ; i++)
        {
            if(number % i == 0 )
            {
                cond =true;
                break;
            }
        }
        return !cond;
       
    }

}