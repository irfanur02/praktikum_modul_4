/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Irfan07156_RencanaMatkulEntity;
import Entity.Irfan07156_MahasiswaEntity;
import Entity.Irfan07156_JurusanEntity;
import Entity.Irfan07156_MataKuliahEntity;
import java.util.ArrayList;

/**
 *
 * @author irfan
 */
public class Irfan07156_RencanaMatkulModel {

    private ArrayList<Irfan07156_RencanaMatkulEntity> rencanaMatkulArrayList;

    public Irfan07156_RencanaMatkulModel() {
        rencanaMatkulArrayList = new ArrayList<Irfan07156_RencanaMatkulEntity>();
    }

    public void insertRencanaMatkul(Irfan07156_RencanaMatkulEntity rencanaMatkulEntity) {
        rencanaMatkulArrayList.add(rencanaMatkulEntity);
    }

    public Irfan07156_RencanaMatkulEntity getRencanaMatkulArrayList(int indexMahasiswa) {
        return rencanaMatkulArrayList.get(indexMahasiswa);
    }

    public void hapusRencanaMatKul(int indexMahasiswa) {
        rencanaMatkulArrayList.remove(indexMahasiswa).getMatkul().remove(indexMahasiswa);
    }

    public int size() {
        return rencanaMatkulArrayList.size();
    }
    
    public void tambahMatkul(int pilMatkul, int indexMahasiswa) {
        getRencanaMatkulArrayList(indexMahasiswa).setMatkul(pilMatkul, indexMahasiswa);
    }
}
