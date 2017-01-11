
package abstractfactory;

import javax.swing.JButton;


public class Theme2 implements ThemeFactory{
    
    @Override
    public JButton createButton() {
        return new Theme2Button();
    }
    
    @Override
    public String toString() {
        return "Theme2";
    }
}
