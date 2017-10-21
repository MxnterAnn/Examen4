package Ejercicio2;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtSueldoBase, txtMeses;
    JButton btnCalcular;
    JLabel etiResultado;

    public Vista() {
        this.setTitle("EJERCICIO 2");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());

        txtSueldoBase = new JTextField();
        this.getContentPane().add(txtSueldoBase, new AbsoluteConstraints(20, 20, 200, 30));
        txtMeses = new JTextField();
        this.getContentPane().add(txtMeses, new AbsoluteConstraints(20, 60, 200, 30));
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(20, 100, 200, 30));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints(20, 140, 200, 30));
        etiResultado.setBorder(new LineBorder(Color.black));
        etiResultado.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista b = new Vista();
        b.setVisible(true);
    }

}
