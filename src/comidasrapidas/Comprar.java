package comidasrapidas;
//Bookstores
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;

public class Comprar extends javax.swing.JFrame {
    //Arrange products       
    String products[]={"Hamburguesa","Perro caliente","Empanadas","Chorizo","Gaseosa 400ml","Pizza"};
    //Arrange prices
    double prices[]={10.000,10.000,3.000,4.000,3.000,7.000};
    double price=0;
    int amount=0;
    DefaultTableModel model = new DefaultTableModel();
    ArrayList<Venta> listaVentas=new ArrayList<Venta>();
    
    public Comprar() {
        initComponents();
        //Name windows
        this.setTitle("Comidas rapidas");
        //Accommodate windows
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(products);
        //Pass values
        cboProducto.setModel(comboModel);
        model.addColumn("DESCRIPCIÓN");
        model.addColumn("PRECIO U");
        model.addColumn("CANTIDAD");
        model.addColumn("IMPORTE");
        updatetable();
        calcularPrecio();
    }

    
    
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btretorno = new javax.swing.JButton();
        btpagar = new javax.swing.JButton();
        cboProducto = new javax.swing.JComboBox();
        spnCantidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        labeltotal = new javax.swing.JLabel();
        labelIva = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelSubtotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        lbltitle = new javax.swing.JLabel();
        bannerright = new javax.swing.JLabel();
        bannerleft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btretorno.setBackground(new java.awt.Color(255, 255, 51));
        btretorno.setText("Retornar");
        btretorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btretornoActionPerformed(evt);
            }
        });
        getContentPane().add(btretorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, -1));

        btpagar.setBackground(new java.awt.Color(255, 255, 51));
        btpagar.setText("Pagar");
        btpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpagarActionPerformed(evt);
            }
        });
        getContentPane().add(btpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, -1));

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 420, 83));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Producto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        labeltotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labeltotal.setText("Total:");
        getContentPane().add(labeltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        labelIva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelIva.setText("Iva:");
        getContentPane().add(labelIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cantidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        labelSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelSubtotal.setText("Subtotal:");
        getContentPane().add(labelSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(255, 153, 153));
        lblSubtotal.setText("Producto");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        lblIva.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIva.setForeground(new java.awt.Color(255, 153, 153));
        lblIva.setText("Producto");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 153, 153));
        lblTotal.setText("Producto");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, 57));

        background.setBackground(new java.awt.Color(255, 245, 101));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitle.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 153, 153));
        lbltitle.setText("Comidas Rapidas");
        background.add(lbltitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 540, 70));

        bannerright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner.png"))); // NOI18N
        bannerright.setText("jLabel1");
        getContentPane().add(bannerright, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 90, 360));

        bannerleft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/banner.png"))); // NOI18N
        bannerleft.setText("jLabel1");
        getContentPane().add(bannerleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 290, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btretornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btretornoActionPerformed
        // --> Menu
        Menu newframe = new Menu();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btretornoActionPerformed

    private void btpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpagarActionPerformed
        // -->Invoice
        Factura newframe = new Factura();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpagarActionPerformed

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Add
        Venta venta=new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setDescripcion(cboProducto.getSelectedItem().toString());
        venta.setPrice(price);
        venta.setAmount(amount);
        venta.setPriceT(price*amount);
        listaVentas.add(venta);
        updatetable();
        Deleteventa();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void Deleteventa(){
        //Restar values
        price=0;
        amount=0;
    }
    public void calcularPrecio(){
        price=prices[cboProducto.getSelectedIndex()];
        amount=Integer.parseInt(spnCantidad.getValue().toString());
    }
    
    public String aMoneda(double price){
        return "$" + Math.round(price*100)/100 +"COP";
    }
    public void updatetable(){
        while (model.getRowCount()>0){
            model.removeRow(0);
        }
        double subtotal=0;
        for (Venta v : listaVentas) {
            Object x[] = new Object [4];
            x[0] = v.getDescripcion();
            x[1] = v.getPrice();
            x[2] = v.getAmount();
            x[3] = v.getPriceT();
            subtotal+=v.getPriceT();
            model.addRow(x);
        }
        double iva=subtotal*0.19;
        double total=subtotal+iva;
        lblSubtotal.setText(aMoneda(subtotal));
        lblIva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        tblProductos.setModel(model);
    }
    
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
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel bannerleft;
    private javax.swing.JLabel bannerright;
    private javax.swing.JButton btpagar;
    private javax.swing.JButton btretorno;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIva;
    private javax.swing.JLabel labelSubtotal;
    private javax.swing.JLabel labeltotal;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
    
    class Fondopanel extends JPanel{
        
    }
}
