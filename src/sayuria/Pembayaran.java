/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayuria;

/**
 *
 * @author User
 */
public class Pembayaran implements Toko_Sayur{
    private int id_keranjang_belanja;
    private int id_pembeli;
    private String nama_pembeli;
    private int jumlah_pembayaran;

    public Pembayaran(int id_pembeli, int id_keranjang_belanja, String nama_pembeli, int jumlah_pembayaran) {
        this.id_keranjang_belanja = id_keranjang_belanja;
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.jumlah_pembayaran = jumlah_pembayaran;
    }

    Pembayaran(int jumlah_pembayaran) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getJumlah_pembayaran() {
        return jumlah_pembayaran;
    }

    @Override
    public void get_nama_sayur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void get_harga_sayur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void get_stock_sayur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
