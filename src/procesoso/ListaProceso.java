package procesoso;

import javax.swing.table.DefaultTableModel;

public class ListaProceso {
    Proceso inicio=null;
    Proceso fin=null;
    public void crearprimerproceso
    (
    int pCodigo,
    String pNombre,	    
    double pTamano
    )
    {
        Proceso temp=new Proceso();
        temp.codigo=pCodigo;
        temp.nombre=pNombre;
        temp.tamano=pTamano;
        temp.liga=null;
        inicio=temp;
        fin=temp;
    }
    
    public Proceso listaprocesos()
    {
        Proceso temp;
        temp=inicio;
        temp=fin;
        
        while (temp!=null)
        {
            System.out.println("Codigo->" + temp.getCodigo());
            System.out.println("Nombre->" + temp.getNombre());
            System.out.println("Tamaño->" + temp.getTamano());
            temp=temp.liga;
        }        
        return temp;
    }    
    
    public void crearproyecto
    (
    int pCodigo,
    String pNombre,	    
    double pTamano
    )
    {
        Proceso temp=new Proceso();
        temp.codigo=pCodigo;
        temp.nombre=pNombre;
        temp.tamano=pTamano;          
        if (inicio==null)
        {                        
            temp.liga=null;            
        }
        else
        {                     
            temp.liga=inicio;                        
        }
        
        inicio=temp;
    }
}
