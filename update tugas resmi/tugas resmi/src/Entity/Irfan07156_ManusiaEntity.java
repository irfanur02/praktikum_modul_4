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
public class Irfan07156_ManusiaEntity {
    protected String nama;
    protected Date tglLahir;

    public Irfan07156_ManusiaEntity(String nama, Date tgl_lahir) {
        this.nama = nama;
        this.tglLahir = tgl_lahir;
    }
    
    public Irfan07156_ManusiaEntity() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
}
