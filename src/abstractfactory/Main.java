/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Poulet
 */
public class Main {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JComboBox jcombo = new JComboBox();
        jcombo.addItem(1);
        jcombo.addItem(2);
        
        panel.add(jcombo);
        
        jcombo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
                //si un bouton est déjà présent
                if (panel.getComponentCount() >= 2) {
                    panel.remove(1);
                }
                
                int i = jcombo.getSelectedIndex();
                
                ButtonFactory button;
                
                if (i == 0) {
                    button = new ButtonTheme1Factory();
                } else {
                    button = new ButtonTheme2Factory();
                }
                
                panel.add(button.createButton());
                panel.revalidate();
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
