package dev.varaday.belajarjava.classes;

// Java Packages & API

/* Sebuah paket di Java digunakan untuk mengelompokkan kelas terkait.
Anggap saja sebagai folder di direktori file.
Kami menggunakan paket untuk menghindari konflik nama, dan untuk menulis kode yang lebih mudah dirawat.
Paket dibagi menjadi dua kategori:

 - Paket Bawaan (paket dari Java API)
 - Paket yang ditentukan pengguna (buat paket Anda sendiri)
 */

// Paket Bawaan

/* Java API adalah pustaka kelas yang telah ditulis sebelumnya, yang gratis untuk digunakan, termasuk dalam Java Development Environment.
Pustaka berisi komponen untuk mengelola input, pemrograman database, dan banyak lagi. Daftar lengkapnya dapat ditemukan di situs web Oracles: https://docs.oracle.com/javase/8/docs/api/.
Perpustakaan dibagi menjadi 'paket' dan 'kelas'.
Artinya Anda dapat mengimpor satu kelas (bersama dengan metode dan atributnya), atau seluruh paket yang berisi semua kelas yang termasuk dalam paket yang ditentukan.

Untuk menggunakan kelas atau paket dari perpustakaan, Anda perlu menggunakan kata kunci import:

import package.name.Class;   // Import satu kelas
import package.name.*;   // Import seluruh kelas
 */

// Import kelas
/* Jika Anda menemukan kelas yang ingin Anda gunakan,
misalnya, kelas Scanner, yang digunakan untuk mendapatkan input pengguna, tulis kode berikut:

// import java.util.Scanner; \\

Pada contoh di atas, java.util adalah sebuah paket, sedangkan Scanner adalah kelas dari paket java.util.

Untuk menggunakan kelas Scanner, buat objek dari kelas tersebut dan gunakan salah satu metode yang tersedia yang ditemukan dalam dokumentasi kelas Scanner.
Dalam contoh kami, kami akan menggunakan metode nextLine (), yang digunakan untuk membaca baris lengkap:
 */

import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan nama pengguna");

        String namaPengguna = myObj.nextLine();
        System.out.println("Nama pengguna adalah: " + namaPengguna);
    }
}
