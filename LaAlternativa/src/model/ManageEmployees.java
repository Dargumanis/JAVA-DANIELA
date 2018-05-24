/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import businesslogic.EmployeeBL;
import entities.Employee;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.FieldGetter;

/**
 *
 * @author Usuario
 */
public class ManageEmployees extends javax.swing.JFrame {

    /**
     * Creates new form ManageEmployees
     */
    EmployeeBL employeebl;
    DefaultTableModel model;

    public ManageEmployees() {
        initComponents();
        employeebl = new EmployeeBL();
        model = (DefaultTableModel) employeeTable.getModel();
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

        dniField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        acceptButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dniField1 = new javax.swing.JTextField();
        nameField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        surnameField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        adminCheckbox = new javax.swing.JCheckBox();
        idField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        tabAgregar = new javax.swing.JMenu();
        tabBuscar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dniField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniFieldActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        surnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Id");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("DNI");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nombre");

        titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo.setText("Editar Empleados");

        idField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFieldFocusGained(evt);
            }
        });
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese uno o más datos para buscar un usuario:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Apellidos");

        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Seleccione un usuario:");

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Dni", "Nombre", "Apellidos", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(employeeTable);

        acceptButton.setText("Aceptar");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("DNI");

        dniField1.setEditable(false);
        dniField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniField1ActionPerformed(evt);
            }
        });

        nameField1.setEditable(false);
        nameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Nombre");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Apellidos");

        surnameField1.setEditable(false);
        surnameField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Empleado:");

        returnButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        returnButton.setText("< Regresar");
        returnButton.setContentAreaFilled(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Modificar");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Eliminar");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Direccion");

        addressField.setEditable(false);
        addressField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFieldFocusGained(evt);
            }
        });
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Telefono");

        phoneField.setEditable(false);
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        passwordField.setEditable(false);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Contraseña");

        adminCheckbox.setText("¿Es administrador?");
        adminCheckbox.setEnabled(false);

        idField1.setEditable(false);
        idField1.setEnabled(false);
        idField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idField1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Id");

        emailField.setEditable(false);
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Email");

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
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(titulo)
                    .addComponent(searchButton)
                    .addComponent(jLabel5)
                    .addComponent(acceptButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminCheckbox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel16)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dniField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(surnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)))))))
                    .addComponent(idField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(acceptButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dniField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(3, 3, 3)
                        .addComponent(idField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(2, 2, 2)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniFieldActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

    private void surnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameFieldActionPerformed

    private void idFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFieldFocusGained
        if (idField.getText().equals("Código")) {
            idField.setText("");
        }
    }//GEN-LAST:event_idFieldFocusGained

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed

    }//GEN-LAST:event_idFieldActionPerformed

    private void tabAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAgregarMouseClicked
        this.dispose();
        AddEmployee pantallaAgregar = new AddEmployee();
        pantallaAgregar.setVisible(true);
    }//GEN-LAST:event_tabAgregarMouseClicked

    private void tabBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabBuscarMouseClicked

    }//GEN-LAST:event_tabBuscarMouseClicked

    private void dniField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dniField1ActionPerformed

    private void nameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1ActionPerformed

    private void surnameField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameField1ActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        PantallaAdmin atras = new PantallaAdmin();
        atras.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        Integer id = FieldGetter.getFieldInt(idField);
        String dni = FieldGetter.getFieldString(dniField);
        String name = FieldGetter.getFieldString(nameField);
        String surname = FieldGetter.getFieldString(surnameField);
        ArrayList<Employee> employees = employeebl.searchEmployees(id, dni, name, surname);
        if (employees.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se encontraron empleados.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (Employee e : employees) {
            model.addRow(new Object[]{String.valueOf(e.getId()), e.getDni(), e.getName(), e.getSurname(), String.valueOf(e.getType())});
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        int index = employeeTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un empleado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Employee> list = employeebl.searchEmployees(Integer.parseInt((String) employeeTable.getValueAt(index, 0)), null, null, null);
        Employee e = list.get(0);
        idField1.setText(String.valueOf(e.getId()));
        dniField1.setText(e.getDni());
        nameField1.setText(e.getName());
        surnameField1.setText(e.getSurname());
        addressField.setText(e.getAddress());
        phoneField.setText(e.getPhoneNumber());
        passwordField.setText(e.getPhoneNumber());
        emailField.setText(e.getEmail());
        if (e.getType() == 1) {
            adminCheckbox.setSelected(true);
        }
        enableFields(true);

    }//GEN-LAST:event_acceptButtonActionPerformed

    private void addressFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldFocusGained

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void enableFields(Boolean b) {
        dniField1.setEnabled(b);
        nameField1.setEnabled(b);
        surnameField1.setEnabled(b);
        emailField.setEnabled(b);
        addressField.setEnabled(b);
        phoneField.setEnabled(b);
        passwordField.setEnabled(b);
        adminCheckbox.setEnabled(b);
        
        dniField1.setEditable(b);
        nameField1.setEditable(b);
        surnameField1.setEditable(b);
        emailField.setEditable(b);
        addressField.setEditable(b);
        phoneField.setEditable(b);
        passwordField.setEditable(b);
    }
    
    private void emptyFields() {
        idField.setText("");
        dniField.setText("");
        nameField.setText("");
        surnameField.setText("");
        
        idField1.setText("");
        dniField1.setText("");
        nameField1.setText("");
        surnameField1.setText("");
        emailField.setText("");
        addressField.setText("");
        phoneField.setText("");
        passwordField.setText("");
        adminCheckbox.setSelected(false);
        
        model.setRowCount(0);
    }
    
     
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (!(!idField1.getText().equals("") && !dniField1.getText().equals("") && !nameField1.getText().equals("") 
                && !surnameField1.getText().equals("") && !emailField.getText().equals("") && !addressField.getText().equals("")
                && !phoneField.getText().equals("") && !passwordField.getText().equals(""))) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben tener valores.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int response = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere modificar este empleado?", "Modificar", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION) {
            return;
        }
        int id = Integer.parseInt(idField1.getText());
        String dni = dniField1.getText();
        String name = nameField1.getText();
        String surname = surnameField1.getText();
        String email = emailField.getText();
        String address = addressField.getText();
        String phone = phoneField.getText();
        String password = passwordField.getText();
        int type;
        if (adminCheckbox.isSelected()) {
            type = 1;
        } else {
            type = 1;
        }
        Employee e = new Employee(id, dni, name, surname, address, password, email, phone, type);
        employeebl.modifyEmployee(e);
        enableFields(false);
        emptyFields();
        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente al empleado.", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void idField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idField1ActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este empleado?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.NO_OPTION) {
            return;
        }
        employeebl.deleteEmployee(Integer.parseInt(idField1.getText()));
        enableFields(false);
        emptyFields();
        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente al empleado.", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteButtonActionPerformed

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 700);
    }

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
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageEmployees().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JCheckBox adminCheckbox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dniField;
    private javax.swing.JTextField dniField1;
    private javax.swing.JTextField emailField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField idField1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton returnButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField surnameField;
    private javax.swing.JTextField surnameField1;
    private javax.swing.JMenu tabAgregar;
    private javax.swing.JMenu tabBuscar;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
