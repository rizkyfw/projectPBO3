/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3pbo12;
/**
 *
 * @author user
 */
class NilaiMahasiswa {

    private String nim;
    private String nama;
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

     public String getNama() {
        return nama;
    }
     
    public void setNama(String nama) {
        this.nama = nama;
    }

 
    public void nilai() {
        char index = 0;
        double uts = 45, uas = 34, quiz = 75;
        double nQuiz = 0.2 * quiz;
        double nUts = 0.3 * uts;
        double nUas = 0.5 * uas;
        double nilai = nQuiz + nUts + nUas;

        System.out.println("\nQUIZ \t\t= " + quiz);
        System.out.println("UTS \t\t= " + uts);
        System.out.println("UAS \t\t= " + uas);
        System.out.println("\nNilai Akhir \t= " + nilai);

        if (nilai > 80 && nilai <= 100) {
            index = 'A';
        } else if (nilai > 68 && nilai <= 80) {
            index = 'B';
        } else if (nilai > 56 && nilai <= 68) {
            index = 'C';
        } else if (nilai > 45 && nilai <= 56) {
            index = 'D';
        } else if (nilai <= 45) {
            index = 'E';
        }

        switch (index) {
            case 'A':

                System.out.println("\nIndex = " + index);
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Baik");
                break;
            case 'C':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Cukup");
                break;
            case 'D':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Kurang");
                break;
            case 'E':
                System.out.println("\nIndex = " + index);
                System.out.println("Keterangan = Sangat Kurang");
                break;
            default:
                System.out.println("\nUNRECOGNIZE");
        }
    }
}

public class tugas3pbo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NilaiMahasiswa oMhs = new NilaiMahasiswa();
        oMhs.setNim("10116512");
        oMhs.setNama("Rizky Fauzy Wahyudi");

        for (int i = 1; i < 5; i++) {
            System.out.println("Nama ke " + i + "\t\t= " + oMhs.getNama());
        }

        for (int j = 8; j >= 1; j--) {
            System.out.println("NIM ke " + j + "\t\t= " + oMhs.getNim() + j);
        }

        oMhs.nilai();

    }

}

