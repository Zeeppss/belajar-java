package varaday.belajarjava.classes;

/* Ekspresi Lambda ditambahkan di Java 8.
Ekspresi lambda adalah blok kode pendek yang mengambil parameter dan mengembalikan nilai.
Ekspresi lambda mirip dengan metode, tetapi tidak memerlukan nama dan dapat diterapkan langsung di bagian isi metode.
 */

/* Menggunakan Lambda Expressions
Ekspresi lambda biasanya diteruskan sebagai parameter ke suatu fungsi:
 */

import java.util.ArrayList;
import java.util.function.Consumer;

class L {
    public static void main(String[] args) {
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        jumlah.add(5);
        jumlah.add(9);
        jumlah.add(8);
        jumlah.add(1);
        jumlah.forEach( (n) -> { System.out.println(n); } );
    }
}

/* Ekspresi lambda dapat disimpan dalam variabel jika tipe variabelnya adalah antarmuka yang hanya memiliki satu metode.
Ekspresi lambda harus memiliki jumlah parameter yang sama dan tipe kembalian yang sama dengan metode itu.
Java memiliki banyak antarmuka bawaan seperti ini, seperti antarmuka Konsumen (ditemukan dalam paket java.util) yang digunakan oleh daftar.
 */

class L1 {
    public static void main(String[] args) {
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        jumlah.add(5);
        jumlah.add(9);
        jumlah.add(8);
        jumlah.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        jumlah.forEach( method );
    }
}

/* Untuk menggunakan ekspresi lambda dalam sebuah metode, metode tersebut harus memiliki parameter dengan antarmuka metode tunggal sebagai tipenya.
Memanggil metode antarmuka akan menjalankan ekspresi lambda:
 */

interface StringFunction {
    String run(String str);
}

class L3 {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}