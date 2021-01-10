package dev.varaday.belajarjava.classes;

/* Anda telah belajar dari bab Metode Java bahwa metode dideklarasikan di dalam kelas,
dan metode tersebut digunakan untuk melakukan tindakan tertentu:
*/

public class ClassMethods {
    static void myMethod() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        myMethod(); // Mencetak > Hello World
    }
}

/* Anda akan sering melihat program Java yang memiliki atribut dan metode statis atau publik.
Dalam contoh di atas, kami membuat metode statis, yang artinya dapat diakses tanpa membuat objek kelas.
tidak seperti publik, yang hanya dapat diakses oleh objek:
 */

class ClassMethods2 {
    // Static method & Metode statis
    static void myStaticMethod() {
        System.out.println("Metode statis dapat dipanggil tanpa membuat objek");
    }
    // Public method & Metode publik
    static void myPublicMethod() {
        System.out.println("Metode publik harus dipanggil dengan membuat objek");
    }
    // Main method & Metode utama
    public static void main(String[] args) {
        myStaticMethod(); // Panggil Static method & Metode statis
        // myPublicMethod(); Ini akan mengkompilasi kesalahan

        ClassMethods2 myObj = new ClassMethods2();
        myPublicMethod();
    }
}
