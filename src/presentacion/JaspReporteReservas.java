/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO GENERADOR DE REPORTE DE RESERVAS
 */
package presentacion;

import entidades.Reserva;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ReservaNegocio;
import reportes.ReporteReservas;

public class JaspReporteReservas extends javax.swing.JDialog {

    public JaspReporteReservas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

        try {
            List<Reserva> reservas = ReservaNegocio.getInstancia().listadoReservas();
            for (int i = 0; i < reservas.size(); i++) {
                boxReservaID.addItem(reservas.get(i).getIDReserva());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idReserva = new javax.swing.JLabel();
        boxReservaID = new javax.swing.JComboBox<>();
        botonReporteReservas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(193, 231, 201));

        idReserva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idReserva.setText("Seleccionar un ID de Reserva:");

        boxReservaID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botonReporteReservas.setBackground(new java.awt.Color(255, 255, 225));
        botonReporteReservas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonReporteReservas.setText("Reporte reservas PDF");
        botonReporteReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonReporteReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReporteReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxReservaID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idReserva)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(botonReporteReservas)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxReservaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(botonReporteReservas)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReporteReservasActionPerformed
        try
        {
            if(!boxReservaID.getSelectedItem().toString().equals(""))
            {
                String reservaID = boxReservaID.getSelectedItem().toString();
                ReporteReservas reporteReservas = new ReporteReservas();
                reporteReservas.runReporteReservas(reservaID);
            }
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_botonReporteReservasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonReporteReservas;
    private javax.swing.JComboBox<String> boxReservaID;
    private javax.swing.JLabel idReserva;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
