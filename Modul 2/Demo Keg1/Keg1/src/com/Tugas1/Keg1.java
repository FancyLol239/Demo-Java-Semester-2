package com.Tugas1;

import java.util.Scanner;

public class Keg1 {
    Scanner in = new Scanner(System.in);

    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double Hasil;


    public int getNilaiProgdas() {
        return NilaiProgdas;
    }

    public void setNilaiProgdas() {
        this.NilaiProgdas = in.nextInt();
    }

    public int getNilaiKalkulus() {
        return NilaiKalkulus;
    }

    public void setNilaiKalkulus() {
        this.NilaiKalkulus = in.nextInt();
    }

    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public void setNilaiOrkom() {
        this.NilaiOrkom = in.nextInt();
    }

    public static void main(String[] args) {
        Scanner tgs1 = new Scanner(System.in);

        Keg1 tugas = new Keg1();

        System.out.print("Nilai Progdas : ");
        tugas.setNilaiProgdas();

        System.out.print("Nilai Kalkulus : ");
        tugas.setNilaiKalkulus();

        System.out.print("Nilai Orkom : ");
        tugas.setNilaiOrkom();


        System.out.println("\nNilai Anda ");
        System.out.println("Progdas : " + tugas.NilaiProgdas);
        System.out.println("Kalkulus : " + tugas.NilaiKalkulus);
        System.out.println("Orkom : " + tugas.NilaiOrkom);

        double Hasil = (tugas.getNilaiProgdas() + tugas.getNilaiKalkulus() + tugas.getNilaiOrkom()) / 3;
        System.out.print("\nRata Rata : " + Hasil);
        if (Hasil > 70) {
            System.out.println("\nStatus : LULUS");
        } else {
            System.out.println("\nStatus : GAGAL");
        }


    }


}
