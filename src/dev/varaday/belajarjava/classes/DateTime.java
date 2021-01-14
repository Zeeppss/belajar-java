package dev.varaday.belajarjava.classes;

/* Java tidak memiliki kelas Date built-in, tetapi kita dapat mengimpor paket java.time untuk bekerja dengan API tanggal dan waktu.
Paket ini mencakup banyak kelas tanggal dan waktu. Sebagai contoh:

LocalDate - Merupakan tanggal (tahun, bulan, hari (yyyy-MM-dd))
LocalTime - Merepresentasikan waktu (jam, menit, detik dan nanodetik (HH-mm-ss-ns))
LocalDateTime - Merupakan tanggal dan waktu (yyyy-MM-hh-HH-mm-ss-ns)
DateTimeFormatter - Pemformat untuk menampilkan dan mengurai objek tanggal-waktu
 */

// Tampilkan Tanggal Sekarang
// Untuk menampilkan tanggal saat ini, import kelas java.time.LocalDate, dan gunakan metode now():

import java.time.LocalDate; // import kelas LocalDate
import java.time.LocalTime; // import kelas LocalTime
import java.time.LocalDateTime; // import kelas LocalDateTime
import java.time.format.DateTimeFormatter; // import kelas DateTimeFormatter

class DT {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now(); // Membuat objek tanggal
        System.out.println(myObj); // Tampilkan tanggal sekarang
        // Mencetak > 2021-01-14
    }
}

// Tampilkan Waktu Saat Ini
// Untuk menampilkan waktu saat ini (jam, menit, detik, dan nanodetik), import kelas java.time.LocalTime, dan gunakan metode now():


class DT1 {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}

// Menampilkan Tanggal dan Waktu Saat Ini
// Untuk menampilkan tanggal dan waktu saat ini, import kelas java.time.LocalDateTime, dan gunakan metode now():

class DT2 {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
        // Mencetak > 2021-01-14T06:58:35.740775
    }
}

// Memformat Tanggal dan Waktu
/*
"T" pada contoh di atas digunakan untuk memisahkan tanggal dari waktu.
Anda bisa menggunakan kelas DateTimeFormatter dengan metode ofPattern() dalam paket yang sama untuk memformat atau mengurai objek tanggal-waktu.
Contoh berikut akan menghapus "T" dan nanodetik dari tanggal-waktu:
 */

class DT3 {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Sebelum memformat: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Setelah memformat: " + formattedDate);
        // Mencetak > Sebelum memformat: 2021-01-14T06:58:35.741720
        //          > Setelah memformat: 14-01-2021 06:58:35
    }
}