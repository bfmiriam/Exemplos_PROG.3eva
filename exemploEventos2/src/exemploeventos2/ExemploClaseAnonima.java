package exemploeventos2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExemploClaseAnonima {

    //utilizando unha clase interna
    JFrame marco;
    JPanel panel;
    JButton bAzul, bVer, bAma;

    public ExemploClaseAnonima() {
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
//        PonColor color = new PonColor();
        bAzul.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.blue);
            }
        });

        bVer.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.RED);
            }
        });
       bAma.addActionListener(new ActionListener()  {
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.YELLOW);
            }
        });
    

    marco.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

    marco.setVisible (true);
    }
    
}
