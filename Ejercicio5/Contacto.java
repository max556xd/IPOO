package Ejercicio5;

public class Contacto
{
    private String nombre;
    private String Mail;

    //Sett-Get
    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getMail() {
        return Mail;
    }



    public void setMail(String mail) {
        Mail = mail;
    }



    public Contacto(String nombre, String Mail)
    {
        this.nombre = nombre;
        this.Mail = Mail;
    }
}
