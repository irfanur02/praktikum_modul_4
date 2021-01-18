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
    JPasswordField textPassword = new JPasswordField();
    JComboBox cbPilJurusan = new JComboBox(Irfan07156_JurusanEntity.jurusan);
    JTextArea areaDataMhs = new JTextArea();
    
    
    JLabel labelNamaMenu = new JLabel();
    JLabel labelNpm = new JLabel("NPM");
    JLabel labelNama = new JLabel("Nama");
    JLabel labelTglLahir = new JLabel("Tanggal Lahir (dd/MM/yyyy)");
    JLabel labelNotelp = new JLabel("No Telepon");
    JLabel labelPassword = new JLabel("Passowrd");
    JLabel labelJurusan = new JLabel("Pilih Jurusan");
    JLabel labelMatKul = new JLabel("Mata Kuliah");
    
    
    
    JButton btnBack = new JButton("Kembali");
    
    JButton btnTambahMatkul = new JButton("Tambah Mata Kuliah");
    JButton btnUpdate = new JButton("Update");
    JButton btnEditNpm = new JButton("Edit");
    JButton btnEditNama = new JButton("Edit");
    JButton btnEditTglLahir = new JButton("Edit");
    JButton btnEditNotelp = new JButton("Edit");
    JButton btnEditPassword = new JButton("Edit");
    JButton btnEditJurusan = new JButton("Edit");
    
    JTextField textNpm = new JTextField();
    JTextField textNama = new JTextField();
    JTextField textTglLahir = new JTextField();
    JTextField textNotelp = new JTextField();
}
