package varaday.belajarjava.files;

/* Membuat File

Untuk membuat file di Java, Anda bisa menggunakan metode createNewFile().
Metode ini mengembalikan nilai boolean: true jika file berhasil dibuat, dan false jika file sudah ada.
Perhatikan bahwa metode ini disertakan dalam blok 'try...catch' Ini diperlukan karena ini melempar IOException jika terjadi kesalahan (jika file tidak dapat dibuat karena alasan tertentu:
 */

import java.io.File;  // Import kelas File
import java.io.FileWriter; // Import kelas File Writer
import java.io.IOException;  // Import kelas IOException untuk menangani kesalahan

class MembuatFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File " + myObj.getName());
            } else {
                System.out.println("File sudah ada!");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }
    }
}

/*
Untuk membuat file dalam direktori tertentu (memerlukan izin), tentukan jalur file dan gunakan garis miring terbalik ganda untuk keluar dari karakter "\" (untuk Windows).
Di Mac dan Linux Anda bisa menulis path, seperti: /Users/name/filename.txt, Contoh:

File myObj = new File("C:\\Users\\MyName\\filename.txt");
 */

/* Menulis File

Dalam contoh berikut, kami menggunakan kelas FileWriter bersama dengan metode write() untuk menulis beberapa teks ke file yang kami buat pada contoh di atas.
Perhatikan bahwa ketika Anda selesai menulis ke file, Anda harus menutupnya dengan metode close():
 */

class MenulisFile{
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("File di Java mungkin rumit, tetapi cukup menyenangkan!");
            fileWriter.close();
            System.out.println("Berhasil menuliskan ke file!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
            e.printStackTrace();
        }
    }
}
