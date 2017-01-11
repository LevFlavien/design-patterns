
package abstractfactory;

import javax.swing.JButton;


public class Theme1 implements ThemeFactory {

    @Override
    public JButton createButton() {
        return new Theme1Button();
    }

    @Override
    public String toString() {
        return "Theme1";
    }
    
}

