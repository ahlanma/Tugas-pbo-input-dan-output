public class Vip extends Kamar{
    private String kdKamar;
    private String jenisKamar;
    private int hargaKamar;
    public Vip(){
        this.jenisKamar = "Kamar Vip";
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public String getKdKamar() {
        return kdKamar;
    }
    public void setKdKamar(String kdKamar) {
        this.kdKamar = kdKamar;
    }
    public int getHargaKamar() {
        return hargaKamar * getJumPesanan();
    }
    public void setHargaKamar(int hargaKamar) {
        this.hargaKamar = hargaKamar;
    }
    @Override
    public void inputPemesanan() {
        System.out.print("Kode kamar     : ");
        kdKamar = input.nextLine();
    }
    @Override
    public void display() {
        System.out.println("Jenis kamar : " + this.jenisKamar);
        System.out.println("Kode kamar  : " + this.kdKamar);
        //System.out.println("Jumlah pesanan: " + this.jumPesanan);
//        System.out.println("Harga kamar : " + this.hargaKamar);
//        System.out.println("Total harga : " + this.getHargaKamar());
    }
}

