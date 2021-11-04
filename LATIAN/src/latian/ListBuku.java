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
public class ListBuku {
    //pemeberian nilai pada array "listBuku" dengan tipe class Buku
    Buku[] listBuku = {
        new Buku(1, "Komedi  ", 6000, 17),
        new Buku(2, "Thriller", 4000, 4),
        new Buku(3, "Fantasi ", 3000, 12),
        new Buku(4, "Sejarah ", 5000, 7),
    };
    
    //method untuk menampilkan data list buku
    public void viewBuku(){
        System.out.println("--- List Buku ---");
        System.out.println("ID \t Judul \t\t Harga \t Stok");
        for (int i = 0; i < listBuku.length; i++) {
            System.out.println(listBuku[i].getIdBuku() + " \t " +
                    listBuku[i].getJudulBuku() + " \t " +
                    listBuku[i].getHarga() + "\t " +
                    listBuku[i].getStok());
        }
    }
    
    public int cariBuku(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].getIdBuku()== id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;        
    }
    
}
