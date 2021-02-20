package varaday.belajarjava.classes;

/* Kelas ArrayList adalah array yang dapat diubah ukurannya, yang dapat ditemukan di paket java.util.
Perbedaan antara array built-in dan ArrayList di Java, adalah bahwa ukuran array tidak dapat diubah (jika Anda ingin menambah atau menghapus elemen ke / dari array, Anda harus membuat yang baru).
Sementara elemen dapat ditambahkan dan dihapus dari ArrayList kapan pun Anda mau. Sintaksnya juga sedikit berbeda:

Buat objek ArrayList bernama mobil yang akan menyimpan string:

import java.util.ArrayList; // import kelas ArrayList

ArrayList<String> mobil = new ArrayList<String>(); // Membuat objek ArrayList
 */

// Menambahkan item
// Kelas ArrayList memiliki banyak metode yang berguna. Misalnya, untuk menambahkan elemen ke ArrayList, gunakan metode add():

import java.util.ArrayList;
import java.util.Collections;

class AL {
    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        System.out.println(mobil);
    }
}

/* Akses Item
// Untuk mengakses elemen di ArrayList, gunakan metode get() dan lihat nomor indeks:
mobil.get(0);
*/

/* Ubah item
Untuk mengubah sebuah elemen, gunakan metode set() dan lihat nomor indeks:
mobil.set(0, "Lamborghini");
 */

/* Hapus Item
Untuk menghapus elemen, gunakan metode remove() dan merujuk ke nomor indeks:
mobil.remove(0);
 */

// Untuk menghapus semua elemen di ArrayList, gunakan metode clear():
// mobil.clear();

/* Ukuran ArrayList
Untuk mengetahui berapa banyak elemen yang dimiliki ArrayList, gunakan metode ukuran:
mobil.size();
 */

// Ulangi Melalui ArrayList
// Ulangi elemen ArrayList dengan perulangan for, dan gunakan metode size() untuk menentukan berapa kali perulangan harus dijalankan:

class AL1 {
    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        for (int i = 0; i < mobil.size(); i++) {
            System.out.println(mobil.get(i));
        }
    }
}

// Anda juga dapat melakukan loop melalui ArrayList dengan for-each loop:

class AL2 {
    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        for (String i : mobil) {
            System.out.println(i);
        }
    }
}

/* Tipe yang lain
Elemen dalam ArrayList sebenarnya adalah objek.
Dalam contoh di atas, kami membuat elemen (objek) berjenis "String".
Ingatlah bahwa String di Java adalah objek (bukan tipe primitif).
Untuk menggunakan tipe lain, seperti int, Anda harus menentukan kelas pembungkus yang setara: Integer.
Untuk tipe primitif lainnya, gunakan: Boolean untuk boolean, Karakter untuk char, Double untuk double, dll:

Buat ArrayList untuk menyimpan angka (tambahkan elemen bertipe Integer):
 */

class AL3 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}

/* Sortir ArrayList
Kelas berguna lainnya dalam paket java.util adalah kelas Koleksi, yang menyertakan metode sort() untuk menyortir daftar menurut abjad atau numerik:
 */

class AL4 {
    public static void main(String[] args) {
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        Collections.sort(mobil);  // Sort cars
        for (String i : mobil) {
            System.out.println(i);
        }
    }
}

// Sortir ArrayList of Integers:

class AL5 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // sortir myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}