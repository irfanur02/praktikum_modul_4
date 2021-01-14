/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entity.Irfan07156_JurusanEntity;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author irfan
 */
public class Irfan07156_Komponen extends JFrame{
    JFrame menuUtama = new JFrame();
    JFrame loginMhs = new JFrame();
    JFrame daftarMhs = new JFrame();
    JFrame profileMhs = new JFrame();
    JFrame rencanaMaktul = new JFrame();
    JFrame updateMhs = new JFrame();
    JTable tabelMhs = new JTable();
    JScrollPane scrollTabelMhs = new JScrollPane(tabelMhs);
    JPasswordField textPassword = new JPasswordField();
    JComboBox cbPilJurusan = new JComboBox(Irfan07156_JurusanEntity.jurusan);
    JTextArea areaDataMhs = new JTextArea();
    JLabel labelNamaAplikasi = new JLabel("Program Pendataan Mahasiswa");
    JLabel labelUbahData = new JLabel("Ubah Data Mahasiswa");
    JLabel labelNamaMenu = new JLabel();
    JLabel labelNpm = new JLabel("NPM");
    JLabel labelNama = new JLabel("Nama");
    JLabel labelTglLahir = new JLabel("Tanggal Lahir (dd/MM/yyyy)");
    JLabel labelNotelp = new JLabel("No Telepon");
    JLabel labelPassword = new JLabel("Passowrd");
    JLabel labelJurusan = new JLabel("Pilih Jurusan");
    JLabel labelMatKul = new JLabel("Mata Kuliah");
    JButton btnLoginMhs = new JButton("Login Mahasiswa");
    JButton btnEditMhs = new JButton("Edit");
    JButton btnHapusMhs = new JButton("Hapus");
    JButton btnBack = new JButton("Kembali");
    JButton btnDaftar = new JButton();
    JButton btnTambahMatkul = new JButton("Tambah Mata Kuliah");
    JButton btnUpdate = new JButton("Update");
    JButton btnEditNpm = new JButton("Edit");
    JButton btnEditNama = new JButton("Edit");
    JButton btnEditTglLahir = new JButton("Edit");
    JButton btnEditNotelp = new JButton("Edit");
    JButton btnEditPassword = new JButton("Edit");
    JButton btnEditJurusan = new JButton("Edit");
    JTextField textUbahData = new JTextField("Index");
    JTextField textNpm = new JTextField();
    JTextField textNama = new JTextField();
    JTextField textTglLahir = new JTextField();
    JTextField textNotelp = new JTextField();
}
