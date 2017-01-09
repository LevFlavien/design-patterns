/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Poulet
 */
public class ButtonTheme2 extends JButton {
    
    public ButtonTheme2() {
        super("theme 2");
        setBackground(Color.red);
    }
}
