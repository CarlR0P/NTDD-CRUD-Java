package view;

import controller.CarroDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carro;

public class FrmVerCarro extends javax.swing.JFrame {

    public FrmVerCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIDCarro = new javax.swing.JLabel();
        lblVerCarros = new javax.swing.JLabel();
        cmbxCategoria = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarros = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIDCarro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblIDCarro.setText(" Buscar Carro por:");
        lblIDCarro.setToolTipText("");

        lblVerCarros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVerCarros.setText("Ver Carros");

        cmbxCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Marca", "Modelo", "Color", "Precio" }));
        cmbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxCategoriaActionPerformed(evt);
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

        tblCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Marca", "Modelo", "Año", "Color", "Tipo De Combustible", "Tipo de Carroceria", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarros);
        if (tblCarros.getColumnModel().getColumnCount() > 0) {
            tblCarros.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblCarros.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblCarros.getColumnModel().getColumn(4).setPreferredWidth(75);
            tblCarros.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblCarros.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(btnVolver1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(lblVerCarros)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIDCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(251, 251, 251))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblVerCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCarro)
                    .addComponent(cmbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
       try {
        // Obtener el criterio de búsqueda seleccionado en el JComboBox
        String categoria = (String) cmbxCategoria.getSelectedItem();
        
        // Obtener el valor de búsqueda ingresado por el usuario
        String valor = txtBuscar.getText().trim();

        // Validar que el valor no esté vacío
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Llamar al método para buscar carros por criterio
        CarroDAO carroDAO = new CarroDAO();
        List<Carro> carros = carroDAO.buscarPorCategoria(categoria, valor);

        // Verificar si se encontraron resultados
        if (carros != null && !carros.isEmpty()) {
            // Crear un modelo de tabla para mostrar los resultados
            DefaultTableModel modelo = (DefaultTableModel) tblCarros.getModel();
            modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

            // Llenar la tabla con los resultados
            for (Carro carro : carros) {
                Object[] fila = {
                    carro.getId(),
                    carro.getMarca(),
                    carro.getModelo(),
                    carro.getAnio(),
                    carro.getColor(),
                    carro.getTipoCombustible(),
                    carro.getTipoCarroceria(),                   
                    carro.getPrecio()
                };
                modelo.addRow(fila); // Agregar la fila a la tabla
            }
        } else {
            // Mostrar un mensaje si no se encontraron resultados
            JOptionPane.showMessageDialog(this, "No se encontraron carros con el criterio proporcionado.", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception ex) {
        // Manejar errores
        JOptionPane.showMessageDialog(this, "Error al buscar carros: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed

        FrmInicio nuevo = new FrmInicio();
        nuevo.setLocationRelativeTo(null);//Para que se muestre en el centro
        nuevo.setVisible(true);
        this.dispose();//Para que se cierre la ventana

    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void cmbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> cmbxCategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIDCarro;
    private javax.swing.JLabel lblVerCarros;
    private javax.swing.JTable tblCarros;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
