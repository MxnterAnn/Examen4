package Ejercicio2;

import java.awt.event.*;
import javax.swing.*;

public class Control implements ActionListener {

    Vista b;
    double sb, m, pt, rf;

    public Control() {
        b = new Vista();
        b.setVisible(true);
        b.btnCalcular.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        sb = Double.parseDouble(b.txtSueldoBase.getText());
        m = Double.parseDouble(b.txtMeses.getText());
        double pt = sb * .10;
        double rf = (sb - pt) * m;

        String o = JOptionPane.showInputDialog(b, "Introduce Password");
        if (o.equals("12345")) {

            b.etiResultado.setText("" + rf);
        } else {
            JOptionPane.showMessageDialog(b, "Error");

        }

    }

    public static void main(String[] args) {
        Control c = new Control();
    }
}
