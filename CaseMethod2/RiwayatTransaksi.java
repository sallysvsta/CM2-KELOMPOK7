package CaseMethod2;

public class RiwayatTransaksi {
    TransaksiLayanan[] data;
    int size;
    //NodePasien head, tail;

    public RiwayatTransaksi(int kapasitas) {
        data = new TransaksiLayanan[kapasitas];
        size = 0;
    }

    public void tambah(TransaksiLayanan trl) {
        if (size < data.length) {
            data[size++] = trl;
        }
    }

    public void tampilkan() {
        if (isEmpty()){
            System.out.println("Belum ada transaksi");
            return;
        }
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < size; i++) {
            data[i].tampilkanTransaksi();
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
