/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author User
 */
public class Irfan07156_MahasiswaEntity extends Irfan07156_ManusiaEntity{
    private String npm, password, no_telp;
    private int index_jurusan;
    
    public Irfan07156_MahasiswaEntity() {
        
    }
    
    @Override
    public Date getTglLahir() {
        return tglLahir;
    }
    
    @Override
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIndex_jurusan() {
        return index_jurusan;
    }

    public void setIndex_jurusan(int index_jurusan) {
        this.index_jurusan = index_jurusan;
    }
}
