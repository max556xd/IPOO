package Ejercicio5;

public class Cuenta
{
    private String Usuario;
    private String DireccionMail;
    
    //Sett-Get

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getDireccionMail() {
        return DireccionMail;
    }

    public void setDireccionMail(String direccionMail) {
        DireccionMail = direccionMail;
    }

    public Cuenta(String Usuario, String DireccionMail)
    {
        this.Usuario = Usuario;
        this.DireccionMail = DireccionMail;
    }
}
