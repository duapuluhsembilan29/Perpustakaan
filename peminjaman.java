
package Perpusss;

import java.util.ArrayList;

public class Peminjaman {
    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Boolean> statusBuku = new ArrayList<Boolean>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    
    public Peminjaman(){
        addBuku(true);
        addBuku(true);
    }
    
    public void setSiswa(int id){
        this.idSiswa.add(id);
    }
    public void addBuku(boolean status){
        this.statusBuku.add(status);
    }
    public void setBuku(int id, boolean status){
        this.statusBuku.set(id, status);
    }
    public boolean getBuku(int id){
        return this.statusBuku.get(id);
    }
    public void setBanyak(int id){
        this.banyak.add(id);
    }
} 
