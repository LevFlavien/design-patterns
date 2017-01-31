
package abstractfactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
                
                ThemeFactory theme;
                
                if (i == 0) {
                    theme = new Theme1();
                } else {
                    theme = new Theme2();
                }
                
                panel.add(theme.createButton());
                panel.revalidate();
            }
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}
