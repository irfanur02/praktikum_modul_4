/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Irfan07156_MahasiswaController;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUI extends Irfan07156_Komponen{
    public Irfan07156_GUI() {
        setSize(800, 380);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        labelNamaAplikasi.setBounds(150, 10, 600, 50);
        labelNamaAplikasi.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(labelNamaAplikasi);

        btnLoginMhs.setBounds(30, 70, 140, 30);
        add(btnLoginMhs);

        btnDaftar.setText("Daftar Mahasiswa");
        btnDaftar.setBounds(180, 70, 140, 30);
        add(btnDaftar);

        scrollTabelMhs.setBounds(30, 110, 570, 200);
        tabelMhs.setModel(Irfan07156_AllObjekController.mahasiswa.dataTabelMhs());
        add(scrollTabelMhs);

        labelUbahData.setBounds(620, 105, 130, 30);
        add(labelUbahData);

        textUbahData.setBounds(620, 135, 100, 30);
        add(textUbahData);

        btnEditMhs.setBounds(620, 175, 55, 30);
        add(btnEditMhs);

        btnHapusMhs.setBounds(685, 175, 70, 30);
        add(btnHapusMhs);

        btnLoginMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                Irfan07156_GUILoginMahasiswa loginMahasiswa = new Irfan07156_GUILoginMahasiswa();
            }
        });

        btnDaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                Irfan07156_GUIDaftarMahasiswa daftarMahasiswa = new Irfan07156_GUIDaftarMahasiswa();
            }
        });

        textUbahData.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textUbahData.setText(null);
            }

            @Override
            public void focusLost(FocusEvent fe) {
            }
        });

        btnEditMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa().size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        if (!"Index".equals(textUbahData.getText()) && !"".equals(textUbahData.getText())) {
                            int index_mhs = Integer.parseInt(textUbahData.getText());
                            Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs);
                            dispose();
                            Irfan07156_GUIUpdateMahasiswa updateMahasiswa = new Irfan07156_GUIUpdateMahasiswa(index_mhs);
                        } else {
                            JOptionPane.showMessageDialog(null, "Pilih Data Mahasiswa\n\tatau\nMasukkan Index Data Mahasiswa",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data tidak Ada",
                                "Information", JOptionPane.INFORMATION_MESSAGE);
                        menuUtama.dispose();
                        Irfan07156_GUI menuUtama = new Irfan07156_GUI();
                    }
                }
            }
        });

        btnHapusMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa().size() == 0) {
                    JOptionPane.showMessageDialog(null, "Data Masih Kosong", "Information",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    try {
                        if (!"Index".equals(textUbahData.getText()) && !"".equals(textUbahData.getText())) {
                            int index_mhs = Integer.parseInt(textUbahData.getText());
                            Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs);
                            int result = JOptionPane.showConfirmDialog(menuUtama, "apakah anda yakin untuk menghapus ?",
                                    "Swing Tester",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.QUESTION_MESSAGE);
                            if (result == JOptionPane.YES_OPTION) {
                                Irfan07156_AllObjekController.mahasiswa.deleteDataMahasiswa(index_mhs);
                                try {
                                    Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs);
                                    Irfan07156_AllObjekController.rencanaMatkul.hapus(index_mhs);
                                } catch (Exception e) {
                                }
                                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus", "Information",
                                        JOptionPane.INFORMATION_MESSAGE);
                                tabelMhs.setModel(Irfan07156_AllObjekController.mahasiswa.dataTabelMhs());
                                textUbahData.setText("Index");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Pilih Data Mahasiswa\n\tatau\nMasukkan Index Data Mahasiswa",
                                    "Information", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data tidak Ada",
                                "Information", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        Irfan07156_GUI menuUtama = new Irfan07156_GUI();
                    }
                }
            }
        });

        tabelMhs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelMhs.getSelectedRow();
                textUbahData.setText(Irfan07156_AllObjekController.mahasiswa.dataTabelMhs().getValueAt(i, 0).toString());
            }
        });
    }
}
