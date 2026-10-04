package kasus_sebelumnya;

public class TestKantin {
    public static void main(String[] args) {
        System.out.println("   PENGUJIAN KASUS SEBELUMNYA (KANTIN POLBAN) - INHERITANCE");

        Makanan mkn1 = new Makanan("MK01", "Ayam Geprek", 15000, 3);
        Minuman mnm1 = new Minuman("MN01", "Es Teh Manis", 5000, true);
        Minuman mnm2 = new Minuman("MN02", "Kopi Tubruk", 6000, false);
        System.out.println("Objek Makanan & Minuman berhasil dibuat via constructor.");

        System.out.println("Method warisan: Harga " + mkn1.getNama() + " = Rp" + mkn1.getHarga());
        System.out.println("Status tersedia awal: " + mnm2.isTersedia());
        mnm2.tandaiHabis();
        System.out.println("Status setelah tandaiHabis(): " + mnm2.isTersedia());

        System.out.println("Method override getDeskripsi Makanan: " + mkn1.getDeskripsi());
        System.out.println("Method override getDeskripsi Minuman: " + mnm1.getDeskripsi());

        System.out.println("Hasil getDeskripsi memanfaatkan super.getDeskripsi():");
        System.out.println(mkn1.getDeskripsi());

        mkn1.setLevelPedas(5);
        System.out.println("Update level pedas via setter: Level " + mkn1.getLevelPedas());

        System.out.println("Perbedaan behavior dua subclass:");
        System.out.println("Makanan: " + mkn1);
        System.out.println("Minuman: " + mnm1);

        System.out.println("\nREGRESSION TEST SISTEM KANTIN LAMA");
        Mahasiswa mhs1 = new Mahasiswa("251511030", "Salman Alfarisi");
        Pesanan p1 = new Pesanan(mhs1, mkn1, 2);
        Pesanan p2 = new Pesanan(mhs1, mnm1, 1);
        Pesanan p3 = new Pesanan(mhs1, mnm2, 1);

        Kasir kasir = new Kasir();
        kasir.proses(p1);
        kasir.proses(p2);
        kasir.proses(p3);

        System.out.println("Total pesanan dibuat: " + Pesanan.getJumlahPesananDibuat());
    }
}
