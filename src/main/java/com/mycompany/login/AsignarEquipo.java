package com.mycompany.login;

import javax.swing.*;

import static com.mycompany.login.NewMain.usuarios;

public class AsignarEquipo extends javax.swing.JFrame {

    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JButton addButton;
    private JComboBox jComboBox2;

    public AsignarEquipo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nameLabel = new JLabel("Nombre del estudiante:");
        nameTextField = new JTextField();
        addButton = new JButton("Agregar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        for (int i = 0; i < NewMain.usuarios.size(); i++) {
            Usuario v = NewMain.usuarios.get(i);

            jComboBox1.addItem(v.getNombre());
        }

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        for (var equipo : CreacionUsuarios.listaEquiposGlobal) {
            jComboBox2.addItem(equipo.getNombre());
        }

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(addButton))
                                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addButton)
                                .addContainerGap(105, Short.MAX_VALUE))
        );
        pack();
    }

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedCaptain = (String) jComboBox2.getSelectedItem();

        String selectedName = (String) jComboBox1.getSelectedItem();

        for (var equipo : CreacionUsuarios.listaEquiposGlobal) {
            if (equipo.getNombre().equals(selectedCaptain)) {

                for (Usuario usuario : usuarios) {
                    if (usuario.getNombre().equals(selectedName)) {
                        equipo.setArraylist(usuario);
                    }
                }

                break;
            }
        }
    }
}
