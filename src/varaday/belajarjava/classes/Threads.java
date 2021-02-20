package varaday.belajarjava.classes;

/* Java Threads
Utas memungkinkan program untuk beroperasi lebih efisien dengan melakukan banyak hal pada waktu yang bersamaan.
Utas dapat digunakan untuk melakukan tugas rumit di latar belakang tanpa mengganggu program utama.
 */

/* Membuat Thread
Ada dua cara untuk membuat utas.
Itu bisa dibuat dengan memperluas kelas Thread dan menimpa metode run():
 */

// Extend Syntax
class T extends Thread {
    public void run() {
        System.out.println("Kode ini berjalan di utas");
    }
}

// Implement Syntax
class T1 implements Runnable {
    public void run() {
        System.out.println("Kode ini berjalan di utas");
    }
}

/* Menjalankan Thread
Jika kelas memperluas kelas Thread, thread dapat dijalankan dengan membuat instance kelas dan memanggil metode start():
 */

class T2 extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println("Kode ini berada di luar utas");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

/* Jika kelas mengimplementasikan antarmuka Runnable,
utas dapat dijalankan dengan meneruskan instance kelas ke konstruktor objek Thread dan kemudian memanggil metode thread's start():
 */

class T4 implements Runnable {
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread((Runnable) obj);
        thread.start();
        System.out.println("Kode ini berada di luar utas");
    }
    public void run() {
        System.out.println("Kode ini berjalan di utas");
    }
}

/* Masalah Konkurensi
Karena utas berjalan pada waktu yang sama dengan bagian lain dari program,
tidak ada cara untuk mengetahui urutan kode akan dijalankan.
Ketika utas dan program utama membaca dan menulis variabel yang sama, nilainya tidak dapat diprediksi.
Masalah yang dihasilkan dari ini disebut masalah konkurensi.
 */

class T5 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}

/* Untuk menghindari masalah konkurensi, yang terbaik adalah membagikan atribut sesedikit mungkin di antara utas.
Jika atribut perlu dibagikan, salah satu solusi yang mungkin adalah menggunakan metode isAlive() dari utas untuk memeriksa apakah utas telah selesai berjalan sebelum menggunakan atribut apa pun yang dapat diubah oleh utas.
 */

class T5 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        // Wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Sebentar...");
        }
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}
