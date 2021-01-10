package dev.varaday.belajarjava.classes;

/* Pada bab sebelumnya, kami menggunakan istilah "variabel" untuk x dalam contoh (seperti yang ditunjukkan di bawah).
Ini sebenarnya adalah atribut kelas.
Atau Anda bisa mengatakan bahwa atribut kelas adalah variabel di dalam kelas:
 */

public class ClassAttributes {
    int x = 5;
    int y = 3;
}

/* Anda dapat mengakses atribut dengan membuat objek kelas, dan dengan menggunakan sintaks titik (.):

Contoh berikut akan membuat objek kelas Utama, dengan nama myObj. Saya menggunakan atribut x pada objek untuk mencetak nilainya:
 */


class AccessingAttributes {
    int x = 5;

    public static void main(String[] args) {
        AccessingAttributes myObj = new AccessingAttributes();
        System.out.println(myObj.x);
    }
}

// Anda juga dapat mengubah nilai atribut:

class ModifyAttributes {
    int x = 5;

    public static void main(String[] args) {
        ModifyAttributes myObj = new ModifyAttributes();
        myObj.x = 40; // x sekarang menjadi > 40
        System.out.println(myObj.x);
    }
}
