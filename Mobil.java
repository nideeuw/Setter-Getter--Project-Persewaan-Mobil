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
public class Mobil extends PersewaanMobil {

    int hari;
    double bayar,kembalian,diskon;
    boolean cek = true;

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setWarna(String warna) {
        super.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void Mobil(int harga) {
        super.harga = harga;
        System.out.println("|Biaya sewa          : Rp " + harga + "/hari");
    }

    public void Mobil(double diskon, int total) {
        this.diskon = diskon;
        super.total = total;

        Scanner input = new Scanner(System.in);
        System.out.print("|Lama sewa           : ");
        hari = input.nextInt();
        total = hari * harga;
        diskon = diskon * total;
        double total1 = total - diskon;
        System.out.println("|Total               : Rp " + total);
        System.out.println("|    Mendapat diskon 10%");
        System.out.println("|Total setelah diskon: Rp " + total1);
        System.out.print("|Bayar               : Rp ");
        bayar = input.nextInt();
        if (bayar >= total1) {
            kembalian = bayar - total1;
            System.out.println("|Kembalian           : Rp " + kembalian);
        } else {
            System.out.println("|    Maaf Nominal Anda Kurang");
            System.out.println("|Nominal Anda Kurang : Rp " + (total1 - bayar));
        }
    }

    public void pilih() {
        Scanner input = new Scanner(System.in);

        while (cek) {
            System.out.print("\nApakah anda ingin memilih lagi? (Ya/Tidak) =>");
            String jawab = input.next();
            if (jawab.equalsIgnoreCase("Ya")) {
                cek = true;
                super.pilih();
            } else {
                cek = false;
                System.out.println("\n================================================");
                System.out.println("          TERIMAKASIH TELAH MENYEWA \n               ENJOY YOUR RIDE");
                System.out.println("================================================");
            }
        }
    }
}
