
package com.ventana;

import java.awt.Color;
import javax.swing.*;


public class Ventana {
    
    JFrame marco;
    JPanel panel1, panel2;
    
    public Ventana(){
       
        //instanciamos
        marco = new JFrame("GUI 1"); //titulo de la ventana
        marco.setSize(800, 400); //cambia las dimensiones de la ventana
        panel1 = new JPanel();
        panel2 = new JPanel();
        //caracteristicas
        panel1.setBounds(0, 0, 800, 150);
        panel1.setBackground(Color.BLUE);
        panel2.setBounds(0, 200, 800, 150);
        panel2.setBackground(Color.MAGENTA);
        marco.setLayout(null);
        
        
        marco.add(panel1);
        marco.add(panel2);
        
        
       // marco.setLocationRelativeTo(marco);//centra la ventana
       // marco.pack(); //los componentes se ajustan a la ventana
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para el programa al cerrar la ventana
        
        marco.setVisible(true); // hace la ventana visible
    }
}
