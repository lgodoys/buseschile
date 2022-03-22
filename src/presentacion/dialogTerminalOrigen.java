/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO MANTENEDOR TERMINAL ORIGEN
 */
package presentacion;

import entidades.CiudadOrigen;
import entidades.TerminalOrigen;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.TerminalOrigenNegocio;

public class dialogTerminalOrigen extends javax.swing.JDialog {

    public dialogTerminalOrigen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void buscarCiudadOrigen()
    {
        try
        {
            List<CiudadOrigen> ciudades = TerminalOrigenNegocio.getInstancia().listaCiudadesOrigen();
            for(CiudadOrigen ciudadOrigen : ciudades)
                boxCiudadOrigen.addItem(ciudadOrigen.getNombre());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        terminal = new javax.swing.JLabel();
        idorigen = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        idciudaddestino = new javax.swing.JLabel();
        textoIDTerminal = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoDireccion = new javax.swing.JTextField();
        textoTelefono = new javax.swing.JTextField();
        boxCiudadOrigen = new javax.swing.JComboBox<>();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        terminal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        terminal.setText("Datos del Terminal de Origen");
        getContentPane().add(terminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        idorigen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idorigen.setText("ID Terminal Origen");
        getContentPane().add(idorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 55, -1, -1));

        nombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        direccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        direccion.setText("Dirección");
        getContentPane().add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, -1, -1));

        telefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        telefono.setText("Teléfono");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        idciudaddestino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        idciudaddestino.setText("ID Ciudad Origen");
        getContentPane().add(idciudaddestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, -1, -1));

        textoIDTerminal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textoIDTerminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 55, 85, -1));

        textoNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, -1));

        textoDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, 210, -1));

        textoTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(textoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 210, -1));

        boxCiudadOrigen.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(boxCiudadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 195, 153, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 275, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        String nombreCiudad = boxCiudadOrigen.getSelectedItem().toString();
        TerminalOrigen terminalOrigen = new TerminalOrigen();
        terminalOrigen.setIDTermOrig(textoIDTerminal.getText());
        terminalOrigen.setNombre(textoNombre.getText());
        terminalOrigen.setDireccion(textoDireccion.getText());
        terminalOrigen.setTelefono(textoTelefono.getText());
        try
        {
            CiudadOrigen ciudadOrigen = TerminalOrigenNegocio.getInstancia().buscarCiudad(nombreCiudad);
            terminalOrigen.setCiudadOrigen(ciudadOrigen);
            int registrosAfectados = TerminalOrigenNegocio.getInstancia().crearTerminalOrigen(terminalOrigen);
            if(registrosAfectados == 1)
            {
                JOptionPane.showMessageDialog(rootPane, "Se ha registrado un nuevo terminal");
                this.dispose();
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCiudadOrigen;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel idciudaddestino;
    private javax.swing.JLabel idorigen;
    private javax.swing.JLabel nombre;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel terminal;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoIDTerminal;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}
