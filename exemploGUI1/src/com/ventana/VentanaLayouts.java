
package com.ventana;

import java.awt.*;
import javax.swing.*;


public class VentanaLayouts {
    
   JFrame marco = new JFrame("Ventana Layouts");
    JPanel panel  = new JPanel();
    JButton boton1 = new JButton("boton1");
    JButton boton2 = new JButton("boton2");
    JButton boton3 = new JButton("boton3");
    JButton boton4 = new JButton("boton4");
    JButton boton5 = new JButton("boton5");
    
    public void flowLayout(){
        //aplicamos caracteristicas
        boton1.setBackground(Color.red);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.yellow);
        boton5.setBackground(Color.pink);
        marco.setSize(600,300);
        
        //aplicamos o layout antes de meter os componentes
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void boxLayout(){
        //aplicamos caracteristicas
        boton1.setBackground(Color.red);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.yellow);
        boton5.setBackground(Color.pink);
        marco.setSize(600,300);
        
        //aplicamos o layout antes de meter los componentes
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.pack();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void borderLayout(){
        //aplicamos caracteristicas
        boton1.setBackground(Color.red);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.yellow);
        boton5.setBackground(Color.pink);
        marco.setSize(600,300);
        
        //aplicamos o layout antes de meter los componentes
        panel.setLayout(new BorderLayout());
        
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.SOUTH);
        panel.add(boton3,BorderLayout.EAST);
        panel.add(boton4,BorderLayout.WEST);
        panel.add(boton5,BorderLayout.CENTER);
        marco.add(panel);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void gridLayout(){
        //aplicamos caracteristicas
        boton1.setBackground(Color.red);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.yellow);
        boton5.setBackground(Color.pink);
        marco.setSize(600,300);
        
        //aplicamos o layout antes de meter los componentes
        panel.setLayout(new GridLayout(2,3));
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.pack();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
