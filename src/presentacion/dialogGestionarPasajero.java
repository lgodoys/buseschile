/**
 * CONSTRUCTOR SWING PARA CREAR DIALOGO GESTOR DE PASAJEROS
 */

package presentacion;

import entidades.Pasajero;
import java.text.ParseException;
import negocio.PasajeroNegocio;
import utilidades.Convertir;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class dialogGestionarPasajero extends javax.swing.JDialog {

    DefaultTableModel modelo = new DefaultTableModel();
    String nombreColumna[] = {"rut","nombre","apellido paterno", "apellido materno", "fechaNacimiento", "edad"};
    boolean registro;
    
    public dialogGestionarPasajero(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);

        limpiarTextos();
        texto(false);
        modelo.setColumnIdentifiers(nombreColumna);
        guardar.setEnabled(false);
        actualizar.setEnabled(false);
        eliminar.setEnabled(false);
    }

    public void texto(boolean verdad) {
        textoRut.setEditable(verdad);
        textoNombre.setEditable(verdad);
        textoApellidoMaterno.setEditable(verdad);
        textoApellidoPaterno.setEditable(verdad);
        textoFechaNacimiento.setEnabled(verdad);
        textoEdad.setEditable(verdad);
        textoRut.requestFocusInWindow();
    }

    public void limpiarTextos() {
        textoRut.setText("");
        textoNombre.setText("");
        textoApellidoMaterno.setText("");
        textoApellidoPaterno.setText("");
        textoFechaNacimiento.setDate(null);
        textoEdad.setText("");
        textoRut.requestFocusInWindow();
    }

    public void controles(boolean verdad) {
        guardar.setEnabled(verdad);
        actualizar.setEnabled(verdad);
        eliminar.setEnabled(verdad);
        cancelar.setEnabled(verdad);
    }
    
    public static Integer calcularEdad(String fecha){
        Date fechanacimiento=null;
        try {
            fechanacimiento = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        } catch (ParseException ex) {
            System.out.println("Error:"+ex);
        }
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        fechaNacimiento.setTime(fechanacimiento);
        int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        if(mes<0 || (mes==0 && dia<0)){
            año--;
        }
        return año;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pasajero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rut = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellidoPaterno = new javax.swing.JLabel();
        apellidoMaterno = new javax.swing.JLabel();
        fechaDeNacim = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        textoApellidoPaterno = new javax.swing.JTextField();
        textoApellidoMaterno = new javax.swing.JTextField();
        textoFechaNacimiento = new com.toedter.calendar.JDateChooser();
        textoRut = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        calcular = new javax.swing.JButton();
        activar = new javax.swing.JCheckBox();
        textoEdad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pasajero.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pasajero.setText("Gestionar Pasajero");
        getContentPane().add(pasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 357, 10));

        rut.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        rut.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rut.setText("RUT");
        rut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        nombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombre.setText("Nombre");
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        apellidoPaterno.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        apellidoPaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoPaterno.setText("Apellido paterno");
        apellidoPaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(apellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        apellidoMaterno.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        apellidoMaterno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        apellidoMaterno.setText("Apellido materno");
        apellidoMaterno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(apellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        fechaDeNacim.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        fechaDeNacim.setText("Fecha de nacimiento");
        fechaDeNacim.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(fechaDeNacim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        edad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        edad.setText("Edad");
        edad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        getContentPane().add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 149, -1));
        getContentPane().add(textoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 149, -1));
        getContentPane().add(textoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 196, 149, -1));

        textoFechaNacimiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(textoFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 149, -1));

        textoRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoRutKeyTyped(evt);
            }
        });
        getContentPane().add(textoRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 100, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 360, -1, -1));

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 360, -1, -1));

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 360, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 360, -1, -1));

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 280, -1, -1));

        activar.setText("Activar");
        activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activarActionPerformed(evt);
            }
        });
        getContentPane().add(activar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        textoEdad.setEditable(false);
        textoEdad.setBackground(new java.awt.Color(255, 255, 255));
        textoEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoEdadActionPerformed(evt);
            }
        });
        getContentPane().add(textoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 68, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activarActionPerformed
        if(activar.isSelected() == true)
        {
            texto(true);
            registro = true;
            guardar.setEnabled(true);
            actualizar.setEnabled(true);
            eliminar.setEnabled(true);
        }
        if(activar.isSelected()==false)
        {
            texto(false);
            registro = false;
            guardar.setEnabled(true);
            actualizar.setEnabled(true);
            eliminar.setEnabled(true);
        }
    }//GEN-LAST:event_activarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        String fecha = String.format("%1$te-%1$tm-%1$tY", textoFechaNacimiento.getDate());
        textoEdad.setText("" + calcularEdad(fecha));
    }//GEN-LAST:event_calcularActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        Pasajero pasajero3 = new Pasajero();
        pasajero3.setRUT(textoRut.getText());
        pasajero3.setNombre(textoNombre.getText());
        pasajero3.setAPaterno(textoApellidoPaterno.getText());
        pasajero3.setAMaterno(textoApellidoMaterno.getText());
        pasajero3.setFechaNac(Convertir.convierteDateToSQLDate(textoFechaNacimiento.getDate()));
        pasajero3.setEdad(Integer.valueOf(textoEdad.getText()));
        try
        {
            if (registro)
            {
                int registrosAfectados;
                registrosAfectados = PasajeroNegocio.getInstancia().crearPasajero(pasajero3);
                if (registrosAfectados == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "Se ha registrado un nuevo pasajero");                
                }
                else
                {
                    registrosAfectados = PasajeroNegocio.getInstancia().modificarPasajero(pasajero3);
                    if(registrosAfectados == 1)
                    {
                        JOptionPane.showMessageDialog(rootPane, "Se han actualizado los datos del pasajero");
                    }
                }
            }
            limpiarTextos();
            activar.setSelected(false);
            controles(false);
            texto(false);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        try
        {
            String codigo = JOptionPane.showInputDialog("ID del Pasajero: ");
            Pasajero pasajero1 = PasajeroNegocio.getInstancia().buscarPasajero(codigo);
            if(pasajero1 != null)
            {
                textoRut.setText(pasajero1.getRUT());
                textoNombre.setText(pasajero1.getNombre());
                textoApellidoPaterno.setText(pasajero1.getAPaterno());
                textoApellidoMaterno.setText(pasajero1.getAMaterno());
                textoFechaNacimiento.setDate(pasajero1.getFechaNac());
                textoEdad.setText("" + pasajero1.getEdad());
                texto(true);
                textoRut.setEditable(false);
                registro = false;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String codigo = JOptionPane.showInputDialog("ID del Pasajero");
        try
        {
            Pasajero pasajero2 = PasajeroNegocio.getInstancia().buscarPasajero(codigo);
            if (pasajero2 != null)
            {
                textoRut.setText(pasajero2.getRUT());
                textoNombre.setText(pasajero2.getNombre());
                textoApellidoPaterno.setText(pasajero2.getAPaterno());
                textoApellidoMaterno.setText(pasajero2.getAMaterno());
                textoFechaNacimiento.setDate(pasajero2.getFechaNac());
                textoEdad.setText("" + pasajero2.getEdad());
                int resultado = JOptionPane.showConfirmDialog(rootPane, "Deseas eliminar?", "Eliminar pasajero", JOptionPane.YES_NO_OPTION);
                if(resultado == JOptionPane.YES_OPTION)
                {
                    int registrosAfectados = PasajeroNegocio.getInstancia().eliminarPasajero(pasajero2);
                    if (registrosAfectados == 1)
                        {
                            JOptionPane.showMessageDialog(rootPane, "Se eliminaron los datos.");
                        }
                }
                limpiarTextos();
                activar.setSelected(false);
                controles(false);
                texto(false);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiarTextos();
        texto(false);
        controles(false);
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void textoRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoRutKeyTyped
        String patronDeEntrada = "12345678-9";
        if(textoRut.getText().length() == 10 || !patronDeEntrada.contains(String.valueOf(evt.getKeyChar())))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textoRutKeyTyped

    private void textoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoEdadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activar;
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel apellidoMaterno;
    private javax.swing.JLabel apellidoPaterno;
    private javax.swing.JButton calcular;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel edad;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel fechaDeNacim;
    private javax.swing.JButton guardar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pasajero;
    private javax.swing.JLabel rut;
    private javax.swing.JTextField textoApellidoMaterno;
    private javax.swing.JTextField textoApellidoPaterno;
    private javax.swing.JTextField textoEdad;
    private com.toedter.calendar.JDateChooser textoFechaNacimiento;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoRut;
    // End of variables declaration//GEN-END:variables
}
