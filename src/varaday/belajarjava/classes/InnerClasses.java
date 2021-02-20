package varaday.belajarjava.classes;

/* Di Java, dimungkinkan juga untuk menumpuk kelas (kelas di dalam kelas).
Tujuan kelas bertingkat adalah untuk mengelompokkan kelas yang dimiliki bersama, yang membuat kode Anda lebih mudah dibaca dan dipelihara.
Untuk mengakses kelas dalam, buat objek kelas luar, lalu buat objek kelas dalam:
 */

class KelasLuar {
    int x = 10;

    class KelasDalam {
        int y = 5;
    }
    public static void main(String[] args) {
        KelasLuar myOuter = new KelasLuar();
        KelasLuar.KelasDalam myInner = myOuter.new KelasDalam();
        System.out.println(myInner.y + myOuter.x);
    }
}

// Mencetak > 15 (5 + 10)

