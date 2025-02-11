package view;

public class FrmInicio extends javax.swing.JFrame {

    public FrmInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSAdC = new javax.swing.JLabel();
        btnBuscarCarro = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNuevoCarro = new javax.swing.JButton();
        btnEliminarCarro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 380));

        lblSAdC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSAdC.setText("Sistema Administracion de Carros");

        btnBuscarCarro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarCarro.setText("Buscar Carro");
        btnBuscarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCarroActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setText("Editar Carro");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNuevoCarro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNuevoCarro.setText("Nuevo Carro");
        btnNuevoCarro.setActionCommand("Nuevo Carro");
        btnNuevoCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCarroActionPerformed(evt);
            }
        });

        btnEliminarCarro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarCarro.setText("Eliminar Carro");
        btnEliminarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCarroActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarCarro)
                            .addComponent(btnNuevoCarro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarCarro)
                            .addComponent(btnEditar)))
                    .addComponent(lblSAdC))
                .addGap(58, 58, 58))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblSAdC)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnBuscarCarro))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCarro)
                    .addComponent(btnEliminarCarro))
                .addGap(28, 28, 28)
                .addComponent(btnSalir)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCarroActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCarroActionPerformed
        
        FrmNuevoCarro nuevoCarro = new FrmNuevoCarro();
        nuevoCarro.setLocationRelativeTo(null);
        nuevoCarro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNuevoCarroActionPerformed

    private void btnEliminarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCarroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCarro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarCarro;
    private javax.swing.JButton btnNuevoCarro;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSAdC;
    // End of variables declaration//GEN-END:variables
}
