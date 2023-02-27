
package Models;

import javax.swing.JOptionPane;


public class Docente extends Personal {
    String [] Materias = new String[3];
    
    public Docente(){}
    
    private void CrearMaterias(){
        for(int a=0;a<3;a++){
            String Materia = JOptionPane.showInputDialog("Dar Nombre de Materia:");
            Materias[a] = Materia;
        }
    }
    private String[] MostrarMaterias(){
        return Materias;
    }
    
}
