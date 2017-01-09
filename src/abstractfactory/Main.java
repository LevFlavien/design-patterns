/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Poulet
 */
public class Main {
    
    public static void main(String[] args) {
        String theme = "2";
        JFrame jframe = new JFrame();
        jframe.setSize(300,300);
        
        if (theme.equals("1")) {
            ButtonFactory button = new ButtonTheme1Factory();
            jframe.add(button.createButton());
        } else {
            ButtonFactory button = new ButtonTheme2Factory();
            jframe.add(button.createButton());
        }
        jframe.setVisible(true);
    }
    
}
