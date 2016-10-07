/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rmorales1
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroDeFilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroDeColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNumerodeFilas1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNumerodeColumnas1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNumerodeFilas3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumerodeColumnas3 = new javax.swing.JTextField();
        cmdCrear = new javax.swing.JButton();
        cmdLlenadoManual = new javax.swing.JButton();
        cmdLlenadoAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        cmbOperaciones = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Matrices II"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 36)); // NOI18N
        jLabel1.setText("Operaciones Matrices");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 310, 40));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("No. de Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));

        txtNumeroDeFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroDeFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, -1));

        jLabel3.setText("No. de Columnas: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));

        txtNumeroDeColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroDeColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroDeColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 60, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("No. de Filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel3.add(txtNumerodeFilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel5.setText("No. de Columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel3.add(txtNumerodeColumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 380, 60));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("No. de Filas:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 20));
        jPanel5.add(txtNumerodeFilas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 30, -1));

        jLabel9.setText("No. de Columnas: ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 20));
        jPanel5.add(txtNumerodeColumnas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 350, 60));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        cmdLlenadoManual.setText("Manual");
        cmdLlenadoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cmdLlenadoAutomatico.setText("Automático");
        cmdLlenadoAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLlenadoAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel4.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 480, 60));

        tblTablaResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 370, 300));

        cmbOperaciones.setBackground(new java.awt.Color(204, 204, 255));
        cmbOperaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Letra B.", "Letra M.", "Letra W.", "Letra Q.", "Letra J.", "Letra G.", "Letra R.", "FiguraI.", "FiguraII.", "FiguraIII." }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 180, 30));

        tblTablaInicial.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 380, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1098, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed

        if (txtNumeroDeFilas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese No. Filas", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroDeFilas.requestFocusInWindow();

            JButton botonesH[] = {cmdCrear, cmdLimpiar};
            JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        } else if (txtNumeroDeColumnas.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese No. Columnas", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumeroDeColumnas.requestFocusInWindow();

            JButton botonesH[] = {cmdCrear, cmdLimpiar};
            JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        } else {
            int nf, nc;
            DefaultTableModel tm, tm2;

            nf = Integer.parseInt(txtNumeroDeFilas.getText());
            nc = Integer.parseInt(txtNumeroDeColumnas.getText());

            if (nf == 0) {
                JOptionPane.showMessageDialog(this, "No. Filas no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);

                txtNumeroDeFilas.requestFocusInWindow();

            } else if (nc == 0) {
                JOptionPane.showMessageDialog(this, "No. Columnas no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumeroDeColumnas.requestFocusInWindow();

            } else if (nc != nf) {
                JOptionPane.showMessageDialog(this, "Se desea que el No. Filas sean iguales al No. Columnas");

            } else if (nc > 10 || nf > 10) {
                JOptionPane.showMessageDialog(this, "No se aceptan No. Filas, ni No. de Columnas mayor a 10 ", "Error", JOptionPane.ERROR_MESSAGE);
                txtNumeroDeColumnas.selectAll();
                txtNumeroDeFilas.selectAll();
                txtNumeroDeFilas.requestFocusInWindow();

            } else {

                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm2 = (DefaultTableModel) tblTablaResultado.getModel();

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                JButton botonesH[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdLimpiar};
                JButton botonesD[] = {cmdCrear, cmdOperacion};

                if (nc <= 10 || nf <= 10) {
                    JOptionPane.showMessageDialog(this, "El número es aceptable");

                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);

                }
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLlenadoAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoAutomaticoActionPerformed
        int nf, nc, n;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);


    }//GEN-LAST:event_cmdLlenadoAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed

        int op;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);

        switch (op) {
            case 0:
                Helper.letraB(tblTablaInicial, tblTablaResultado);
                break;

            case 1:
                Helper.letraM(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.letraW(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.letraQ(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.letraJ(tblTablaInicial, tblTablaResultado);
                break;
            case 5:
                Helper.letraG(tblTablaInicial, tblTablaResultado);
                break;
            case 6:
                Helper.letraR(tblTablaInicial, tblTablaResultado);
                break;
            case 7:
                Helper.figuraI(tblTablaInicial, tblTablaResultado);
                break;
            case 8:
                Helper.figuraII(tblTablaInicial, tblTablaResultado);
                break;
            case 9:
                Helper.figuraIII(tblTablaInicial, tblTablaResultado);
                break;
        }

        JButton botonesH[] = {cmdLimpiar, cmdOperacion};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);


    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed

        DefaultTableModel tm, tm2;

        txtNumeroDeFilas.setText("");
        txtNumeroDeColumnas.setText("");
        txtNumeroDeFilas.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdLlenadoManual, cmdLlenadoAutomatico, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

        tm = (DefaultTableModel) tblTablaInicial.getModel();
        tm2 = (DefaultTableModel) tblTablaResultado.getModel();

        tm.setRowCount(0);
        tm.setColumnCount(0);

        tm2.setRowCount(0);
        tm2.setColumnCount(0);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtNumeroDeFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeFilasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDeFilasKeyTyped

    private void txtNumeroDeColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDeColumnasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroDeColumnasKeyTyped

    private void cmdLlenadoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoManualActionPerformed
        int nf, nc, n, sw, res;;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);

                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdLlenadoManual, cmdLlenadoAutomatico};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLlenadoManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbOperaciones;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenadoAutomatico;
    private javax.swing.JButton cmdLlenadoManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumeroDeColumnas;
    private javax.swing.JTextField txtNumeroDeFilas;
    private javax.swing.JTextField txtNumerodeColumnas1;
    private javax.swing.JTextField txtNumerodeColumnas3;
    private javax.swing.JTextField txtNumerodeFilas1;
    private javax.swing.JTextField txtNumerodeFilas3;
    // End of variables declaration//GEN-END:variables
}
