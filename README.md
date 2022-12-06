# TUGAS OOP PERTEMUAN 11 - PRAKTIKUM 6

Nama: Gufranaka Samudra<br/>
NIM: 312110300<br/>
Matkul: Pemrograman Berorientasi Objek<br/>

# Relasi Class
Di sini saya mencoba untuk sedikit menjelaskan singkat tentang diagram class, terutama untuk membangun program berorientasi objek atau OOP. Dalam program ini saya membuat rumus dasar bangun datar yaitu terdiri dari Persegi, Persegi Panjang, Segitiga, Lingkaran. Dan Relasi Class yang saya gunakan ada 4 yaitu `Depedensi`, `Asosiasi`, `Agregasi`, `Komposisi`.

- **Depedensi** adalah Hubungan dependensi diartikan sebagai hubungan antara dua buah class, di mana satu class memiliki ketergantungan dengan class lainnya tetapi class lainnya tidak/mungkin memiliki ketergantungan terhadap class pertama tadi. Jadi apa pun perubahan yang terjadi pada class pertama dapat mempengaruhi fungsi class yang memiliki ketergantungan pada class tersebut. Hubungan dependensi terjadi apabila, sebuah fungsi pada class A membutuhkan class B sebagai `parameter`, fungsi pada class A memiliki nilai kembalian berupa class B, dan class A menggunakan class B tetapi class B bukan merupakan sebuah atribut.<br/>
[Referensi Depedensi](https://medium.com/sysinfo/pengenalan-relasi-pada-paradigma-pemrograman-object-oriented-programming-7e3b77d9ee01)
```java
public class Lingkaran {
    protected final double PHI = 3.14;

    public void luas(BangunDatar lingkaran, double r){
        lingkaran.luas();
        double luasPersegi = PHI * r * r;
        System.out.println("Luas Lingkaran: " + luasPersegi);
    }
```

- **Asosiasi** adalah  Asosiasi dapat diartikan sebagai hubungan antara dua class yang bersifat statis. Biasanya asosiasi menjelaskan class yang memiliki atribut tambahan seperti class lain. Di sini mungkin ada kemiripan antara Asosiasi dan Depedensi, mudahnya Asosiasi di dalamnya memiliki `atribut` berupa sebuah `class`, sedangkan Depedensi itu sebuah class yang memiliki sebuah fungsi di dalamnya dengan parameter class lain.<br/>
[Referensi Asosiasi](https://www.dicoding.com/blog/memahami-class-diagram-lebih-baik/)
```java
public class Persegi {
    public BangunDatar persegi;

    public void luas(float sisi){
        persegi.luas();
        float luasPersegi = sisi * sisi;
        System.out.println("Luas Persegi: " + luasPersegi);
    }
```

- **Agregasi** adalah  bentuk hubungan yang lebih khusus dari Assosiasi dimana sebuah object memiliki lifecycle nya sendiri tapi dengan kepemilikan dan class child tidak dapat memiliki class parentnya.<br/>
[Referensi Agregasi](https://adnansetiawan.com/2017/01/15/perbedaan-asosiasi-agregasi-dan-komposisi-pada-object-oriented-programming/)
```java
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
```

- **Komposisi** adalah Komposisi sama dengan relasi Agregasi, tapi lebih spesfic lagi yaitu lifecycle object bergantung pada object ownernya. Aturan yang berlaku untuk hubungan ini adalah ketika kelas yang “memiliki” class lainnya dihancurkan maka class yang “dimiliki” oleh kelas tersebut akan hancur juga atau tidak dapat digunakan.<br/>
[Referensi Komposisi 1](https://medium.com/sysinfo/pengenalan-relasi-pada-paradigma-pemrograman-object-oriented-programming-7e3b77d9ee01)<br/>
[Referensi Komposisi 2](https://adnansetiawan.com/2017/01/15/perbedaan-asosiasi-agregasi-dan-komposisi-pada-object-oriented-programming/)
```java
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
```

# Diagram Class
Saya juga mencoba untuk membuat diagram class sederhana dengan software online di internet. Walaupun masih belum sempurna namun saya mulai memahami sedikit dari konsep-konsep di atas. Di sini saya mencoba membuat program Bangun Datar sederhana menggunakan bahasa pemrograman Java.

<p align="center">
<img src="https://raw.githubusercontent.com/AgufSamudra/TugasOOP-Pertemuan11/main/DiagramBangunDatar.png" />
</p>

Dan membuat beberapa `Class` seperti contoh di atas sebelumnya, dan menyatukan semua Class ke dalam Main.java sehingga keseluruhan code javanya akan menjadi seperti berikut.

```java
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
```

# Hasilnya
<p align="center">
<img src="https://raw.githubusercontent.com/AgufSamudra/TugasOOP-Pertemuan11/main/hasilPert11.png" />
</p>

