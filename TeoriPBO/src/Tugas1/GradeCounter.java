/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Fitri Fauziyah
 */
public class GradeCounter {
    public static void main(String[] args) {
        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        char grade;
        String nim, nama;
        Scanner input = new Scanner(System.in);
        
        System.out.println("--GRADE COUNTER--\n");
        System.out.print("NIM        : ");
        nim = input.nextLine();
        System.out.print("nama       : ");
        nama = input.nextLine();
        System.out.println("\nSilakan masukkan nilai berikut.");
        System.out.print("nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("nilai UTS  : ");
        nilaiUTS = input.nextDouble();
        System.out.print("nilai UAS  : ");
        nilaiUAS = input.nextDouble();
        nilaiAkhir = 0.2 * nilaiTugas + 0.35 * nilaiUTS + 0.45 * nilaiUAS;
        
        if(nilaiAkhir >= 85)
            grade = 'A';
        else if (nilaiAkhir >= 75 && nilaiAkhir <= 84)
            grade = 'B';
        else if (nilaiAkhir >= 65 && nilaiAkhir <= 74)
            grade = 'C';
        else if (nilaiAkhir >= 49 && nilaiAkhir <= 64)
            grade = 'D';
        else
            grade = 'E';
        System.out.println("\nNIM        : " + nim);
        System.out.println("nama       : " + nama);
        System.out.println("hasil      : Predikat '" + grade + "' dengan nilai akhir " + nilaiAkhir);
    }
}
