/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Dimension;

/**
 *
 * @author Alumno
 */
public class Ejercicio1 extends javax.swing.JFrame implements ActionListener {

    private boolean inicioNuevoNumero = true;
    private double num1 = 0;
    private String operador = "";
    
    public Ejercicio1() {
        initComponents();
        conectarBotones();
        configuracionForm();
    }
    
    private void configuracionForm() {
        setLocationRelativeTo(null);
        
        Dimension tamMinimo = new Dimension(240,300);
        Dimension tamMaximo = new Dimension(240,300);
        
        setMinimumSize(tamMinimo);
        setMaximumSize(tamMaximo);
    }
    
    // Nuevo método para conectar todos los botones
    private void conectarBotones() {
        // Botones Numéricos
        btnCero.addActionListener(this);
        btnUno.addActionListener(this);
        btnDos.addActionListener(this);
        btnTres.addActionListener(this);
        btnCuatro.addActionListener(this);
        btnCinco.addActionListener(this);
        btnSeis.addActionListener(this);
        btnSiete.addActionListener(this);
        btnOcho.addActionListener(this);
        btnNueve.addActionListener(this);

        // Botones de Operación
        btnSumar.addActionListener(this);
        btnRestar.addActionListener(this);
        btnMultiplicar.addActionListener(this);
        btnDividir.addActionListener(this);
        

        btnIgual.addActionListener(this);
        btnLimpiar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();
        
        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9'){
            if (inicioNuevoNumero) {
                txtResultado.setText(comando);
                inicioNuevoNumero = false;
            } else {
                // Previene múltiples ceros iniciales si solo hay un 0
                if (txtResultado.getText().equals("0") && comando.equals("0")) {
                    return;
                }
                // Si el display es "0", lo reemplaza con el nuevo dígito
                if (txtResultado.getText().equals("0")) {
                     txtResultado.setText(comando);
                } else {
                    txtResultado.setText(txtResultado.getText() + comando);
                }
            }
        }
        // 2. Manejo de operaciones (+, -, *, /)
        else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            try {
                // Almacena el número actual y el operador
                num1 = Double.parseDouble(txtResultado.getText());
                operador = comando;
                inicioNuevoNumero = true;
            } catch (NumberFormatException ex) {
                txtResultado.setText("Error");
                inicioNuevoNumero = true;
                num1 = 0;
            }
        }
        // 3. Manejo del botón Igual (=)
        else if (comando.equals("=")) {
            if (!operador.isEmpty() && !inicioNuevoNumero) {
                try {
                    double num2 = Double.parseDouble(txtResultado.getText());
                    double resultado = calcular(num1, num2, operador);
                    txtResultado.setText(String.valueOf(resultado));
                    
                    // Prepara la calculadora para la siguiente operación
                    num1 = resultado;
                    operador = "";
                    inicioNuevoNumero = true;
                } catch (NumberFormatException ex) {
                    txtResultado.setText("Error");
                    num1 = 0;
                    operador = "";
                    inicioNuevoNumero = true;
                }
            }
        }
        // 4. Manejo del botón Limpiar (C)
        else if (comando.equals("C")) {
            txtResultado.setText("0");
            num1 = 0;
            operador = "";
            inicioNuevoNumero = true;
        }
    }
    
    // Función para realizar el cálculo
    private double calcular(double n1, double n2, String op) {
        switch (op) {
            case "+": return n1 + n2;
            case "-": return n1 - n2;
            case "*": return n1 * n2;
            case "/": 
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                    return 0; // O manejar el error de otra forma
                }
                return n1 / n2;
            default: return 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnNueve = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        Titulo = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(221, 300));
        setMinimumSize(new java.awt.Dimension(221, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, -1));

        btnNueve.setText("9");
        getContentPane().add(btnNueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 60, -1));

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        btnOcho.setText("8");
        getContentPane().add(btnOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));

        btnSeis.setText("6");
        getContentPane().add(btnSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, -1));

        btnCuatro.setText("4");
        getContentPane().add(btnCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, -1));

        btnCinco.setText("5");
        getContentPane().add(btnCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        btnTres.setText("3");
        getContentPane().add(btnTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, -1));

        btnCero.setText("0");
        getContentPane().add(btnCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 200, -1));

        btnDos.setText("2");
        getContentPane().add(btnDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 60, -1));

        btnUno.setText("1");
        getContentPane().add(btnUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, -1));

        btnDividir.setText("/");
        getContentPane().add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 40, -1));

        btnLimpiar.setText("C");
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 90, -1));

        btnRestar.setText("-");
        getContentPane().add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, -1));

        btnMultiplicar.setText("*");
        getContentPane().add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 40, -1));

        btnSumar.setText("+");
        getContentPane().add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 40, -1));

        btnIgual.setText("=");
        getContentPane().add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        Titulo.setAlignment(java.awt.Label.CENTER);
        Titulo.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Titulo.setName(""); // NOI18N
        Titulo.setText("CALCULADORA");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSieteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Titulo;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
