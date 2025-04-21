import java.util.Scanner;

public class Mahasiswa {

    String NIM, nama, prodi;
    static Mahasiswa[] daftarMahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    public Mahasiswa(String NIM, String nama, String prodi) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM : " + NIM + " | Nama : " + nama + " | Prodi : " + prodi);
    }

    public static void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilMahasiswa();
        }
    }

    //sequential search
    public static void cariDanTampilkanByNIM() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang dicari : ");
        String nim = input.nextLine();
    
        Mahasiswa hasil = null;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.NIM.equals(nim)) {
                hasil = m;
                break;
            }
        }
    
        if (hasil != null) {
            System.out.println("Mahasiswa Ditemukan:");
            hasil.tampilMahasiswa();
        } else {
            System.out.println("Data mahasiswa tidak ditemukan.");
        }
    }

    //binary search
    public static void binarySearchByNIM() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM mahasiswa yang dicari : ");
        String nim = input.nextLine();
    
        int left = 0;
        int right = daftarMahasiswa.length - 1;
        boolean found = false;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = daftarMahasiswa[mid].NIM.compareTo(nim);
    
            if (comparison == 0) {
                System.out.println("Mahasiswa Ditemukan:");
                daftarMahasiswa[mid].tampilMahasiswa();
                found = true;
                break;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        if (!found) {
            System.out.println("Data mahasiswa tidak ditemukan.");
        }
    }
    
}
