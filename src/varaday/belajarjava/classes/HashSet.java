package varaday.belajarjava.classes;

/* Java HashSet
HashSet adalah kumpulan item yang setiap itemnya unik, dan dapat ditemukan di paket java.util:

Contoh
Buat objek HashSet yang disebut mobil yang akan menyimpan string:

import java.util.HashSet; // Import kelas HashSet

HashSet<String> mobil = new HashSet<String>();
 */

/* Tambahkan Item
Kelas HashSet memiliki banyak metode yang berguna.
Misalnya, untuk menambahkan item ke dalamnya, gunakan metode add():
 */

// Import kelas HashSet
import java.util.HashSet;

class HSet {
    public static void main(String[] args) {
        HashSet<String> mobil = new HashSet<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        System.out.println(mobil);
    }
}

/* Periksa Jika Item Ada
Untuk memeriksa apakah suatu item ada di HashSet, gunakan metode contains():

mobil.contains("Avanza");
 */

/* Hapus Item
Untuk menghapus item, gunakan metode remove():

mobil.remove("Toyota");

Untuk menghapus semua item, gunakan metode clear():

mobil.clear();
 */

/* Ukuran HashSet
Untuk mengetahui berapa banyak item yang ada, gunakan metode ukuran:

mobil.size();
 */

/* Ulangi Melalui HashSet
Ulangi item dari HashSet dengan loop untuk setiap:

Contoh
for (String i : mobil) {
  System.out.println(i);
}
 */

/* Tipe yang lain
Item dalam HashSet sebenarnya adalah objek. Dalam contoh di atas, kami membuat item (objek) dengan tipe "String".
Ingatlah bahwa String di Java adalah objek (bukan tipe primitif).
Untuk menggunakan tipe lain, seperti int, Anda harus menentukan kelas pembungkus yang setara: Integer.
Untuk tipe primitif lainnya, gunakan: Boolean untuk boolean, Karakter untuk char, Double untuk double, dll:
 */

class HSet1 {
    public static void main(String[] args) {

        // Buat objek HashSet yang disebut angka
        HashSet<Integer> angka = new HashSet<Integer>();

        // Tambahkan nilai ke set
        angka.add(4);
        angka.add(7);
        angka.add(8);

        // Tunjukkan angka antara 1 dan 10 yang ada di set
        for(int i = 1; i <= 10; i++) {
            if(angka.contains(i)) {
                System.out.println(i + " ditemukan di set.");
            } else {
                System.out.println(i + " tidak ditemukan di set.");
            }
        }
    }
}
