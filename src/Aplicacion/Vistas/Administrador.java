
package Aplicacion.Vistas;

import Aplicacion.Controller.IndexController;
import System.DataBase.Core.ConvertidorAMatriz;
import System.DataBase.Core.DataBase;
import System.Helper.IO;
import System.MVC.Core.IView;
import System.MVC.Core.View;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JOptionPane;


/**
 * Frame del administrador
 * @author santiquiroz e isamelTheMemeMaster
 * @version 0.8.1
 * @since JConexionDB 1.0
 */
public class Administrador extends View implements IView{
    DataBase db = new DataBase();
    String nickUsuario,nickUsuario2;
    public Administrador(String nick) {
        initComponents();
        nickUsuario2=nick;
        System.out.println(nickUsuario);
        Map<String,String> map = new HashMap();
        map.put("nick",nick);
        db.getWhereEquals("usuario",map,null);
        jTextField1.setText(db.getDato(0,1));
        nickUsuario= db.getDato(0,1);
        jTextField2.setText(nick);
        jTextField2.setEditable(false);
        jTextField3.setText(db.getDato(0,2));
        setVisible(true);
        setTitle("Ventana de administrador");
        setLocationRelativeTo(null);
    }
    /*public Administrador() {
        initComponents();
        setVisible(true);
        setTitle("Ventana de administrador");
        setLocationRelativeTo(null);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jButton3 = new javax.swing.JButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jTextField15 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jTextField20 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField27 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField24 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jTextField36 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jTextField37 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jTextField38 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("Cerrar Sesion");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("REGISTRAR UN PAGO");

        jLabel12.setText("Cedula Empleado");

        jLabel14.setText("Cantidad");

        jButton13.setText("Realizar Pago");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField11)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(210, 210, 210))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addGap(63, 63, 63)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(46, 46, 46)
                .addComponent(jButton13)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Realizar Pago Empleado", jPanel7);

        jLabel19.setText("Cedula");

        jLabel20.setText("Nombre");

        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField13KeyPressed(evt);
            }
        });

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
        });

        jButton9.setText("Registrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });

        jLabel21.setText("Telefono");

        jLabel32.setText("Direccion");

        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });
        jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField28KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton9))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton9)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Agregar Empleado", jPanel8);

        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
        });

        jLabel23.setText("Cedula");

        jLabel24.setText("Confirmar Cedula");

        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton7)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(jButton7)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Eliminar Empleado", jPanel10);

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField18KeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("INGRESE LOS DATOS CONOCIDOS");

        jLabel25.setText("Cedula");

        jLabel26.setText("Nombre");

        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField19KeyPressed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconocido", "Activo", "Inactivo", "Despedido" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel27.setText("Estatus");

        jButton11.setText("Buscar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField20KeyPressed(evt);
            }
        });

        jLabel28.setText("Telefono");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField20)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19))
                        .addGap(75, 75, 75)))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel22)
                .addGap(49, 49, 49)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(58, 58, 58)
                .addComponent(jButton11)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Buscar Empleado", jPanel11);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empleados", jPanel2);

        jLabel4.setText("Nick");

        jLabel6.setText("Nombre");

        jLabel7.setText("Password");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jLabel8.setText("Confirmar Password");

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Administrador","Comun"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de usuario");

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(141, 141, 141)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField2)
                                    .addComponent(jComboBox1, 0, 126, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jButton2)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Registrar Usuario", jPanel3);

        jLabel10.setText("Nick");

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel13.setText("Confirmar Nick");

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jTextField8)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton4)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButton4)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Eliminar Usuario", jPanel6);

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("INGRESE LOS DATOS CONOCIDOS");

        jLabel15.setText("Nick");

        jLabel17.setText("Nombre");

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Desconocido", "Administrador", "Comun"}));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel18.setText("Tipo");

        jButton8.setText("Buscar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(116, 116, 116)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9)
                    .addComponent(jTextField12))
                .addGap(75, 75, 75))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addGap(47, 47, 47)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(54, 54, 54)
                .addComponent(jButton8)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Buscar Usuario", jPanel12);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane2)
                .addGap(73, 73, 73))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 272, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuarios", jPanel5);

        jLabel29.setText("Codigo");

        jLabel30.setText("Nombre");

        jLabel31.setText("Descripcion");

        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField21KeyPressed(evt);
            }
        });

        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField22KeyPressed(evt);
            }
        });

        jLabel33.setText("Precio base");

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField27KeyPressed(evt);
            }
        });

        jLabel39.setText("Peso");

        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField29KeyPressed(evt);
            }
        });

        jLabel40.setText("Tipo");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquido", "Envase", "Otro" }));
        jComboBox6.setToolTipText("");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33))
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(96, 96, 96)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel14Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField29)
                                            .addComponent(jTextField22)
                                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField27)))))
                            .addComponent(jLabel29)
                            .addComponent(jLabel39)
                            .addComponent(jLabel30))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jTabbedPane4.addTab("Registrar Producto", jPanel14);

        jLabel34.setText("Codigo");

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
        });

        jLabel35.setText("Confirmar Codigo");

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField24KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jTextField24)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Eliminar Producto", jPanel15);

        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField25KeyPressed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("INGRESE LOS DATOS CONOCIDOS");

        jLabel37.setText("Codigo");

        jLabel38.setText("Nombre");

        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField26KeyPressed(evt);
            }
        });

        jButton12.setText("Buscar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel41.setText("Peso");

        jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField30KeyPressed(evt);
            }
        });

        jLabel42.setText("Tipo");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquido", "Envase", "Otro", "Desconocido" }));
        jComboBox5.setSelectedIndex(3);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jLabel43.setText("Disponible");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconocido", "Disponible", "No Disponible" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jLabel44.setText("Precio Base");

        jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField31KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(100, 100, 100)
                        .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel44))
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField31)
                                            .addComponent(jTextField30)
                                            .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton12)
                                .addGap(117, 117, 117)))))
                .addGap(220, 220, 220))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel36)
                .addGap(35, 35, 35)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton12)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Buscar Producto", jPanel16);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane4)
                .addGap(73, 73, 73))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel13);

        jLabel1.setText("Nombre");

        jLabel2.setText("Nick");

        jLabel3.setText("Password");

        jButton1.setText("Actualizar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(166, 166, 166))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(491, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mi cuenta", jPanel4);

        jLabel50.setText("Nombre del municipio");

        jButton16.setText("Registrar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField36KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(41, 41, 41)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton16)
                        .addGap(210, 210, 210))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton16)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Registrar municipio", jPanel19);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Municipios", jPanel18);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Pedidos del dia", jPanel17);

        jLabel52.setText("Codigo");

        jTextField35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField35KeyPressed(evt);
            }
        });

        jLabel53.setText("Confirmar Codigo");

        jButton14.setText("Eliminar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField37KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField35, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jTextField37)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Eliminar Producto", jPanel20);

        jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField38KeyPressed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("INGRESE LOS DATOS CONOCIDOS");

        jLabel55.setText("Codigo");

        jLabel56.setText("Nombre");

        jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField39KeyPressed(evt);
            }
        });

        jButton15.setText("Buscar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel57.setText("Peso");

        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField40KeyPressed(evt);
            }
        });

        jLabel58.setText("Tipo");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Liquido", "Envase", "Otro", "Desconocido" }));
        jComboBox9.setSelectedIndex(3);
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });

        jLabel59.setText("Disponible");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desconocido", "Disponible", "No Disponible" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jLabel60.setText("Precio Base");

        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField41KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(100, 100, 100)
                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel60))
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel21Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField41)
                                            .addComponent(jTextField40)
                                            .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jButton15)
                                .addGap(117, 117, 117)))))
                .addGap(220, 220, 220))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel54)
                .addGap(35, 35, 35)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel57)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel60)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel58)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton15)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Buscar Producto", jPanel21);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos", jPanel1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Clientes");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 24));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToggleButton6)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton6)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           BuscarCliente();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BuscarCliente(){
        
        boolean b1 = IO.textfield_requerido(jTextField4);
        
        if (b1){
            String telefono= jTextField4.getText();
            Map<String,String> map = new HashMap();
            map.put("telefono",telefono);
            db.getWhereEquals("cliente", map, null);
            int tipo = 1;
            if(db.isEmpty()){
                new ClienteNuevo(telefono,this.nickUsuario);
            }
            else{
                new Pedido(telefono,this.nickUsuario);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese el telefono del cliente");
        }
    }
    
    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        new Index();
        this.dispose();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void ActualizarCuenta(){
        boolean b1 = IO.textfield_requerido(jTextField3);
        
        if (b1){
            String nombre=jTextField1.getText();
            String nick=jTextField2.getText();
            String password=jTextField3.getText();
            
            
            Map<String,String> map = new HashMap();

            //map.put("nick", nick);
            map.put("nombre", nombre);
            map.put("password", password);
            //map.put("ADMINISTRADOR", "1");
            //map.put("COMUN", "0");
            
            //db.getWhereEquals("usuario",map,"AND");
            String[] arrayNick = new String[2];
            arrayNick[0]="nick";
            arrayNick[1]=nick;
            db.update("usuario", map, arrayNick);
            
            //db.actualizar("UPDATE usuario SET nombre=`"+nombreN+"`, password=`"+passwordN+"`WHERE (nick=`"+nickN+"`)");
            //db.excecuteQuery("UPDATE usuario SET nombre=`"+nombreN+"`, password=`"+passwordN+"`WHERE (nick=`"+nickN+"`)");
                       
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void RegistrarUsuario(){
        boolean b1 = IO.textfield_requerido(jTextField5,jPasswordField1,jPasswordField2);

        if (b1){
            String nombre=jTextField6.getText();
            String nick=jTextField5.getText();
            String password=jPasswordField1.getText();
            String seleccion=jComboBox1.getSelectedItem().toString();
            
            
            if(password.equals(jPasswordField2.getText())){
                 Map<String,String> map = new HashMap();
                 map.put("nick",nick);
                 map.put("nombre", nombre);
                 map.put("password", password);
                 if(seleccion.equals("Administrador")){
                     map.put("ADMINISTRADOR","1");
                     map.put("COMUN","0");
                 }
                 else{
                     map.put("ADMINISTRADOR","0");
                     map.put("COMUN","1");
                 }
                 db= new DataBase();
                 db.excecuteQuery("SELECT * FROM usuario WHERE(nick='"+nick+"')");
                 if(db.isEmpty()){
                    
                    db.insertar("usuario", map);
                    jTextField6.setText("");
                    jTextField5.setText("");
                    jPasswordField1.setText("");
                    jComboBox1.setSelectedIndex(0);
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cedula ya esta registrada");

                }
                 
                 jTextField5.setText("");
                 jTextField6.setText("");
                 jPasswordField1.setText("");
                 jPasswordField2.setText("");
                 jComboBox1.setSelectedIndex(0);
            }
            else{
                JOptionPane.showMessageDialog(null, "Los passwords no coinciden");
                jPasswordField1.setText("");
                jPasswordField2.setText("");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void EliminarUsuario(){
        boolean b1 = IO.textfield_requerido(jTextField7,jTextField8);

        if (b1){
            String nick=jTextField7.getText();
            
            
            if(nick.equals(jTextField8.getText())){
                db=new DataBase();
                Map<String,String> map = new HashMap();
                map.put("nick",nick);
                db.getWhereEquals("usuario", map, null);
                if(!db.isEmpty()){
                    map = new HashMap();
                    map.put("nick",nick);

                     db=new DataBase();
                     db.delete("usuario", map);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El nick no existe");  
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Los nicks no coinciden");
            }
            jTextField7.setText("");
            jTextField8.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void BuscarUsuario(){
        String[] cabecera= new String[5];
                cabecera[0]="nick";
                cabecera[1]="nombre";
                cabecera[2]="password";
                cabecera[3]="administrador";
                cabecera[4]="comun";
        boolean b1 = IO.textfield_requerido(jTextField9);
        boolean b2 = (jTextField12.getText().equals("")==false);
        boolean cb1= (jComboBox2.getSelectedItem().equals("Desconocido"));
        
        if((b1==true && b2==false && cb1==true)||(b1==true && b2==true && cb1==true)){//Si se sabe el nick y el nombre o el nick
            String nick= jTextField9.getText();
            db = new DataBase();
            ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+nick+"')");
            //System.out.println(datos.get(0));
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un usuario con tal nick");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                //db.mostrarTerminalTable("usuario");
                //db.mostrarDialogTable("Usuario");  
            }
            
        }
        else if(b1==false && b2==true && cb1==true){//si solo se sabe el nombre
            db = new DataBase();
            ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nombre='"+jTextField12.getText()+"')");
      
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un usuario con tal nombre");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                
            }             
        }
       
        else if(b1==false && b2==false && cb1==false){//si solo se sabe el tipo
            db = new DataBase();
            if(jComboBox2.getSelectedItem().equals("Administrador")){
                    ArrayList datos =db.excecuteQuery("SELECT * FROM usuario WHERE (ADMINISTRADOR='1')");
                    

                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario de tipo administrador");
                }
                else{
                   new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else if(jComboBox2.getSelectedItem().equals("Comun")){
                 ArrayList datos =db.excecuteQuery("SELECT * FROM usuario WHERE (COMUN='1')");
                 if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario de tipo comun");
               }
               else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            
            }
        }
        else if(b1==true && b2==true && cb1==true){//si se sabe nick y nombre
                db = new DataBase();
                ArrayList datos =db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+jTextField9.getText()+"' AND nombre='"+jTextField12.getText()+"')");
      
                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe un usuario con tal combinacion de nick y nombre");
                }
                 else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                 }
        }
        else if(b1==false && b2==true && cb1==false){//si sabe nombre y tipo
            db = new DataBase();
            if(jComboBox2.getSelectedItem().equals("Administrador")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nombre='"+jTextField12.getText()+"'AND ADMINISTRADOR='1')");
                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario de tipo administrador con ese nombre");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else if(jComboBox2.getSelectedItem().equals("Comun")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nombre='"+jTextField12.getText()+"'AND COMUN='1')");

                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario de tipo comun con ese nombre");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
        }
            
        else if(b1==true && b2==false && cb1==false){//si sabe nick y tipo
            db = new DataBase();
            if(jComboBox2.getSelectedItem().equals("Administrador")){
                    ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+jTextField9.getText()+"'AND ADMINISTRADOR='1')");

                    if(db.isEmpty()){
                        JOptionPane.showMessageDialog(null, "No existe un usuario de tipo administrador con ese nick");
                    }
                     else{
                        new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                    }
            }
            else if(jComboBox2.getSelectedItem().equals("Comun")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+jTextField9.getText()+"'AND COMUN='1')");
                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario de tipo comun con ese nick");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else{
                System.out.println("fallo");
            }
        }
        
        else if(b1==true && b2==true && cb1==false){//si se sabe todo
            db = new DataBase();
            if(jComboBox2.getSelectedItem().equals("Administrador")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+jTextField9.getText()+"' AND nombre='"+jTextField12.getText()+"'AND ADMINISTRADOR='1')");
                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario con tal nick y nombre y que sea de tipo administrador");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else if(jComboBox2.getSelectedItem().equals("Comun")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM usuario WHERE (nick='"+jTextField9.getText()+"' AND nombre='"+jTextField12.getText()+"'AND COMUN='1')");
                if(db.isEmpty()){
                   JOptionPane.showMessageDialog(null, "No existe un usuario con tal nick y nombre y que sea de tipo comun");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
                }
            }
        }
        else{//Si no se sabe nada
            ArrayList datos = db.excecuteQuery("SELECT * FROM usuario");
            if(db.isEmpty()){
               JOptionPane.showMessageDialog(null, "No existe ningun usuario en la DB");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,5).result(), "Usuarios", "",this,"soloIdentificador").createAndShowGUI();
            }
            
        }
            
        //reiniciando campos
        jTextField9.setText("");
        jTextField12.setText("");
        jComboBox2.setSelectedIndex(0);
    }
    
    private void RegistrarProducto(){
        boolean b1 = IO.textfield_requerido(jTextField21, jTextField22, jTextField29,jTextField21);
        boolean b2 = (jTextArea1.getText().equals("")==false);
        

        if (b1){
            String codigo=jTextField21.getText();
            String nombre=jTextField29.getText();
            String peso=jTextField22.getText();
            String tipo=jComboBox6.getItemAt(jComboBox6.getSelectedIndex());
            String descripcion=jTextArea1.getText();
            String precioBase=jTextField27.getText();
            
            
            db.excecuteQuery("SELECT * FROM producto WHERE(codigo='"+codigo+"')");
            if(db.isEmpty()){
                
                Map<String,String> map = new HashMap();
                 map.put("codigo",codigo);
                 map.put("nombre", nombre);
                 map.put("peso",peso);
                 map.put("tipo",tipo);
                 map.put("descripcion", descripcion);
                 map.put("precioBase", precioBase);
                 map.put("disponible", "1");
                 
                    
                db.insertar("producto", map);
                if(db.isEmpty()){
                    jTextField21.setText("");
                    jTextField29.setText("");
                    jTextField22.setText("");
                    jTextArea1.setText("");
                    jTextField27.setText("");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "La codigo ya esta registrado");

            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void EliminarProducto(){
        boolean b1 = IO.textfield_requerido(jTextField23,jTextField24);

        if (b1){
            String codigo=jTextField23.getText();
            
            
            if(codigo.equals(jTextField24.getText())){
                db=new DataBase();
                Map<String,String> map = new HashMap();
                map.put("codigo",codigo);
                db.getWhereEquals("producto", map, null);
                if(!db.isEmpty()){
                    map = new HashMap();
                    map.put("codigo",codigo);

                     db=new DataBase();
                     db.delete("producto", map);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El codigo no existe");  
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Los codigos no coinciden");
            }
            jTextField23.setText("");
            jTextField24.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void BuscarProducto(){
        
        String[] cabecera= new String[7];
                cabecera[0]="codigo";
                cabecera[1]="nombre";
                cabecera[2]="peso";
                cabecera[3]="tipo";
                cabecera[4]="descripcion";
                cabecera[5]="precio base";
                cabecera[6]="disponible";
        boolean b1 = IO.textfield_requerido(jTextField25);//codigo
        boolean b2 = IO.textfield_requerido(jTextField26);//nombre
        boolean b3 = IO.textfield_requerido(jTextField30);//peso
        boolean b4 = IO.textfield_requerido(jTextField31);//preciobase
        boolean b5 = !(((String)jComboBox5.getSelectedItem())).equals("Desconocido");//tipo
        boolean b6 = !(((String)jComboBox7.getSelectedItem())).equals("Desconocido");//disponible
        
        if(b1==true || b2==true || b3==true || b4==true || b5==true || b6==true){
            db=new DataBase();
            String disponibilidad = (String)jComboBox7.getSelectedItem();
            if(disponibilidad.equals("Disponible")){
                disponibilidad="1";
            }
            else if(disponibilidad.equals("No disponible")){
                disponibilidad="0";
            }
            ArrayList datos = db.excecuteQuery("SELECT * FROM producto WHERE codigo='"+jTextField25.getText()+"' OR nombre='"+jTextField26.getText()+"' OR peso='"+jTextField30.getText()+"' OR precioBase ='"+jTextField31.getText()+"' OR tipo='"+(String)jComboBox5.getSelectedItem()+"' OR disponible='"+disponibilidad+"'");
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un producto con esas caracteristicas");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,7).result(), "Productos", "EditarProducto",this,"soloIdentificador").createAndShowGUI();
            }
        }
        else{
            db=new DataBase();
            ArrayList datos =db.excecuteQuery("SELECT * FROM producto");
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existen productos registrados");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,7).result(), "Productos", "EditarProducto",this,"soloIdentificador").createAndShowGUI();
            }
        }  
        //reiniciando campos
        jTextField9.setText("");
        jTextField12.setText("");
        jComboBox2.setSelectedIndex(0);
    }
        
    private void BuscarEmpleado(){
        String[] cabecera= new String[6];
        cabecera[0]="cedula";
        cabecera[1]="nombre";
        cabecera[2]="telefono";
        cabecera[3]="activo";
        cabecera[4]="inactivo";
        cabecera[5]="despedido";
        boolean b1 = IO.textfield_requerido(jTextField18);
        boolean b2 = (jTextField19.getText().equals("")==false);
        boolean b3 = (jTextField20.getText().equals("")==false);
        boolean cb1= (jComboBox3.getSelectedItem().equals("Desconocido"));

        if(b1==true){//Si se sabe la cedula
            String cedula= jTextField18.getText();
            db = new DataBase();
            ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (cedula='"+cedula+"')");
            //System.out.println(datos.get(0));
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un empleado con tal cedula");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
            }
        }

        else if(b2==true && b3==false && cb1==true){//si solo se sabe el nombre
            db = new DataBase();
            ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (nombre='"+jTextField19.getText()+"')");

            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un empleado con tal nombre");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();

            }
        }

        else if(b2==false && b3==true && cb1==true){//si solo se sabe el telefono
            db = new DataBase();
            ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (telefono='"+jTextField20.getText()+"')");

            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un empleado con tal telefono");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();

            }
        }

        else if(b2==false && b3==false && cb1==false){//si solo se sabe el estatus
            db = new DataBase();
            if(jComboBox3.getSelectedItem().equals("Activo")){
                ArrayList datos =db.excecuteQuery("SELECT * FROM empleado WHERE (activo='1')");

                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe ningun usuario de tipo Activo");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else if(jComboBox3.getSelectedItem().equals("Inactivo")){
                ArrayList datos =db.excecuteQuery("SELECT * FROM empleado WHERE (inactivo='1')");
                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe ningun usuario de tipo inactivo");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }

            }
            else{
                ArrayList datos =db.excecuteQuery("SELECT * FROM empleado WHERE (despedido='1')");

                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe ningun usuario de tipo despedido");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleado", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }
            }
        }
        else if(b2==true && b3==true && cb1==true){//si se sabe telefono y nombre
            db = new DataBase();
            ArrayList datos =db.excecuteQuery("SELECT * FROM empleado WHERE (nombre='"+jTextField19.getText()+"' AND telefono='"+jTextField20.getText()+"')");

            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe un empleado con tal combinacion de nombre y telefono");
            }
            else{

                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
            }
        }
        else if(b2==true && b3==false && cb1==true){//si sabe el nombre y tipo
            db = new DataBase();
            if(jComboBox3.getSelectedItem().equals("Activo")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (nombre='"+jTextField19.getText()+"'AND activo='1')");
                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe un empleado activo con ese nombre");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else if(jComboBox3.getSelectedItem().equals("Inactivo")){
                ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (nombre='"+jTextField19.getText()+"'AND inactivo='1')");
                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe un empleado inactivo con ese nombre");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }
            }
            else{
                ArrayList datos = db.excecuteQuery("SELECT * FROM empleado WHERE (nombre='"+jTextField19.getText()+"'AND despedido='1')");
                if(db.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existe un empleado despedido con ese nombre");
                }
                else{
                    new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
                }
            }
        }

        else{//Si no se sabe nada
            ArrayList datos = db.excecuteQuery("SELECT * FROM empleado");
            if(db.isEmpty()){
                JOptionPane.showMessageDialog(null, "No existe ningun empleado");
            }
            else{
                new SimpleTableDemo(cabecera,new ConvertidorAMatriz(datos,6).result(), "Empleados", "EditarEmpleado",this,"soloIdentificador").createAndShowGUI();
            }

        }

        //reiniciando campos
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jComboBox3.setSelectedIndex(0);
    }
    
    private void AgregarEmpleado(){
        boolean b1 = IO.textfield_requerido(jTextField13);

        if (b1){
            String cedula=jTextField13.getText();
            String nombre=jTextField14.getText();
            String telefono=jTextField17.getText();
            String direccion = jTextField28.getText();
            db=new DataBase();
            db.excecuteQuery("SELECT * FROM EMPLEADO WHERE(cedula='"+cedula+"')");
            if(db.isEmpty()){
                Map<String,String> map = new HashMap();
                map.put("cedula",cedula);
                map.put("nombre", nombre);
                map.put("telefono", telefono);
                map.put("direccion", direccion);
                map.put("activo", "1");
                map.put("inactivo", "0");
                map.put("despedido", "0");

                db.insertar("empleado", map);
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField17.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "La cedula ya esta registrada");

            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos obligatorios");
        }
    }
        
    private void RealizarPago(){
        boolean b1 = IO.textfield_requerido(jTextField11,jTextField10);

        if(b1){

            String fecha = new Fecha().toString("A/M/D");
            String hora = new Fecha().toString("h:m:s");
            String fechayhora = (fecha+"-"+hora);
            String cedula= jTextField11.getText();
            String cantidad= jTextField10.getText();

            Map<String,String> map = new HashMap();
            map.put("fechayhora",fechayhora);
            map.put("cantidad",cantidad);
            map.put("cedula",cedula);
            map.put("nick",nickUsuario2);
            db = new DataBase();
            if(db.insertar("pago",map)){
                new PagoRealizado(cedula, cantidad, fecha, hora);

                jTextField11.setText("");
                jTextField10.setText("");

            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void EliminarEmpleado(){
        boolean b1 = IO.textfield_requerido(jTextField15,jTextField16);

        if (b1){
            String cedula=jTextField15.getText();
            
            
            if(cedula.equals(jTextField16.getText())){
                db=new DataBase();
                Map<String,String> map = new HashMap();
                map.put("cedula",cedula);
                db.getWhereEquals("empleado", map, null);
                if(!db.isEmpty()){
                    map = new HashMap();
                    map.put("cedula",cedula);

                     db=new DataBase();
                     db.delete("empleado", map);
                }
                else{
                    JOptionPane.showMessageDialog(null, "La cedula no existe");  
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Las cedulas no coinciden");
            }
            jTextField15.setText("");
            jTextField16.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }
    }
    
    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarCliente();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ActualizarCuenta();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ActualizarCuenta();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ActualizarCuenta();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ActualizarCuenta();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31KeyPressed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextField30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField30KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30KeyPressed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        BuscarProducto();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarProducto();
        }
    }//GEN-LAST:event_jTextField26KeyPressed

    private void jTextField25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarProducto();
        }
    }//GEN-LAST:event_jTextField25KeyPressed

    private void jTextField24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarProducto();
        }
    }//GEN-LAST:event_jTextField24KeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EliminarProducto();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarProducto();
        }
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jTextField29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29KeyPressed

    private void jTextField27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarProducto();
        }
    }//GEN-LAST:event_jTextField27KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarProducto();
        }
    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //21, 22 y 27 y text area 1
        RegistrarProducto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarProducto();
        }
    }//GEN-LAST:event_jTextField22KeyPressed

    private void jTextField21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField21KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarProducto();
        }
    }//GEN-LAST:event_jTextField21KeyPressed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        BuscarUsuario();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarUsuario();
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarUsuario();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarUsuario();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EliminarUsuario();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarUsuario();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistrarUsuario();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPasswordField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarUsuario();
        }
    }//GEN-LAST:event_jPasswordField2KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarUsuario();
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarUsuario();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RegistrarUsuario();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarEmpleado();
        }
    }//GEN-LAST:event_jTextField20KeyPressed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        BuscarEmpleado();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarEmpleado();
        }
    }//GEN-LAST:event_jTextField19KeyPressed

    private void jTextField18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            BuscarEmpleado();
        }
    }//GEN-LAST:event_jTextField18KeyPressed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //15 y 16
        EliminarEmpleado();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarEmpleado();
        }
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            EliminarEmpleado();
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            AgregarEmpleado();
        }
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        AgregarEmpleado();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            AgregarEmpleado();
        }
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            AgregarEmpleado();
        }
    }//GEN-LAST:event_jTextField13KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RealizarPago();
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            RealizarPago();
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        RealizarPago();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField36KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36KeyPressed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        db=new DataBase();
        db.insertar3("INSERT INTO municipio(nombremunicipio) VALUES('"+jTextField36.getText()+"')");
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTextField35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField35KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35KeyPressed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37KeyPressed

    private void jTextField38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38KeyPressed

    private void jTextField39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39KeyPressed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40KeyPressed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jTextField41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41KeyPressed

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28KeyPressed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    public javax.swing.JComboBox<String> jComboBox2;
    public javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onDataReceiver(int action, Object object) {
        switch (action) {
            // recibimos la informacion desde el controllador
            case IndexController.btnExitApp:
                String data = (String) object; // parceamos al objeto original
                JOptionPane.showMessageDialog(this, data); // imprimimos la informacion 
                break;
            default:
                System.out.println("No hay un caso para actionid");
        }
    }
    
}


