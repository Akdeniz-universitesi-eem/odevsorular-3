
public class soru6 {

    public static void main(String[] args) {

        System.out.println(Mid(10,20,30));
        System.out.println(Mid(20,0,3130));
        System.out.println(Mid(-10,80,40));

    }

    //Access Modifier
    public static int Mid(int num1,int num2,int num3)
    {
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

        return num2;
    }

}