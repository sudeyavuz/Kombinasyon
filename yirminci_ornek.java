package JAVA101;
import java.util.Scanner;
public class yirminci_ornek {
    public static void main(String[] args) {
        int a, b, total1=1,total2=1,total3=1,sonuc=1;
        Scanner input = new Scanner(System.in);

        System.out.println("eleman sayısı: ");
        a = input.nextInt();
        System.out.println("farklı grup eleman sayısı: ");
        b = input.nextInt();

        for(int i =1;i<=a;i++){
            total1*=i;
        }
        for (int j =1;j<=b;j++){
            total2*=j;
        }
        for (int k =1;k<=(a-b);k++){
            total3*=k;
        }
        sonuc=total1/(total2*total3);
        System.out.println("sonuç: "+sonuc);
    }
}
