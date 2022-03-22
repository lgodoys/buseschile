/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO GESTOR DE RESERVAS
 */

package presentacion;

import entidades.Pasaje;
import entidades.Pasajero;
import entidades.Reserva;
import negocio.ReservaNegocio;
import java.sql.Date;
import javax.swing.*;

public class dialogGestionarReservas extends javax.swing.JDialog {

    Pasajero pasajero;
    Pasaje pasaje;
    Date fecha;
    boolean setVencido;
    boolean setPagado;
    
    public dialogGestionarReservas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoPagado = new javax.swing.JCheckBox();
        textoVencido = new javax.swing.JCheckBox();
        buscarPasaje = new javax.swing.JButton();
        buscarPasajero = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        textoIDReserva = new javax.swing.JTextField();
        textoRUTPasajero = new javax.swing.JTextField();
        textofechaReserva = new javax.swing.JTextField();
        textoIDPasajero = new javax.swing.JTextField();
        textoPrecioReserva = new javax.swing.JTextField();
        textoIDPasaje = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        reservas = new javax.swing.JLabel();
        idReserva = new javax.swing.JLabel();
        fechaReserva = new javax.swing.JLabel();
        precioReserva = new javax.swing.JLabel();
        rutPasajero = new javax.swing.JLabel();
        idPasaje = new javax.swing.JLabel();
        idPasajero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(531, 447));
        setPreferredSize(new java.awt.Dimension(531, 447));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoPagado.setText("Reserva pagada");
        textoPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPagadoActionPerformed(evt);
            }
        });
        getContentPane().add(textoPagado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        textoVencido.setText("Reserva vencida?");
        textoVencido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoVencidoActionPerformed(evt);
            }
        });
        getContentPane().add(textoVencido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        buscarPasaje.setText("Buscar...");
        buscarPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPasajeActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        buscarPasajero.setText("Buscar");
        buscarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPasajeroActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));
        getContentPane().add(textoIDReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 57, 114, -1));
        getContentPane().add(textoRUTPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 160, 114, -1));
        getContentPane().add(textofechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 88, 114, -1));
        getContentPane().add(textoIDPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 200, 114, -1));
        getContentPane().add(textoPrecioReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 120, 114, -1));
        getContentPane().add(textoIDPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 240, 114, -1));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 40, 498, 10));

        reservas.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        reservas.setText("Gestión de reservas");
        getContentPane().add(reservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        idReserva.setText("ID Reserva");
        getContentPane().add(idReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 57, -1, -1));

        fechaReserva.setText("Fecha de reserva");
        getContentPane().add(fechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 88, -1, -1));

        precioReserva.setText("Precio de reserva");
        getContentPane().add(precioReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        rutPasajero.setText("RUT Pasajero");
        getContentPane().add(rutPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        idPasaje.setText("ID Pasaje");
        getContentPane().add(idPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        idPasajero.setText("ID Pasajero");
        getContentPane().add(idPasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPasajeActionPerformed
        dialogBuscarPasaje buscarPasaje1 = new dialogBuscarPasaje(null, true);
        buscarPasaje1.setVisible(true);
        pasaje = buscarPasaje1.pasajeSelecciona;
        int diffInDays = (int)(fecha.getTime() - pasaje.getFechaViaje().getTime())/(1000*60*60*24);
        if(pasaje.getFechaViaje() != null && diffInDays >= 24)
        {
            textoIDPasaje.setText(pasaje.getIDPasaje());
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "La reserva se encuentra fuera de plazo");
        }
    }//GEN-LAST:event_buscarPasajeActionPerformed

    private void buscarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPasajeroActionPerformed
        String id = textoRUTPasajero.getText().trim();
        try
        {
            pasajero = ReservaNegocio.getInstancia().buscarPasajero(id);
            if(pasajero != null)
            {
                textoIDPasajero.setText(pasajero.getIDPasajero());
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "El pasajero no se encuentra registrado.");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_buscarPasajeroActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Reserva reserva = new Reserva();
        reserva.setIDReserva(textoIDReserva.getText());
        reserva.setFechaReserva(fecha);
        reserva.setPasajero(pasajero);
        reserva.setPasaje(pasaje);
        if(pasajero.getEdad() < 8 )
        {
            double precio = Double.parseDouble(textoPrecioReserva.getText());
            precio = precio / 1.5;
            reserva.setPrecioReserva(precio);
        }
        else if (pasajero.getEdad() > 65)
        {
            double precio = Double.parseDouble(textoPrecioReserva.getText());
            precio = precio / 1.3;
            reserva.setPrecioReserva(precio);
        }
        else
        {
            reserva.setPrecioReserva(Double.parseDouble(textoPrecioReserva.getText()));
        }   
        reserva.setPagado(setPagado);
        reserva.setVencido(setVencido);
        try
        {
            if(!textoIDPasaje.getText().equals(""))
            {
                int registrosAfectados = ReservaNegocio.getInstancia().crearReserva(reserva);
                if(registrosAfectados == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Se registró una nueva reserva");
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "El pasajero no se encuentra registrado");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Seleccione un pasaje");
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void textoVencidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoVencidoActionPerformed
        if(textoVencido.isSelected() == true)
        {
            setVencido = true;
        }
        if(textoVencido.isSelected()==false)
        {
            setVencido = false;
        }
    }//GEN-LAST:event_textoVencidoActionPerformed

    private void textoPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPagadoActionPerformed
        if(textoPagado.isSelected() == true)
        {
            setPagado = true;
        }
        if(textoPagado.isSelected()==false)
        {
            setPagado = false;
        }
    }//GEN-LAST:event_textoPagadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarPasaje;
    private javax.swing.JButton buscarPasajero;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fechaReserva;
    private javax.swing.JLabel idPasaje;
    private javax.swing.JLabel idPasajero;
    private javax.swing.JLabel idReserva;
    private javax.swing.JLabel precioReserva;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel reservas;
    private javax.swing.JLabel rutPasajero;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField textoIDPasaje;
    private javax.swing.JTextField textoIDPasajero;
    private javax.swing.JTextField textoIDReserva;
    private javax.swing.JCheckBox textoPagado;
    private javax.swing.JTextField textoPrecioReserva;
    private javax.swing.JTextField textoRUTPasajero;
    private javax.swing.JCheckBox textoVencido;
    private javax.swing.JTextField textofechaReserva;
    // End of variables declaration//GEN-END:variables
}
