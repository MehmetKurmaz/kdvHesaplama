import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Tutar Giriniz :");
        double kdvOrani,kdvTutar,kdvliTutar;
        int tutar;
        Scanner input=new Scanner(System.in);
        tutar=input.nextInt();
        kdvOrani=tutar>0&&tutar<1000?0.18:0.08;
        if (tutar<0){
            System.out.println("Gecerli Tutar Giriniz :");
             return;
        }

        kdvTutar=tutar*kdvOrani;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("KDVsiz Tutar :"+tutar);
        System.out.println("KDVli Tutar :"+kdvliTutar);
        System.out.println("KDV Orani :"+kdvOrani);



    }


}