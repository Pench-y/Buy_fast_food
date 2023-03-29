package comidasrapidas;

public class Informacion extends javax.swing.JFrame {

    public Informacion() {
        initComponents();
        //Name windows
        this.setTitle("Información");
        //Accommodate windows
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroud = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Text_title1 = new javax.swing.JLabel();
        btretorno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroud.setBackground(new java.awt.Color(255, 245, 101));
        backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner.png"))); // NOI18N
        jLabel2.setText("jLabel1");
        backgroud.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, -10, 110, 370));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        backgroud.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-280, -10, 380, 370));

        Text_title1.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        Text_title1.setForeground(new java.awt.Color(255, 153, 153));
        Text_title1.setText("Acerca de la aplicación");
        backgroud.add(Text_title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        btretorno.setBackground(new java.awt.Color(255, 255, 51));
        btretorno.setText("Volver");
        btretorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btretornoActionPerformed(evt);
            }
        });
        backgroud.add(btretorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Esta apliacación te permitira realizar el \npedido que desea en este establecimiento.\n\nMenú\nPodrás visualizar los productos con los que\ncuenta el establecimiento \"Billings\", en este\nespacio hay un numero del lado izquierdo que\nrepresenta el id del producto seguido a este\nel nombre del producto y del lado derecho \nse resalta el precio que corresponde. En la\nparte inferior se encontrar dos botones:\nExit = Salir de la aplicación\nComprar = Desplegar ventana de pedido\n\nPedido\nEn el apartado \"Producto\" podra seleccionar\nel productos(s) que fueron de su interes\npor el lado de \"Cantidad\" el numero de \nunidades que desea llevar, con el boton \n\"Agregar\" ingresara los datos a la lista de\npedido, en la lista encontrara los siguientes\ncampos:\nDescripción = Producto\nPrecio U = Precio unitario producto\nCantidad = numero de unidades\nImporte = total de precio U * cantidad\nEn la parte inferior se podra visualizar:\nSubtotal: precio de lista de pedido\nIva = iva sobre el subtotal\nTotal = suma de subtotal y iva\nfuncion de botones\nVolver = Regresar al menú\nPagar = Pagar pedido \n\nFactura\nDespliega un mensaje donde agradece su compra\ny se encuentra el boton \"Finalizar\" donde \nfinalizara el ciclo de compra y podra de \nnuevo realizar un nuevo pedido.\n\nHacemos que su pedido sea sencillo y estamos\nsiempre para servir. Pueder dirigirte al \nsiguiente correo nicolas@penchy.lat para\nsugerencias y preguntas. ");
        jScrollPane1.setViewportView(jTextArea1);

        backgroud.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 380, 210));

        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btretornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btretornoActionPerformed
        // --> Menu
        Menu newframe = new Menu();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btretornoActionPerformed

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
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text_title1;
    private javax.swing.JPanel backgroud;
    private javax.swing.JButton btretorno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
