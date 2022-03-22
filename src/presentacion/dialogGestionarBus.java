/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO GESTOR DE BUSES
 */

package presentacion;

import entidades.TerminalOrigen;
import entidades.TerminalDestino;
import negocio.BusNegocio;
import java.util.List;
import javax.swing.*;

public final class dialogGestionarBus extends javax.swing.JDialog {

    public dialogGestionarBus(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        
        buscarTerminalOrigen();
        buscarTerminalDestino();
    }
    
    public void buscarTerminalOrigen()
    {
        try
        {
            List<TerminalOrigen> terminalOrigenes = BusNegocio.getInstancia().terminalOrigenes();
            for(TerminalOrigen terminalOrigen : terminalOrigenes)
                boxOrigen.addItem(terminalOrigen.getCiudadOrigen().getNombre());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    public void buscarTerminalDestino()
    {
        try
        {
            List<TerminalDestino> terminalDestinos = BusNegocio.getInstancia().terminalDestinos();
            for(TerminalDestino terminalDestino : terminalDestinos)
                boxDestino.addItem(terminalDestino.getCiudadDestino().getNombre());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        idBus = new javax.swing.JLabel();
        origen = new javax.swing.JLabel();
        destino = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        boxOrigen = new javax.swing.JComboBox<>();
        boxDestino = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setText("Gestionar Bus");

        idBus.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        idBus.setText("ID Bus:");

        origen.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        origen.setText("Origen:");

        destino.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        destino.setText("Destino:");

        boxOrigen.setSelectedIndex(-1);

        guardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        guardar.setText("Guardar");

        cancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(guardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(origen)
                                .addComponent(destino)
                                .addComponent(idBus))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBus))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origen)
                    .addComponent(boxOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destino)
                    .addComponent(boxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(cancelar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxDestino;
    private javax.swing.JComboBox<String> boxOrigen;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel destino;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel idBus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel origen;
    // End of variables declaration//GEN-END:variables
}
