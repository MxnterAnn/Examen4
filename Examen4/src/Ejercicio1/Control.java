package Ejercicio1;

import java.awt.event.*;
import javax.swing.*;

public class Control implements ActionListener {

    Vista a;
    double n1, n2,p;

    public Control() {
        a = new Vista();
        a.setVisible(true);
        a.btnDivision.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        n1 = Double.parseDouble(a.txtA.getText());
        n2 = Double.parseDouble(a.txtB.getText());

        double p = (n1 / n2);
        a.etiResultado.setText("" + p);
        if(n1==0){
        JOptionPane.showMessageDialog(a, "Error");
        }
        if(n2==0){
        JOptionPane.showMessageDialog(a, "Error");
        }

    }
    public static void main(String[] args) {
        Control c = new Control();
    }

}
