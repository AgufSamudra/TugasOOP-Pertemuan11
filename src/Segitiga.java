public class Segitiga {
    public BangunDatar segitiga;

    public Segitiga(BangunDatar b){
        segitiga = b;
    }

    public void luas(float alas, float tinggi){
        segitiga.luas();
        double luasPersegi = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga: " + luasPersegi);
    }

    public void keliling(float sisi){
        segitiga.keliling();
        double kelilingPersegi = sisi * 3;
        System.out.println("Keliling Segitiga: " + kelilingPersegi);
    }
}
