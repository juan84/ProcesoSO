package procesoso;
public class Proceso {
    int codigo=0;
    String nombre="";	    
    double tamano=0;
    Proceso liga;

    public Proceso(){}

    public Proceso(int codigo,String nom,double tam) {
        this.codigo=codigo;
        this.nombre=nom;
        this.tamano=tam;
    }

    public Proceso getLiga() {
        return liga;
    }

    public void setLiga(Proceso liga) {
        this.liga = liga;
    }
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
}

