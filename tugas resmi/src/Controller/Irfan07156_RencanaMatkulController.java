/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Irfan07156_MahasiswaEntity;
import Entity.Irfan07156_RencanaMatkulEntity;
import Model.Irfan07156_RencanaMatkulModel;
import java.util.ArrayList;

/**
 *
 * @author irfan
 */
public class Irfan07156_RencanaMatkulController {

    public Irfan07156_RencanaMatkulModel rencanaMatKulModel = new Irfan07156_RencanaMatkulModel();
    public Irfan07156_RencanaMatkulEntity rencanaMatkulEntity = new Irfan07156_RencanaMatkulEntity();

    public void insertMatkul(int pilMatKul, int index_mhs) {
        if (size() == 0) {
            rencanaMatkulEntity.setMatkul(pilMatKul, index_mhs);
            rencanaMatkulEntity.setMahasiswa(getDataMahasiswa(index_mhs));
            rencanaMatKulModel.insertRencanaMatkul(rencanaMatkulEntity);
        } else {
            if (showRencanaMatkul(index_mhs) == null) {
                rencanaMatkulEntity.setMatkul(pilMatKul, index_mhs);
                rencanaMatkulEntity.setMahasiswa(getDataMahasiswa(index_mhs));
                rencanaMatKulModel.insertRencanaMatkul(rencanaMatkulEntity);
            }
        }
    }

    public void tambahMatkul(int pilMatKul, int index_mhs) {
        rencanaMatkulEntity.setMatkul(pilMatKul, index_mhs);
    }

    public Irfan07156_MahasiswaEntity getDataMahasiswa(int index) {
        return Irfan07156_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }

    public Irfan07156_RencanaMatkulEntity showRencanaMatkul(int indexMahasiswa) {
        try {
            return rencanaMatKulModel.getRencanaMatkulArrayList(indexMahasiswa);
        } catch (Exception e) {
            return null;
        }
    }

    public void hapus(int indexMahasiswa) {
        rencanaMatKulModel.hapusRencanaMatKul(indexMahasiswa);
    }

    public int size() {
        return rencanaMatKulModel.size();
    }
}
