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
public class AddSupplierOrder extends javax.swing.JFrame {

    private ProductBL productBL;
    private OrderBL orderBL;
    private BundleBL bundleBL;
    private DefaultTableModel productsOrderModel;
    private SearchSupplier searchSupplier;
    private SearchProducts searchProduct;
    SimpleDateFormat formatofecha;

    public AddSupplierOrder() {
        initComponents();
        //pantallaCompras = new SearchOrders(this, rootPaneCheckingEnabled);
        productBL = new ProductBL();
        orderBL = new OrderBL();
        bundleBL = new BundleBL();
        productsOrderModel = (DefaultTableModel) productsOrderTable.getModel();
        searchSupplier = new SearchSupplier(this, rootPaneCheckingEnabled);
        searchProduct = new SearchProducts(this, rootPaneCheckingEnabled);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        supplierIdField = new javax.swing.JTextField();
        searchProductButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        productsOrderTable = new javax.swing.JTable();
        confirmButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        productIdField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        supplierNameField = new javax.swing.JTextField();
        searchSupplierButton = new javax.swing.JButton();
        expirationField = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        productSaleField = new javax.swing.JTextField();
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

        supplierIdField.setEnabled(false);
        supplierIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supplierIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierIdFieldFocusLost(evt);
            }
        });
        supplierIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierIdFieldActionPerformed(evt);
            }
        });

        searchProductButton.setText("Buscar Producto");
        searchProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Agregar Producto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Productos de la orden:");

        quantityField.setEnabled(false);
        quantityField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityFieldFocusLost(evt);
            }
        });
        quantityField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quantityFieldMouseClicked(evt);
            }
        });
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });

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

        confirmButton.setText("Confirmar");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Quitar Productos");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        productIdField.setEnabled(false);
        productIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                productIdFieldFocusLost(evt);
            }
        });
        productIdField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productIdFieldMouseClicked(evt);
            }
        });
        productIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productIdFieldActionPerformed(evt);
            }
        });

        productNameField.setEnabled(false);
        productNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                productNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameFieldFocusLost(evt);
            }
        });
        productNameField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productNameFieldMouseClicked(evt);
            }
        });
        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });

        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Código de  Proveedor");

        jLabel2.setText("Código de Producto");

        jLabel4.setText("Nombre del Producto");

        jLabel8.setText("Cantidad");

        jLabel9.setText("Precio de Compra");

        priceField.setEnabled(false);
        priceField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceFieldFocusLost(evt);
            }
        });
        priceField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceFieldMouseClicked(evt);
            }
        });
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Fecha Caducidad");

        jLabel11.setText("Nombre del Proveedor");

        supplierNameField.setEnabled(false);
        supplierNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supplierNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierNameFieldFocusLost(evt);
            }
        });
        supplierNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierNameFieldActionPerformed(evt);
            }
        });

        searchSupplierButton.setText("Buscar Proveedor");
        searchSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupplierButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio de Venta");

        productSaleField.setEnabled(false);

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(productIdField)
                            .addComponent(jLabel8)
                            .addComponent(quantityField))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel3)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(productNameField)
                                    .addComponent(jLabel4)
                                    .addComponent(priceField)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(productSaleField)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(expirationField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addComponent(titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supplierIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(supplierNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(searchSupplierButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegresar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(confirmButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeButton)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supplierIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplierNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchSupplierButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchProductButton)
                            .addComponent(productSaleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(expirationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton)
                    .addComponent(removeButton))
                .addGap(13, 13, 13)
                .addComponent(botonRegresar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetProducts() {
        productIdField.setText("");
        productNameField.setText("");
        quantityField.setText("");
        priceField.setText("");
        expirationField.setDate(null);

        productIdField.setEnabled(false);
        productNameField.setEnabled(false);
        quantityField.setEnabled(false);
        priceField.setEnabled(false);
        expirationField.setEnabled(false);

        searchProduct.product = null;
    }
    
    private void resetSupplier() {
        supplierIdField.setText("");
        supplierNameField.setText("");
        
        searchSupplier.supplier = null;
    }
    
    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.dispose();
        AdminScreen atras = new AdminScreen();
        atras.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void searchProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductButtonActionPerformed
        searchProduct.setVisible(true);
        if (searchProduct.product != null) {
            productIdField.setText(String.valueOf(searchProduct.product.getId()));
            productNameField.setText(searchProduct.product.getName());
            productSaleField.setText(String.valueOf(searchProduct.product.getPrice()));
            quantityField.setEnabled(true);
            priceField.setEnabled(true);
            expirationField.setEnabled(true);
        }
    }//GEN-LAST:event_searchProductButtonActionPerformed

    private void supplierIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierIdFieldActionPerformed
        supplierIdField.getText();
    }//GEN-LAST:event_supplierIdFieldActionPerformed

    private void campoNombres1Clicked(java.awt.event.ActionEvent evt) {
        supplierIdField.setText("");
    }

    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked
        this.dispose();
        ManageSupplierOrders manageScreen = new ManageSupplierOrders();
        manageScreen.setVisible(true);
    }//GEN-LAST:event_tabBuscarMouseClicked

    private void tabAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgregarMouseClicked

    }//GEN-LAST:event_tabAgregarMouseClicked

    private void supplierIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierIdFieldFocusGained

    }//GEN-LAST:event_supplierIdFieldFocusGained

    private void supplierIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierIdFieldFocusLost

    }//GEN-LAST:event_supplierIdFieldFocusLost

    private void quantityFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldFocusGained

    private void quantityFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldFocusLost

    private void quantityFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantityFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldMouseClicked

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Order order = new Order();
        ArrayList<Bundle> bundles = new ArrayList<>();
        if (supplierIdField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (productsOrderModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "La orden de compra debe tener al menos un producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int ans = JOptionPane.showConfirmDialog(null, "¿Confirma que desea agregar la compra?", "Agregar", JOptionPane.YES_NO_OPTION);
        if (ans == 0) {
            order.setIdSupplier(Integer.parseInt(supplierIdField.getText()));
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            order.setTransactionDate(date);
            int idOrder;
            try {
                idOrder = orderBL.addOrder(order);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error en base de datos al agregar orden de compra.", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (int i = 0; i < productsOrderModel.getRowCount(); i++) {
                Bundle bundle = new Bundle();
                bundle.setIdOrder(idOrder);
                bundle.setIdProduct((int) productsOrderModel.getValueAt(i, 0));
                String fecha = (String) productsOrderModel.getValueAt(i, 2);
                bundle.setAdqPrice((double) productsOrderModel.getValueAt(i, 3));
                bundle.setQuantity((int) productsOrderModel.getValueAt(i, 4));
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    java.util.Date dateUtil = sdf1.parse(fecha);
                    java.sql.Date sqlDate = new java.sql.Date(dateUtil.getTime());
                    bundle.setExpirationDate(sqlDate);
                } catch (ParseException ex) {
                    Logger.getLogger(AddSupplierOrder.class.getName()).log(Level.SEVERE, null, ex);
                }
                bundles.add(bundle);
            }
            try {
                bundleBL.addBundles(bundles);
                JOptionPane.showMessageDialog(null, "Registro exitoso de suministros", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }        
        resetProducts();
        resetSupplier();
        while (productsOrderModel.getRowCount() != 0) {
            productsOrderModel.removeRow(productsOrderModel.getRowCount()-1);
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere quitar los productos seleccionados?", "Quitar", JOptionPane.YES_NO_OPTION);
        if (answer == 0) {
            for (int i = 0; i < productsOrderModel.getRowCount(); i++) {
                if ((boolean) productsOrderModel.getValueAt(i, 6)) {
                    productsOrderModel.removeRow(i);
                    i--;
                }
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void productIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdFieldFocusGained

    private void productIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdFieldFocusLost

    private void productIdFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productIdFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdFieldMouseClicked

    private void productIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productIdFieldActionPerformed

    private void productNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldFocusGained

    private void productNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldFocusLost

    private void productNameFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productNameFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldMouseClicked

    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (productIdField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (quantityField.getText().equals("") || priceField.getText().equals("") || expirationField.getDate()==null) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (int i = 0; i < productsOrderModel.getRowCount(); i++) {
            if ((int) productsOrderModel.getValueAt(i, 0) == Integer.parseInt(productIdField.getText())) {
                JOptionPane.showMessageDialog(null, "El producto seleccionado ya ha sido agregado a la orden de compra.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        Object[] fila = new Object[7];
        fila[0] = Integer.parseInt(productIdField.getText());
        fila[1] = productNameField.getText();
        fila[2] = formatofecha.format(expirationField.getDate());   // PROBANDO FECHA
        double price = Double.parseDouble(priceField.getText());
        int cant = Integer.parseInt(quantityField.getText());
        fila[3] = price;
        fila[4] = cant;
        fila[5] = price * cant;
        fila[6] = false;
        productsOrderModel.addRow(fila);

        resetProducts();
    }//GEN-LAST:event_addButtonActionPerformed

    private void priceFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldFocusGained

    private void priceFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldFocusLost

    private void priceFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceFieldMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldMouseClicked

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void supplierNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierNameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameFieldFocusGained

    private void supplierNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierNameFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameFieldFocusLost

    private void supplierNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierNameFieldActionPerformed

    private void searchSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplierButtonActionPerformed
        searchSupplier.setVisible(true);
        if (searchSupplier.supplier != null) {
            supplierIdField.setText(String.valueOf(searchSupplier.supplier.getId()));
            supplierNameField.setText(searchSupplier.supplier.getName());
        }
    }//GEN-LAST:event_searchSupplierButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplierOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton confirmButton;
    private com.toedter.calendar.JDateChooser expirationField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField productIdField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField productSaleField;
    private javax.swing.JTable productsOrderTable;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchProductButton;
    private javax.swing.JButton searchSupplierButton;
    private javax.swing.JTextField supplierIdField;
    private javax.swing.JTextField supplierNameField;
    private javax.swing.JMenu tabAgregar;
    private javax.swing.JMenu tabBuscar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
