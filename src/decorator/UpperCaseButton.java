package decorator;

import java.awt.Color;
import javax.swing.JButton;


public class UpperCaseButton implements IButton {

    private final IButton button;

    public UpperCaseButton(IButton button) {
        this.button = button;
        this.button.getButton().setText(getText().toUpperCase());
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
        return button.getText().toUpperCase();
    }
}
