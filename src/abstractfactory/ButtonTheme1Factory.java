
package abstractfactory;

import javax.swing.JButton;


public class ButtonTheme1Factory implements ButtonFactory {

    @Override
    public JButton createButton() {
        return new ButtonTheme1();
    }
}

