/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersewaanMobil;


/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // jadwal buka persewaannya,harga,tanggal,durasi persewaan,asuransi,denda
        PersewaanMobil sewa = new PersewaanMobil();
        sewa.Display();
        sewa.setNama("Naswa Nida");
        System.out.println("Nama        : "+sewa.getNama());
        sewa.setAlamat("Jalan Candi Mendut Utara No.2");
        System.out.println("Alamat      : "+sewa.getAlamat());
        sewa.setNomor("081218887436");
        System.out.println("No Telepon  : "+sewa.getNomor());
        System.out.println("===============================================");
        sewa.pilih();
        
        Mobil barang = new Mobil();
        barang.pilih();
    }
    
}
