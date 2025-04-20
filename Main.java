import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n==== MENU SISTEM AKADEMIK ====");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    Mahasiswa.tampilkanSemua();
                    break;
                case 2:
                    MataKuliah.tampilkanSemua();
                    break;
                case 3:
                    Penilaian.tampilkanSemua();
                    break;
                case 4:
                    Penilaian.urutkanBerdasarkanNilaiAkhir();
                    break;
                case 5:
                    Penilaian.cariDanTampilkanByNIM();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
