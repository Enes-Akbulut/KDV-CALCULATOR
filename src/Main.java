import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
           //if ile daha kolay yapılsa bile bunu da bilmek büyük bir artıdır.
        // yapamayan arkadaslara yardimci olurum. enesakbulut1933@gmail.com

        Scanner input = new Scanner(System.in);
        double tutar, kdvOrani, kdvliFiyat, netKdv, kdvSecimi;
        System.out.print("URUN TUTARI =  ");
        tutar = input.nextDouble();

        // kosul 1 tutar buyuk veya esit 1000, dogruysa 8 degılse 18
        // bu 2 satırda kosulu ayarladık.
        boolean kosul1 = tutar >= 1000;
        kdvSecimi = kosul1 ? 8 : 18;

        netKdv = (tutar * kdvSecimi) / 100;
        kdvliFiyat = tutar + netKdv;
        kdvOrani = kdvSecimi;

        // YAZDIRMA ZAMANI
        System.out.println("kdvsiz fiyat= " + tutar);
        System.out.println("kdvli fiyat= " + kdvliFiyat);
        System.out.println("kdv= " + netKdv);
        System.out.println("kdv orani= " + kdvOrani);
    }
}
