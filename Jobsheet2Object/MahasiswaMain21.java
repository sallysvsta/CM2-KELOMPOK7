package Jobsheet2Object;

public class MahasiswaMain21 {
    public static void main(String[] args) {
    Mahasiswa21 mhs1 = new Mahasiswa21();
    mhs1.nama = "Muhammad Ali Farhan";
    mhs1.nim = "2241720171";
    mhs1.kelas = "SI 2J";
    mhs1.ipk = 3.55;

    mhs1.tampilkanInformasi();
    mhs1.ubahKelas("SI 2K");
    mhs1.updateIpk(3.60);
    mhs1.tampilkanInformasi();

    Mahasiswa21 mhs2 = new Mahasiswa21("Annisa Nabila", "2141720160", 3.25, "TI 2L");
    mhs2.updateIpk(3.30);
    mhs2.tampilkanInformasi();

    Mahasiswa21 mhsSukma = new Mahasiswa21("Sukma Ananda Putri", "244107060003", 4.00, "SIB 1D");
    mhsSukma.tampilkanInformasi();

    }
}
