package com.kuis;

import java.awt.event.*;
import javax.swing.*;

public class GuiMhs extends JFrame {
    // deklarasi komponen komponen input form
    protected JLabel lNama, lNIM, lMatkul1, lNilai1, lMatkul2, lNilai2, lError;
    protected JTextField fNama,fNIM, fMatkul1, fMatkul2, fNilai1, fNilai2;
    protected JButton btnConvert;

    public void guiMhs(){
        // inisialisasi komponen input
        lNIM = new JLabel("NIM");
        fNIM = new JTextField(9);
        lNama = new JLabel("Nama");
        fNama = new JTextField(30);
        lMatkul1 = new JLabel("Mata Kuliah 1");
        fMatkul1 = new JTextField(20);
        lNilai1 = new JLabel("Nilai 1");
        fNilai1 = new JTextField(5);
        lMatkul2 = new JLabel("Mata Kuliah 2");
        fMatkul2 = new JTextField(20);
        lNilai2 = new JLabel("Nilai 2");
        fNilai2 = new JTextField(5);
        btnConvert = new JButton("Convert");
        lError = new JLabel("");

        setLayout(null);
        //add to frame, supaya komponen bisa tampil pada frame java
        add(lNIM);
        add(fNIM);
        add(lNama);
        add(fNama);
        add(lMatkul1);
        add(fMatkul1);
        add(lMatkul2);
        add(fMatkul2);
        add(lNilai1);
        add(fNilai1);
        add(lNilai2);
        add(fNilai2);
        add(btnConvert);
        add(lError);

        // mengatur tataletak komponen pada frame java
        lNIM.setBounds(50,30,100,30);
        fNIM.setBounds(150,30,200,25);
        lNama.setBounds(50,80,100,30);
        fNama.setBounds(150,80,200,25);
        lMatkul1.setBounds(50,130,100,30);
        fMatkul1.setBounds(150,130,200,25);
        lNilai1.setBounds(50,180,100,30);
        fNilai1.setBounds(150,180,200,25);
        lMatkul2.setBounds(50,230,100,30);
        fMatkul2.setBounds(150,230,200,25);
        lNilai2.setBounds(50,280,100,30);
        fNilai2.setBounds(150,280,200,25);
        btnConvert.setBounds(180,330,80,30);
        lError.setBounds(130,380,300,30);

        // membuat judul frame
        setTitle("Hitung Nilai");
        // mengatur besar frame java
        setSize(450,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // membuat event listener (action listener) untuk menangkap data dari data guiMhs diatas saat tombol convert di klik
        btnConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // membuat objek tukar dari class Convert
                Convert hasil = new Convert();
                // data dari guiMhs diubah menjadi variabel string
                String nim = fNIM.getText();
                String nama = fNama.getText();
                String matkul1 = fMatkul1.getText();
                String nilai1 = fNilai1.getText();
                String matkul2 = fMatkul2.getText();
                String nilai2 = fNilai2.getText();

                // program error handling pak novrido
                try {
                    // cek komponen komponen deklararsi objek hasil diatas
                    cekData(nim, nama, matkul1, nilai1, matkul2, nilai2);
                    hasil.hasilConvert(nim, nama, matkul1, nilai1, matkul2, nilai2);
                } catch (java.lang.Error exception1) {
                    // menangkap error jika terjadi error lalu di tampilkan pada frame
                    lError.setText(String.valueOf(exception1));
                } catch (NumberFormatException exception2) {
                    // menangkap error jika terjadi error lalu di tampilkan pada frame
                    lError.setText("Error : error bro, masukin yang bener");
                }
            }
        });

    }

    // method cek data error handling                                                                         //mengeluarkan error jika terjadi sesuai statement if dibawah
    public void cekData(String nim, String nama, String matkul1, String nilai1, String matkul2, String nilai2) throws java.lang.Error {
        // if pertama keadaan jika semua inputan pada guiMhs kosong, cek menggunakan lenght
        if (!(nim.length() > 0 && nama.length() > 0 && matkul1.length() > 0 && nilai1.length() > 0 && matkul2.length() > 0 && nilai2.length() > 0)) {
            throw new java.lang.Error("masih kosong nih bro");
        } // ketika nilai inputan tidak sesuai kriteria
        else if ((Float.parseFloat(nilai1)) <= 0 || (Float.parseFloat(nilai1)) >= 100 || (Float.parseFloat(nilai2)) <= 0 || (Float.parseFloat(nilai2)) >= 100) {
            throw new java.lang.Error("range nilai 1-100 bro");
        }
    }
}