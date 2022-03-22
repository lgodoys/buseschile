/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO DE BUSQUEDA DE PASAJES
 */
package presentacion;

import entidades.Bus;
import entidades.CiudadDestino;
import entidades.CiudadOrigen;
import entidades.Pasaje;
import entidades.TerminalDestino;
import entidades.TerminalOrigen;
import java.awt.HeadlessException;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dialogBuscarPasaje extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumna[] = {"ID", "Hora salida", "Fecha salida", "Origen", "Destino"};
    Pasaje pasajeSelecciona = new Pasaje();
    
    public dialogBuscarPasaje(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pasajes = new javax.swing.JLabel();
        seleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Pasajes.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Pasajes.setText("Pasajes disponibles");

        seleccionar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        seleccionar.setText("Seleccionar");
        seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pasajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seleccionar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Pasajes)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(seleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarActionPerformed
        int numeroFila = jTable1.getSelectedRow();
        CiudadOrigen c1 = new CiudadOrigen();
        CiudadDestino c2 = new CiudadDestino();
        TerminalOrigen to1 = new TerminalOrigen();
        TerminalDestino to2 = new TerminalDestino();
        Bus b = new Bus();
        try
        {
            if(numeroFila != -1)
            {
                pasajeSelecciona.setIDPasaje(modelo.getValueAt(numeroFila, 0).toString());
                pasajeSelecciona.setHoraViaje(modelo.getValueAt(numeroFila, 1).toString());
                pasajeSelecciona.setFechaViaje(Date.valueOf(modelo.getValueAt(numeroFila, 2).toString()));
                c1.setNombre(modelo.getValueAt(numeroFila, 3).toString());
                c2.setNombre(modelo.getValueAt(numeroFila, 4).toString());
                to1.setCiudadOrigen(c1);
                to2.setCiudadDestino(c2);
                b.setOrigen(to1);
                b.setDestino(to2);
                pasajeSelecciona.setBus(b);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Debes seleccionar un elemento");
            }
        }
        catch (HeadlessException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_seleccionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pasajes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton seleccionar;
    // End of variables declaration//GEN-END:variables
}
