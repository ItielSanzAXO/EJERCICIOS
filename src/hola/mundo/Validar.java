/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author ItielSanz
 */
public class Validar {
        public void validarSoloLetreas(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
            if(Character.isDigit(c)){
                e.consume();
                System.out.println("car: "+c);
            }
            }
        });
    }
    public void validarSoloNumeros(JTextField campo){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
            if(!Character.isDigit(c)){
                e.consume();
                System.out.println("car: "+c);
            }
            }
        });
    }
    public void limitarCaracteres(JTextField campo, int cantidad){
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
            char c = e.getKeyChar();
            int tam=campo.getText().length();
            if(tam>=cantidad){
                e.consume();
                System.out.println("car: "+c);
            }
            }
        });
    }

    public static class v {

        public v() {
        }
    }
}
