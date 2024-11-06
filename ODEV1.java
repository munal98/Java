import java.util.Scanner;

public class ODEV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        if (sayi1 == sayi2) {
            int carpim = sayi1 * sayi2;
            System.out.println("Sayılar eşit. Çarpımları: " + carpim);
        } else {
            int toplam = sayi1 + sayi2;
            System.out.println("Sayılar eşit değil. Toplamları: " + toplam);
        }
    }
}
