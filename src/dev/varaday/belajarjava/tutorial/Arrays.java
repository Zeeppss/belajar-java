package dev.varaday.belajarjava.tutorial;

/*
Anda mengakses elemen array dengan mengacu pada nomor indeks.

Pernyataan ini mengakses nilai elemen pertama di nama string, contoh:
*/

public class Arrays {
    public static void main(String[] args) {
        // Change an Array Element:
        String[] uzumaki = {"Naruto", "Kushina"};
        uzumaki[0] = "Naruto";
        System.out.println(uzumaki[0]); // Mencetak > Naruto

        String[] uchiha = {"Madara", "Itachi", "Sishui", "Sasuke"};
        System.out.println(uchiha[0]); // Mencetak > Madara

        // Array length
        String[] senju = {"Butsuma", "Hashirama", "Tobirama", "Itama"};
        System.out.println(senju.length); // Mencetak > 4

        // Loop Through an Array
        String[] otsutsuki = {"Kaguya", "Hagoromo", "Hamura", "Indra", "Ashura"};
        for (int i = 0; i < otsutsuki.length; i++) {
            System.out.println(otsutsuki[i]); // Mencetak > Kaguya - Ashura
        }
    }
}
