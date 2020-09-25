/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukanubin2;

/**
 *
 * @author Lenovo
 */
public class TotalHarga {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MenentukanUbin2 HU1 = new MenentukanUbin2(30, 30, 10, 54000);
        System.out.println("Keramik Jenis A");
        System.out.println("Panjang:" + HU1.panjang + " ,Lebar:" + HU1.lebar);
        System.out.println("Harga dari keramik Jenis A:" + HU1.hargaJenis);
        System.out.println("Luas Keramik:" + HU1.luasKeramik());
        System.out.println("Ubin yang dibutuhkan sebanyak:" + HU1.ubinDibutuhkan());
        System.out.println("Total harga dari Keramik Jenis A yang dibutuhkan:" + HU1.harga());
        
        MenentukanUbin2 HU2 = new MenentukanUbin2(40, 40, 5, 65000);
        System.out.println("Keramik Jenis B");
        System.out.println("Panjang:" + HU2.panjang + " ,Lebar:" + HU2.lebar);
        System.out.println("Harga dari keramik Jenis B:" + HU2.hargaJenis);
        System.out.println("Luas Keramik:" + HU2.luasKeramik());
        System.out.println("Ubin yang dibutuhkan sebanyak:" + HU2.ubinDibutuhkan());
        System.out.println("Total harga dari Keramik Jenis B yang dibutuhkan:" + HU2.harga());
        
        MenentukanUbin2 HU3 = new MenentukanUbin2(30, 40, 8, 60000);
        System.out.println("Keramik Jenis B");
        System.out.println("Panjang:" + HU3.panjang + " ,Lebar:" + HU3.lebar);
        System.out.println("Harga dari keramik Jenis A:" + HU3.hargaJenis);
        System.out.println("Luas Keramik:" + HU3.luasKeramik());
        System.out.println("Ubin yang dibutuhkan sebanyak:" + HU3.ubinDibutuhkan());
        System.out.println("Total harga dari Keramik Jenis A yang dibutuhkan:" + HU3.harga());
    }
}
