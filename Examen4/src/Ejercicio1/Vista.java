
package Ejercicio1;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;


public class Vista extends JFrame{
    JTextField txtA,txtB;
    JButton btnDivision;
    JLabel etiResultado;

    public Vista() {
        this.setTitle("EJERCICIO 1");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        txtA = new JTextField();
        this.getContentPane().add(txtA, new AbsoluteConstraints              (20, 20, 200, 30));
        txtB = new JTextField();
        this.getContentPane().add(txtB, new AbsoluteConstraints              (20, 60, 200, 30));
        btnDivision = new JButton("Calcular División");
        this.getContentPane().add(btnDivision, new AbsoluteConstraints       (20, 100, 200, 30));
        etiResultado = new JLabel();
        this.getContentPane().add(etiResultado, new AbsoluteConstraints      (20, 140, 200, 30));
        etiResultado.setBorder(new LineBorder(Color.black));
        etiResultado.setOpaque(true);
    }
    
    public static void main(String[] args) {
        Vista a=new Vista();
        a.setVisible(true);
    }
    
}
