import java.util.Scanner;

public class Pembayaran implements Menu {
    private int tglBayar;


    @Override
    public void inputData() {
        System.out.print("Tgl bayar      : ");
        tglBayar = input.nextInt();

    }

    @Override
    public void displayData() {

        System.out.println("Tgl bayar   : "+ this.tglBayar);

    }


//    public void pembayaranKamar(){
//        System.out.print("Id pembayaran    : ");
//        idTransaksi = input.nextLine();
//        System.out.println("Tgl pembayaran : ");
//        tglBayar = input.nextInt();
        //System.out.println("Lama inap    :" + psn.getLamaInap());
//        lamaInap = input.nextInt();
//        System.out.println("Harga kamar    :");
//        hargaKamar = input.nextInt();
//        System.out.print("Total harga      : " + this.getHargaKamar());
//        totalBayar = input.nextInt();
//        System.out.println();
//    }
}
