package varaday.belajarjava.classes;

/* Konstruktor di Java adalah metode khusus yang digunakan untuk menginisialisasi objek.
 Konstruktor dipanggil ketika objek kelas dibuat.
 Ini dapat digunakan untuk mengatur nilai awal untuk atribut objek:
 */

public class Constructors {
    int x; // Membuat atribut kelas

    // Buat konstruktor kelas untuk kelas Utama
    public Constructors() {
        x = 5; // Tetapkan nilai awal untuk atribut kelas x
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors(); // Buat objek kelas utama (Ini akan memanggil konstruktor)
        System.out.println(myObj.x); // Mencetak nilai x
        // Mencetak > 5
    }
}

/* Konstruktor juga dapat mengambil parameter, yang digunakan untuk menginisialisasi atribut.
Contoh berikut menambahkan parameter int y ke konstruktor.
Di dalam konstruktor kita atur x ke y (x = y).
Ketika kita memanggil konstruktor, kita meneruskan parameter ke konstruktor (5), yang akan menyetel nilai x menjadi 5:
 */

class ConstructorParameters {
    int x;

    public ConstructorParameters(int y) {
        x = y;
    }

    public static void main(String[] args) {
        ConstructorParameters myObj = new ConstructorParameters(5);
        System.out.println(myObj.x);
    }
}

// Anda dapat memiliki parameter sebanyak yang anda inginkan:

class ConstructorExample {
    int modelTahun;
    String modelNama;

    public ConstructorExample(int tahun, String nama) {
        modelTahun = tahun;
        modelNama = nama;
    }

    public static void main(String[] args) {
        ConstructorExample myCar = new ConstructorExample(1969, "Mustang");
        System.out.println(myCar.modelTahun + " " + myCar.modelNama);
        // Mencetak > 1969 Mustang
    }
}
