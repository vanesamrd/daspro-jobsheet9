import java.util.Scanner;
public class SearchingModif123 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiCari = input.nextInt();

        boolean ditemukan = false;
        int posisi = -1;
        
        for (int i = 0; i < jumlah; i++) {
            if (nilaiMahasiswa[i] == nilaiCari) {
                ditemukan = true;
                posisi = i + 1;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Nilai " + nilaiCari + " ketemu, merupakan nilai mahasiswa ke-" + posisi);
        } else {
            System.out.println("Nilai " + nilaiCari + " tidak ditemukan");
        }

    }
}
