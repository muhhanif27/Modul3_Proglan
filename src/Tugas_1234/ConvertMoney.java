package Tugas_1234;

import java.util.Scanner;


public class ConvertMoney {


    /**
     * konstanta kurdollar
     */
    private static final double kursDollar = 15000.0;


    /**
     * fungsi main
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Dollar: ");
        double dollar = scanner.nextDouble();

        double rupiah = konversiDollarKeRupiah(dollar);

        System.out.println(dollar + " Dollar setara dengan " + rupiah + " Rupiah.");
    }

    /**
     *
     * @param dollar
     * @return penjumlahan konversi
     */
    public static double konversiDollarKeRupiah(double dollar) {
        return dollar * kursDollar;
    }
}