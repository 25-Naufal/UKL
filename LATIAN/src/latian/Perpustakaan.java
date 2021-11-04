/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian;

import java.util.Scanner;

/**
 *
 * @author Naufal Rafif
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pembuatan untuk menangani input dari user
        Scanner input = new Scanner(System.in);
        Scanner uangsewa = new Scanner (System.in);
        
        //membuat variable utk mengondisikan program masih berjalan atau berhenti
        boolean stay = true;
        
        //variabel utk menyimpan input user
        String key;
        
        siswaInhe test1 = new siswaInhe();
        NewClass test2 = new NewClass();
        
        //pembuat object berisi data petugas
        Petugas petugas = new Petugas();
        
        //pembuatan object yg berisi daftar buku
        ListBuku listBuku = new ListBuku();
        test1.test();
        test2.test();
        //pembuatan object yg berisi daftar siswa
        ListSiswa listSiswa = new ListSiswa();
        System.out.println("");
        System.out.println("Halo Nama saya "+petugas.getNama(0));
        System.out.println("Saya dari "+petugas.getAlamat(0));
        System.out.println("Dan ini nomor telepon saya "+petugas.getTelepon(0));
        System.out.println("Saya disini sebagai Karyawan Ark Library");
        System.out.println("--Selamat menikmati--");
        System.out.println("");
        
         //selama nilai "stay" = true maka program terus berjalan
        while (stay) {
            //tampilan menu 
            System.out.println("----Ark Library ---");
            System.out.println("1. List Buku");
            System.out.println("2. List Siswa");
            System.out.println("3. Peminjaman");
            System.out.println("4. Pengembalian");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            
            if (menu == 1) {
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                
                // menampilkan daftar buku
                listBuku.viewBuku();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if(menu == 2){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
               
                //menampilkan daftar siswa
                listSiswa.viewSiswa();
                System.out.println("Press any key and enter...");
                key = input.next();
            } else if (menu == 3){
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Peminjaman Buku ---");
           
                
                
                /** variabel "selectedIDSiswa" utk menyimpan data id siswa yg dipilih,
                 * variabel "selectedIDBuku" utk menyimpan data id buku yg dipilih
                 */
                int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                
                //"selectedSiswa" menyimpan data client yg dipilih
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];
                
                //Logika percabangan, jika true --> lanjut
                if (selectedSiswa.isStatus()) {
                    
 
                            
                    //menampilkan data buku
                    listBuku.viewBuku();

                    System.out.print("Pilih ID buku yang dipinjam: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);

                    //"selectedBuku" menyimpan data client yg dipilih
                    Buku selectedBuku = listBuku.listBuku[foundIndex];
                    
                    //masukkan uang siswa
                    System.out.println("Masukkan Uang : Rp.");
                    int uang = uangsewa.nextInt();
                    
                if (uang < selectedBuku.getHarga()) {
                    System.out.println("Maaf, uang anda tidak cukup");
                        
                    
                    }else if (uang >= selectedBuku.getHarga()) {
                        //proses perubahan status siswa
                        listSiswa.listSiswa[foundIndex].changeStatus();
                    System.out.println("--- List Peminjaman ---");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Kembalian: Rp." + (uang - selectedBuku.getHarga()));
                    System.out.println("Peminjam: " + selectedSiswa.getNama());

                    //proses pengurangan stok
                    listBuku.listBuku[foundIndex].kurangiStok();
                    } else {
                    System.out.println("Maaf anda masih punya tanggungan buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();
                }
            } else if (menu == 4){  
                System.out.println("---------------------------");
                System.out.println("---------------------------\n");
                System.out.println("--- Pengembalian Buku ---");
                
                 int selectedIDSiswa, selectedIDBuku;
                
                System.out.print("Masukkan ID Siswa: ");
                selectedIDSiswa = input.nextInt();
                
                //"foundIndex" menyimpan posisi index dari data siswa yg dipilih
                int foundIndex = listSiswa.cariSiswa(selectedIDSiswa);
                
                //"selectedSiswa" menyimpan data client yg dipilih
                Siswa selectedSiswa = listSiswa.listSiswa[foundIndex];


//Logika percabangan, jika false --> lanjut
                if (selectedSiswa.isStatus() == false) {
                    //proses perubahan status siswa
                    listSiswa.listSiswa[foundIndex].changeStatus();
                            
                    //menampilkan data buku
                    listBuku.viewBuku();

                    System.out.print("Pilih ID buku akan dikembalikan: ");
                    selectedIDBuku = input.nextInt();
                    foundIndex = listBuku.cariBuku(selectedIDBuku);

                    //"selectedBuku" menyimpan data client yg dipilih
                    Buku selectedBuku = listBuku.listBuku[foundIndex];

                    System.out.println("--- List Pengembalian ---");
                    System.out.println("Judul Buku: " + selectedBuku.getJudulBuku());
                    System.out.println("Peminjam: " + selectedSiswa.getNama());

                    //proses pengurangan stok
                    listBuku.listBuku[foundIndex].tambahiStok();
                    
                    
                } else {
                    System.out.println("Maaf anda belum meminjam buku");
                }
                
                System.out.println("Press any key and enter...");
                key = input.next();

            } else if(menu == 5){
                System.out.println("Program end");
                //variabel "stay" diset false menyebabkan program berhenti
                stay = false;
            }
        }
    }
    
}
