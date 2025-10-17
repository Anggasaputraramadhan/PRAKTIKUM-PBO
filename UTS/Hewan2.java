class Hewan2 {
    private String nama;

    Hewan2(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
    public void setName(String nama) {
        this.nama = nama;
    }

class Kucing extends Hewan {
    private String ras;

    Kucing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    void tampilkanData() {
        System.out.println("Nama: " + super.getNama());
        System.out.println("Ras: " + ras);
    }
}

    public class DemoSuperPrivate {
        public static void main(String[] args) {
            Kucing k = new kucing("Miko", "Persia");
            k.tampilkanData();
        }
    }
