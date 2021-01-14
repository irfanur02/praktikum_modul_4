/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Irfan07156_MahasiswaEntity;
import Entity.Irfan07156_JurusanEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author irfan
 */
public class Irfan07156_MahasiswaController {
    int indexLogin;
    public Irfan07156_MahasiswaEntity getDataMahasiswa(int index) {
        return Irfan07156_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }
    
    public int login(String npm, String password) {
        return Irfan07156_AllObjectModel.mahasiswa.cekMahasiswa(npm, password);
    }
    
    public Irfan07156_MahasiswaEntity mahasiswaEntity(int index) {
        return Irfan07156_AllObjectModel.mahasiswa.getProfileMahasiswa(index);
    }
    
    public void insertDataMahasiswa(String npm, String nama, Date tanggal_lahir, int index_jurusan, String no_telp, String password) {
        Irfan07156_MahasiswaEntity mahasiswa = new Irfan07156_MahasiswaEntity();
        mahasiswa.setNpm(npm);
        mahasiswa.setNama(nama);
        mahasiswa.setTglLahir(tanggal_lahir);
        mahasiswa.setIndex_jurusan(index_jurusan);
        mahasiswa.setNo_telp(no_telp);
        mahasiswa.setPassword(password);
        Irfan07156_AllObjectModel.mahasiswa.insertMahasiswaModel(mahasiswa);
    }
    
    public void deleteDataMahasiswa(int index) {
        Irfan07156_AllObjectModel.mahasiswa.hapusMahasiswaModel(index);
    }
    
    public ArrayList<Irfan07156_MahasiswaEntity> getDataMahasiswa() {
        return Irfan07156_AllObjectModel.mahasiswa.getAllMahasiswa();
    }
    
    public void updateDataMahasiswa(int index, String data, String ubah, String tipe) throws ParseException {
        switch(tipe) {
            case "string" :
                switch(ubah) {
                    case "npm":
                        Irfan07156_AllObjectModel.mahasiswa.editNpmMahasiswaModel(index, data);
                        break;
                    case "nama":
                        Irfan07156_AllObjectModel.mahasiswa.editNamaMahasiswaModel(index, data);
                        break;
                    case "noTelp":
                        Irfan07156_AllObjectModel.mahasiswa.editNoTelpMahasiswaModel(index, data);
                        break;
                    case "password":
                        Irfan07156_AllObjectModel.mahasiswa.editPasswordMahasiswaModel(index, data);
                        break;
                }
                break;
            case "date" :
                Irfan07156_AllObjectModel.mahasiswa.editMahasiswaModel(index, new SimpleDateFormat("dd/MM/yyyy").parse(data));
                break;
            case "int":
                Irfan07156_AllObjectModel.mahasiswa.editMahasiswaModel(index, Integer.parseInt(data));
                break;
        }
    }
    
    public DefaultTableModel dataTabelMhs(){
        DefaultTableModel dtmMhs = new DefaultTableModel();
        Object[] kolom = {"index", "NPM", "Nama", "Jurusan"};
        dtmMhs.setColumnIdentifiers(kolom);
        int size = Irfan07156_AllObjectModel.mahasiswa.getAllMahasiswa().size();
        for (int i = 0; i < size; i++) {
            Object[] data = new Object[4];
            data[0] = String.valueOf(i);
            data[1] = Irfan07156_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNpm();
            data[2] = Irfan07156_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getNama();
            data[3] = Irfan07156_JurusanEntity.jurusan[Irfan07156_AllObjectModel.mahasiswa.getAllMahasiswa().get(i).getIndex_jurusan()];
            dtmMhs.addRow(data);
        }
        return dtmMhs;
    }
}
