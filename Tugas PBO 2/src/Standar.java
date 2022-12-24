public class Standar extends Kamar{
    private String kdKamar;
    private String jenisKamar;
    private int hargaKamar;
    public Standar(){
        this.hargaKamar = 500;
        this.jenisKamar = "Kamar Standart";
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
    }
}
