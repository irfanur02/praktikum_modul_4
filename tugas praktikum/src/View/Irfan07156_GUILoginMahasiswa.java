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
public class Irfan07156_GUILoginMahasiswa {

    JFrame loginMhs = new JFrame();
    JButton btnLoginMhs, btnBack;
    JLabel labelNamaMenu, labelNpm, labelPassword;
    JTextField textNpm;
    JPasswordField textPassword;

    public Irfan07156_GUILoginMahasiswa() {
        loginMhs.setSize(227, 370);
        loginMhs.setLayout(null);
        loginMhs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginMhs.setVisible(true);
        loginMhs.setLocationRelativeTo(null);

        labelNamaMenu = new JLabel("Login Mahasiswa");
        labelNamaMenu.setBounds(27, 10, 300, 50);
        labelNamaMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loginMhs.add(labelNamaMenu);

        labelNpm = new JLabel("NPM");
        labelNpm.setBounds(30, 70, 150, 30);
        loginMhs.add(labelNpm);

        textNpm = new JTextField();
        textNpm.setBounds(30, 100, 150, 30);
        loginMhs.add(textNpm);

        labelPassword = new JLabel("Password");
        labelPassword.setBounds(30, 130, 150, 30);
        loginMhs.add(labelPassword);

        textPassword = new JPasswordField();
        textPassword.setBounds(30, 160, 150, 30);
        loginMhs.add(textPassword);

        btnLoginMhs = new JButton("Login");
        btnLoginMhs.setBounds(30, 220, 150, 30);
        loginMhs.add(btnLoginMhs);

        btnBack = new JButton("Kembali");
        btnBack.setBounds(30, 260, 150, 30);
        loginMhs.add(btnBack);

        btnLoginMhs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int index_mhs = Irfan07156_AllObjekController.mahasiswa.login(textNpm.getText(), textPassword.getText());
                if (index_mhs == -1) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    loginMhs.dispose();
                    Irfan07156_GUILoginMahasiswa loginMahasiswa = new Irfan07156_GUILoginMahasiswa();
                } else if (index_mhs == -2) {
                    JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    loginMhs.dispose();
                    Irfan07156_GUILoginMahasiswa loginMahasiswa = new Irfan07156_GUILoginMahasiswa();
                } else {
                    loginMhs.dispose();
                    Irfan07156_GUIProfileMahasiswa profileMhs = new Irfan07156_GUIProfileMahasiswa(index_mhs);
//                    profileMhs.profileMhs(index_mhs);
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                loginMhs.dispose();
                Irfan07156_GUI menuUtama = new Irfan07156_GUI();
            }
        });
    }
}
