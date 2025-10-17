class Guru4 {
    private String nama;

    public Guru4(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar.");
    }
}

class Sekolah {
    private String namaSekolah;
    private Guru4 guru;

    public Sekolah(String namaSekolah, Guru4 guru) {
        this.namaSekolah = namaSekolah;
        this.guru = guru;
    }

    public void infoSekolah() {
        System.out.println("Nama Sekolah: " + namaSekolah);
        System.out.println("Guru: " + guru.getNama());
    }
}

public class DemoAgregasiSederhana {
    public static void main(String[] args) {
        Guru4 guru1 = new Guru4("Pak Budi");
        Sekolah sekolah1 = new Sekolah("SD Negeri Ngijo", guru1);

        sekolah1.infoSekolah();
        guru1.mengajar();

        sekolah1 = null;
        System.out.println("\nSetelah sekolah dihapus, guru masih ada:");
        guru1.mengajar();
    }
}