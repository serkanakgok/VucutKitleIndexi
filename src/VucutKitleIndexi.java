import java.util.Scanner;

public class VucutKitleIndexi {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner data = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = data.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = data.nextInt();

        double index = kilo / (boy * boy);
        System.out.println(boy > 0 && kilo > 0 ? "Vücut kitle indeksiniz: " + index : "Sıfırdan büyük değer giriniz");
    }
}
