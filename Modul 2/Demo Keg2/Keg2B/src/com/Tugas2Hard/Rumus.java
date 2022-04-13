package com.Tugas2Hard;
import java.util.Scanner;

public class Rumus {
    Scanner rms = new Scanner(System.in);

    private int diagonal1;
    private int diagonal2;
    private int sisi;
    private int luas;
    private int keliling;
    private char pilihan;
    private int input;

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1() {
        this.diagonal1 = rms.nextInt();
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2() {
        this.diagonal2 = rms.nextInt();
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi() {
        this.sisi = rms.nextInt();
    }

    public char getPilihan() {
        return pilihan;
    }

    public void setPilihan() {
        this.pilihan = rms.next().charAt(0);
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public void rumusluas(){
        System.out.print("Input Diagonal 1 : ");
        setDiagonal1();
        System.out.print("Input Diagonal 2 : ");
        setDiagonal2();
        float luas = (getDiagonal1() * getDiagonal2() * 1/2);
        System.out.print("Hasil : " + luas);
    }

    public void rumuskeliling(){
        System.out.print("Input sisi : ");
        setSisi();
        float keliling = (getSisi() * 4);
        System.out.print("Hasil : " + keliling);
    }

    public void exit(){
        System.out.println("Terimakasih Telah Menggunakan Program Kami");
    }

    public void menu(){
        System.out.println("Pilihan : \n1.Keliling Ketupat\n2.Luas Ketupat\n3.Exit");
        System.out.print("NO : ");
        setPilihan();

        switch (getPilihan()) {
            case '1':
                rumusluas();
                System.out.println("\nJika Ingin kembali [Y] / Jika tidak [T]");
                input = rms.next().charAt(0);
                if (input == 'y' || input == 'Y') {
                    menu();
                } else {
                    exit();
                }
                break;

            case '2':
                rumuskeliling();
                System.out.println("\nJika Ingin kembali [Y] / Jika tidak [T]");
                input = rms.next().charAt(0);
                if (input == 'y' || input == 'Y') {
                    menu();
                } else {
                    exit();
                }
                break;

            case '3' :
            default :
                exit();
                break;
        }
    }
}
