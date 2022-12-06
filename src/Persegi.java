public class Persegi {
    public BangunDatar persegi;

    public void luas(float sisi){
        persegi.luas();
        float luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi: " + luasPersegi);
    }

    public void keliling(float sisi){
        persegi.keliling();
        float kelilingPersegi = sisi * 4;
        System.out.println("Keliling Persegi: " + kelilingPersegi);
    }
}
