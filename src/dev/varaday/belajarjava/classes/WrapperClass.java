package dev.varaday.belajarjava.classes;

/* Java Wrapper Classes
Kelas pembungkus menyediakan cara untuk menggunakan tipe data primitif (int, boolean, dll ..) sebagai objek.
Tabel di bawah ini menunjukkan tipe primitif dan kelas pembungkus yang setara:

Primitive Data Type	| Wrapper Class
byte	            | Byte
short	            | Short
int	                | Integer
long	            | Long
float	            | Float
double	            | Double
boolean	            | Boolean
char	            | Character

Terkadang Anda harus menggunakan kelas pembungkus.
Misalnya saat bekerja dengan objek Collection, seperti ArrayList,
di mana tipe primitif tidak dapat digunakan (daftar hanya dapat menyimpan objek):

Contoh:

ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
 */

/* Membuat Objek Pembungkus
Untuk membuat objek pembungkus, gunakan kelas pembungkus sebagai ganti tipe primitif.
Untuk mendapatkan nilainya, Anda cukup mencetak objek:
 */

class WClass {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
    }
}

/* Karena Anda sekarang bekerja dengan objek, Anda dapat menggunakan metode tertentu untuk mendapatkan informasi tentang objek tertentu.

Misalnya, metode berikut digunakan untuk mendapatkan nilai yang terkait dengan objek pembungkus yang sesuai:
intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue().

Contoh ini akan menampilkan hasil yang sama seperti contoh di atas:
 */

class WClass1 {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}

/* Metode berguna lainnya adalah metode toString(), yang digunakan untuk mengonversi objek pembungkus menjadi string.
Dalam contoh berikut, kami mengonversi Integer menjadi String,
dan menggunakan metode length() dari kelas String untuk menampilkan panjang "string":
 */

class WClass2 {
    public static void main(String[] args) {
        Integer myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString.length());
    }
}
