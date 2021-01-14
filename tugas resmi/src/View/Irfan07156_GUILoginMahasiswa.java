/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author irfan
 */
public class Irfan07156_GUILoginMahasiswa extends Irfan07156_Komponen{

    public Irfan07156_GUILoginMahasiswa() {
        setSize(227, 370);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        labelNamaMenu.setText("Login Mahasiswa");
        labelNamaMenu.setBounds(27, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(labelNamaMenu);

        labelNpm.setBounds(30, 70, 150, 30);
        add(labelNpm);

        textNpm.setBounds(30, 100, 150, 30);
        add(textNpm);

        labelPassword.setBounds(30, 130, 150, 30);
        add(labelPassword);

        textPassword.setBounds(30, 160, 150, 30);
        add(textPassword);

        btnLoginMhs.setBounds(30, 220, 150, 30);
        add(btnLoginMhs);

        btnBack.setBounds(30, 260, 150, 30);
        add(btnBack);

        btnLoginMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index_mhs = Irfan07156_AllObjekController.mahasiswa.login(textNpm.getText(), textPassword.getText());
                if (index_mhs == -1) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    Irfan07156_GUILoginMahasiswa loginMahasiswa = new Irfan07156_GUILoginMahasiswa();
                } else if (index_mhs == -2) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    Irfan07156_GUILoginMahasiswa loginMahasiswa = new Irfan07156_GUILoginMahasiswa();
                } else {
                    dispose();
                    Irfan07156_GUIProfileMahasiswa profileMhs = new Irfan07156_GUIProfileMahasiswa(index_mhs);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });
    }
}
