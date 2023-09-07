package Ejercicio5;

import java.util.List;

public class GestorCorreo 
{

    private Cuenta Cuenta;          //Esto es para vincular ClienteCorreo con Cuenta(Asosiacion)
    
    private List<Correo> Enviados;  //Estos 3 son para hacer las colecciones de las otras entidades
    private List<Correo> Recibidos;
    private List<Contacto> Contactos;

    //Sett-Get



    public GestorCorreo(List<Correo> enviados, List<Correo> recibidos, List<Contacto> contactos)
    {
        Enviados = enviados;
        Recibidos = recibidos;
        Contactos = contactos;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        Cuenta = cuenta;
    }



    //Metodos

    public int cantidadDeCorreosRecibidos()
    {
        return Recibidos.size();
    }

    public int cantidadDeCorreosEnviados()
    {
        return Enviados.size();
    }

    public int cantidadDeCorreos()
    {
        return Enviados.size() + Recibidos.size();  //.size() devuelve la cantidad de elementos de la lista
    }

    public int cantidadDeCorreosNoLeidos(){ 
        int correoNoLeido = 0;
        for (Correo c : Recibidos)
        {
            if(!c.getLeido())
            {
                correoNoLeido++;
            }
        }
        return correoNoLeido;
    }

    public int cantidadDeContactos()
    {
        return Contactos.size();
    }

    public void agregarCorreoRecibido(Correo correo)
    {
        Recibidos.add(correo);//Esto agrega el correo que pasas por parametro a la lista
    }
}