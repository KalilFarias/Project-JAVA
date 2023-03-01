package Projeto_;

public class User {

    private static String user_name;
    private static String passwd;
    private static String cpf;

    public String getUser_name() {
        return user_name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        User.cpf = cpf;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        User.passwd = passwd;
    }
    public void setUser_name(String user_name) {
        User.user_name = user_name;
    }

    
}
