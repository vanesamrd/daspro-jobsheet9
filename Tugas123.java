import java.util.Scanner;

public class Tugas123 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int nilai : nilaiMhs) {
            totalNilai += nilai;
        }
        double rata2 = (double) totalNilai / jumlahMahasiswa;

        int nilaiTinggi = nilaiMhs[0];
        int nilaiRendah = nilaiMhs[0];
        for (int nilai : nilaiMhs) {
            if (nilai > nilaiTinggi) {
                nilaiTinggi = nilai;
            }
            if (nilai < nilaiRendah) {
                nilaiRendah = nilai;
            }
        }

        System.out.println("\nHasil:");
        System.out.println("Rata-rata nilai: " + rata2);
        System.out.println("Nilai tertinggi: " + nilaiTinggi);
        System.out.println("Nilai terendah: " + nilaiRendah);
        System.out.println("Semua nilai:");
        
        for (int nilai : nilaiMhs) {
            System.out.print(nilai + " ");
        }
    }
}