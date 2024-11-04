/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class WarnaKepribadian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println("MERAH");
        System.out.println("HIJAU");
        System.out.println("KUNING");
        System.out.println("BIRU");
        System.out.println("UNGU");

        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();

        System.out.print("NAMA KAMU: ");
        String nama = scanner.nextLine();

        System.out.println("\n====HASIL TEST KEPRIBADIAN " + nama + "====");
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);

        switch (warnaFavorit) {
            case "MERAH":
                System.out.println("1. Pemberani");
                System.out.println("2. Berani mengambil risiko");
                System.out.println("3. Penuh semangat");
                System.out.println("4. Mudah marah");
                System.out.println("5. Kurang sabar");
                break;
            case "HIJAU":
                System.out.println("1. Tenang");
                System.out.println("2. Sabar");
                System.out.println("3. Ramah");
                System.out.println("4. Penyayang");
                System.out.println("5. Suka menolong");
                break;
            case "KUNING":
                System.out.println("1. Ceria");
                System.out.println("2. Optimis");
                System.out.println("3. Kreatif");
                System.out.println("4. Suka bersenang-senang");
                System.out.println("5. Kadang kurang fokus");
                break;
            case "BIRU":
                System.out.println("1. Menyenangkan");
                System.out.println("2. Bijaksana");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah");
                System.out.println("4. Dinamis");
                System.out.println("5. Senang berbagi");
                System.out.println("6. Bersahabat");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang");
                System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai");
                break;
            case "UNGU":
                System.out.println("1. Kreatif");
                System.out.println("2. Imajinatif");
                System.out.println("3. Intuitif");
                System.out.println("4. Misterius");
                System.out.println("5. Sensitif");
                break;
            default:
                System.out.println("Warna tidak valid.");
        }
    }
}
