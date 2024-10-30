package org.example;

import java.util.Scanner;

/**
 * Program ini memperkirakan tinggi badan anak berdasarkan tinggi badan ayah dan ibu,
 * serta jenis kelamin anak.
 * <p>
 * Program akan meminta input tinggi badan ayah, ibu, dan jenis kelamin anak,
 * lalu menghitung tinggi badan anak berdasarkan rumus yang disesuaikan dengan jenis kelamin.
 * </p>
 * <p>
 * Referensi perhitungan:
 * - Untuk anak laki-laki: (tinggiAyah + tinggiIbu) * 0.54
 * - Untuk anak perempuan: (tinggiAyah + tinggiIbu) * 0.51
 * </p>
 */
public class PerkiraanTinggiBadan3 {

    /**
     * Metode utama yang menjalankan program.
     *
     * @param args argumen baris perintah (tidak digunakan dalam program ini)
     */
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

    /**
     * Menerima input tinggi badan dari pengguna.
     *
     * @param orangTua nama orang tua yang tinggi badannya diminta (contoh: "ayah" atau "ibu")
     * @param scanner  objek Scanner untuk membaca input pengguna
     * @return tinggi badan yang dimasukkan oleh pengguna dalam satuan cm
     */
    public static double inputTinggi(String orangTua, Scanner scanner) {
        System.out.println("Masukkan tinggi " + orangTua + " (dalam cm): ");
        return scanner.nextDouble();
    }

    /**
     * Menghitung perkiraan tinggi badan anak berdasarkan tinggi badan ayah, ibu,
     * dan jenis kelamin anak.
     *
     * @param tinggiAyah   tinggi badan ayah dalam satuan cm
     * @param tinggiIbu    tinggi badan ibu dalam satuan cm
     * @param jenisKelamin jenis kelamin anak, "laki-laki" atau "perempuan"
     * @return perkiraan tinggi badan anak dalam satuan cm
     * <ul>
     *     <li>Jika jenis kelamin adalah "laki-laki", tinggi anak dihitung sebagai (tinggiAyah + tinggiIbu) * 0.54</li>
     *     <li>Jika jenis kelamin adalah "perempuan", tinggi anak dihitung sebagai (tinggiAyah + tinggiIbu) * 0.51</li>
     * </ul>
     */
    public static double hitungTinggiAnak(double tinggiAyah, double tinggiIbu, String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("laki-laki")) {
            return (tinggiAyah + tinggiIbu) * 0.54;
        } else {
            return (tinggiAyah + tinggiIbu) * 0.51;
        }
    }
}
