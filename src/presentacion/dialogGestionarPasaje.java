/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO GESTOR DE PASAJES
 */
package presentacion;

import datos.BusDatos;
import entidades.Bus;
import entidades.Pasaje;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import negocio.PasajeNegocio;
import utilidades.Convertir;

public class dialogGestionarPasaje extends javax.swing.JDialog {
    
    Bus bus;
    public dialogGestionarPasaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registroPasaje = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        idPasaje = new javax.swing.JLabel();
        fechaSalida = new javax.swing.JLabel();
        horaSalida = new javax.swing.JLabel();
        textoIDPasaje = new javax.swing.JTextField();
        textoFechaSalida = new com.toedter.calendar.JDateChooser();
        textoHoraSalida = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        idBus = new javax.swing.JLabel();
        textoAsiento = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        origen = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        capacidad = new javax.swing.JLabel();
        precioPasaje = new javax.swing.JLabel();
        textoOrigen = new javax.swing.JTextField();
        textoDestino = new javax.swing.JTextField();
        textoCapacidad = new javax.swing.JTextField();
        textoPrecio = new javax.swing.JTextField();
        asiento = new javax.swing.JLabel();
        textoIDBus = new javax.swing.JTextField();
        textoIDPasajero = new javax.swing.JTextField();
        idPasajero = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registroPasaje.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        registroPasaje.setText("Registrar pasaje");
        registroPasaje.setToolTipText("");
        getContentPane().add(registroPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 448, 12));

        idPasaje.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        idPasaje.setText("ID:");
        getContentPane().add(idPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        fechaSalida.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        fechaSalida.setText("Fecha de Salida");
        getContentPane().add(fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        horaSalida.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        horaSalida.setText("Hora de Salida");
        getContentPane().add(horaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));
        getContentPane().add(textoIDPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 69, 140, -1));
        getContentPane().add(textoFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 112, -1));
        getContentPane().add(textoHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 113, -1));

        idBus.setText("ID Bus");

        textoAsiento.setEditable(false);
        textoAsiento.setBorder(null);

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        origen.setText("Origen");

        destino.setText("Destino");

        capacidad.setText("Capacidad");

        precioPasaje.setText("Precio");

        textoOrigen.setEditable(false);
        textoOrigen.setBorder(null);

        textoDestino.setEditable(false);
        textoDestino.setBorder(null);

        textoCapacidad.setEditable(false);
        textoCapacidad.setBorder(null);

        textoPrecio.setEditable(false);
        textoPrecio.setBorder(null);

        asiento.setText("Asiento");

        textoIDPasajero.setEditable(false);
        textoIDPasajero.setBorder(null);

        idPasajero.setText("ID Pasajero");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precioPasaje)
                    .addComponent(idBus)
                    .addComponent(asiento)
                    .addComponent(idPasajero)
                    .addComponent(origen)
                    .addComponent(destino)
                    .addComponent(capacidad))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoOrigen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoDestino, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoIDPasajero, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoAsiento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoIDBus, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(buscar))
                    .addComponent(textoCapacidad))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIDBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBus)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asiento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precioPasaje)
                    .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPasajero)
                    .addComponent(textoIDPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(destino)
                    .addComponent(textoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(origen)
                    .addComponent(textoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(capacidad)
                    .addComponent(textoCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 449, 290));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try
        {
            bus = BusDatos.getInstancia().buscar(textoIDBus.getText());
            if (bus != null)
            {
                textoDestino.setText(bus.getDestino().getCiudadDestino().getNombre());
                textoOrigen.setText(bus.getOrigen().getCiudadOrigen().getNombre());
                textoCapacidad.setText("" + bus.getAsientos());
            }
            else
                JOptionPane.showMessageDialog(rootPane, "El bus no se encuentra registrado");
        }
        catch (HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Pasaje pasaje = new Pasaje();
        pasaje.setIDPasaje(textoIDPasaje.getText());
        pasaje.setHoraViaje(textoHoraSalida.getText());
        pasaje.setFechaViaje(Convertir.convierteDateToSQLDate(textoFechaSalida.getDate()));
        pasaje.setEstado(Pasaje.ESTADO_LIBRE);
        pasaje.setBus(bus);
        try
        {
            int registrosAfectados = PasajeNegocio.getInstancia().crearPasaje(pasaje);
            if(registrosAfectados == 1)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado un nuevo pasaje");
                this.dispose();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asiento;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel capacidad;
    private javax.swing.JLabel destino;
    private javax.swing.JLabel fechaSalida;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel horaSalida;
    private javax.swing.JLabel idBus;
    private javax.swing.JLabel idPasaje;
    private javax.swing.JLabel idPasajero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel origen;
    private javax.swing.JLabel precioPasaje;
    private javax.swing.JLabel registroPasaje;
    private javax.swing.JTextField textoAsiento;
    private javax.swing.JTextField textoCapacidad;
    private javax.swing.JTextField textoDestino;
    private com.toedter.calendar.JDateChooser textoFechaSalida;
    private javax.swing.JTextField textoHoraSalida;
    private javax.swing.JTextField textoIDBus;
    private javax.swing.JTextField textoIDPasaje;
    private javax.swing.JTextField textoIDPasajero;
    private javax.swing.JTextField textoOrigen;
    private javax.swing.JTextField textoPrecio;
    // End of variables declaration//GEN-END:variables
}
