⚙️ Fitur Baru

Pemilihan level kesulitan (mudah, sedang, sulit).

Batas angka berubah sesuai level.

Jumlah kesempatan menyesuaikan level.

Menampilkan sisa kesempatan setelah setiap tebakan.

💻 Cara Menjalankan

Buka program Java (misalnya NetBeans atau VS Code).

Buat file bernama TebakAngkaV2.java.

Salin kode berikut ke dalam file dan jalankan:

    import java.util.Random;
    import java.util.Scanner;

    public class TebakAngkaV2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

        System.out.println("=== Permainan Tebak Angka Versi 2 ===");

        System.out.println("Pilih level: ");
        System.out.println("1. Mudah (1–10)");
        System.out.println("2. Sedang (1–50)");
        System.out.println("3. Sulit (1–100)");
        System.out.print("Masukkan pilihan level (1/2/3): ");
        int level = input.nextInt();

        int batas;
        if (level == 1) {
            batas = 10;
        } else if (level == 2) {
            batas = 50;
        } else {
            batas = 100;
        }

        int kesempatan = (level == 3) ? 5 : 3;
        int angkaBenar = rand.nextInt(batas) + 1;

        System.out.println("\nTebak angka antara 1 - " + batas);
        System.out.println("Kamu punya " + kesempatan + " kesempatan.\n");

        int tebakan;
        while (kesempatan > 0) {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();

            if (tebakan == angkaBenar) {
                System.out.println("Selamat! Tebakanmu benar!");
                break;
            } else if (tebakan < angkaBenar) {
                System.out.println("Terlalu kecil!");
            } else {
                System.out.println("Terlalu besar!");
            }

            kesempatan--;

            if (kesempatan == 0) {
                System.out.println("Kesempatan habis! Angka yang benar adalah " + angkaBenar);
            } else {
                System.out.println("Sisa kesempatan: " + kesempatan);
            }
            System.out.println();
        }

        input.close();
    }
}

👨‍💻 Pembuat

Farrel Nadhif Otto Diyarno
