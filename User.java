package modul1;

import java.util.Scanner;

class Mahasiswa {

    Scanner input = new Scanner(System.in);

    private String Nama;
    private String Nim;
    private String Password;

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public String getNama() {
        return Nama;
    }
    //NIM
    public void setNim(String Nim) {
        this.Nim = Nim;
    }
    public String getNim() {
        return Nim;
    }
    //Password
    public void setPassword(String Password) {
        this.Password = Password;
    }
    public String getPassword() {
        return Password;
    }

    public void daftar(){
        System.out.println("=== daftar ===");
        System.out.print("Nama: " );
        Nama = input.nextLine();
        setNama(Nama);

        System.out.print("NIM: ");
        Nim = input.nextLine();
        setNim(Nim);
            if (Nim.length() != 15) {
                System.out.println("Nim harus berjumlah 15 angka");
                System.out.print("Nim : ");
                Nim = input.nextLine();
            } else {
                this.Nim = Nim;
            }

        System.out.print("Password: ");
        Password = input.nextLine();
        setPassword(Password);
            if (Password.length() < 8) {
                System.out.println("Password minimal 8 karakter");
                System.out.print("Password : ");
                Password = input.nextLine();
            } else {
                this.Password = Password;
            }

        System.out.println("==============================================");
        System.out.println("Selamat " + getNama() + " Anda berhasil daftar");
        System.out.println("Berikut Username dan Password anda : ");
        System.out.println("Username: " + getNim());
        System.out.println("Password " + getPassword());
        System.out.println("==============================================");

    }
}

public class User {
    public static void main(String[] args) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.daftar();
    }
}