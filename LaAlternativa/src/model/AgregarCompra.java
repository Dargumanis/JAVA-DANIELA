/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import businesslogic.*;
import entities.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author alulab14
 */
public class AgregarCompra extends javax.swing.JFrame {

    private ProductBL productBL;
    private OrderBL orderBL;
    private BundleBL bundleBL;
    private DefaultTableModel productsModel;
    private DefaultTableModel productsOrderModel;
    SearchOrders pantallaCompras;


    public AgregarCompra() {
        initComponents();
        //pantallaCompras = new SearchOrders(this, rootPaneCheckingEnabled);
        productBL= new ProductBL();
        orderBL = new OrderBL();
        bundleBL = new BundleBL();
        productsModel = (DefaultTableModel) productsTable.getModel();
        productsOrderModel = (DefaultTableModel) productsOrderTable.getModel();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        campoProv = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsOrderTable = new javax.swing.JTable();
        botonConfirmar = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        campoCodProd = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fechaExp = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        tabAgregar = new javax.swing.JMenu();
        tabBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Agregar Órden de Compra");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Complete los campos del producto a agregar:");

        botonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonRegresar.setText("< Regresar");
        botonRegresar.setContentAreaFilled(false);
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        campoProv.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoProvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoProvFocusLost(evt);
            }
        });
        campoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProvActionPerformed(evt);
            }
        });

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio Venta", "Prescripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsTable);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Agregar Producto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Productos de la orden:");

        campoCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCantidadFocusLost(evt);
            }
        });
        campoCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCantidadMouseClicked(evt);
            }
        });
        campoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCantidadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Datos del producto:");

        productsOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Caducidad", "Precio Compra", "Cantidad", "SubTotal", "Quitar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(productsOrderTable);

        botonConfirmar.setText("Confirmar");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        botonQuitar.setText("Quitar Productos");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });

        campoCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoCodProdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCodProdFocusLost(evt);
            }
        });
        campoCodProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoCodProdMouseClicked(evt);
            }
        });
        campoCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodProdActionPerformed(evt);
            }
        });

        campoNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoNombreFocusLost(evt);
            }
        });
        campoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoNombreMouseClicked(evt);
            }
        });
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código de Proveedor");

        jLabel2.setText("Código de Producto");

        jLabel4.setText("Nombre del Producto");

        jLabel8.setText("Cantidad");

        jLabel9.setText("Precio Compra");

        campoPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoPrecioFocusLost(evt);
            }
        });
        campoPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoPrecioMouseClicked(evt);
            }
        });
        campoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecioActionPerformed(evt);
            }
        });

        jLabel10.setText("Fec. Caducidad (dd-MM-yyyy)");

        fechaExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fechaExpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaExpFocusLost(evt);
            }
        });
        fechaExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaExpMouseClicked(evt);
            }
        });
        fechaExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaExpActionPerformed(evt);
            }
        });

        tabAgregar.setText("Agregar");
        tabAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(tabAgregar);

        tabBuscar.setText("Modificar/Eliminar");
        tabBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabBuscarMouseClicked(evt);
            }
        });
        jMenuBar1.add(tabBuscar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoCodProd)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(botonBuscar)))
                                .addComponent(jLabel1)
                                .addComponent(jLabel5))
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(fechaExp, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                            .addComponent(campoPrecio)
                                            .addComponent(campoCantidad))
                                        .addGap(34, 34, 34))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonAgregar)
                                        .addGap(28, 28, 28))))
                            .addComponent(botonRegresar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(botonConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonQuitar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)
                                .addGap(11, 11, 11)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBuscar)))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmar)
                    .addComponent(botonQuitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegresar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        AdminScreen atras = new AdminScreen();
        atras.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Integer codigo = campoCodProd.getText().equals("") ? null :Integer.parseInt(campoCodProd.getText());
        String name = campoNombre.getText();
        ArrayList<Product> products= new ArrayList<>();
        try {
            products = productBL.searchProducts(codigo, name,null);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error en la base de datos: " + ex);
            return;
        }
        productsModel.setRowCount(0);
        Object[] fila = new Object[4];
        for(int i=0;i<products.size();i++){
            fila[0] = products.get(i).getId();
            fila[1] = products.get(i).getName();
            fila[2] = products.get(i).getPrice();
            fila[3] = products.get(i).getNeedsPrescription();
            productsModel.addRow(fila);
        }
        
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void campoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProvActionPerformed
        campoProv.getText();
    }//GEN-LAST:event_campoProvActionPerformed

    private void campoNombres1Clicked(java.awt.event.ActionEvent evt) {
        campoProv.setText("");
    }
    
    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked
        this.dispose();
        pantallaCompras.setVisible(true);
    }//GEN-LAST:event_tabBuscarMouseClicked

    private void tabAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgregarMouseClicked

    }//GEN-LAST:event_tabAgregarMouseClicked

    private void campoProvFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoProvFocusGained
   
    }//GEN-LAST:event_campoProvFocusGained

    private void campoProvFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoProvFocusLost
     
    }//GEN-LAST:event_campoProvFocusLost

    private void campoCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadFocusGained

    private void campoCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCantidadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadFocusLost

    private void campoCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCantidadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadMouseClicked

    private void campoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
       Order order = new Order();
       ArrayList<Bundle> bundles = new ArrayList<>();
        if (campoProv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el código del proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (productsOrderTable.getComponentCount() == 0){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int ans = JOptionPane.showConfirmDialog(null, "¿Confirma que desea agregar la compra?", "Agregar", JOptionPane.YES_NO_OPTION);
        if(ans==0){
            order.setIdSupplier(Integer.parseInt(campoProv.getText()));
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);  
            order.setTransactionDate(date);
            int idOrder;
           try {
               idOrder = orderBL.addOrder(order);
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
               return;
           }
            for(int i=0;i<productsOrderModel.getRowCount();i++){
                Bundle bundle = new Bundle();
                bundle.setIdOrder(idOrder);
                bundle.setIdProduct((int)productsOrderModel.getValueAt(i, 0));
                String fecha = (String)productsOrderModel.getValueAt(i, 2);
                bundle.setAdqPrice((double)productsOrderModel.getValueAt(i,3));
                bundle.setQuantity((int)productsOrderModel.getValueAt(i, 4));
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
                try {
                    java.util.Date dateUtil = sdf1.parse(fecha);                    
                    java.sql.Date sqlDate = new java.sql.Date(dateUtil.getTime());
                    bundle.setExpirationDate(sqlDate);
                } catch (ParseException ex) {
                    Logger.getLogger(AgregarCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
                bundles.add(bundle);
            }
           try {
               bundleBL.addBundles(bundles);
               JOptionPane.showMessageDialog(null, "Registro exitoso de suministros", "Error", JOptionPane.ERROR_MESSAGE);

           } catch (SQLException ex) {               
               JOptionPane.showMessageDialog(null, "Error en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
               return;
           }
            
        }
        
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere quitar estos productos?", "Quitar", JOptionPane.YES_NO_OPTION);
        if(answer ==0){
            for(int i=0; i<productsOrderModel.getRowCount();i++){
                if((boolean)productsOrderModel.getValueAt(i, 6)){
                    productsOrderModel.removeRow(i);
                    i--;
                }
            }
        }
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void campoCodProdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodProdFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodProdFocusGained

    private void campoCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCodProdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodProdFocusLost

    private void campoCodProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoCodProdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodProdMouseClicked

    private void campoCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodProdActionPerformed

    private void campoNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreFocusGained

    private void campoNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoNombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreFocusLost

    private void campoNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreMouseClicked

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if (productsTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
	}
        if (campoCantidad.getText().equals("") || campoPrecio.getText().equals("") || fechaExp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int index = productsTable.getSelectedRow();
        ArrayList<Product> list = new ArrayList<>();
        try {
            list = productBL.searchProducts((Integer) productsTable.getValueAt(index, 0), null, null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Object[] fila= new Object[7];
        Product prod = list.get(0);
        fila[0]= prod.getId();
        fila[1]= prod.getName();
        fila[2]= fechaExp.getText();
        double price= Double.parseDouble(campoPrecio.getText());
        int cant= Integer.parseInt(campoCantidad.getText());
        fila[3]= price;
        fila[4]= cant;
        fila[5]= price*cant;
        fila[6]= false;
        productsOrderModel.addRow(fila);
        
        
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void campoPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioFocusGained

    private void campoPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoPrecioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioFocusLost

    private void campoPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoPrecioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioMouseClicked

    private void campoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPrecioActionPerformed

    private void fechaExpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaExpFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaExpFocusGained

    private void fechaExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaExpFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaExpFocusLost

    private void fechaExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaExpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaExpMouseClicked

    private void fechaExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaExpActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoCodProd;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoProv;
    private javax.swing.JTextField fechaExp;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable productsOrderTable;
    private javax.swing.JTable productsTable;
    private javax.swing.JMenu tabAgregar;
    private javax.swing.JMenu tabBuscar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
