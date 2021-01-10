package dev.varaday.belajarjava.classes;

/* Di Java, sebuah objek dibuat dari sebuah kelas. Kami telah membuat kelas bernama MyClass,
jadi sekarang kami dapat menggunakan ini untuk membuat objek.

Untuk membuat objek MyClass, tentukan nama kelas, diikuti dengan nama objek:
 */

public class Objects {
    int x = 5;

    public static void main(String[] args) {
        Objects myObj = new Objects();
        System.out.println(myObj.x);
    }
}

// Anda dapat membuat beberapa objek dari satu kelas:

class MultipleObjects {
    int x = 5;

    public static void main(String[] args) {
        MultipleObjects myObj1 = new MultipleObjects(); // Objek 1
        MultipleObjects myObj2 = new MultipleObjects(); // Objek 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
