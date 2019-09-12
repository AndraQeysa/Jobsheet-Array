package Latihan;

public class Multi_Dimensi2 {

    //public static void mian (String args []){
    int nis[][] = {{210651}, {210652}, {210653}};
    String nama[][] = {{"Shyhab"}, {"Andra"}, {"Lukman"}};

    public void tampil(String n) {
        System.out.println("Identitas Siswa Angkatan ");
    }

    public void namanis(int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(nama[1][j] + ":" + nis[1][j]);
            }
        }
    }

    public static void main(String[] args) {
        Multi_Dimensi2 siswa = new Multi_Dimensi2();
        siswa.tampil(null);
        siswa.namanis(0);
    }
}
