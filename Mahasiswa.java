public class Mahasiswa {
    // Field-Atribut-Properties-Variabel
    String nim;
    String nama;
    String kelas;

    // konstruktor
    public Mahasiswa(String nima, String nama, String kelas) {
        nim = nima;
        this.nama = nama;
        this.kelas = kelas;
    }

    public Mahasiswa() {
        nim = "xxxxx";
        nama = "xxx";
        kelas = "X";
    }

    // method-fungsi-prosedur
    public String info() {
        return "NIM   :"+nim + "\nNAMA  :" + nama + "\nKELAS :" + kelas;
    }
}
