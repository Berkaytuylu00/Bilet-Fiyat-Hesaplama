package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafe, yaş ve yolculuk tipi bilgilerini alın
        System.out.print("Mesafe (KM): ");
        double mesafe = scanner.nextDouble();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk Tipi (1 - Tek Yön, 2 - Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            // Mesafe başına ücret
            double ucret = mesafe * 0.10;
            // Yaşa göre indirimler
            if (yas < 12) {
                ucret *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                ucret *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                ucret *= 0.7; // %30 indirim
            }
            
            // Yolculuk tipine göre indirim
            if (yolculukTipi == 2) {
                ucret *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Bilet Fiyatı: " + ucret + " TL");
        }

    }
}
