import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int sayac = 0;
        int toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz :");
        k = inp.nextInt();

        for(int i = 0; i <= k; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.println(i);
                toplam += i;
                sayac++;
        }
    }

        System.out.println("Toplam sonuç : " + (double) toplam / sayac);

}

}