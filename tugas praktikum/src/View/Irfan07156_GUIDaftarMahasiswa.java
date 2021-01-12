/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Entity.Irfan07156_JurusanEntity;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIDaftarMahasiswa {
    JFrame daftarMhs = new JFrame();
    JLabel labelNpm, labelNama, labelPassword, labelNotelp, labelTglLahir, labelJurusan, labelNamaMenu;
    JTextField textNpm, textNama, textNotelp, textTglLahir;
    JButton btnDaftar, btnBack;
    JPasswordField textPassword;
    JComboBox cbPilJurusan = new JComboBox(Irfan07156_JurusanEntity.jurusan);
    public Irfan07156_GUIDaftarMahasiswa() {
        daftarMhs.setSize(227, 600);
        daftarMhs.setLayout(null);
        daftarMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        daftarMhs.setVisible(true);
        daftarMhs.setLocationRelativeTo(null);
        
        labelNamaMenu = new JLabel("Daftar Mahasiswa");
        labelNamaMenu.setBounds(27, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        daftarMhs.add(labelNamaMenu);
        
        labelNpm = new JLabel("NPM");
        labelNpm.setBounds(30, 70, 150, 30);
        daftarMhs.add(labelNpm);
        
        textNpm = new JTextField();
        textNpm.setBounds(30, 100, 150, 30);
        daftarMhs.add(textNpm);
        
        labelNama = new JLabel("Nama");
        labelNama.setBounds(30, 130, 150, 30);
        daftarMhs.add(labelNama);
        
        textNama = new JTextField();
        textNama.setBounds(30, 160, 150, 30);
        daftarMhs.add(textNama);
        
        labelTglLahir = new JLabel("Tanggal Lahir (dd/MM/yyy)");
        labelTglLahir.setBounds(30, 190, 150, 30);
        daftarMhs.add(labelTglLahir);
        
        textTglLahir = new JTextField();
        textTglLahir.setBounds(30, 220, 150, 30);
        daftarMhs.add(textTglLahir);
        
        labelNotelp = new JLabel("No Telepon");
        labelNotelp.setBounds(30, 250, 150, 30);
        daftarMhs.add(labelNotelp);
        
        textNotelp = new JTextField();
        textNotelp.setBounds(30, 280, 150, 30);
        daftarMhs.add(textNotelp);
        
        labelPassword = new JLabel("Password");
        labelPassword.setBounds(30, 310, 150, 30);
        daftarMhs.add(labelPassword);
        
        textPassword = new JPasswordField();
        textPassword.setBounds(30, 340, 150, 30);
        daftarMhs.add(textPassword);
        
        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(30, 370, 150, 30);
        daftarMhs.add(labelJurusan);
        
        cbPilJurusan.setBounds(30, 400, 150, 30);
        daftarMhs.add(cbPilJurusan);
        
        btnDaftar = new JButton("Daftar");
        btnDaftar.setBounds(30, 460, 150, 30);
        daftarMhs.add(btnDaftar);
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(30, 500, 150, 30);
        daftarMhs.add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                daftarMhs.dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });
        
        btnDaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String npm = textNpm.getText();
                    String nama = textNama.getText();
                    Date tgllahir = new Date(textTglLahir.getText());
                    String notelp = textNotelp.getText();
                    String pass = textPassword.getText();
                    int indexJurusan = cbPilJurusan.getSelectedIndex();
                    Irfan07156_AllObjekController.mahasiswa.insertDataMahasiswa(npm, nama, tgllahir, indexJurusan, notelp, pass);
                    JOptionPane.showMessageDialog(null, "Registrasi Berhasil", "Information", JOptionPane.INFORMATION_MESSAGE);
                    daftarMhs.dispose();
                    Irfan07156_GUI menuUtama = new Irfan07156_GUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }
            }
        });
    }
    
    void kosong() {
        textNpm.setText(null);
        textNama.setText(null);
        textNotelp.setText(null);
        textTglLahir.setText(null);
        textPassword.setText(null);
        cbPilJurusan.setSelectedIndex(0);
    }
}