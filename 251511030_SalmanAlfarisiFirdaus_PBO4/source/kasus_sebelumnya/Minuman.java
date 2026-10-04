package kasus_sebelumnya;

public class Minuman extends MenuItem {
    private boolean dingin;

    public Minuman(String kode, String nama, int harga, boolean dingin) {
        super(kode, nama, harga);
        this.dingin = dingin;
    }

    public boolean isDingin() {
        return dingin;
    }

    public void setDingin(boolean dingin) {
        this.dingin = dingin;
    }

    @Override
    public String getDeskripsi() {
        return super.getDeskripsi() + " (" + (dingin ? "Dingin/Es" : "Hangat") + ")";
    }
}
