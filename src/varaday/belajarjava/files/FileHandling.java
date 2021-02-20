package varaday.belajarjava.files;

/* Penanganan file adalah bagian penting dari aplikasi apa pun.

Java memiliki beberapa metode untuk membuat, membaca, memperbarui, dan menghapus file.:

Kelas File dari paket java.io, memungkinkan kita untuk bekerja dengan file.
Untuk menggunakan kelas File, buat objek kelas, dan tentukan nama file atau nama direktori:

import java.io.File;  // Import kelas File

File myObj = new File("filename.txt"); // Tentukan nama file
 */

/* Kelas File memiliki banyak metode yang berguna untuk membuat dan mendapatkan informasi tentang file. Sebagai contoh:

Method
canRead() - Boolean - Menguji apakah file dapat dibaca atau tidak
canWrite() - Boolean - Menguji apakah file dapat ditulis atau tidak
createNewFile() - Boolean - Membuat file kosong
delete() - Boolean - Menghapus file
exists() - Boolean - Menguji apakah file tersebut ada
getName() - String - Mengembalikan nama file
getAbsolutePath() - String - Mengembalikan nama jalur absolut file
length() - Long - Mengembalikan ukuran file dalam byte
list() - String[] - Mengembalikan larik file dalam direktori
mkdir() - Boolean - Membuat direktori
 */
