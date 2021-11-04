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
public class ListSiswa{
    //pemeberian nilai pada array "listSiswa" dengan tipe class Siswa
    Siswa[] listSiswa = {
        new Siswa(1, "Hana", "Malang", "082134758906", true),
        new Siswa(2, "Erin", "Sidoarjo", "081234637489", true),
        new Siswa(3, "Nanda", "Bekasi", "081364738294", true),
        new Siswa(4, "Kio",   "Malang", "082132636045", true )
    };
    
    //method untuk menampilkan data list siswa
    public void viewSiswa(){
        System.out.println("--- List Siswa ---");
        System.out.println("ID \t Nama \t\t Alamat \t Telepon \t Status");
        for (int i = 0; i < listSiswa.length; i++) {
            System.out.println(listSiswa[i].getIdSiswa() +" \t "+
                    listSiswa[i].getNama()+" \t\t "+
                    listSiswa[i].getAlamat() +" \t "+
                    listSiswa[i].getTelepon()+ "\t " +
                    listSiswa[i].getStatus());
        }
    }
    
    public int cariSiswa(int id){
        int found = 0;
        //pencarian data berdasarkan id
        for (int i = 1; i < listSiswa.length; i++) {
            if (listSiswa[i].getIdSiswa() == id) {
                found = i; 
                //menyimpan nilai index dari data yg ditemukan
            }
        }
        return found;
    }
    
    
}
