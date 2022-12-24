
public class Pelanggan implements Menu {



    private String nama;
    private String alamat;
    private String noHp;
    private String Jk;

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getJk() {
        return Jk;
    }

    public Pelanggan(){
        this.nama = nama;
        this.alamat = alamat;
        this.Jk = Jk;
        this.noHp = noHp;
    }

    public void inputData(){

        System.out.print("Nama custumrs   : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan no HP  : ");
        noHp = input.nextLine();
        System.out.print("Jenis kelamin   : ");
        Jk = input.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Nama castumers : " + this.nama);
        System.out.println("alamat         : " + this.alamat);
        System.out.println("no HP          : " + this.noHp);
        System.out.println("Jenis kelamin  : " + this.Jk);
    }

}
