public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();
        bangunDatar.judul = "bangun ruang";

        // Dependensi
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.luas(bangunDatar, 5);
        lingkaran.keliling(bangunDatar, 8);

        System.out.println();

        // Asosiasi
        Persegi persegi = new Persegi();
        persegi.persegi = bangunDatar;
        persegi.luas(9);
        persegi.keliling(5);

        System.out.println();

        // Agregasi
        Segitiga segitiga = new Segitiga(bangunDatar);
        segitiga.luas(5,4);
        segitiga.keliling(7);

        System.out.println();

        // Komposisi
        PersegiPanjang persegiPanjang = new PersegiPanjang("Persegi Panjang");
        persegiPanjang.luas(4,4);
        persegiPanjang.keliling(5,5);
    }
}