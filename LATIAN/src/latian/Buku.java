/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian;

/**
 *
 * @author Naufal Rafif
 */
public class Buku {
    private int idBuku, stok;
    private String judulBuku;
    private int harga;

    public Buku(int idBuku, String judulBuku, int harga, int stok) {
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
        this.harga = harga;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idBuku"
    public int getIdBuku() {
        return idBuku;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "stok"
    public int getStok() {
        return stok;
    }

    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "judulBuku" 
    public String getJudulBuku() {
        return judulBuku;
    }
    
    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "harga" 
    public int getHarga() {
        return harga;
    }
    

    
    // method untuk mengurangi stok sejumlah 1
    public void kurangiStok(){
        this.stok--;
    }
    
    public void tambahiStok(){
        this.stok++;
    }
}
