import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan : ");
        int angka = input.nextInt();

        int bilangan = angka % 2;

        if (bilangan == 0) {
            System.out.println("Keterangan : Bilangan genap");
        } else {
            System.out.println("Keterangan : Bilangan ganjil");
        }
    }
}
