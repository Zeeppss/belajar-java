package varaday.belajarjava.classes;

/* Java HashMap
Di bab ArrayList, Anda mengetahui bahwa Array menyimpan item sebagai koleksi yang dipesan, dan Anda harus mengaksesnya dengan nomor indeks (tipe int).
Namun, HashMap, menyimpan item dalam pasangan "kunci / nilai", dan Anda dapat mengaksesnya dengan indeks jenis lain (mis. String).
Satu objek digunakan sebagai kunci (indeks) ke objek lain (nilai).
Ini dapat menyimpan jenis yang berbeda: Kunci string dan nilai Integer, atau jenis yang sama, seperti: Kunci string dan nilai String:

Buat objek HashMap bernama capitalCities yang akan menyimpan kunci String dan nilai String:

import java.util.HashMap; // import kelas HashMap

HashMap<String, String> ibuKota = new HashMap<String, String>();
 */

/* Tambahkan Item
Kelas HashMap memiliki banyak metode yang berguna. Misalnya, untuk menambahkan item ke dalamnya, gunakan metode put():
 */

// Import the HashMap class
import java.util.HashMap;

class HMap {
    public static void main(String[] args) {
        // Buat objek HashMap bernama ibuKota
        HashMap<String, String> ibuKota = new HashMap<String, String>();

        // Tambahkan kunci dan nilai (Negara, Kota)
        ibuKota.put("Indonesia", "Jakarta");
        ibuKota.put("Malaysia", "Kuala Lumpur");
        ibuKota.put("Singapore", "Singapore");
        ibuKota.put("Thailand", "Bangkok");
        System.out.println(ibuKota);
    }
}

/* Akses Item
Untuk mengakses nilai di HashMap, gunakan metode get() dan lihat kuncinya:

ibuKota.get("Indonesia");
 */

/* Hapus Item
Untuk menghapus item, gunakan metode remove() dan lihat kuncinya:

ibuKota.remove("Indonesia");

Untuk menghapus semua item, gunakan metode clear():

ibuKota.clear();
 */

/* Ukuran HashMap
Untuk mengetahui berapa banyak item yang ada, gunakan metode ukuran:

ibuKota.size();
 */

/* Ulangi Melalui HashMap
Ulangi item dari HashMap dengan loop untuk setiap.

Catatan: Gunakan metode keySet() jika Anda hanya menginginkan kunci, dan gunakan metode values() jika Anda hanya menginginkan nilai:

// Cetak kunci
for (String i : ibukota.keySet()) {
  System.out.println(i);
}

-------------------------------------

// Nilai cetak
for (String i : ibuKota.values()) {
  System.out.println(i);
}

-------------------------------------

// Cetak kunci dan nilai
for (String i : ibuKota.keySet()) {
  System.out.println("kunci: " + i + " nilai: " + ibuKota.get(i));
}
 */

/* Tipe yang lain
Kunci dan nilai dalam HashMap sebenarnya adalah objek.
Dalam contoh di atas, kami menggunakan objek berjenis "String".
Ingatlah bahwa String di Java adalah objek (bukan tipe primitif).
Untuk menggunakan tipe lain, seperti int, Anda harus menentukan kelas pembungkus yang setara: Integer.
Untuk tipe primitif lainnya, gunakan: Boolean untuk boolean, Karakter untuk char, Double untuk double, dll:

Buat objek HashMap bernama orang yang akan menyimpan kunci String dan nilai Integer:
 */

class HMap1 {
    public static void main(String[] args) {

        // Create a HashMap object called people
        HashMap<String, Integer> orang = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        orang.put("Varaday", 15);
        orang.put("Varadayy", 16);
        orang.put("Varadayyy", 17);

        for (String i : orang.keySet()) {
            System.out.println("kunci: " + i + " nilai: " + orang.get(i));
        }
    }
}
