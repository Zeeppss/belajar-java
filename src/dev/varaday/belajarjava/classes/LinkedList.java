package dev.varaday.belajarjava.classes;

/* Di bab sebelumnya, Anda telah mempelajari kelas ArrayList.
Kelas LinkedList hampir identik dengan ArrayList:
 */

// Import kelas LinkedList
import java.util.LinkedList;

class LList {
    public static void main(String[] args) {
        LinkedList<String> mobil = new LinkedList<String>();
        mobil.add("Avanza");
        mobil.add("Toyota");
        mobil.add("Mitsubishi");
        mobil.add("Alphard");
        System.out.println(mobil);
    }
}

/* ArrayList vs LinkedList
Kelas LinkedList adalah kumpulan yang bisa berisi banyak objek dengan tipe yang sama, seperti ArrayList.
Kelas LinkedList memiliki semua metode yang sama dengan kelas ArrayList karena keduanya mengimplementasikan antarmuka List.
Ini berarti Anda dapat menambahkan item, mengubah item, menghapus item, dan menghapus daftar dengan cara yang sama.
Namun, sementara kelas ArrayList dan kelas LinkedList dapat digunakan dengan cara yang sama, keduanya dibangun dengan sangat berbeda.
 */


/* Bagaimana ArrayList bekerja
Kelas ArrayList memiliki array biasa di dalamnya.
Ketika sebuah elemen ditambahkan, itu ditempatkan ke dalam array.
Jika array tidak cukup besar, array baru yang lebih besar dibuat untuk menggantikan yang lama dan yang lama dihapus.
 */


/* Bagaimana LinkedList bekerja
LinkedList menyimpan itemnya dalam "kontainer".
Daftar tersebut memiliki tautan ke penampung pertama dan setiap penampung memiliki tautan ke penampung berikutnya dalam daftar.
Untuk menambahkan elemen ke daftar, elemen ditempatkan ke dalam penampung baru dan penampung itu ditautkan ke salah satu penampung lain dalam daftar.
 */

/* Kapan Menggunakan
Yang terbaik adalah menggunakan ArrayList ketika:

- Anda ingin sering mengakses item acak
- Anda hanya perlu menambah atau menghapus elemen di akhir daftar

Cara terbaik adalah menggunakan LinkedList ketika:

- Anda hanya menggunakan daftar dengan mengulanginya daripada mengakses item acak
- Anda sering kali perlu menambah dan menghapus item dari awal atau tengah daftar
 */

/* Metode LinkedList
Untuk banyak kasus, ArrayList lebih efisien karena biasanya memerlukan akses ke item acak dalam daftar.
Tetapi LinkedList menyediakan beberapa metode untuk melakukan operasi tertentu dengan lebih efisien:

addFirst() - Menambahkan item ke addFirst()
addLast() - Tambahkan item ke addLast()
removeFirst() - Hapus item dari removeFirst()
removeLast() - Hapus item dari removeLast()
getFirst() - Dapatkan item di getFirst()
getLast() - Dapatkan item di getLast()
 */
