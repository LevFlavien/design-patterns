package decorator;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JComboBox jcombo = new JComboBox();
        jcombo.addItem(1);
        jcombo.addItem(2);
        jcombo.addItem(3);

        panel.add(jcombo);
        
        Button button = new Button(50, 50);
        panel.add(button.getButton());
        
        jcombo.addActionListener((ActionEvent e) -> {
            //si un bouton est déjà présent
            if (panel.getComponentCount() >= 2) {
                panel.remove(1);
                panel.add(button.getButton());
                System.out.println("removed");
            }

            int i = jcombo.getSelectedIndex();

            System.out.println(i);

            switch (i) {
                case 0:
                    BlueButton blueButton = new BlueButton(button);
                    panel.add(blueButton.getButton());
                    System.out.println(blueButton.getColor());
                    break;
                case 1:
                    UpperCaseButton upperCaseButton = new UpperCaseButton(button);
                    panel.add(upperCaseButton.getButton());
                    break;
                case 2:
                    BorderedButton borderedButton = new BorderedButton(button);
                    panel.add(borderedButton.getButton());
                    break;
            }
            
            panel.revalidate();
        });

        frame.add(panel);
        frame.setVisible(true);
    }

}
