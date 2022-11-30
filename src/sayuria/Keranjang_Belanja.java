/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayuria;

/**
 *
 * @author User
 */
public class Keranjang_Belanja {
    private int id_keranjang_belanja;
    private int total_harga;
    private int jumlah_sayur;

    public Keranjang_Belanja(int id_keranjang_belanja, int total_harga, int jumlah_sayur) {
        this.id_keranjang_belanja = id_keranjang_belanja;
        this.total_harga = total_harga;
        this.jumlah_sayur = jumlah_sayur;
    }
    
    

    public int getId_keranjang_belanja() {
        return id_keranjang_belanja;
    }


    public int getTotal_harga() {
        return total_harga;
    }


    public int getJumlah_sayur() {
        return jumlah_sayur;
    }

    
    
    
}
