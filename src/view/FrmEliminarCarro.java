package view;

import controller.CarroDAO;
import javax.swing.JOptionPane;
import model.Carro;

public class FrmEliminarCarro extends javax.swing.JFrame {

    public FrmEliminarCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEliminarCarro = new javax.swing.JLabel();
        lblIDCarro = new javax.swing.JLabel();
        txtIDCarro = new javax.swing.JTextField();
        lblDatosCarro = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEliminarCarro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEliminarCarro.setText("Eliminar Carro");

        lblIDCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIDCarro.setText("Id del Carro:");
        lblIDCarro.setToolTipText("");

        txtIDCarro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIDCarro.setToolTipText("");

        lblDatosCarro.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblDatosCarro.setText("Datos del Carro");
        lblDatosCarro.setToolTipText("");

        lblMarca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMarca.setText("Marca");

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMarca.setToolTipText("");

        lblModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModelo.setText("Modelo");

        txtModelo.setEditable(false);
        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModelo.setToolTipText("");

        lblColor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblColor.setText("Color");

        txtColor.setEditable(false);
        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtColor.setToolTipText("");

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setText("Precio");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecio.setToolTipText("");

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVolver1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEliminarCarro)
                .addGap(105, 105, 105))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblDatosCarro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelo)
                            .addComponent(lblMarca)
                            .addComponent(lblColor)
                            .addComponent(lblPrecio))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPrecio)
                                .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblIDCarro)
                        .addGap(18, 18, 18)
                        .addComponent(txtIDCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnVolver1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblEliminarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCarro)
                    .addComponent(txtIDCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(28, 28, 28)
                .addComponent(lblDatosCarro)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver1)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                                                 
        try {
            
            int idCarro = Integer.parseInt(txtIDCarro.getText());

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este carro?", "Confirmar", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                CarroDAO carroDAO = new CarroDAO();
                carroDAO.eliminarCarro(idCarro);
                //Para limpiar los campos
                    txtMarca.setText("");
                    txtModelo.setText("");
                    txtColor.setText("");
                    txtPrecio.setText("");
                
            }
        } catch (NumberFormatException ex) {
            // Manejar el caso en que el ID no sea un número válido
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Manejar otros errores
            JOptionPane.showMessageDialog(this, "Error al eliminar el carro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
  
        try {
            
            int idCarro = Integer.parseInt(txtIDCarro.getText());

            CarroDAO carroDAO = new CarroDAO();
            Carro carro = carroDAO.buscarCarro(idCarro);

            if (carro != null) {
                txtMarca.setText(carro.getMarca());
                txtModelo.setText(carro.getModelo());
                txtColor.setText(carro.getColor());
                txtPrecio.setText(String.valueOf(carro.getPrecio()));
            } else {
                // Mostrar un mensaje si no se encontró el carro
                JOptionPane.showMessageDialog(this, "No se encontró un carro con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            // Manejar el caso en que el ID no sea un número válido
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            // Manejar otros errores
            JOptionPane.showMessageDialog(this, "Error al buscar el carro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        
        FrmInicio nuevo = new FrmInicio();
        nuevo.setLocationRelativeTo(null);//Para que se muestre en el centro
        nuevo.setVisible(true);
        this.dispose();//Para que se cierre la ventana
        
    }//GEN-LAST:event_btnVolver1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDatosCarro;
    private javax.swing.JLabel lblEliminarCarro;
    private javax.swing.JLabel lblIDCarro;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtIDCarro;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
