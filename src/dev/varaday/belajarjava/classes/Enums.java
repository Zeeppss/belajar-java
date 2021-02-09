package dev.varaday.belajarjava.classes;

/* Enum adalah kelas khusus yang mewakili sekelompok konstanta (variabel yang tidak dapat diubah, seperti variabel akhir).
Untuk membuat enum, gunakan kata kunci enum (bukan class atau interface),
dan pisahkan konstanta dengan koma. Perhatikan bahwa mereka harus dalam huruf besar:

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
 */

// Anda dapat mengakses konstanta enum dengan sintaks titik:
// Level myVar = Level.MEDIUM;

public class Enums {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

// Enum dalam Pernyataan Switch
// Enum sering digunakan dalam pernyataan sakelar untuk memeriksa nilai yang sesuai:

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

class Enums1 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
