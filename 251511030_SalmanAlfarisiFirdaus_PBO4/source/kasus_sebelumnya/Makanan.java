package kasus_sebelumnya;

public class Makanan extends MenuItem {
    private int levelPedas;

    public Makanan(String kode, String nama, int harga, int levelPedas) {
        super(kode, nama, harga);
        this.levelPedas = levelPedas;
    }

    public int getLevelPedas() {
        return levelPedas;
    }

    public void setLevelPedas(int levelPedas) {
        this.levelPedas = levelPedas;
    }

    @Override
    public String getDeskripsi() {
        return super.getDeskripsi() + " (Level Pedas: " + levelPedas + ")";
    }
}
