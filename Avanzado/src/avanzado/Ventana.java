/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avanzado;

/**
 *
 * @author TensinUriel
 */
public class Ventana extends javax.swing.JFrame {

    private String resultados;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AreaInteraccion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MostrarClientes = new javax.swing.JButton();
        MostrarFacturas = new javax.swing.JButton();
        MostrarDesgCiente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Nombre = new javax.swing.JButton();
        Direccion = new javax.swing.JButton();
        PlacasVehiculo = new javax.swing.JButton();
        MostrarDesg2 = new javax.swing.JButton();
        PrimaAsegurada = new javax.swing.JButton();
        CostoPoliza = new javax.swing.JButton();
        MostrarDesg1 = new javax.swing.JButton();
        MostrarPolizas = new javax.swing.JButton();
        ClienteIdActualizacionEntrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NuevaDireccion = new javax.swing.JTextField();
        NuevoCostoTotal = new javax.swing.JTextField();
        NuevaMarcaModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PolizaMayorCosto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        VehículoIdEntrada = new javax.swing.JTextField();
        VehiculoIdEntrada = new javax.swing.JTextField();
        ClienteIdConsultas = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaResultados = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consultas");

        jLabel2.setText("Actualización de datos");

        MostrarClientes.setText("Mostrar clientes");
        MostrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarClientesActionPerformed(evt);
            }
        });

        MostrarFacturas.setText("Mostrar facturas");
        MostrarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarFacturasActionPerformed(evt);
            }
        });

        MostrarDesgCiente.setText("Mostrar desglose");
        MostrarDesgCiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDesgCienteActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar cliente por ID");

        Nombre.setText("Nombre");
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        Direccion.setText("Dirección");
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        PlacasVehiculo.setText("Placas de vehículo");

        MostrarDesg2.setText("Desglose 2");

        PrimaAsegurada.setText("Prima asegurada");

        CostoPoliza.setText("Costo póliza");

        MostrarDesg1.setText("Desglose 1");

        MostrarPolizas.setText("Mostra pólizas");
        MostrarPolizas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPolizasActionPerformed(evt);
            }
        });

        ClienteIdActualizacionEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteIdActualizacionEntradaActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente ID");

        jLabel5.setText("Nueva dirección");

        jLabel6.setText("Nueva marca o modelo");

        jLabel7.setText("Factura ID");

        jLabel8.setText("Vehículo ID");

        PolizaMayorCosto.setText("Poliza Mayor Costo");

        jLabel9.setText("Nuevo costo total");

        VehículoIdEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehículoIdEntradaActionPerformed(evt);
            }
        });

        VehiculoIdEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculoIdEntradaActionPerformed(evt);
            }
        });

        ClienteIdConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteIdConsultasActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaInteraccionLayout = new javax.swing.GroupLayout(AreaInteraccion);
        AreaInteraccion.setLayout(AreaInteraccionLayout);
        AreaInteraccionLayout.setHorizontalGroup(
            AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaInteraccionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaInteraccionLayout.createSequentialGroup()
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                        .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(MostrarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostrarFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostrarDesgCiente))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaInteraccionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PrimaAsegurada, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(CostoPoliza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Actualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                                .addComponent(MostrarPolizas, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PolizaMayorCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(PlacasVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ClienteIdConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                                .addComponent(MostrarDesg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MostrarDesg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NuevaDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                        .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ClienteIdActualizacionEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NuevaMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(VehiculoIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AreaInteraccionLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(VehículoIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AreaInteraccionLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(NuevoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        AreaInteraccionLayout.setVerticalGroup(
            AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaInteraccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarClientes)
                    .addComponent(MostrarFacturas)
                    .addComponent(MostrarDesgCiente))
                .addGap(17, 17, 17)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ClienteIdConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlacasVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostoPoliza)
                    .addComponent(Direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrimaAsegurada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MostrarDesg1)
                    .addComponent(MostrarDesg2))
                .addGap(27, 27, 27)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PolizaMayorCosto)
                    .addComponent(MostrarPolizas))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClienteIdActualizacionEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(VehiculoIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VehículoIdEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AreaInteraccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NuevoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevaMarcaModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Actualizar)
                .addGap(19, 19, 19))
        );

        CajaResultados.setColumns(20);
        CajaResultados.setRows(5);
        jScrollPane1.setViewportView(CajaResultados);

        jLabel10.setText("Resultados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel10)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AreaInteraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaInteraccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        
    }//GEN-LAST:event_DireccionActionPerformed

    private void ClienteIdActualizacionEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteIdActualizacionEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteIdActualizacionEntradaActionPerformed

    private void VehículoIdEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehículoIdEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehículoIdEntradaActionPerformed

    private void VehiculoIdEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculoIdEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VehiculoIdEntradaActionPerformed

    private void ClienteIdConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteIdConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteIdConsultasActionPerformed

    private void MostrarPolizasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPolizasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarPolizasActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        Avanzado.Actualizar();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void MostrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarClientesActionPerformed
        CajaResultados.setText("");
        resultados = Avanzado.ConsultaGeneral("cliente");
        CajaResultados.setText(resultados);
    }//GEN-LAST:event_MostrarClientesActionPerformed

    private void MostrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarFacturasActionPerformed
        CajaResultados.setText("");
        resultados = Avanzado.ConsultaGeneral("factura");
        CajaResultados.setText(resultados);
    }//GEN-LAST:event_MostrarFacturasActionPerformed

    private void MostrarDesgCienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDesgCienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarDesgCienteActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        int id = Integer.parseInt(ClienteIdConsultas.getText());
        CajaResultados.setText("");
        resultados = Avanzado.Consulta1("cliente","Nombre",id);
        CajaResultados.setText(resultados);
    }//GEN-LAST:event_NombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JPanel AreaInteraccion;
    private javax.swing.JTextArea CajaResultados;
    private javax.swing.JTextField ClienteIdActualizacionEntrada;
    private javax.swing.JTextField ClienteIdConsultas;
    private javax.swing.JButton CostoPoliza;
    private javax.swing.JButton Direccion;
    private javax.swing.JButton MostrarClientes;
    private javax.swing.JButton MostrarDesg1;
    private javax.swing.JButton MostrarDesg2;
    private javax.swing.JButton MostrarDesgCiente;
    private javax.swing.JButton MostrarFacturas;
    private javax.swing.JButton MostrarPolizas;
    private javax.swing.JButton Nombre;
    private javax.swing.JTextField NuevaDireccion;
    private javax.swing.JTextField NuevaMarcaModelo;
    private javax.swing.JTextField NuevoCostoTotal;
    private javax.swing.JButton PlacasVehiculo;
    private javax.swing.JButton PolizaMayorCosto;
    private javax.swing.JButton PrimaAsegurada;
    private javax.swing.JTextField VehiculoIdEntrada;
    private javax.swing.JTextField VehículoIdEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
