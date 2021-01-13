package dev.varaday.belajarjava.classes;

/* Polymorphism berarti "banyak bentuk", dan itu terjadi ketika kita memiliki banyak kelas yang terkait satu sama lain melalui pewarisan.
Seperti yang kami tentukan di bab sebelumnya; Pewarisan memungkinkan kita mewarisi atribut dan metode dari kelas lain.
Polymorphism menggunakan metode tersebut untuk melakukan tugas yang berbeda. Ini memungkinkan kami untuk melakukan satu tindakan dengan cara berbeda.
Misalnya, bayangkan superclass yang disebut Hewan atau Animal yang memiliki metode yang disebut animalSound ().
Subkelas Hewan dapat berupa Babi, Kucing, Anjing, Burung.
Dan mereka juga memiliki implementasi suara hewan sendiri (suara babi, kucing mengeong, dll.:
 */

// Dan juga kita bisa membuat objek 'Anjing' dan 'Babi' dan memanggil metode suaraHewan() pada keduanya:

class Hewan {
    public void suaraHewan() {
        System.out.println("Hewan itu mengeluarkan suara");
    }
}

class Babi extends Hewan {
    public void suaraHewan() {
        System.out.println("Babi berkata: wee wee");
    }
}

class Anjing extends Hewan {
    public void suaraHewan() {
        System.out.println("Anjing berkata: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Hewan myHewan = new Hewan();  // Membuat objek Hewan
        Hewan myBabi = new Babi();  // Membuat objek Babi
        Hewan myAnjing = new Anjing();  // Membuat objek Anjing
        myHewan.suaraHewan();
        myBabi.suaraHewan();
        myAnjing.suaraHewan();
    }
}

