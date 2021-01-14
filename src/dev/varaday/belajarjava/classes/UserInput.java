package dev.varaday.belajarjava.classes;

/* Kelas Scanner digunakan untuk mendapatkan input pengguna, dan itu ditemukan dalam paket java.util.

Untuk menggunakan kelas Scanner, buat objek dari kelas tersebut dan gunakan salah satu metode yang tersedia yang ditemukan dalam dokumentasi kelas Scanner.
Dalam contoh saya, saya akan menggunakan metode nextLine(), yang digunakan untuk membaca Strings:
 */

import java.util.Scanner;  // Import kelas Scanner

class UI {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Membuat objek Scanner
        System.out.println("Masukkan nama pengguna");

        String userName = myObj.nextLine();  // Membaca masukan pengguna(UserInput)
        System.out.println("Pengguna adalah: " + userName);  // Mengeluarkan masukan pengguna(UserInput)
    }
}

/* Input Types
Dalam contoh di atas, kami menggunakan metode nextLine (), yang digunakan untuk membaca Strings.
Untuk membaca jenis lain, lihat tabel di bawah ini:

Deskripsi metode
----------------
nextBoolean() - Membaca nilai boolean dari pengguna
nextByte() - Membaca nilai byte dari pengguna
nextDouble() - Membaca nilai ganda dari pengguna
nextFloat()	- Membaca nilai float dari pengguna
nextInt() - Membaca nilai int dari pengguna
nextLine() - Membaca nilai String dari pengguna
nextLong() - Membaca nilai panjang dari pengguna
nextShort()	- Membaca nilai singkat dari pengguna

Pada contoh di bawah ini, kami menggunakan metode berbeda untuk membaca data dari berbagai jenis:
 */

// import java.util.Scanner? sudah di import di UI.class

class UI1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan nama, umur dan gaji:");

        // Masukkan String
        String nama = myObj.nextLine();

        // Masukan numerik
        int umur = myObj.nextInt();
        double gaji = myObj.nextDouble();

        // Masukan keluaran oleh pengguna
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Gaji: " + gaji);
    }
}
