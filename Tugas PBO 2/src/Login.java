public class Login {

    private String userName;
    private String Password;
    private String userName2;
    private String sandi2;

    public Login(){
        userName = "mhs";
        Password = "mhs";
        userName2 = "admin";
        sandi2 = "admin";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return Password;
    }

}
