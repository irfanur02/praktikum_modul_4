/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIDaftarMahasiswa extends Irfan07156_Komponen{
    
    public Irfan07156_GUIDaftarMahasiswa() {
        setSize(227, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        labelNamaMenu.setText("Daftar Mahasiswa");
        labelNamaMenu.setBounds(27, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelNamaMenu);
        
        labelNpm.setBounds(30, 70, 150, 30);
        add(labelNpm);
        
        textNpm.setBounds(30, 100, 150, 30);
        add(textNpm);
        
        labelNama.setBounds(30, 130, 150, 30);
        add(labelNama);
        
        textNama.setBounds(30, 160, 150, 30);
        add(textNama);
        
        labelTglLahir.setBounds(30, 190, 150, 30);
        add(labelTglLahir);
        
        textTglLahir.setBounds(30, 220, 150, 30);
        add(textTglLahir);
        
        labelNotelp.setBounds(30, 250, 150, 30);
        add(labelNotelp);
        
        textNotelp.setBounds(30, 280, 150, 30);
        add(textNotelp);
        
        labelPassword.setBounds(30, 310, 150, 30);
        add(labelPassword);
        
        textPassword.setBounds(30, 340, 150, 30);
        add(textPassword);
        
        labelJurusan.setBounds(30, 370, 150, 30);
        add(labelJurusan);
        
        cbPilJurusan.setBounds(30, 400, 150, 30);
        add(cbPilJurusan);
        
        btnDaftar.setText("Daftar");
        btnDaftar.setBounds(30, 460, 150, 30);
        add(btnDaftar);
        
        btnBack.setBounds(30, 500, 150, 30);
        add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
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
                    dispose();
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