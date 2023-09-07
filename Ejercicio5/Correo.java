package Ejercicio5;

import java.util.List;

public class Correo
{
    private String asunto;
    private String texto;
    private Contacto origen;
    private List<Correo> Correos;
    private List<Contacto> destinatino;
    private boolean leido;
    
    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Contacto getOrigen() {
        return origen;
    }

    public void setOrigen(Contacto origen) {
        this.origen = origen;
    }

    public List<Correo> getCorreos() {
        return Correos;
    }

    public void setCorreos(List<Correo> correos) {
        Correos = correos;
    }

    public List<Contacto> getDestinatino() {
        return destinatino;
    }

    public void setDestinatino(List<Contacto> destinatino) {
        this.destinatino = destinatino;
    }

    public boolean  getLeido()
    {
        return this.leido;
    }

    public void setLeido(boolean leido)
    {
        this.leido = leido;
    }

    public Correo(String asunto, String texto, Contacto origen, boolean leido)
    {
        this.asunto = asunto;
        this.texto = texto;
        this.origen = origen;
        if (leido)
        {
            this.leido = true;            
        }
        else
        {
            this.leido = false;
        }
    }

    public void leer(Correo c)
    {
        c.setLeido(true);
    }
}
