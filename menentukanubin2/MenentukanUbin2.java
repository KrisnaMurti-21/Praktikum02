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
public class MenentukanUbin2 {
    
    //Atribut
    double panjang;
    double lebar;
    double luasTanah = 1000000;
    double box;
    double hargaJenis;
    
    //Construtor
    MenentukanUbin2(double p, double l, double b, double HJ){
        this.panjang = p;
        this.lebar = l;
        this.box = b;
        this.hargaJenis = HJ;
    }


    
    //Method
    double luasKeramik(){
        double luasKeramik;
        luasKeramik = this.panjang * this.lebar;
        return luasKeramik;
    }
    
    double ubinDibutuhkan(){
        double ubinDibutuhkan;
        ubinDibutuhkan = this.luasTanah / this.luasKeramik();
        return Math.ceil(ubinDibutuhkan);
    }
    
    double harga(){
        double hargaBox;
        hargaBox = Math.ceil(this.ubinDibutuhkan() / this.box) * hargaJenis;
        return hargaBox;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}
