package varaday.belajarjava.classes;

/* Java Iterator
Iterator adalah objek yang dapat digunakan untuk mengulang koleksi, seperti ArrayList dan HashSet.
Ini disebut "iterator" karena "iterating" adalah istilah teknis untuk perulangan.
Untuk menggunakan Iterator, Anda harus mengimpornya dari paket java.util.
 */

/* Mendapatkan Iterator
Metode iterator() bisa digunakan untuk mendapatkan Iterator untuk koleksi apa pun:
 */

// Impor kelas ArrayList dan kelas Iterator
import java.util.ArrayList;
import java.util.Iterator;

class ITR {
    public static void main(String[] args) {

        // Buatlah koleksi
        ArrayList<String> mobil = new ArrayList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");

        // Dapatkan iterator
        Iterator<String> it = mobil.iterator();

        // Cetak item pertama
        System.out.println(it.next());
    }
}

/* Pendauran Melalui Koleksi
Untuk mengulang koleksi, gunakan metode hasNext() dan next() dari Iterator:

Contoh

while(it.hasNext()) {
  System.out.println(it.next());
}
 */

/* Menghapus Item dari Koleksi
Iterator dirancang untuk dengan mudah mengubah koleksi yang dilaluinya.
Metode remove() bisa menghapus item dari koleksi saat melakukan perulangan.
 */

class ITR1 {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<Integer>();
        angka.add(12);
        angka.add(8);
        angka.add(2);
        angka.add(23);
        Iterator<Integer> it = angka.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();
            }
        }
        System.out.println(angka);
    }
}
