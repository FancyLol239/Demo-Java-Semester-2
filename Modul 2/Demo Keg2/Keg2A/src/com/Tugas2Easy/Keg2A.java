package com.Tugas2Easy;
import java.util.Scanner;

public class Keg2A {

    private int hari;
    private int jam;
    private int menit;
    private int detik;
    private int bulan;

    public void setBulan(int bulan){
        this.bulan = bulan;
    }

    public void convert(){
        hari = bulan* 30;
        jam = hari*24;
        menit = jam*60;
        detik = menit*60;
    }

    public void menu(){
        System.out.println("\nHasil Konversi\n");
        System.out.println(bulan + " Bulan sama dengan : " + hari + " Hari");
        System.out.println(bulan + " Bulan sama dengan : " + jam + " Jam");
        System.out.println(bulan + " Bulan sama dengan : " + menit + " Menit");
        System.out.println(bulan + " Bulan sama dengan : " + detik + " Detik");
    }

    public static void main(String [] args){
    Scanner tgs2A = new Scanner(System.in);
    Keg2A tugas = new Keg2A();
    int bulan;

    System.out.println("Konversi Waktu Bulan ke- (Hari, Jam, Menit, Detik)");
    System.out.print("Masukkan Waktu Bulan : ");
    bulan = tgs2A.nextInt();
    tugas.setBulan(bulan);
    tugas.convert();
    tugas.menu();

    }

}
