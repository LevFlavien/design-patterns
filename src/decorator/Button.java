package decorator;

import java.awt.Color;
import javax.swing.JButton;


public class Button implements IButton {

    JButton button;
    int height;
    int width;
    Color color = Color.white;

    public Button(int width, int height) {
        this.width = width;
        this.height = height;
        button = new JButton("Bouton");
        button.setSize(width, height);
        button.setBackground(color);
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public JButton getButton() {
        return button;
    }

    @Override
    public String getText() {
        return button.getText();
    }
}
