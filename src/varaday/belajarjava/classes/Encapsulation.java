package varaday.belajarjava.classes;

/* Arti dari Enkapsulasi, adalah untuk memastikan bahwa data "sensitif" disembunyikan dari pengguna.
Untuk mencapai ini, Anda harus:

 - mendeklarasikan variabel / atribut kelas sebagai private
 - menyediakan metode publik dan setel untuk mengakses dan memperbarui nilai variabel private
 */

// Example:

public class Encapsulation {
    private String nama; // private = akses terbatas

    // Getter
    public String getName() {
        return nama;
    }

    // Setter
    public void setName(String namaBaru) {
        this.nama = namaBaru;
    }
}
