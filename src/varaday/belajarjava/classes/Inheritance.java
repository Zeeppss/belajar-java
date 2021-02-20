package varaday.belajarjava.classes;

/* Di Java, dimungkinkan untuk mewarisi atribut dan metode dari satu kelas ke kelas lainnya.
Kami mengelompokkan "konsep warisan" menjadi dua kategori:

- subclass (anak) - kelas yang mewarisi dari kelas lain
- superclass (induk) - kelas yang diwarisi dari

Untuk mewarisi dari kelas, gunakan kata kunci extends.

Pada contoh di bawah ini, class Mobil (subclass) mewarisi atribut dan metode dari class Kendaraan (superclass):
 */

class Kendaraan {
    protected String merek = "Ford";        // Atribut kendaraan
    public void suara() {                    // Metode kendaraan
        System.out.println("Tuut, tuut!");
    }
}

class Mobil extends Kendaraan {
    private String namaModel = "Mustang";    // Atribut mobil
    public static void main(String[] args) {

        // Buat objek myCar
        Mobil myMobil = new Mobil();

        // Panggil metode honk () (dari kelas Vehicle) di objek myCar
        myMobil.suara();

        // Menampilkan nilai atribut merek (dari kelas Kendaraan) dan nilai modelName dari kelas Mobil
        System.out.println(myMobil.merek + " " + myMobil.namaModel);
    }
}