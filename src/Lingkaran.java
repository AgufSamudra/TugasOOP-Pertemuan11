public class Lingkaran {
    protected final double PHI = 3.14;

    public void luas(BangunDatar lingkaran, double r){
        lingkaran.luas();
        double luasPersegi = PHI * r * r;
        System.out.println("Luas Lingkaran: " + luasPersegi);
    }

    public void keliling(BangunDatar lingkaran, double r){
        lingkaran.keliling();
        double kelilingPersegi = 2 * (PHI * r);
        System.out.println("Keliling Lingkaran: " + kelilingPersegi);
    }
}
