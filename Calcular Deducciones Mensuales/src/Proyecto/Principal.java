/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import javax.swing.ImageIcon;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author º1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Deducciones c=new Deducciones();
       c.setVisible(true);
       c.setDefaultCloseOperation(EXIT_ON_CLOSE);
       c. setLocationRelativeTo(null);
       c.setTitle("Deducciones");
       c.setLayout(null);     
    }
    
}
