package MasEjerciciosOOP;

public class User {

    private String username;
    private String password;


    public void setUsername(String username){
        this.username = username;

    }

    public void setPassword(String password){
        this.password = password;
    }

    public void checkPassword(String inputPassword){
        if(this.password.equals(inputPassword)){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Contrasela incorrecta. Acceso denagado");
        }
    }
}


