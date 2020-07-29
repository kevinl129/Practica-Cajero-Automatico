/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    ArrayList<UsuarioCajero> MenuUsuario = new ArrayList<>();
    int numusuario;

    public Menu(ArrayList<UsuarioCajero> MenuUsuario, int numusuario) {
        this.MenuUsuario = MenuUsuario;
        this.numusuario = numusuario;
        initComponents();
        label_bienvenido.setText("Bienvenido "+ MenuUsuario.get(numusuario).usuario);
    }
    boolean retirar = false;
    boolean depositar = false;
    boolean consultar = false;
    boolean salir=false;
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btn_consultar = new javax.swing.JToggleButton();
        btn_depositar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btn_retirardinero = new javax.swing.JToggleButton();
        label_bienvenido = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        btn_consultar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_consultar.setText("Hacer consulta");
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_depositar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_depositar.setText("Depositar");
        btn_depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depositarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel1.setText("MENU");

        btn_retirardinero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_retirardinero.setText("Retirar dinero");
        btn_retirardinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retirardineroActionPerformed(evt);
            }
        });

        label_bienvenido.setBackground(new java.awt.Color(153, 153, 255));
        label_bienvenido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btn_salir.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btn_consultar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_depositar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_retirardinero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(label_bienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btn_salir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_retirardinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_consultar)
                                .addComponent(btn_depositar))
                            .addComponent(btn_salir)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(label_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btn_retirardinero)
                .addGap(18, 18, 18)
                .addComponent(btn_consultar)
                .addGap(18, 18, 18)
                .addComponent(btn_depositar)
                .addGap(41, 41, 41)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//RETIRAR DINERO
    private void btn_retirardineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retirardineroActionPerformed
        retirar = true;
        RetirarDinero retirar_dinero = new RetirarDinero(MenuUsuario, numusuario);
        retirar_dinero.setVisible(retirar);
        retirar_dinero.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_retirardineroActionPerformed
//CONSULTAR SALDO
    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        consultar = true;
        Consultar consultar_dinero = new Consultar(MenuUsuario, numusuario);
        consultar_dinero.setVisible(consultar);
        consultar_dinero.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_consultarActionPerformed
//DEPOSITAR DINERO
    private void btn_depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depositarActionPerformed
        depositar = true;
        Depositar depositar_dinero = new Depositar(MenuUsuario, numusuario);
        depositar_dinero.setVisible(depositar);
        depositar_dinero.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_depositarActionPerformed
//SALIR
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        salir=true;
                Archivo escritura = new Archivo();
        escritura.escribir(MenuUsuario);
        CajeroAutomatico cajero_automatico=new CajeroAutomatico();
        cajero_automatico.setVisible(salir);
        cajero_automatico.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btn_consultar;
    public javax.swing.JToggleButton btn_depositar;
    public javax.swing.JToggleButton btn_retirardinero;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_bienvenido;
    // End of variables declaration//GEN-END:variables

}