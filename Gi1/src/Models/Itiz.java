
package Models;
import java.util.ArrayList; //Libreria para Almanenar Objetos

public class Itiz implements Operaciones {
    ArrayList<Itiz> Base;
    public String Nombre;
    public String Correo;
    public String Direccion;
    public String Telefono;
    
    public Itiz(){}
    public Itiz(ArrayList<Itiz> Base){
        this.Base = Base;
    }

    @Override
    public void Registrar(Itiz Guardar) { 
        this.Base.add(Guardar);
    }

    @Override
    public void Actualizar() {}

    @Override
    public void Eliminar() {}

    @Override
    public void Mostrar() {}
}
