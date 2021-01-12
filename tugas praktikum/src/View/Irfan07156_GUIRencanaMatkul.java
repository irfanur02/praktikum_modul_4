/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Entity.Irfan07156_MataKuliahEntity;
import Entity.Irfan07156_JurusanEntity;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUIRencanaMatkul {

    JFrame rencanaMaktul = new JFrame();
    JComboBox cbPilMatkul;
    JLabel labelNamaMenu, labelJurusan, labelMatKul;
    JButton btnTambah, btnBack;
    
    public Irfan07156_GUIRencanaMatkul(int index) {
        rencanaMaktul.setSize(227, 330);
        rencanaMaktul.setLayout(null);
        rencanaMaktul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        rencanaMaktul.setVisible(true);
        rencanaMaktul.setLocationRelativeTo(null);

        if (Irfan07156_AllObjekController.rencanaMatkul.size() == 0) {
            for (int i = 0; i < Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()].length; i++) {
                cbPilMatkul = new JComboBox(Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()]);
                cbPilMatkul.getItemAt(i);
            }
        } else if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index) == null) {
            for (int i = 0; i < Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()].length; i++) {
                cbPilMatkul = new JComboBox(Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()]);
                cbPilMatkul.getItemAt(i);
            }
        } else {
            for (int j = 0; j < Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()].length; j++) {
                for (int i = 0; i < Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index).getMatkul().get(index).size(); i++) {
                    if (j != Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index).getMatkul().get(index).get(i)) {
                        cbPilMatkul = new JComboBox(Irfan07156_MataKuliahEntity.matkul[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()]);
                        cbPilMatkul.getItemAt(j);
                    }
                }
            }
        }

        labelNamaMenu = new JLabel("Rencana Mata Kuliah");
        labelNamaMenu.setBounds(16, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        rencanaMaktul.add(labelNamaMenu);

        labelJurusan = new JLabel("Jurusan " + Irfan07156_JurusanEntity.jurusan[Irfan07156_AllObjekController.mahasiswa.getDataMahasiswa(index).getIndex_jurusan()]);
        labelJurusan.setBounds(38, 40, 300, 50);
        rencanaMaktul.add(labelJurusan);

        labelMatKul = new JLabel("Mata Kuliah");
        labelMatKul.setBounds(70, 90, 300, 50);
        rencanaMaktul.add(labelMatKul);

        cbPilMatkul.setBounds(32, 130, 150, 30);
        rencanaMaktul.add(cbPilMatkul);

        btnTambah = new JButton("Tambah Mata Kuliah");
        btnTambah.setBounds(32, 190, 150, 30);
        rencanaMaktul.add(btnTambah);
        
        btnBack = new JButton("Kembali");
        btnBack.setBounds(32, 250, 150, 30);
        rencanaMaktul.add(btnBack);

        btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int pilMatKul = cbPilMatkul.getSelectedIndex();
                if (Irfan07156_AllObjekController.rencanaMatkul.size() == 0) {
                    Irfan07156_AllObjekController.rencanaMatkul.insertMatkul(pilMatKul, index);
                } else if (Irfan07156_AllObjekController.rencanaMatkul.showRencanaMatkul(index) == null) {
                    Irfan07156_AllObjekController.rencanaMatkul.insertMatkul(pilMatKul, index);
                } else {
                    Irfan07156_AllObjekController.rencanaMatkul.tambahMatkul(pilMatKul, index);
                }
                rencanaMaktul.dispose();
                Irfan07156_GUIProfileMahasiswa profileMhs = new Irfan07156_GUIProfileMahasiswa(index);
//                profileMhs.profileMhs(index_mhs);
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                rencanaMaktul.dispose();
                Irfan07156_GUIProfileMahasiswa profileMhs = new Irfan07156_GUIProfileMahasiswa(index);
            }
        });
    }
}
