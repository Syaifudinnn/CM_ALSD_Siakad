public class Penilaian {

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

    static Penilaian[] daftarPenilaian = {
            new Penilaian(Mahasiswa.daftarMahasiswa[0], MataKuliah.daftarMK[0], 80, 85, 90),
            new Penilaian(Mahasiswa.daftarMahasiswa[0], MataKuliah.daftarMK[1], 60, 75, 70),
            new Penilaian(Mahasiswa.daftarMahasiswa[1], MataKuliah.daftarMK[0], 75, 70, 80),
            new Penilaian(Mahasiswa.daftarMahasiswa[2], MataKuliah.daftarMK[1], 85, 90, 95),
            new Penilaian(Mahasiswa.daftarMahasiswa[2], MataKuliah.daftarMK[2], 80, 90, 65)
    };

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double tugas, double uts, double uas) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = tugas;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public void tampilPenilaian() {
        System.out.println(mahasiswa.nama + " | " + mataKuliah.namaMK + " | Nilai Akhir : " + nilaiAkhir);
    }

    public static void tampilkanSemua() {
        for (Penilaian p : daftarPenilaian) {
            p.tampilPenilaian();
        }
    }

    //bubble sort (desc)
    public static void urutkanBerdasarkanNilaiAkhir() {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            for (int j = 0; j < daftarPenilaian.length - i - 1; j++) {
                if (daftarPenilaian[j].nilaiAkhir < daftarPenilaian[j + 1].nilaiAkhir) {
                    Penilaian temp = daftarPenilaian[j];
                    daftarPenilaian[j] = daftarPenilaian[j + 1];
                    daftarPenilaian[j + 1] = temp;
                }
            }
        }
        tampilkanSemua();
    }

    public static void bubbleSortAsc() {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            for (int j = 0; j < daftarPenilaian.length - i - 1; j++) {
                if (daftarPenilaian[j].nilaiAkhir > daftarPenilaian[j + 1].nilaiAkhir) {
                    Penilaian temp = daftarPenilaian[j];
                    daftarPenilaian[j] = daftarPenilaian[j + 1];
                    daftarPenilaian[j + 1] = temp;
                }
            }
        }
        tampilkanSemua();
    }

    //selection sort (desc)
    public static void selectionSortBerdasarkanNilaiAkhir() {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < daftarPenilaian.length; j++) {
                if (daftarPenilaian[j].nilaiAkhir > daftarPenilaian[maxIndex].nilaiAkhir) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                Penilaian temp = daftarPenilaian[i];
                daftarPenilaian[i] = daftarPenilaian[maxIndex];
                daftarPenilaian[maxIndex] = temp;
            }
        }
        tampilkanSemua();
    }

    public static void selectionSortAsc() {
        for (int i = 0; i < daftarPenilaian.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < daftarPenilaian.length; j++) {
                if (daftarPenilaian[j].nilaiAkhir < daftarPenilaian[minIndex].nilaiAkhir) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Penilaian temp = daftarPenilaian[i];
                daftarPenilaian[i] = daftarPenilaian[minIndex];
                daftarPenilaian[minIndex] = temp;
            }
        }
        tampilkanSemua();
    }

    //insertion sort (desc)
    public static void insertionSortBerdasarkanNilaiAkhir() {
        for (int i = 1; i < daftarPenilaian.length; i++) {
            Penilaian key = daftarPenilaian[i];
            int j = i - 1;
            while (j >= 0 && daftarPenilaian[j].nilaiAkhir < key.nilaiAkhir) {
                daftarPenilaian[j + 1] = daftarPenilaian[j];
                j--;
            }
            daftarPenilaian[j + 1] = key;
        }
        tampilkanSemua();
    }

    public static void insertionSortAsc() {
        for (int i = 1; i < daftarPenilaian.length; i++) {
            Penilaian key = daftarPenilaian[i];
            int j = i - 1;
            while (j >= 0 && daftarPenilaian[j].nilaiAkhir > key.nilaiAkhir) {
                daftarPenilaian[j + 1] = daftarPenilaian[j];
                j--;
            }
            daftarPenilaian[j + 1] = key;
        }
        tampilkanSemua();
    }

}
