public class Resepsionis implements Menu{

private String nama;
private String email;
private String noHP;
private String jk;

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getJk() {
        return jk;
    }

    @Override
    public void inputData() {
        System.out.print("Nama petugas    : ");
        nama = input.nextLine();
        System.out.print("Masukkan email  : ");
        email = input.nextLine();
        System.out.print("Masukkan no HP  : ");
        noHP = input.nextLine();
        System.out.print("Jenis kelamin   : ");
        jk = input.nextLine();

    }

    @Override
    public void displayData() {
        System.out.println("Nama petugas  : " + this.nama);
        System.out.println("Jenis kelamin : " + this.jk);
        System.out.println("email         : " + this.email);
        System.out.println("no HP         : " + this.noHP);


    }
}
