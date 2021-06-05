/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersewaanMobil;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class PersewaanMobil {

    private String nama,alamat,no;
    int harga,total;
    String merk, warna;

    public void Display() {
        System.out.println("                Welcome To 3N Rent    ");
        System.out.println("     Jl. Bunga Kumis Kucing No.23, Jatimulyo,\n   Kec.Lowokwaru, Kota Malang, Jawa Timur 62975");
        System.out.println("   ============================================");
        System.out.println("               Identitas Penyewa");
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setNomor(String no) {
        this.no = no;
    }
    public String getNomor() {
        return no;
    }

    public void pilih() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kendaraan yang tersedia: ");
        System.out.println(" 1.Alphard \n 2.Fortuner \n 3.Mini Cooper \n 4.HRV");
        System.out.print("Masukkan Pilihan (Angkanya): ");
        int pilih = input.nextInt();
        System.out.println("===============================================");
        switch (pilih) {
            case 1: System.out.println("|             Anda menyewa");
                Mobil Alphard = new Mobil();
                Alphard.setMerk("Alphard");
                System.out.println("|Merk                : " + Alphard.getMerk());
                Alphard.setWarna("Hitam");
                System.out.println("|Warna               : " + Alphard.getWarna());
                Alphard.Mobil(270000);
                Alphard.Mobil(0.1, total);
                break;
            case 2: System.out.println("|             Anda menyewa");
                Mobil Fortuner = new Mobil();
                Fortuner.setMerk("Fortuner");
                System.out.println("|Merk                : " + Fortuner.getMerk());
                Fortuner.setWarna("Abu-Abu");
                System.out.println("|Warna               : " + Fortuner.getWarna());
                Fortuner.Mobil(250000);
                Fortuner.Mobil(0.1, total);
                break;
            case 3: System.out.println("|             Anda menyewa");
                Mobil Cooper = new Mobil();
                Cooper.setMerk("Mini Cooper");
                System.out.println("|Merk                : " + Cooper.getMerk());
                Cooper.setWarna("Merah");
                System.out.println("|Warna               : " + Cooper.getWarna());
                Cooper.Mobil(300000);
                Cooper.Mobil(0.1, total);
                break;
            case 4: System.out.println("|             Anda menyewa");
                Mobil HRV = new Mobil();
                HRV.setMerk("HRV");
                System.out.println("|Merk                : " + HRV.getMerk());
                HRV.setWarna("Putih");
                System.out.println("|Warna               : " + HRV.getWarna());
                HRV.Mobil(150000);
                HRV.Mobil(0.1, total);
                break;
            default:
                System.out.println("Maaf pilihan anda tidak tersedia");
        }
    }

}
