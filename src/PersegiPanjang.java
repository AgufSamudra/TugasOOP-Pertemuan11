public class PersegiPanjang {
    public BangunDatar persegiPanjang;

    public PersegiPanjang(String judul){
        persegiPanjang = new BangunDatar();
        persegiPanjang.judul = "Persegi Panjang";
    }

    public void luas(float panjang, float lebar){
        persegiPanjang.luas();
        float luasPersegi = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luasPersegi);
    }

    public void keliling(float panjang, float lebar){
        persegiPanjang.keliling();
        float kelilingPersegiPanjang = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);
    }
}
