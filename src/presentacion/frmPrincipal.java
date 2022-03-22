/**
 * CONSTRUCTOR SWING PARA CREAR GUI PRINCIPAL
 */
package presentacion;

import reportes.ReportePasajeros;
import javax.swing.*;
import java.sql.SQLException;

public class frmPrincipal extends javax.swing.JFrame {
  
    public frmPrincipal() 
    {
        asignarLook();
        initComponents();
        setLocationRelativeTo(null);
        setSize(1000,1000);
        setTitle("BUSES CHILE - Sistema de venta de pasajes 1.0");
        ((JPanel)getContentPane()).setOpaque(false);
    }
    
    private void asignarLook()
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuMantenimiento = new javax.swing.JMenu();
        mantenedorCiudadOrigen = new javax.swing.JMenuItem();
        mantenedorCiudadDestino = new javax.swing.JMenuItem();
        separadorMantenimiento = new javax.swing.JPopupMenu.Separator();
        mantenedorTerminalOrigen = new javax.swing.JMenuItem();
        mantenedorTerminalDestino = new javax.swing.JMenuItem();
        menuProceso = new javax.swing.JMenu();
        gestionarBus = new javax.swing.JMenuItem();
        separadorProceso = new javax.swing.JPopupMenu.Separator();
        gestionarPasajero = new javax.swing.JMenuItem();
        gestionarPasaje = new javax.swing.JMenuItem();
        separadorProceso2 = new javax.swing.JPopupMenu.Separator();
        gestionarReserva = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        reportePasajeros = new javax.swing.JMenuItem();
        reporteReservas = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();
        acercaDe = new javax.swing.JMenuItem();
        separadorAyuda = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("\"BUSES CHILE - Sistema de venta de pasajes 1.0\"");
        jFrame1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jFrame1.setName("frame"); // NOI18N

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1500, 750));
        setPreferredSize(new java.awt.Dimension(1500, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bienvenidos.png"))); // NOI18N
        jLabel1.setNextFocusableComponent(this);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 240));

        botonSalir.setBackground(new java.awt.Color(255, 255, 204));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        botonSalir.setText("SALIR");
        botonSalir.setMaximumSize(new java.awt.Dimension(121, 41));
        botonSalir.setMinimumSize(new java.awt.Dimension(121, 41));
        botonSalir.setName("botonSalir"); // NOI18N
        botonSalir.setPreferredSize(new java.awt.Dimension(121, 41));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 680, 130, -1));
        botonSalir.getAccessibleContext().setAccessibleName("botonSalir");

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FONDO.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        fondo.getAccessibleContext().setAccessibleName("fondo");

        barraMenu.setAlignmentY(0.5F);
        barraMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        barraMenu.setMaximumSize(new java.awt.Dimension(576, 32768));
        barraMenu.setMinimumSize(new java.awt.Dimension(576, 33));
        barraMenu.setName("barraMenu"); // NOI18N
        barraMenu.setPreferredSize(new java.awt.Dimension(576, 33));

        menuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        menuMantenimiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuMantenimiento.setLabel("Mantenimiento");
        menuMantenimiento.setName("menuMantenimiento"); // NOI18N
        menuMantenimiento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N
        menuMantenimiento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/settings.png"))); // NOI18N

        mantenedorCiudadOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mantenedorCiudadOrigen.setText("Mantenedor de Ciudad origen");
        mantenedorCiudadOrigen.setName("mantenedorCiudadOrigen"); // NOI18N
        mantenedorCiudadOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenedorCiudadOrigenActionPerformed(evt);
            }
        });
        menuMantenimiento.add(mantenedorCiudadOrigen);

        mantenedorCiudadDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mantenedorCiudadDestino.setText("Mantenedor de Ciudad destino");
        mantenedorCiudadDestino.setName("mantenedorCiudadDestino"); // NOI18N
        mantenedorCiudadDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenedorCiudadDestinoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(mantenedorCiudadDestino);

        separadorMantenimiento.setName("separadorMantenimiento"); // NOI18N
        menuMantenimiento.add(separadorMantenimiento);
        separadorMantenimiento.getAccessibleContext().setAccessibleName("separadorMantenimiento");

        mantenedorTerminalOrigen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mantenedorTerminalOrigen.setText("Mantenedor de Terminal Origen");
        mantenedorTerminalOrigen.setName("mantenedorTerminalOrigen"); // NOI18N
        mantenedorTerminalOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenedorTerminalOrigenActionPerformed(evt);
            }
        });
        menuMantenimiento.add(mantenedorTerminalOrigen);

        mantenedorTerminalDestino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mantenedorTerminalDestino.setText("Mantenedor de Terminal Destino");
        mantenedorTerminalDestino.setName("mantenedorTerminalDestino"); // NOI18N
        mantenedorTerminalDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenedorTerminalDestinoActionPerformed(evt);
            }
        });
        menuMantenimiento.add(mantenedorTerminalDestino);

        barraMenu.add(menuMantenimiento);
        menuMantenimiento.getAccessibleContext().setAccessibleName("Mantenimiento");

        menuProceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/process.png"))); // NOI18N
        menuProceso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuProceso.setLabel("Procesos");
        menuProceso.setName("menuProceso"); // NOI18N

        gestionarBus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gestionarBus.setText("Gestionar Buses");
        gestionarBus.setName("gestionarBus"); // NOI18N
        gestionarBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarBusActionPerformed(evt);
            }
        });
        menuProceso.add(gestionarBus);

        separadorProceso.setName("separadorProceso"); // NOI18N
        menuProceso.add(separadorProceso);
        separadorProceso.getAccessibleContext().setAccessibleName("separadorProceso");

        gestionarPasajero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gestionarPasajero.setText("Gestionar Pasajeros");
        gestionarPasajero.setName("gestionarPasajero"); // NOI18N
        gestionarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarPasajeroActionPerformed(evt);
            }
        });
        menuProceso.add(gestionarPasajero);

        gestionarPasaje.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gestionarPasaje.setText("Gestionar Pasajes");
        gestionarPasaje.setName("gestionarPasaje"); // NOI18N
        gestionarPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarPasajeActionPerformed(evt);
            }
        });
        menuProceso.add(gestionarPasaje);

        separadorProceso2.setName("separadorProceso2"); // NOI18N
        menuProceso.add(separadorProceso2);
        separadorProceso2.getAccessibleContext().setAccessibleName("separadorProceso2");

        gestionarReserva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gestionarReserva.setText("Gestionar Reservas");
        gestionarReserva.setName("gestionarReserva"); // NOI18N
        gestionarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarReservaActionPerformed(evt);
            }
        });
        menuProceso.add(gestionarReserva);
        gestionarReserva.getAccessibleContext().setAccessibleName("gestionarReserva");

        barraMenu.add(menuProceso);
        menuProceso.getAccessibleContext().setAccessibleName("Procesos");

        menuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reports.png"))); // NOI18N
        menuReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuReportes.setLabel("Reportes");
        menuReportes.setName("menuReportes"); // NOI18N

        reportePasajeros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reportePasajeros.setText("Reporte de pasajeros");
        reportePasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePasajerosActionPerformed(evt);
            }
        });
        menuReportes.add(reportePasajeros);

        reporteReservas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        reporteReservas.setText("Reporte reserva de pasajes");
        reporteReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteReservasActionPerformed(evt);
            }
        });
        menuReportes.add(reporteReservas);

        barraMenu.add(menuReportes);
        menuReportes.getAccessibleContext().setAccessibleName("Reportes");

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/help.png"))); // NOI18N
        menuAyuda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuAyuda.setLabel("Ayuda");
        menuAyuda.setName("menuAyuda"); // NOI18N

        ayuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ayuda.setText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        menuAyuda.add(ayuda);

        acercaDe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acercaDe.setText("Acerca de");
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(acercaDe);

        separadorAyuda.setName("separadorAyuda"); // NOI18N
        menuAyuda.add(separadorAyuda);
        separadorAyuda.getAccessibleContext().setAccessibleName("separadorAyuda");

        salir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menuAyuda.add(salir);

        barraMenu.add(menuAyuda);
        menuAyuda.getAccessibleContext().setAccessibleName("Ayuda");

        setJMenuBar(barraMenu);
        barraMenu.getAccessibleContext().setAccessibleName("barraMenu");

        getAccessibleContext().setAccessibleName("BUSES CHILE - Sistema de venta de pasajes 1.0");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mantenedorCiudadOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenedorCiudadOrigenActionPerformed
        dialogCiudadOrigen ciudadOrigen = new dialogCiudadOrigen(this, true);
        ciudadOrigen.setVisible(true);
    }//GEN-LAST:event_mantenedorCiudadOrigenActionPerformed

    private void mantenedorCiudadDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenedorCiudadDestinoActionPerformed
        dialogCiudadDestino ciudadDestino = new dialogCiudadDestino(this,true);
        ciudadDestino.setVisible(true);
    }//GEN-LAST:event_mantenedorCiudadDestinoActionPerformed

    private void mantenedorTerminalOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenedorTerminalOrigenActionPerformed
        dialogTerminalOrigen terminalOrigen = new dialogTerminalOrigen(this, true);
        terminalOrigen.setVisible(true);
    }//GEN-LAST:event_mantenedorTerminalOrigenActionPerformed

    private void mantenedorTerminalDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenedorTerminalDestinoActionPerformed
        dialogTerminalDestino terminalDestino = new dialogTerminalDestino(this,true);
        terminalDestino.setVisible(true);
    }//GEN-LAST:event_mantenedorTerminalDestinoActionPerformed

    private void gestionarBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarBusActionPerformed
        dialogGestionarBus gestionarBusVar = new dialogGestionarBus(this, true);
        gestionarBusVar.setVisible(true);
    }//GEN-LAST:event_gestionarBusActionPerformed

    private void gestionarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarPasajeroActionPerformed
        dialogGestionarPasajero gestionarPasajero1 = new dialogGestionarPasajero(this,true);
        gestionarPasajero1.setVisible(true);
    }//GEN-LAST:event_gestionarPasajeroActionPerformed

    private void gestionarPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarPasajeActionPerformed
        dialogGestionarPasaje gestionarPasaje1 = new dialogGestionarPasaje(this,true);
        gestionarPasaje1.setVisible(true);
    }//GEN-LAST:event_gestionarPasajeActionPerformed

    private void gestionarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarReservaActionPerformed
        dialogGestionarReservas gestionarReservas = new dialogGestionarReservas(this,true);
        gestionarReservas.setVisible(true);
    }//GEN-LAST:event_gestionarReservaActionPerformed

    private void reportePasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePasajerosActionPerformed
        try
        {
            ReportePasajeros reportePasajeros1 = new ReportePasajeros();
            reportePasajeros1.runReportePasajeros();
        }
        catch (SQLException e)
        {
            
        }
    }//GEN-LAST:event_reportePasajerosActionPerformed

    private void reporteReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteReservasActionPerformed
        JaspReporteReservas jaspReporteReservas = new JaspReporteReservas(this,true);
        jaspReporteReservas.setVisible(true);
    }//GEN-LAST:event_reporteReservasActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaActionPerformed

    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acercaDeActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem acercaDe;
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JMenuItem gestionarBus;
    private javax.swing.JMenuItem gestionarPasaje;
    private javax.swing.JMenuItem gestionarPasajero;
    private javax.swing.JMenuItem gestionarReserva;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem mantenedorCiudadDestino;
    private javax.swing.JMenuItem mantenedorCiudadOrigen;
    private javax.swing.JMenuItem mantenedorTerminalDestino;
    private javax.swing.JMenuItem mantenedorTerminalOrigen;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuProceso;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenuItem reportePasajeros;
    private javax.swing.JMenuItem reporteReservas;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separadorAyuda;
    private javax.swing.JPopupMenu.Separator separadorMantenimiento;
    private javax.swing.JPopupMenu.Separator separadorProceso;
    private javax.swing.JPopupMenu.Separator separadorProceso2;
    // End of variables declaration//GEN-END:variables
}
