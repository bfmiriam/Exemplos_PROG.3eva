
package com.ventana;

import java.awt.*;
import javax.swing.*;

public class VentanaMixLayout {
    JFrame marco = new JFrame("Ventana Componentes");
    JPanel panel1  = new JPanel();
    JPanel panel2  = new JPanel();
    JLabel etUsuario = new JLabel("Usuario:");
    JLabel etPass = new JLabel("Contrasinal:");
    JButton boton1 = new JButton("boton1");
    JButton boton2 = new JButton("boton2");
    JButton boton3 = new JButton("boton3");
    JTextField jtUsuario = new JTextField(5);
    JPasswordField jpPass = new JPasswordField(5);
    
    public VentanaMixLayout(){
        marco.setSize(600,300);
        
        panel1.setLayout(new GridLayout(2,2));
        //panel1.setBounds(200, 50, 200, 50);
        panel1.add(etUsuario);
        panel1.add(jtUsuario);
        panel1.add(etPass);
        panel1.add(jpPass);

        
        panel2.setLayout(new FlowLayout());
        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);

        marco.add(panel1);
        marco.add(panel2,BorderLayout.SOUTH);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
}