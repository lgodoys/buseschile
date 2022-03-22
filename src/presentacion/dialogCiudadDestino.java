/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO MANTENEDOR DE CIUDAD DESTINO
 */
package presentacion;

import entidades.CiudadDestino;
import negocio.CiudadDestinoNegocio;

import javax.swing.JOptionPane;

public class dialogCiudadDestino extends javax.swing.JDialog {

    public dialogCiudadDestino(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ciudad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        idCiudad = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        region = new javax.swing.JLabel();
        provincia = new javax.swing.JLabel();
        textoIDCiudad = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        boxRegion = new javax.swing.JComboBox<>();
        boxProvincia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ciudad.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ciudad.setText("Ciudad");

        idCiudad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        idCiudad.setText("ID Ciudad");

        nombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        nombre.setText("Nombre");

        region.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        region.setText("Region");

        provincia.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        provincia.setText("Provincia");

        textoIDCiudad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        textoIDCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoIDCiudadKeyTyped(evt);
            }
        });

        textoNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        guardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        boxRegion.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        boxRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Región de O'Higgins", "Región de Maule", "Región de Bio Bio", "Región de Araucanía", "Región de Los Rios", "Región de Los Lagos" }));

        boxProvincia.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        boxProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Provincia de Colchagua", "Provincia de Talca", "Provincia de Concepción", "Provincia de Cautín", "Provincia de Valdivia", "Provincia de Llanquihue" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idCiudad)
                                    .addComponent(nombre)
                                    .addComponent(region)
                                    .addComponent(provincia))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoIDCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxProvincia, 0, 0, Short.MAX_VALUE)
                                    .addComponent(textoNombre)
                                    .addComponent(boxRegion, 0, 150, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(ciudad))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(guardar)
                        .addGap(43, 43, 43)
                        .addComponent(cancelar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ciudad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCiudad)
                    .addComponent(textoIDCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(region)
                    .addComponent(boxRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(provincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardar)
                            .addComponent(cancelar))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        CiudadDestino ciudadDestino = new CiudadDestino();
        ciudadDestino.setIDCiudad(idCiudad.getText());
        ciudadDestino.setNombre(textoNombre.getText());
        ciudadDestino.setRegion(boxRegion.getSelectedItem().toString());
        ciudadDestino.setProvincia(boxProvincia.getSelectedItem().toString());
        try
        {
            int registrosAfectados = CiudadDestinoNegocio.getInstancia().crearCiudad(ciudadDestino);
            if(registrosAfectados == 1)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado una nueva ciudad");
                this.dispose();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void textoIDCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoIDCiudadKeyTyped
        this.dispose();
    }//GEN-LAST:event_textoIDCiudadKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxProvincia;
    private javax.swing.JComboBox<String> boxRegion;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel ciudad;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel idCiudad;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel provincia;
    private javax.swing.JLabel region;
    private javax.swing.JTextField textoIDCiudad;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}
