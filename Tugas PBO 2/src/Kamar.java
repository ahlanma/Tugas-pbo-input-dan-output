//public class Kamar {
//    public void input(){
//    }
//}
//
//class kamar_VIP extends Kamar {
//private String idKmrVip;
//private String namaKmr1;
//private String fasilitas1;
//
//
//    public void setFasilitas(String fasilitas) {
//        this.fasilitas1 = fasilitas;
//    }
//
//    public void setIdKmr(String idKmr) {
//        this.idKmrVip = idKmr;
//    }
//
//    public void setNamaKmr(String namaKmr) {
//        this.namaKmr1 = namaKmr;
//    }
//
//    @Override
//    public void input() {
//        this.idKmrVip = idKmrVip;
//        this.namaKmr1 = namaKmr1;
//        this.fasilitas1 = fasilitas1;
//    }
//
//
//
//}
//
//class kamar_standar extends  Kamar {
//    private String idKmrStandar;
//    private String namaKmr2;
//    private String fasilitas2;
//
//    public void setIdKmrStandar(String idKmrStandar) {
//        this.idKmrStandar = idKmrStandar;
//    }
//
//    public void setNamaKmr2(String namaKmr2) {
//        this.namaKmr2 = namaKmr2;
//    }
//
//    public void setFasilitas2(String fasilitas2) {
//        this.fasilitas2 = fasilitas2;
//    }
//
//    @Override
//    public void input() {
//        this.idKmrStandar = idKmrStandar;
//        this.namaKmr2 = namaKmr2;
//        this.fasilitas2 = fasilitas2;
//    }
//}

import java.util.Scanner;

public abstract class Kamar  {
    Scanner input = new Scanner(System.in);


    private int jumPesanan;

    public void setJumPesanan(int jumPesanan) {
        this.jumPesanan = jumPesanan;
    }

    public int getJumPesanan() {
        return jumPesanan;
    }


    public abstract void display();
    public abstract void inputPemesanan();


}

