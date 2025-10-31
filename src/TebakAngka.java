import java.util.Random;
import java.util.Scanner;

/**
 * Program Tebak Angka Sederhana
 * Pemain menebak angka acak antara 1-10 dengan 3 kesempatan.
 * Program berakhir ketika pemain menebak dengan benar atau kehabisan kesempatan.
 */
public class TebakAngka {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        /** Membuat angka acak antara 1 dan 10 */
        int angkaBenar = rand.nextInt(10) + 1;

        /** Menentukan jumlah kesempatan tetap, yaitu 3 */
        int kesempatan = 3;

        /** Menampilkan informasi awal permainan */
        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Tebak angka antara 1 - 10. Kamu punya 3 kesempatan!");

        /** Menyimpan tebakan pemain */
        int tebakan;

        /** Perulangan selama kesempatan masih ada */
        while (kesempatan > 0) {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();

            /** Mengecek apakah tebakan pemain benar, terlalu kecil, atau terlalu besar */
            if (tebakan == angkaBenar) {
                System.out.println("Selamat! Tebakanmu benar!");
                break;
            } else if (tebakan < angkaBenar) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("Terlalu besar!");
            }

            /** Mengurangi kesempatan setelah setiap tebakan */
            kesempatan--;

            /** Menampilkan pesan jika kesempatan habis */
            if (kesempatan == 0) {
                System.out.println("Kesempatan habis! Angka yang benar adalah " + angkaBenar);
            }
        }

        /** Menutup scanner */
        input.close();
    }
}

