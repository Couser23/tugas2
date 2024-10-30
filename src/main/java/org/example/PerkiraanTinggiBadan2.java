package org.example;
import java.util.Scanner;

public class PerkiraanTinggiBadan2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tinggiAyah = inputTinggi("ayah", scanner);
        double tinggiIbu = inputTinggi("ibu", scanner);

        System.out.println("Masukkan jenis kelamin anak (laki-laki/perempuan): ");
        String jenisKelamin = scanner.next();

        double tinggiAnak = hitungTinggiAnak(tinggiAyah, tinggiIbu, jenisKelamin);

        System.out.println("Perkiraan tinggi badan anak: " + tinggiAnak + " cm");
        scanner.close();
    }

    // Metode untuk menerima input tinggi badan
    public static double inputTinggi(String orangTua, Scanner scanner) {
        System.out.println("Masukkan tinggi " + orangTua + " (dalam cm): ");
        return scanner.nextDouble();
    }

    // Metode untuk menghitung tinggi badan anak berdasarkan jenis kelamin
    public static double hitungTinggiAnak(double tinggiAyah, double tinggiIbu, String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("laki-laki")) {
            return (tinggiAyah + tinggiIbu) * 0.54;
        } else {
            return (tinggiAyah + tinggiIbu) * 0.51;
        }
    }
}
