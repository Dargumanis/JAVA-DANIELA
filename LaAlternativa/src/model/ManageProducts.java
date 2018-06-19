/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import businesslogic.DiscountBL;
import businesslogic.ProductBL;
import businesslogic.SymptomBL;
import entities.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.FieldGetter;

/**
 *
 * @author alulab14
 */
public class ManageProducts extends javax.swing.JFrame {

    /**
     * Creates new form EliminarCliente
     */
    ProductBL productbl;
    DiscountBL discountbl;
    SymptomBL symptombl;
    AddSymptomsToProduct addSymptoms;
    ArrayList<String> symptomsList;
    SearchProducts searchProducts;
//    boolean symptomsAdded = false;

    public ManageProducts() {
        initComponents();
        this.setLocationRelativeTo(null);
        productbl = new ProductBL();
        symptombl = new SymptomBL();
        discountbl = new DiscountBL();
        symptomsList = new ArrayList<>();
        searchProducts = new SearchProducts(this, rootPaneCheckingEnabled);
        addSymptoms = null;
        enableFields(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nameField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        priceField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        pointsField = new javax.swing.JTextField();
        maxStockField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        minStockField = new javax.swing.JTextField();
        idField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        prescriptionCheckbox = new javax.swing.JCheckBox();
        symptomButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        tabAgregar = new javax.swing.JMenu();
        tabBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Editar Productos");

        acceptButton.setText("Buscar Producto");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        returnButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnButton.setText("< Regresar");
        returnButton.setContentAreaFilled(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Producto:");

        modifyButton.setText("Modificar");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Nombre");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Precio");

        priceField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceField1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Puntos");

        pointsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsFieldActionPerformed(evt);
            }
        });

        maxStockField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxStockFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Max Stock");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Min Stock");

        minStockField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minStockFieldActionPerformed(evt);
            }
        });

        idField1.setEnabled(false);
        idField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idField1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Código");

        totalField.setEnabled(false);
        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Total de Items");

        prescriptionCheckbox.setText("¿Necesita prescripción?");

        symptomButton.setText("Añadir Síntomas");
        symptomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symptomButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(idField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(pointsField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(minStockField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(maxStockField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(prescriptionCheckbox)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modifyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(symptomButton))
                            .addComponent(acceptButton)
                            .addComponent(titulo))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pointsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minStockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxStockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prescriptionCheckbox)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyButton)
                    .addComponent(deleteButton)
                    .addComponent(symptomButton))
                .addGap(7, 7, 7)
                .addComponent(returnButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enableFields(Boolean b) {
        nameField1.setEnabled(b);
        priceField1.setEnabled(b);
        pointsField.setEnabled(b);
        minStockField.setEnabled(b);
        maxStockField.setEnabled(b);

        nameField1.setEditable(b);
        priceField1.setEditable(b);
        pointsField.setEditable(b);
        minStockField.setEditable(b);
        maxStockField.setEditable(b);
    }

    private void emptyFields() {
        pointsField.setText("");

        nameField1.setText("");
        priceField1.setText("");
        pointsField.setText("");
        minStockField.setText("");
        maxStockField.setText("");

        prescriptionCheckbox.setSelected(false);

    }

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        searchProducts.setVisible(true);
        Product p = searchProducts.product;
        if (p == null)  {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        enableFields(true);
        ArrayList<Integer> codSymptoms;
        try {
            codSymptoms = symptombl.searchProductSymptoms(p.getId());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error al buscar sintomas: " + ex);
            return;
        }
        try {
            symptomsList.clear();
            for (int i = 0; i < codSymptoms.size(); i++) {
                String symptomName = symptombl.searchSymptoms(codSymptoms.get(i));
                symptomsList.add(symptomName);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error al buscar nombres de sintomas: " + ex);
            return;
        }

        idField1.setText(String.valueOf(p.getId()));
        totalField.setText(String.valueOf(p.getTotalItems()));
        nameField1.setText(p.getName());
        priceField1.setText(String.valueOf(p.getPrice()));
        pointsField.setText(String.valueOf(p.getPoints()));
        minStockField.setText(String.valueOf(p.getMinStock()));
        maxStockField.setText(String.valueOf(p.getMaxStock()));
        if (p.getNeedsPrescription() == 1) {
            prescriptionCheckbox.setSelected(true);
        } else {
            prescriptionCheckbox.setSelected(false);
        }
        addSymptoms = new AddSymptomsToProduct(this, rootPaneCheckingEnabled, symptomsList);

//        System.out.println("0");
//        if (symptomsList.isEmpty()) {
//            System.out.println("Symptoms vacio");
//        } else {
//            for (int i = 0; i < symptomsList.size(); i++) {
//                System.out.println(symptomsList.get(i));
//            }
//        }
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        AdminScreen atras = new AdminScreen();
        atras.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
//        System.out.println("1");
//        if (symptomsList.isEmpty()) {
//            System.out.println("Symptoms vacio");
//        } else {
//            for (int i = 0; i < symptomsList.size(); i++) {
//                System.out.println(symptomsList.get(i));
//            }
//        }
//        System.out.println("2");
//        if (addSymptoms.symptoms.isEmpty()) {
//            System.out.println("Symptoms vacio");
//        } else {
//            for (int i = 0; i < addSymptoms.symptoms.size(); i++) {
//                System.out.println(addSymptoms.symptoms.get(i));
//            }
//        }
        
        if (!(!nameField1.getText().equals("") && !priceField1.getText().equals("") && !pointsField.getText().equals("") && !minStockField.getText().equals("") && !maxStockField.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben tener valores.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (addSymptoms.symptoms.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El producto debe tener al menos un síntoma.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = Integer.parseInt(idField1.getText());
        int totalItems = Integer.parseInt(totalField.getText());
        String name = nameField1.getText();
        double price;
        try {
            price = Double.parseDouble(priceField1.getText());
        } catch (Exception ex) {
            System.out.println("Error en precio: " + ex);
            JOptionPane.showMessageDialog(null, "El precio debe ser un valor decimal.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int points;
        try {
            points = Integer.parseInt(pointsField.getText());
        } catch (Exception ex) {
            System.out.println("Error en puntos: " + ex);
            JOptionPane.showMessageDialog(null, "Los puntos deben ser un valor entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int minStock;
        try {
            minStock = Integer.parseInt(minStockField.getText());
        } catch (Exception ex) {
            System.out.println("Error en puntos: " + ex);
            JOptionPane.showMessageDialog(null, "El stock mínimo debe ser un valor entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int maxStock;
        try {
            maxStock = Integer.parseInt(maxStockField.getText());
        } catch (Exception ex) {
            System.out.println("Error en puntos: " + ex);
            JOptionPane.showMessageDialog(null, "El stock máximo debe ser un valor entero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int prescription;
        if (prescriptionCheckbox.isSelected()) {
            prescription = 1;
        } else {
            prescription = 0;
        }

        int response = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere modificar este producto?", "Modificar", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION) {
            return;
        }
        Product p = new Product(id, name, price, prescription, points, totalItems, minStock, maxStock);
        try {
            productbl.updateProduct(p);
        } catch (Exception ex) {
            System.out.println("Error al modificar producto " + ex);
            JOptionPane.showMessageDialog(null, "Error en base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            for (int i = 0; i < addSymptoms.symptoms.size(); i++) {
                if (symptomsList.contains(addSymptoms.symptoms.get(i))) {
                    continue;
                }
                productbl.addProductXTag(id, symptombl.searchSymptom(addSymptoms.symptoms.get(i)));
            }
        } catch (Exception ex) {
            System.out.println("Error al agregar síntomas " + ex);
            JOptionPane.showMessageDialog(null, "Error en base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            for (String symptom : symptomsList) {
                if (!addSymptoms.symptoms.contains(symptom)) {
                    int symId = symptombl.searchSymptom(symptom);
                    System.out.println(symId);
                    symptombl.deleteProductXTag(Integer.parseInt(idField1.getText()), symId);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error al eliminar síntomas " + ex);
            JOptionPane.showMessageDialog(null, "Error en base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        enableFields(false);
        emptyFields();
        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente el producto.", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este producto?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            for (String symptom : symptomsList) {
                int id = symptombl.searchSymptom(symptom);
                symptombl.deleteProductXTag(Integer.parseInt(idField1.getText()), id);
            }
        } catch (Exception ex) {
            System.out.println("Error al eliminar síntoma del producto: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            discountbl.deleteAllForProduct(Integer.parseInt(idField1.getText()));
        } catch (Exception ex) {
            System.out.println("Error al eliminar descuentos del producto: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            productbl.deleteProduct(Integer.parseInt(idField1.getText()));
        } catch (Exception ex) {
            System.out.println("Error al eliminar producto: " + ex.toString());
            JOptionPane.showMessageDialog(null, "Error en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        enableFields(false);
        emptyFields();
        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente el producto.", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked

    }//GEN-LAST:event_tabBuscarMouseClicked

    private void tabAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgregarMouseClicked
        this.dispose();
        AddProduct addProduct = new AddProduct();
        addProduct.setVisible(true);
    }//GEN-LAST:event_tabAgregarMouseClicked

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

    private void priceField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceField1ActionPerformed

    private void pointsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointsFieldActionPerformed

    private void maxStockFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxStockFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxStockFieldActionPerformed

    private void minStockFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minStockFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minStockFieldActionPerformed

    private void idField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idField1ActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    private void symptomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_symptomButtonActionPerformed
        addSymptoms.setVisible(true);
    }//GEN-LAST:event_symptomButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField idField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField maxStockField;
    private javax.swing.JTextField minStockField;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField pointsField;
    private javax.swing.JCheckBox prescriptionCheckbox;
    private javax.swing.JTextField priceField1;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton symptomButton;
    private javax.swing.JMenu tabAgregar;
    private javax.swing.JMenu tabBuscar;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField totalField;
    // End of variables declaration//GEN-END:variables
}