/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan26;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        Date tanggalSekarang = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy HH.mm.ss");
        String tanggalFormat = dateFormat.format(tanggalSekarang);

        System.out.println("Hari ini adalah hari : " + tanggalFormat);
        System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }
  
    }

