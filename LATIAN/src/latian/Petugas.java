/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latian;

import java.util.ArrayList;

public class Petugas implements User {
     private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
 
    public Petugas() {
        this.namaKaryawan.add("Aika Kiyowo");
        this.alamat.add("Malang");
        this.telepon.add("081112432533");
        this.jabatan.add(0);
 }                         //parameter 
    public void setJabatan(int jabatan ){
        this.jabatan.add(jabatan);
 }
    public int getJabatan(int id){
        return this.jabatan.get(id);
 } 
    @Override
    public void setNama(String namaKaryawan ){
        this.namaKaryawan.add(namaKaryawan);
 }
 
    @Override
    public void setAlamat(String alamat ){
        this.namaKaryawan.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.namaKaryawan.add(telepon);
 }
 
 @Override
 public String getNama(int idKaryawan){
 return this.namaKaryawan.get(idKaryawan);
 }
 
 @Override
 public String getAlamat(int idKaryawan){
    return this.alamat.get(idKaryawan);
 }
 
 @Override
 public String getTelepon(int idKaryawan){
    return this.telepon.get(idKaryawan);
 } 
}

