
package abstractfactory;

import javax.swing.JButton;


public class ButtonTheme2Factory implements ButtonFactory{
    
    @Override
    public JButton createButton() {
        return new ButtonTheme2();
    }
}
