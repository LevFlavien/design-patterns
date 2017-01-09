/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import javax.swing.JButton;

/**
 *
 * @author Poulet
 */
public class ButtonTheme2Factory implements ButtonFactory{
    
    @Override
    public JButton createButton() {
        return new ButtonTheme2();
    }
}
