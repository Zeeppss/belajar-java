package varaday.belajarjava.files;

/* Menghapus File
Untuk menghapus file di Java, gunakan metode delete():
 */

import java.io.File;  // Import kelas File

class MenghapusFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Menghapus File: " + myObj.getName());
        } else {
            System.out.println("Gagal menghapus file.");
        }
    }
}

/* Menghapus Folder
Anda juga dapat menghapus folder, Namun, harus kosong:
 */

class MenghapusFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\MyName\\Test");
        if (myObj.delete()) {
            System.out.println("Menghapus Folder: " + myObj.getName());
        } else {
            System.out.println("Gagal menghapus folder.");
        }
    }
}
