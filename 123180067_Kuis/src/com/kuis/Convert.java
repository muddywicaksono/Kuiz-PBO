package com.kuis;

public class Convert {
    // deklarasi variabel score, rata rata
    protected float nilai1;
    protected float nilai2;
    protected float rata2;
    protected String nilai;

    // membuat method hasil convert data
    public void hasilConvert(String nim, String nama, String matkul1, String nilai1, String matkul2, String nilai2) {
        this.nilai1 = Float.parseFloat(nilai1);
        this.nilai2 = Float.parseFloat(nilai2);
        //menghitung rata rata nilai
        rata2 = (this.nilai1 + this.nilai2) / 2;
        nilai = ConvertNilaiRataKeNilaiHuruf(rata2);

        System.out.println("NIM         : " + nim);
        System.out.println("Name        : " + nama);
        System.out.println("Matkul 1    : " + matkul1);
        System.out.println("Matkul 2    : " + matkul2);
        System.out.println("Rata - Rata : " + rata2);
        System.out.println("Nilai       : " + nilai);
    }

    // methode range nilai dan mengubah nilai angka menjadi huruf
    private String ConvertNilaiRataKeNilaiHuruf(float rata2) {
        if (rata2 >= 80 && rata2 <= 100) return "A";
        else if (rata2 >= 75 && rata2 < 80) return "B+";
        else if (rata2 >= 65 && rata2 < 75) return "B";
        else if (rata2 >= 60 && rata2 < 65) return "C+";
        else if (rata2 >= 50 && rata2 < 60) return "C";
        else if (rata2 >= 20 && rata2 < 50) return "D";
        else if (rata2 >= 0 && rata2 < 20) return "E";
        else return "Nilai Tidak Terdeteksi pada range";
    }
}

