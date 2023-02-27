package Models;

public class Estudiantes extends Itiz{
    String Nocontrol;
    String Carrera;
    String Semestre;
    
    public Estudiantes(String Nocontrol,
    String Carrera, String Semestre){
        this.Nocontrol = Nocontrol;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }
    public void setNocontrol(String Nocontrol){this.Nocontrol = Nocontrol;}
    public String getNocontrol(){return this.Nocontrol;}
    
    public void setCarrera(String Carrera){this.Carrera = Carrera;}
    public String getCarrera(){return this.Carrera;}
    
    public void setSemestre(String Semestre){this.Semestre = Semestre;}
    public String getSemestre(){return this.Semestre;}
}
