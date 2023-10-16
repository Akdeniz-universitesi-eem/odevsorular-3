//System.out.println(Math.abs(-2147483648)); ekran çıkƨsını yorumlayınız.
public class soru1 {
    public static void main(String[] args) {
    //Sayımız veri tipinin sınır değeri olduğu için aynısını döndürür, yani bu sayının artı tarafta
    // karşılığı olmadığı için aynısını döndürür. 32 bitlik işaretleme tam sayısı, sadece -2147483648 ile
    // +2147483647 arasındaki değeri temsil edebilir. Verinin boyutu int değerden yüksek olduğu için
    // verdiğimiz değeri döndürür.
        System.out.println(Math.abs(-2147483648));
    }
}