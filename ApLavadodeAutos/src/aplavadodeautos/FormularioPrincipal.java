package aplavadodeautos;
/*FALTA HACER EL CÓDIGO PARA QUE DIFERENCIE LOS PRECIOS ENTRE CARRO Y CAMIONETA DEPENDIENDO DEL SERVICIO ELEGIDO */
import javax.swing.table.DefaultTableModel;

public class FormularioPrincipal extends javax.swing.JFrame {
   DefaultTableModel model=new DefaultTableModel();
    
    public FormularioPrincipal() {
        initComponents();
         
        cboautomovil.addItem("Camioneta");
        cboautomovil.addItem("carro");
        cboservicio.addItem("Lavado Básico");
        cboservicio.addItem("Lavado especial");
        cboservicio.addItem("Desinfección básica");
        cboservicio.addItem("Desinfección avanzada");
        cboservicio.addItem("Combo1");
        cboservicio.addItem("Combo2");
        cboservicio.addItem("Combo3");
//CREAMOS LAS COLLUMNAS DE NUESTRA TABLA    
        model.addColumn("Tipo de vehiculo");
        model.addColumn("Servicio");
        model.addColumn("Funcionarios");
        model.addColumn("Fecha");      
        model.addColumn("Precio");
        this.TabResult.setModel(model);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        TabResult = new javax.swing.JTable();
        bguardar = new javax.swing.JButton();
        lbfuncionarios = new javax.swing.JLabel();
        txtfuncionarios = new javax.swing.JTextField();
        lblservicio = new javax.swing.JLabel();
        lblautomovil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboautomovil = new javax.swing.JComboBox<>();
        cboservicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Producción Diraria por Serivicio");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        TabResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TabResult.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        TabResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo Automovil", "Servicio", "Funcionario", "Fecha", "Precio"
            }
        ));
        jScrollPane2.setViewportView(TabResult);

        bguardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        bguardar.setText("Aceptar");
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        lbfuncionarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lbfuncionarios.setText("Funcionarios");

        txtfuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfuncionariosActionPerformed(evt);
            }
        });

        lblservicio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblservicio.setText("Servicio");

        lblautomovil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblautomovil.setText("Tipo de vehiculo");

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        jLabel1.setText("CENTRO DE LAVADOS LA ESTRELLA");

        cboautomovil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboautomovilItemStateChanged(evt);
            }
        });
        cboautomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboautomovilActionPerformed(evt);
            }
        });

        cboservicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboservicioItemStateChanged(evt);
            }
        });
        cboservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboservicioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Precio");

        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Fecha");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblautomovil)
                                .addGap(32, 32, 32)
                                .addComponent(cboautomovil, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbfuncionarios)
                                    .addComponent(lblservicio))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboservicio, 0, 196, Short.MAX_VALUE)
                                    .addComponent(txtfuncionarios))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtprecio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblautomovil)
                    .addComponent(cboautomovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblservicio)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfuncionarios)
                    .addComponent(txtfuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed

//CONVIERTE LAS VARIABLES DE COMBOBOX A STRING Y LAS IMPRIME EN CADENA      
       String precio = txtprecio.getText();
       String fecha = txtfecha.getText();
       String funcionarios = txtfuncionarios.getText();
       String servicio = cboservicio.getSelectedItem() .toString();
       String vehiculo = cboautomovil.getSelectedItem() .toString();
       //System.out.println(vehiculo + " " + servicio + " " + funcionarios);
    
//CODIGO DEL BOTON ACEPTAR, SE CREA UN ARREGLO
       String []Aceptar=new String[5];
       Aceptar [0]=vehiculo;
       Aceptar [1]=servicio;
       Aceptar [2]=funcionarios;
       Aceptar [3]=fecha;
       Aceptar [4]=precio;
       
      //for(int i=0 ; i<Aceptar.length ; i++){        //ESTE FOR DUPLICA LA CANTIDAD DEL DATO INGRESADO EN LA TABLA
        // System.out.println(aceptar[i]);
         
         model.addRow(Aceptar);
           
    //}
    }//GEN-LAST:event_bguardarActionPerformed

    private void txtfuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfuncionariosActionPerformed

    private void cboautomovilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboautomovilItemStateChanged
        
    }//GEN-LAST:event_cboautomovilItemStateChanged

    private void cboautomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboautomovilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboautomovilActionPerformed

    private void cboservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboservicioActionPerformed

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void cboservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboservicioItemStateChanged
//AL OPRIMIR EL TIPO DE SERVICIO, CAPTURA EL OBJETO Y LO ASIGNA A LA VARIABLE SERVICIO IMPRIMIENDO LA DESCRIPCIÓN EN LA CASILLA DE PRECIOS
        String Servicio = (String)cboservicio.getSelectedItem();
        if (Servicio.equals("Lavado Básico")){
            txtprecio.setText("$30.000");
        }
        if(Servicio.equals("Lavado especial")){
            txtprecio.setText("$50.000");
        }
        if(Servicio.equals("Desinfección básica")){
            txtprecio.setText("$60.000");
        }
        if(Servicio.equals("Desinfección avanzada")){
            txtprecio.setText("$80.000");
        }  
        if(Servicio.equals("Combo1")){
            txtprecio.setText("$130.000");
        }
        if(Servicio.equals("Combo2")){
            txtprecio.setText("$150.000");
        }
        if(Servicio.equals("Combo3")){
            txtprecio.setText("$180.000");
        }
    }//GEN-LAST:event_cboservicioItemStateChanged

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabResult;
    private javax.swing.JButton bguardar;
    private javax.swing.JComboBox<String> cboautomovil;
    private javax.swing.JComboBox<String> cboservicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbfuncionarios;
    private javax.swing.JLabel lblautomovil;
    private javax.swing.JLabel lblservicio;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfuncionarios;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
