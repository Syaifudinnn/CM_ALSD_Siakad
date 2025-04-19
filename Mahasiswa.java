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
        System.out.println("NIM: " + NIM + " | Nama: " + nama + " | Prodi: " + prodi);
    }

    public static void tampilkanSemua() {
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilMahasiswa();
        }
    }

    public static Mahasiswa cariByNIM(String nim) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.NIM.equals(nim)) return m;
        }
        return null;
    }
}
