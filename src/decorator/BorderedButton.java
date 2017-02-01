package decorator;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class BorderedButton implements IButton {

    private final IButton button;

    public BorderedButton(IButton button) {
        this.button = button;        
        this.button.getButton().setBorder(BorderFactory.createLineBorder(Color.black,8));
    }

    @Override
    public Color getColor() {
        return button.getColor();
    }

    @Override
    public JButton getButton() {
        return button.getButton();
    }

    @Override
    public String getText() {
        return button.getText();
    }
}
