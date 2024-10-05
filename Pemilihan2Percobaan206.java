
import java.util.Scanner;

public class Pemilihan2Percobaan206 {

    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int pilihan_menu, harga;
        String member;
        double total_bayar, diskon;

        System.out.println("-----------------------------------------");
        System.out.println("========== menu  kafe jti =============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. ice tea");
        System.out.println("3. paket bunding (ricebowl + ice tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih: ");
        pilihan_menu = input06.nextInt();
        input06.nextLine();
        System.out.println("apakah punya member (y / n): ");
        member = input06.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;
            System.out.println("besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl: " + harga);

            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea: " +harga);

            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling: " +harga);

            }else{
                System.out.println("masukkan menu yang benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("total bayar setealah diskon: " +total_bayar);

        }else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga ricebowl= " + harga);
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga ice tea= " +harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling= " +harga);
            }else{
                System.out.println("masukkan menu yang benar");
                return;
            }
            System.out.println("Total bayar= " +harga);

        }else{
            System.out.println("member tidak valid     ");
        }
        System.out.println("-------------------------------------");
    }

}
