import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void cetakMenu() {
        System.out.println(" << WOLCOME to OYO >>");
        System.out.println("Menu :");
        System.out.println("[1]. Input Pemesanan");
        System.out.println("[2]. Display Pemesanan");
        System.out.println("[3]. Exit");
    }

    public static void main(String[] args) {
        Login lgn = new Login();
        Pelanggan pelgn = new Pelanggan();
        Resepsionis ptgas = new Resepsionis();
        Vip vip = new Vip();
        Pemesanan pesanan = new Pemesanan();
        Pembayaran pembayaran = new Pembayaran();
        Standar standar = new Standar();
        Scanner input = new Scanner(System.in);

        int pilih;
        boolean pil = false;
        int i = 0;
        int salah = 3;
        String pil2;
        System.out.println("+==================+");
        System.out.println("|   LOGIN FORM     |");
        System.out.println("| [1] Pelangan     |");
        System.out.println("| [2] Resepsionis  |");
        System.out.println("+==================+");

        System.out.print("Pilih : ");
        pilih = input.nextInt();

        if (pilih == 1) {
            while (i <= 3) {
                System.out.print("Username : ");
                String usernama = input.next();
                lgn.setUserName(usernama);

                System.out.print("Password : ");
                String sandi = input.next();
                lgn.setPassword(sandi);

                if (lgn.getUserName().equals("mhs") && lgn.getPassword().equals("mhs")) {
                    System.out.println("Login succes");
                    break;

                } else {
                    System.out.println("Login gagal");
                    salah++;
                    i++;
                    if (i == 3) {
                        System.out.println("Anda sudah 3x mencoba maaf anda keluar ");
                        System.exit(0);

                    }
                }
            }


            while (true) {
                cetakMenu();
                System.out.print("Pilih : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1:


                        System.out.println("+------------------------------+");
                        System.out.println("| No | Jenis Kamar |  Harga    |");
                        System.out.println("+------------------------------+");
                        System.out.println("| 1  | VIP        | 1000k /mlm |");
                        System.out.println("| 2  | Standar    | 500k /mlm  |");
                        System.out.println("+------------------------------+");
                        System.out.println("");
                        System.out.print("Pilih kamar : ");
                        pilih = input.nextInt();

                        switch (pilih) {
                            //input  custamers dan cetak struk kamar vip
                                case 1:
                                java.io.File file = new java.io.File("printout.txt");
                                try {
                                    java.io.PrintWriter out = new java.io.PrintWriter(file);

                                    pelgn.inputData();
                                    pesanan.inputData();
                                    pembayaran.inputData();
                                    vip.inputPemesanan();
                                    out.println("+=======================+");
                                    out.println("| STRUK PENYEWAAN KAMAR |");
                                    out.println("+=======================+");
                                    out.println("");
                                    out.println("Jenis kamar      : " + vip.getJenisKamar());
                                    out.println("Kode kamar       : " + vip.getKdKamar());
                                    out.println("Nama pelanggan   : " + pelgn.getNama());
                                    out.println("Alamat           : " + pelgn.getAlamat());
                                    out.println("No hp            : " + pelgn.getNoHp());
                                    out.println("Jenis kelamin    : " + pelgn.getJk());
                                    out.println("Tgl chek in      : " + pesanan.getTglMasuk());
                                    out.println("Tgl chek out     : " + pesanan.getTglKeluar());
                                    out.println("Jml kamar dipesan: " + pesanan.getJumPsn());
                                    out.println("Harga kamar      : " + pesanan.getHargaKamar());
                                    out.println("Lama inap        : " + pesanan.getLamaInap());
                                    out.println("Total harga      : " + pesanan.getHargaKamar());
                                    out.println("Jml bayar        : " + pesanan.getJumBayar());
                                    out.println("Kembalian        : " + pesanan.getKembalian());
                                    out.close();
                                } catch (FileNotFoundException e) {
                                    System.out.println("File belum di buat");
                                }

                                break;

                                //input custamer dan cetak struk standert
                            case 2:
                                file = new File("printout.txt");
                                try {
                                    java.io.PrintWriter out = new java.io.PrintWriter(file);
                                    pelgn.inputData();
                                    pesanan.inputData();
                                    pembayaran.inputData();
                                    standar.inputPemesanan();
                                    out.println("+=======================+");
                                    out.println("| STRUK PENYEWAAN KAMAR |");
                                    out.println("+=======================+");
                                    out.println("");
                                    out.println("Jenis kamar      : " + standar.getJenisKamar());
                                    out.println("Kode kamar       : " + standar.getKdKamar());
                                    out.println("Nama pelanggan   : " + pelgn.getNama());
                                    out.println("Alamat           : " + pelgn.getAlamat());
                                    out.println("No hp            : " + pelgn.getNoHp());
                                    out.println("Jenis kelamin    : " + pelgn.getJk());
                                    out.println("Tgl chek in      : " + pesanan.getTglMasuk());
                                    out.println("Tgl chek out     : " + pesanan.getTglKeluar());
                                    out.println("Jml kamar dipesan: " + pesanan.getJumPsn());
                                    out.println("Harga kamar      : " + pesanan.getHargaKamar());
                                    out.println("Lama inap        : " + pesanan.getLamaInap());
                                    out.println("Total harga      : " + pesanan.getHargaKamar());
                                    out.println("Jml bayar        : " + pesanan.getJumBayar());
                                    out.println("Kembalian        : " + pesanan.getKembalian());
                                    out.close();
                                } catch (FileNotFoundException e) {
                                    System.out.println("File belum di buat");
                                }
                                break;
                            default:
                                System.out.println("Errorr!!");
                                break;

                        }
                        break;
                    case 2:
                        pelgn.displayData();
                        pembayaran.displayData();
                        pesanan.displayData();
                        System.out.println("Apakah anda ingin lanjut ");
                        System.out.print("Jika yes klik [1] batal klik [2]: ");
                        pil2 = input.next();

                        if (pil2.equals("1")) {
                            System.out.println("benar");

                        } else {
                            System.out.println("salah");
                            System.exit(0);
                        }
                        break;

                    case 3:
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Error!!!");
                }




            }
        } else if (pilih == 2) {
            while (i <= 3) {
                System.out.print("Username : ");
                String usernama2 = input.next();
                lgn.setUserName(usernama2);

                System.out.print("Password : ");
                String sandi2 = input.next();
                lgn.setPassword(sandi2);

                if (lgn.getUserName().equals("admin") && lgn.getPassword().equals("admin")) {
                    System.out.println("Login succes");
                    break;

                } else {
                    System.out.println("Login gagal");
                    salah++;
                    i++;
                    if (i == 3) {
                        System.out.println("Anda sudah 3x mencoba maaf anda keluar ");
                        System.exit(0);

                    }
                }

            }

        } else {
            System.out.println("Input salah");
            System.exit(0);
        }

        //String keputusan = "1";


        while (true) {
            cetakMenu();
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:


                    System.out.println("+------------------------------+");
                    System.out.println("| No | Jenis Kamar |  Harga    |");
                    System.out.println("+------------------------------+");
                    System.out.println("| 1  | VIP        | 1000k /mlm |");
                    System.out.println("| 2  | Standar    | 500k /mlm  |");
                    System.out.println("+------------------------------+");
                    System.out.println("");
                    System.out.print("Pilih kamar : ");
                    pilih = input.nextInt();

                    switch (pilih) {
                        //input dan cetak struk vip
                        case 1:
                            java.io.File file = new java.io.File("printout.txt");
                            try {
                                java.io.PrintWriter out = new java.io.PrintWriter(file);

                                ptgas.inputData();
                                pesanan.inputData();
                                pembayaran.inputData();
                                vip.inputPemesanan();
                                out.println("+=======================+");
                                out.println("| STRUK PENYEWAAN KAMAR |");
                                out.println("+=======================+");
                                out.println("");
                                out.println("Jenis kamar      : " + vip.getJenisKamar());
                                out.println("Kode kamar       : " + vip.getKdKamar());
                                out.println("Nama petugas     : " + ptgas.getNama());
                                out.println("E-mail           : " + ptgas.getEmail());
                                out.println("No hp            : " + ptgas.getNoHP());
                                out.println("Jenis kelamin    : " + ptgas.getJk());
                                out.println("Tgl chek in      : " + pesanan.getTglMasuk());
                                out.println("Tgl chek out     : " + pesanan.getTglKeluar());
                                out.println("Jml kamar dipesan: " + pesanan.getJumPsn());
                                out.println("Harga kamar      : " + pesanan.getHargaKamar());
                                out.println("Lama inap        : " + pesanan.getLamaInap());
                                out.println("Total harga      : " + pesanan.getHargaKamar());
                                out.println("Jml bayar        : " + pesanan.getJumBayar());
                                out.println("Kembalian        : " + pesanan.getKembalian());
                                out.close();
                            } catch (FileNotFoundException e) {
                                System.out.println("File belum di buat");
                            }

                            break;

                        case 2:
                            file = new File("printout.txt");
                            try {
                                java.io.PrintWriter out = new java.io.PrintWriter(file);
                                pelgn.inputData();
                                pesanan.inputData();
                                pembayaran.inputData();
                                standar.inputPemesanan();
                                out.println("+=======================+");
                                out.println("| STRUK PENYEWAAN KAMAR |");
                                out.println("+=======================+");
                                out.println("");
                                out.println("Jenis kamar      : " + standar.getJenisKamar());
                                out.println("Kode kamar       : " + standar.getKdKamar());
                                out.println("Nama petugas     : " + ptgas.getNama());
                                out.println("E-mail           : " + ptgas.getEmail());
                                out.println("No hp            : " + ptgas.getNoHP());
                                out.println("Jenis kelamin    : " + ptgas.getJk());
                                out.println("Tgl chek in      : " + pesanan.getTglMasuk());
                                out.println("Tgl chek out     : " + pesanan.getTglKeluar());
                                out.println("Jml kamar dipesan: " + pesanan.getJumPsn());
                                out.println("Harga kamar      : " + pesanan.getHargaKamar());
                                out.println("Lama inap        : " + pesanan.getLamaInap());
                                out.println("Total harga      : " + pesanan.getHargaKamar());
                                out.println("Jml bayar        : " + pesanan.getJumBayar());
                                out.println("Kembalian        : " + pesanan.getKembalian());
                                out.close();
                            } catch (FileNotFoundException e) {
                                System.out.println("File belum di buat");
                            }
                            break;
                        default:
                            System.out.println("Errorr!!");
                            break;

                    }


                    break;

                    //dispaly petugas
                case 2:
                    ptgas.displayData();
                    pembayaran.displayData();
                    pesanan.displayData();
                    System.out.println("Apakah anda ingin lanjut ");
                    System.out.print("Jika yes klik [1] batal klik [2]: ");
                    pil2 = input.next();

                    if (pil2.equals("1")) {
                        System.out.println("benar");

                    } else {
                        System.out.println("salah");
                        System.exit(0);
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Error!!!");

            }
        }
    }
}









