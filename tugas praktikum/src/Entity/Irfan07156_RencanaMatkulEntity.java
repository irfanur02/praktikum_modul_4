/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author irfan
 */
public class Irfan07156_RencanaMatkulEntity {
    private Irfan07156_MahasiswaEntity mahasiswa;
    private ArrayList<ArrayList<Integer>> matKul = new ArrayList<ArrayList<Integer>>();
    
    public Irfan07156_RencanaMatkulEntity() {
    }

    public Irfan07156_MahasiswaEntity getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Irfan07156_MahasiswaEntity mahasiswa ) {
        this.mahasiswa = mahasiswa;
    }

    public ArrayList<ArrayList<Integer>> getMatkul() {
        return matKul;
    }
    
    public void setMatkul(int matkul, int index_mhs) {
        matKul.add(new ArrayList<>());
        this.matKul.get(index_mhs).add(matkul);
    }
}
