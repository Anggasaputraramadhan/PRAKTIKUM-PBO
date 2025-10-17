class Hewan1 {
    private String nama = "Harimau";

    public String getNama() {
        return nama;
    }
}

class Kucing extends Hewan {
    void tampilkan() {
        System.out.println(super.getNama());
    }
}

class Hewan {
    private String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
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

