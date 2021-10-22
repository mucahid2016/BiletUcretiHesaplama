import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe,yas,yolculukTipi,netTutar,indirimliTutar = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Girin: ");
        mesafe=input.nextDouble();

        netTutar = 0.10*mesafe;

        if(mesafe>0){
            netTutar = 0.10*mesafe;
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yaşınızı Girin: ");
        yas=input.nextDouble();

        if(yas>0){
            if (yas<12){
                indirimliTutar=netTutar-(netTutar*0.50);
            }else if(yas>12 ||yas<24){
                indirimliTutar=netTutar-(netTutar*0.10);
            }else if(24<yas || yas<65){
                indirimliTutar = netTutar;
            }else {
                indirimliTutar=netTutar-(netTutar*0.30);
            }

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi=input.nextDouble();
        if (yolculukTipi == 1){
            System.out.println(indirimliTutar);
            System.out.println("Harika Airlines İyi Uçuşlar Diler !");
        }else if (yolculukTipi == 2){
            System.out.println(2*(indirimliTutar-(indirimliTutar*0.20)));
            System.out.println("Harika Airlines İyi Uçuşlar Diler !");
        }else {
            System.out.println("Yolculuk Tipini Doğru Girdiniz !");
        }

    }
}
