import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, nr, total1=1, total2=1, total3=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        n= scan.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        r= scan.nextInt();

        for (int i=1; i <=n; i++) {
            total1= total1*i;
        }
        for (int j=1; j <=r; j++) {
            total2= total2*j;
        }
        nr= n-r;
        for (int l=1; l<=nr; l++) {
            total3 = total3 * l;
        }
        System.out.println("Kombinasyon= " + total1/(total2*total3));

    }
}