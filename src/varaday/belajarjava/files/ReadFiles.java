package varaday.belajarjava.files;

/* Membaca File

Di bab sebelumnya, Anda telah mempelajari cara membuat dan menulis ke file.
Pada contoh berikut, saya menggunakan kelas Scanner untuk membaca konten file teks yang kami buat di bab sebelumnya:
 */

import java.io.File;  // Import kelas File
import java.io.FileNotFoundException;  // Import kelas ini untuk menangani kesalahan
import java.util.Scanner; // Import kelas Scanner untuk membaca file teks

class MembacaFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }
    }
}

/* Mendapatkan Informasi File

Untuk mendapatkan informasi selengkapnya tentang file, gunakan salah satu metode File:
 */

class MendapatkanInformasiFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("Nama File: " + myObj.getName());
            System.out.println("Jalan Mutlak: " + myObj.getAbsolutePath());
            System.out.println("Dapat Ditulis: " + myObj.canWrite());
            System.out.println("Dapat Dibaca: " + myObj.canRead());
            System.out.println("Ukurang File Dalam Byte: " + myObj.length());
        } else {
            System.out.println("File tidak ada.");
        }
    }
}
