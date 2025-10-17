class Jantung3 {
    public void berdetak() {
        System.out.println("❤️ Jantung berdetak...");
    }
}

class Manusia {
    private String nama;
    private Jantung3 jantung;

    public Manusia(String nama) {
        this.nama = nama;
        this.jantung = new Jantung3();
    }

    public void hidup() {
        System.out.println(nama + " sedang hidup.");
        jantung.berdetak();
    }
}

public class DemoKomposisi {
    public static void main(String[] args) {
        Manusia m1 = new Manusia("Andri");
        m1.hidup();
    }
}
