
public class Main {
    public static void main(String[] args) {
        int i =0;
        int sayi =0;

        String  asalSayilar = "";

        for (i = 1; i <= 100; i++)
        {
            int sayac=0;
            for(sayi =i; sayi>=1; sayi--)
            {
                if(i%sayi==0)
                {
                   sayac = sayac + 1;
                }
            }
            if (sayac ==2)
            {

                asalSayilar = asalSayilar + i + " ";
            }
        }
        System.out.println("1 ila 100 arasındaki asal sayılar :");
        System.out.println(asalSayilar);
}}