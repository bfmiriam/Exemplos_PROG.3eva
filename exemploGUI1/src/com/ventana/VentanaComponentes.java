
package com.ventana;

import javax.swing.*;


public class VentanaComponentes {
    
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,botonLimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes(){
        
        marco = new JFrame(" ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("USUARIO");
        etContrasinal = new JLabel("CONTRASINAL");
        boton1 = new JButton("inxire");
        botonLimpar = new JButton("limpa");
        jtUsuario = new JTextField(10);
        jpContrasinal = new JPasswordField(4);
        
        marco.setSize(600, 300);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(botonLimpar);
        marco.add(panel);
        
        //marco.pack();
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
}
