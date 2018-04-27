
package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Evento implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton bAzul,bVer,bAma;
    
    public Evento(){
        marco = new JFrame("ventana eventos");
        panel = new JPanel();
        bAzul = new JButton("cian");
        bVer = new JButton("vermello");
        bAma = new JButton("amarelo");
        
        marco.setSize(400, 200);
        panel.add(bAzul);
        panel.add(bVer);
        panel.add(bAma);
        marco.add(panel);
        bAzul.addActionListener(this);
        bVer.addActionListener(this);
        bAma.addActionListener(this);
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if(boton == bAzul)
        panel.setBackground(Color.CYAN);
        else if(boton == bVer)
            panel.setBackground(Color.red);
        else
            panel.setBackground(Color.YELLOW);
    }
}
