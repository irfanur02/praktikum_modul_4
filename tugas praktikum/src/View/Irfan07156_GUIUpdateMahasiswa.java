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
import java.text.SimpleDateFormat;
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
public class Irfan07156_GUIUpdateMahasiswa {

    JFrame updateMhs = new JFrame();
    JLabel labelNpm, labelNama, labelPassword, labelNotelp, labelTglLahir, labelJurusan, labelNamaMenu;
    JTextField textNpm, textNama, textNotelp, textTglLahir;
    JButton btnUpdate, btnBack, btnEditNpm, btnEditNama, btnEditTglLahir, btnEditNotelp, btnEditPassword, btnEditJurusan;
    JPasswordField textPassword;
    JComboBox cbPilJurusan = new JComboBox(Irfan07156_JurusanEntity.jurusan);
    boolean edit = false;

    public Irfan07156_GUIUpdateMahasiswa(int index_mhs) {
        updateMhs.setSize(310, 550);
        updateMhs.setLayout(null);
        updateMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        updateMhs.setVisible(true);
        updateMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Update Mahasiswa");
        labelNamaMenu.setBounds(67, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        updateMhs.add(labelNamaMenu);

        labelNpm = new JLabel("NPM");
        labelNpm.setBounds(30, 70, 150, 30);
        updateMhs.add(labelNpm);

        textNpm = new JTextField();
        textNpm.setBounds(30, 100, 150, 30);
        updateMhs.add(textNpm);

        btnEditNpm = new JButton("Edit");
        btnEditNpm.setBounds(210, 100, 55, 30);
        updateMhs.add(btnEditNpm);

        labelNama = new JLabel("Nama");
        labelNama.setBounds(30, 130, 150, 30);
        updateMhs.add(labelNama);

        textNama = new JTextField();
        textNama.setBounds(30, 160, 150, 30);
        updateMhs.add(textNama);

        btnEditNama = new JButton("Edit");
        btnEditNama.setBounds(210, 160, 55, 30);
        updateMhs.add(btnEditNama);

        labelTglLahir = new JLabel("Tanggal Lahir (dd/MM/yyy)");
        labelTglLahir.setBounds(30, 190, 150, 30);
        updateMhs.add(labelTglLahir);

        textTglLahir = new JTextField();
        textTglLahir.setBounds(30, 220, 150, 30);
        updateMhs.add(textTglLahir);

        btnEditTglLahir = new JButton("Edit");
        btnEditTglLahir.setBounds(210, 220, 55, 30);
        updateMhs.add(btnEditTglLahir);

        labelNotelp = new JLabel("No Telepon");
        labelNotelp.setBounds(30, 250, 150, 30);
        updateMhs.add(labelNotelp);

        textNotelp = new JTextField();
        textNotelp.setBounds(30, 280, 150, 30);
        updateMhs.add(textNotelp);

        btnEditNotelp = new JButton("Edit");
        btnEditNotelp.setBounds(210, 280, 55, 30);
        updateMhs.add(btnEditNotelp);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(30, 310, 150, 30);
        updateMhs.add(labelPassword);

        textPassword = new JPasswordField();
        textPassword.setBounds(30, 340, 150, 30);
        updateMhs.add(textPassword);

        btnEditPassword = new JButton("Edit");
        btnEditPassword.setBounds(210, 340, 55, 30);
        updateMhs.add(btnEditPassword);

        labelJurusan = new JLabel("Jurusan");
        labelJurusan.setBounds(30, 370, 150, 30);
        updateMhs.add(labelJurusan);

        cbPilJurusan.setBounds(30, 400, 150, 30);
        updateMhs.add(cbPilJurusan);

        btnEditJurusan = new JButton("Edit");
        btnEditJurusan.setBounds(210, 400, 55, 30);
        updateMhs.add(btnEditJurusan);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(30, 460, 100, 30);
        btnUpdate.setVisible(false);
        updateMhs.add(btnUpdate);
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(150, 460, 100, 30);
        updateMhs.add(btnBack);

        textNpm.setEnabled(false);
        textNama.setEnabled(false);
        textTglLahir.setEnabled(false);
        textNotelp.setEnabled(false);
        textPassword.setEnabled(false);
        cbPilJurusan.setEnabled(false);

        textNpm.setText(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNpm());
        textNama.setText(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNama());
        textTglLahir.setText(new SimpleDateFormat("dd/MM/yyy").format(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getTglLahir()));
        textNotelp.setText(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNo_telp());
        textPassword.setText(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getPassword());
        cbPilJurusan.setSelectedIndex(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan());
        
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                updateMhs.dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });
        
        btnEditNpm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNpm.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });

        btnEditNama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNama.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });

        btnEditTglLahir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textTglLahir.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });
        
        btnEditPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textPassword.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });
        
        btnEditJurusan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                cbPilJurusan.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });

        btnEditNotelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                textNotelp.setEnabled(true);
                btnUpdate.setVisible(true);
            }
        });
        
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if(textNpm.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, textNpm.getText(), "npm", "string");
                    }
                    if(textNama.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, textNama.getText(), "nama", "string");
                    }
                    if(textNotelp.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, textNotelp.getText(), "notelp", "string");
                    }
                    if(textPassword.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, textPassword.getText(), "password", "string");
                    }
                    if(textTglLahir.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, textTglLahir.getText(), "tgllahir", "date");
                    }
                    if(cbPilJurusan.isEnabled()) {
                        Irfan07156_AllObjekController.mahasiswa.updateDataMahasiswa(index_mhs, String.valueOf(cbPilJurusan.getSelectedIndex()), "jurusan", "int");
                        try {
                            Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs);
                            Irfan07156_AllObjekController.rencanaMatkul.hapus(index_mhs);
                        } catch (Exception e) {
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Update Berhasil", "Information", JOptionPane.INFORMATION_MESSAGE);
                    updateMhs.dispose();
                    Irfan07156_GUI menuUtama = new Irfan07156_GUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
