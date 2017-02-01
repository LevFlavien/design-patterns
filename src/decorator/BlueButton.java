package decorator;

import java.awt.Color;
import javax.swing.JButton;


public class BlueButton implements IButton {

    private final IButton button;

    public BlueButton(IButton button) {
        this.button = button;
        this.button.getButton().setBackground(Color.blue);
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
