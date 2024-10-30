package org.example;

import java.util.Scanner;

public class PerkiraanTinggiBadan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tinggi ayah (dalam cm): ");
        double tinggiAyah = scanner.nextDouble();

        System.out.println("Masukkan tinggi ibu (dalam cm): ");
        double tinggiIbu = scanner.nextDouble();

        // Menghitung tinggi anak berdasarkan jenis kelamin
        System.out.println("Masukkan jenis kelamin anak (laki-laki/perempuan): ");
        String jenisKelamin = scanner.next();

        double tinggiAnak;
        if (jenisKelamin.equalsIgnoreCase("laki-laki")) {
            tinggiAnak = (tinggiAyah + tinggiIbu) * 0.54;
        } else {
            tinggiAnak = (tinggiAyah + tinggiIbu) * 0.51;
        }

        System.out.println("Perkiraan tinggi badan anak: " + tinggiAnak + " cm");
        scanner.close();
    }
}
