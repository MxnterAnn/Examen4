package Ejercicio3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Control implements ActionListener {

    Vista c;
    double p, t = 0;

    public Control() {
        c = new Vista();
        c.setVisible(true);
        c.btnCalcular.addActionListener(this);
        c.btnLimpiar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (c.btnLimpiar == ae.getSource()) {
            c.txtPeso.setText("");
            c.txtTalla.setText("");
            c.etiMC.setText("");

        }
        p = Double.parseDouble(c.txtPeso.getText());
        t = Double.parseDouble(c.txtTalla.getText());
        double imc;

        imc = p / (t * t);
        if (imc <= 18) {
            JOptionPane.showMessageDialog(c, "Usted tiene anorexia");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 18 && imc <= 20) {
            JOptionPane.showMessageDialog(c, "Usted tiene delgadez");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 20 && imc <= 27) {
            JOptionPane.showMessageDialog(c, "Usted tiene normalidad");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 27 && imc <= 30) {
            JOptionPane.showMessageDialog(c, "Usted tiene obecidad (Grado 1)");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 30 && imc <= 35) {
            JOptionPane.showMessageDialog(c, "Usted tiene obecidad (Grado 2)");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 35 && imc <= 40) {
            JOptionPane.showMessageDialog(c, "Usted tiene obecidad (Grado 3)");
            c.etiMC.setText(" " + imc);

        }
        if (imc >= 40) {
            JOptionPane.showMessageDialog(c, "Usted tiene obesidad morbida");
            c.etiMC.setText(" " + imc);

        }

    }

    public static void main(String[] args) {
        Control d = new Control();
    }
}
