package Ejercicio3;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtPeso, txtTalla;
    JButton btnCalcular,btnLimpiar;
    JLabel etiMC;

    public Vista() {
        this.setTitle("EJERCICIO 2");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());

        txtPeso = new JTextField();
        this.getContentPane().add(txtPeso, new AbsoluteConstraints(20, 20, 200, 30));
        txtTalla = new JTextField();
        this.getContentPane().add(txtTalla, new AbsoluteConstraints(20, 60, 200, 30));
        btnCalcular = new JButton("Calcular");
        this.getContentPane().add(btnCalcular, new AbsoluteConstraints(20, 100, 100, 30));
        btnLimpiar = new JButton("Limpiar");
        this.getContentPane().add(btnLimpiar, new AbsoluteConstraints(150, 100, 100, 30));
        etiMC = new JLabel();
        this.getContentPane().add(etiMC, new AbsoluteConstraints(20, 140, 200, 30));
        etiMC.setBorder(new LineBorder(Color.black));
        etiMC.setOpaque(true);
    }

    public static void main(String[] args) {
        Vista c = new Vista();
        c.setVisible(true);
    }

}
