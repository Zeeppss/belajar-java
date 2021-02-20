package varaday.belajarjava.classes;

// Sekarang, Anda sudah cukup familiar dengan kata kunci publik yang muncul di hampir semua contoh saya:

public class Modifiers {
}

/* Kata kunci publik adalah pengubah akses,
artinya digunakan untuk menyetel tingkat akses untuk kelas, atribut, metode, dan konstruktor.
Saya membagi pengubah menjadi dua kelompok:

- Access Modifiers = mengontrol tingkat akses
- Non-Access Modifiers = tidak mengontrol tingkat akses, tetapi menyediakan fungsionalitas lain.
 */

// Final
// Jika Anda tidak ingin kemampuan untuk mengganti nilai atribut yang ada, nyatakan atribut sebagai final:

class Final {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        Final myObj = new Final();
        myObj.x = 50; // akan menghasilkan kesalahan: tidak dapat memberikan nilai ke variabel akhir
        myObj.PI = 20; // akan menghasilkan kesalahan: tidak dapat memberikan nilai ke variabel akhir
        System.out.println(myObj.x);
    }
}

// Static
// Metode statis berarti itu dapat diakses tanpa membuat objek kelas, tidak seperti publik:

class Static {
    // Static method || Metode statis
    static void myStaticMethod() {
        System.out.println("Metode statis dapat dipanggil tanpa membuat objek");
    }
    // Public method || Metode publik
    public void myPublicMethod() {
        System.out.println("Metode publik harus dipanggil dengan membuat objek");
    }

    // Metode utama
    public static void main(String[] args) {
        myStaticMethod(); // Panggil metode statis
        // myPublicMethod(); //Ini akan menghasilkan kesalahan

        Static myObj = new Static(); // Membuat objek utama
        myObj.myPublicMethod(); // Panggil metode publik
    }
}

// Kode dari nama file: Abstract.class
// kelas abstrak
abstract class Abstract {
    public String fnama = "Varaday";
    public int umur = 15;
    public abstract void study(); // abstract method
}

// Subclass (diwarisi dari Abstract)
class Student extends Abstract {
    public int tahunKelulusan = 2020;
    public void study() { // tubuh metode abstrak disediakan disini
        System.out.println("Belajar sepanjang hari");
    }
}
// Kode akhir dari nama file: Static.class

// Kode dari nama file: Second.class
class Second {
    public static void main(String[] args) {
        // membuat objek kelas Student (yang mewarisi atribut dan metode dari Person)
        Student myObj = new Student();

        System.out.println("Nama: " + myObj.fnama);
        System.out.println("Umur: " + myObj.umur);
        System.out.println("Tahun Kelulusan: " + myObj.tahunKelulusan);
        myObj.study(); // panggil metode abstrak
    }
}




