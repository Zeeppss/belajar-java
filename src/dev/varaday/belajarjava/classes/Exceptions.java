package dev.varaday.belajarjava.classes;

/* Java Exceptions
Saat menjalankan kode Java, kesalahan yang berbeda dapat terjadi: kesalahan pengkodean yang dilakukan oleh programmer,
kesalahan karena input yang salah, atau hal-hal lain yang tidak terduga.
Ketika terjadi kesalahan, Java biasanya akan berhenti dan menghasilkan pesan kesalahan.
Istilah teknis untuk ini adalah: Java akan membuat pengecualian (membuat kesalahan).
 */

/* Java coba dan tangkap
Pernyataan coba memungkinkan Anda untuk menentukan blok kode yang akan diuji untuk kesalahan saat sedang dijalankan.
Pernyataan catch memungkinkan Anda untuk menentukan blok kode yang akan dieksekusi, jika terjadi kesalahan di blok percobaan.
Kata kunci coba dan tangkap datang berpasangan:

try {
  //  Blok kode untuk dicoba
}
catch(Exception e) {
  //  Blok kode untuk menangani kesalahan
}

Perhatikan contoh berikut:
 */

class ECPTNS {
    public static void main(String[ ] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}

/* Akhirnya
Pernyataan terakhir memungkinkan Anda mengeksekusi kode, setelah try ... catch, apa pun hasilnya:
 */

class ECPTNS1 {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Ada yang salah.");
        } finally {
            System.out.println("'Coba tangkap' selesai.");
        }
    }
}

/* Kata kunci lemparan
Pernyataan throw memungkinkan Anda membuat kesalahan khusus.
Pernyataan throw digunakan bersama dengan tipe pengecualian.
Ada banyak jenis pengecualian yang tersedia di Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, dll:
 */

class ECPTNS2 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Akses ditolak - Anda harus berusia minimal 18 tahun.");
        }
        else {
            System.out.println("Akses diberikan - Anda cukup tua!");
        }
    }

    public static void main(String[] args) {
        checkAge(15); // Setel usia menjadi 15 (yaitu di bawah 18 ...)
    }
}

// Jika usia Anda 20 tahun, Anda tidak akan mendapatkan pengecualian:
// checkAge(20);
// Outputnya adalah:
// Akses diberikan - Anda cukup tua!