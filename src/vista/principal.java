/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author Ardilla Jedi
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmArticulo = new javax.swing.JMenuItem();
        jmFactura = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmDeslog = new javax.swing.JMenuItem();
        jmCambiar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmGestionArt = new javax.swing.JMenuItem();
        jmGestionUs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inventario");

        jmArticulo.setText("Buscar articulo");
        jmArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArticuloActionPerformed(evt);
            }
        });
        jMenu1.add(jmArticulo);

        jmFactura.setText("Revisar facturas");
        jmFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFacturaActionPerformed(evt);
            }
        });
        jMenu1.add(jmFactura);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Usuarios");

        jmDeslog.setText("Deslogear");
        jMenu2.add(jmDeslog);

        jmCambiar.setText("Cambiar usuario");
        jMenu2.add(jmCambiar);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Admin");

        jmGestionArt.setText("Gestionar artículos");
        jmGestionArt.setToolTipText("");
        jmGestionArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionArtActionPerformed(evt);
            }
        });
        jMenu3.add(jmGestionArt);

        jmGestionUs.setText("Gestionar usuarios");
        jMenu3.add(jmGestionUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmArticuloActionPerformed

    private void jmFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmFacturaActionPerformed

    private void jmGestionArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmGestionArtActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jmArticulo;
    public javax.swing.JMenuItem jmCambiar;
    public javax.swing.JMenuItem jmDeslog;
    public javax.swing.JMenuItem jmFactura;
    public javax.swing.JMenuItem jmGestionArt;
    public javax.swing.JMenuItem jmGestionUs;
    // End of variables declaration//GEN-END:variables
}
