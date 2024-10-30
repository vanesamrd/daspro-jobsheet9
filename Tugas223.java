    import java.util.Scanner;

public class Tugas223 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = scanner.nextInt();
        scanner.nextLine(); 
    
        String[] namaPesanan = new String[jmlPesanan];
        int[] hargaPesanan = new int[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = scanner.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int totalBayar = 0; 
        for (int i = 0; i < jmlPesanan; i++) {
            totalBayar += hargaPesanan[i];
        }

        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }

        System.out.println("Total Bayar: Rp" + totalBayar);
    }
}

