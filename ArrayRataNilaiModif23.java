import java.util.Scanner;

public class ArrayRataNilaiModif23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextInt();
        }

        int jumlahLulus = 0;
        int totalLulus = 0;
        for (int nilaiAkhir : nilai) {
            if (nilaiAkhir >= 70) {
                jumlahLulus++;
                totalLulus += nilaiAkhir;
            }
        }
        double rataRataLulus = jumlahLulus > 0 ? (double) totalLulus / jumlahLulus : 0;

        int jumlahTidakLulus = 0;
        int totalTidakLulus = 0;
        for (int nilaiAkhir : nilai) {
            if (nilaiAkhir < 70) {
                jumlahTidakLulus++;
                totalTidakLulus += nilaiAkhir;
            }
        }
        double rataRataTidakLulus = jumlahTidakLulus > 0 ? (double) totalTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);


    }
}
