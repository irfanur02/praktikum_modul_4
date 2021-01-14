/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIUpdateMahasiswa extends Irfan07156_Komponen{
    boolean edit = false;

    public Irfan07156_GUIUpdateMahasiswa(int index_mhs) {
        setSize(310, 550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        labelNamaMenu.setText("Update Mahasiswa");
        labelNamaMenu.setBounds(67, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelNamaMenu);

        labelNpm.setBounds(30, 70, 150, 30);
        add(labelNpm);

        textNpm.setBounds(30, 100, 150, 30);
        add(textNpm);

        btnEditNpm.setBounds(210, 100, 55, 30);
        add(btnEditNpm);

        labelNama.setBounds(30, 130, 150, 30);
        add(labelNama);

        textNama.setBounds(30, 160, 150, 30);
        add(textNama);

        btnEditNama.setBounds(210, 160, 55, 30);
        add(btnEditNama);

        labelTglLahir.setBounds(30, 190, 150, 30);
        add(labelTglLahir);

        textTglLahir.setBounds(30, 220, 150, 30);
        add(textTglLahir);

        btnEditTglLahir.setBounds(210, 220, 55, 30);
        add(btnEditTglLahir);

        labelNotelp.setBounds(30, 250, 150, 30);
        add(labelNotelp);

        textNotelp.setBounds(30, 280, 150, 30);
        add(textNotelp);

        btnEditNotelp.setBounds(210, 280, 55, 30);
        add(btnEditNotelp);

        labelPassword.setBounds(30, 310, 150, 30);
        add(labelPassword);

        textPassword.setBounds(30, 340, 150, 30);
        add(textPassword);

        btnEditPassword.setBounds(210, 340, 55, 30);
        add(btnEditPassword);

        labelJurusan.setBounds(30, 370, 150, 30);
        add(labelJurusan);

        cbPilJurusan.setBounds(30, 400, 150, 30);
        add(cbPilJurusan);

        btnEditJurusan.setBounds(210, 400, 55, 30);
        add(btnEditJurusan);

        btnUpdate.setBounds(30, 460, 100, 30);
        btnUpdate.setVisible(false);
        add(btnUpdate);
        
        btnBack.setBounds(150, 460, 100, 30);
        add(btnBack);

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
                dispose();
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
                    dispose();
                    Irfan07156_GUI menuUtama = new Irfan07156_GUI();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
