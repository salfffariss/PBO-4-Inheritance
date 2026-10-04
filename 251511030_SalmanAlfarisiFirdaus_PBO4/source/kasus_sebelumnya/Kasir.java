package kasus_sebelumnya;

public class Kasir {
    public void proses(Pesanan pesanan) {
        if (pesanan.dapatDiproses()) {
            System.out.println("Pesanan #" + pesanan.getNomor() + " diproses: " + pesanan.ringkasan());
        } else {
            System.out.println("Pesanan #" + pesanan.getNomor() + " ditolak!");
        }
    }
}
