
package com.ventana;

import javax.swing.*;


public class VentanaComponentes2 {
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,botonLimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes2(){
        
        marco = new JFrame(" ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("USUARIO");
        etContrasinal = new JLabel("CONTRASINAL");
        boton1 = new JButton("inxire");
        boton1.setToolTipText("inxire os datos");
        botonLimpar = new JButton("limpa");
        jtUsuario = new JTextField(7);
        jpContrasinal = new JPasswordField(4);
        
    marco.setSize(500,300);
        
        etUsuario.setBounds(150, 50, 80, 30);
        panel.add(etUsuario);
        jtUsuario.setBounds(225, 55, 100, 25);
        panel.add(jtUsuario);
        etContrasinal.setBounds(130, 100, 100, 30);
        panel.add(etContrasinal);
        jpContrasinal.setBounds(225, 105, 100, 25);
        panel.add(jpContrasinal);
        boton1.setBounds(130, 160, 100, 30);
        panel.add(boton1);
        botonLimpar.setBounds(250, 160, 100, 30);
        panel.add(botonLimpar);
        panel.setLayout(null);
        
        marco.add(panel);
       
        //marco.pack();
        panel.setLayout(null);
         marco.add(panel);
        
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
}
