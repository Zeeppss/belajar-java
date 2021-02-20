package varaday.belajarjava.classes;

/* Cara lain untuk mencapai abstraksi di Java adalah dengan antarmuka.
Antarmuka adalah "kelas abstrak" sepenuhnya yang digunakan untuk mengelompokkan metode terkait dengan badan kosong:
 */

// interface
interface ContohAnimal {
    public void animalSound(); // metode antarmuka (tidak memiliki tubuh)
    public void run(); // metode antarmuka (tidak memiliki tubuh)
}

/* Untuk mengakses metode antarmuka, antarmuka harus "diimplementasikan" (seperti diwariskan) oleh kelas lain dengan kata kunci implement (bukan extends).
Tubuh metode antarmuka disediakan oleh kelas "implement":
 */

// Interface
interface Animal1 {
    public void animalSound(); // metode antarmuka (tidak memiliki tubuh)
    public void sleep(); // metode antarmuka (tidak memiliki tubuh)
}

// Pig "mengimplementasikan" antarmuka Hewan
class Pig1 implements Animal1 {
    public void animalSound() {
        // Tubuh animalSound() disediakan di sini
        System.out.println("Babi berkata: wee wee");
    }
    public void sleep() {
        // Tubuh sleep() disediakan di sini
        System.out.println("Zzz");
    }
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Membuat objek babi
        myPig.animalSound();
        myPig.sleep();
    }
}

// Multiple Interfaces
// Untuk menerapkan banyak antarmuka, pisahkan dengan koma:

interface InterfacePertama {
    public void myMethod(); // metode interface
}

interface InterfaceKedua {
    public void myOtherMethod(); // metode interface
}

class KelasDemo implements InterfacePertama, InterfaceKedua {
    public void myMethod() {
        System.out.println("Beberapa teks...");
    }
    public void myOtherMethod() {
        System.out.println("Beberapa teks lain ...");
    }
    public static void main(String[] args) {
        KelasDemo myObj = new KelasDemo();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}
