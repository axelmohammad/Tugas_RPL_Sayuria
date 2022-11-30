/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sayuria;

/**
 *
 * @author User
 */
public class Pembeli{
    private int id_pembeli;
    private String nama_pembeli;
    private String alamat_pembeli;
    private String email_pembeli;
    protected String passowrd_pembeli;
    private int no_telp;
    
    //Agregasi
    private Keranjang_Belanja keranjang_belanja;
    
    private Pembayaran pembayaran;

    public Pembeli(int id_pembeli, String nama_pembeli, String alamat_pembeli, String email_pembeli, String passowrd_pembeli, int no_telp) {
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat_pembeli = alamat_pembeli;
        this.email_pembeli = email_pembeli;
        this.passowrd_pembeli = passowrd_pembeli;
        this.no_telp = no_telp;
    }
    public void login(){
        
    }

    public String get_nama_pembeli() {
        return nama_pembeli;
    }
    public void membeli_sayur(){
        
    }
    public void membayar_sayur(){
        
    }
    public void beli_sayur() {
        
    }
    public void edit_keranjang(){
        
    }
    public void cari_sayur(){
        
    }
    public void logout(){
        
    }

    public Keranjang_Belanja getKeranjang_belanja() {
        return keranjang_belanja;
    }
    
    public void setKeranjang_belanja(Keranjang_Belanja keranjang_belanja) {
        this.keranjang_belanja = new Keranjang_Belanja(keranjang_belanja.getId_keranjang_belanja(), keranjang_belanja.getJumlah_sayur(), keranjang_belanja.getTotal_harga());
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }
    
    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = new Pembayaran(pembayaran.getJumlah_pembayaran());
    }
    
        
    
}
