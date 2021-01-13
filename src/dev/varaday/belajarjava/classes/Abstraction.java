package dev.varaday.belajarjava.classes;

/* Abstraksi data adalah proses menyembunyikan detail tertentu dan hanya menampilkan informasi penting kepada pengguna.
Abstraksi dapat dicapai dengan kelas atau antarmuka abstrak (yang akan Anda pelajari lebih lanjut di bab berikutnya).

- Abstract Class: adalah kelas terbatas yang tidak dapat digunakan untuk membuat objek (untuk mengaksesnya, harus diturunkan dari kelas lain).
- Abstract Method: hanya dapat digunakan dalam kelas abstrak, dan tidak memiliki isi. Tubuh disediakan oleh subclass (diwarisi dari).


Abstract Class / Kelas abstrak dapat memiliki metode abstrak dan reguler:
 */

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }
}

/* Dari contoh di atas, tidak mungkin membuat objek kelas Animal:
Animal myObj = new Animal(); // akan menghasilkan kesalahan

Untuk mengakses kelas abstrak, itu harus diwarisi dari kelas lain.
Mari kita ubah kelas Hewan yang kita gunakan di bab Polimorfisme menjadi kelas abstrak:
 */

// Abstract class / Kelas abstrak
abstract class Animal2 {
    // Abstract method / Metode abstrak (tidak memiliki tubuh)
    public abstract void animalSound();
    // Regular method / Metode biasa
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (mewarisi dari Animal)
class Pig extends Animal {
    public void animalSound() {
        // Tubuh animalSound() disediakan di sini
        System.out.println("Babi berkata: wee wee");
    }
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Membuat objek Pig
        myPig.animalSound();
        myPig.sleep();
    }
}


