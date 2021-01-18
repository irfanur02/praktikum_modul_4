/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entity.Irfan07156_JurusanEntity;
import Entity.Irfan07156_MataKuliahEntity;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIProfileMahasiswa extends JFrame{
    int index_mhs;

    public Irfan07156_GUIProfileMahasiswa(int index) {
        this.index_mhs = index;
        setSize(350, 455);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        JLabel labelNamaMenu = new JLabel("Profile Mahasiswa");
        labelNamaMenu.setBounds(65, 10, 600, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(labelNamaMenu);

        JTextArea areaDataMhs = new JTextArea();
        areaDataMhs.setBounds(30, 70, 273, 270);
        add(areaDataMhs);

        JButton btnTambahMatkul = new JButton("Tambah Mata Kuliah");
        btnTambahMatkul.setBounds(30, 360, 150, 30);
        add(btnTambahMatkul);

        JButton btnBack = new JButton("Kembali");
        btnBack.setBounds(210, 360, 95, 30);
        add(btnBack);

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });

        btnTambahMatkul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index).getMatkul().get(index).size() < 2) {
                        dispose();
                        Irfan07156_GUIRencanaMatkul rencanaMatkul = new Irfan07156_GUIRencanaMatkul(index);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mata Kuliah Sudah Diambil Semua !!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    dispose();
                    Irfan07156_GUIRencanaMatkul rencanaMatkul = new Irfan07156_GUIRencanaMatkul(index);
                }
            }
        });

        if (Irfan07156_AllObjekController.rencanaMatkul.size() == 0) {
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Mata Kuliah\nSilahkan Pilih Mata Kualih !!", "Information", JOptionPane.INFORMATION_MESSAGE);
            areaDataMhs.setText(dataMhs());
        } else if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index) == null) {
            JOptionPane.showMessageDialog(null, "Anda Belum Memilih Mata Kuliah\nSilahkan Pilih Mata Kualih", "Information", JOptionPane.INFORMATION_MESSAGE);
            areaDataMhs.setText(dataMhs());
        } else {
            areaDataMhs.setText(dataMhs());
        }
    }

    String dataMhs() {
        String concat1 = null, concat2 = null, text2 = null;
        String text1 = "Npm = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNpm() + "\n"
                + "Nama = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNama() + "\n"
                + "No Telp = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getNo_telp() + "\n"
                + "Tanggal Lahir = " + new SimpleDateFormat("dd-MM yyyy").format(Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getTglLahir()) + "\n"
                + "Password = " + Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getPassword() + "\n"
                + "Jurusan = " + Irfan07156_JurusanEntity.jurusan[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()] + "\n"
                + "Mata Kuliah : \n";
        if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs) != null) {
            for (int j = 0; j < Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).size(); j++) {
                if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).size() == 1) {
                    concat1 = text1.concat(" - " + Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()][Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).get(j)]);
                    return concat1;
                } else {
                    text2 = " - " + Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()][Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).get(j)];
                    concat2 = text2.concat("\n - " + Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index_mhs).getIndex_jurusan()][Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).get(j + 1)]);
                    concat2 = text1.concat(concat2);
                    return concat2;
                }
            }
            if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index_mhs).getMatkul().get(index_mhs).size() == 1) {
                return concat1;
            } else {
                return concat2;
            }
        } else {
            return text1;
        }
    }
}
