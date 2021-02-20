package varaday.belajarjava.classes;

/* Java Regular Expressions
Ekspresi reguler adalah urutan karakter yang membentuk pola pencarian.
Saat Anda mencari data dalam teks, Anda dapat menggunakan pola pencarian ini untuk menjelaskan apa yang Anda cari.
Ekspresi reguler dapat berupa satu karakter, atau pola yang lebih rumit.
Ekspresi reguler dapat digunakan untuk melakukan semua jenis pencarian teks dan operasi penggantian teks.
Java tidak memiliki kelas Ekspresi Reguler bawaan, tetapi kita dapat mengimpor paket java.util.regex untuk bekerja dengan ekspresi reguler.
Paket tersebut mencakup kelas-kelas berikut:

- Pattern Class - Mendefinisikan pola (untuk digunakan dalam pencarian)
- Matcher Class - Digunakan untuk mencari pola
- Pattern SyntaxException - Menunjukkan kesalahan sintaks dalam pola ekspresi reguler

Contoh:
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class REx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Varaday", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit Varaday!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Pertandingan ditemukan");
        } else {
            System.out.println("Pertandingan tidak ditemukan");
        }
    }
}
// Hasil yang Cocok ditemukan

/* Contoh Dijelaskan
Dalam contoh ini, Kata "Varaday" sedang dicari dalam sebuah kalimat.

Pertama, pola dibuat menggunakan metode Pattern.compile().
Parameter pertama menunjukkan pola mana yang sedang dicari dan parameter kedua memiliki tanda yang menunjukkan bahwa pencarian harus peka huruf besar kecil.
Parameter kedua adalah opsional.
Metode matcher() digunakan untuk mencari pola dalam sebuah string.
Ini mengembalikan objek Matcher yang berisi informasi tentang pencarian yang dilakukan.
Metode find() mengembalikan nilai true jika pola ditemukan dalam string dan false jika tidak ditemukan.
 */

/* Bendera
Tanda dalam metode compile() mengubah cara pencarian dilakukan. Berikut ini beberapa di antaranya:

- Pattern CASE_INSENSITIVE - Kapitalisasi huruf akan diabaikan saat melakukan pencarian.
- Pattern LITERAL - Karakter khusus dalam pola tidak akan memiliki arti khusus dan akan diperlakukan sebagai karakter biasa saat melakukan pencarian.
- Pattern UNICODE_CASE - Gunakan bersama dengan bendera CASE_INSENSITIVE untuk juga mengabaikan huruf besar / kecil di luar alfabet Inggris
 */