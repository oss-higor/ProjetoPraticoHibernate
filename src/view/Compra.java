/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Banco.Conexao;
import Dao.ProdutoDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.*;



public class Compra extends javax.swing.JFrame {
    ArrayList<Double> total = new ArrayList<>();
    Connection conexao1 = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int UltimaChave, last, paradaExecucao=0;
    
    
    
    public Compra() {
        conexao1 = Conexao.conector();
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    int i = 1;
    int j = 1;

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancodedados_projetopratico?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        tbprodutoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbproduto t");
        tbprodutoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbprodutoQuery.getResultList();
        tbprodutoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbproduto t");
        tbprodutoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbprodutoQuery1.getResultList();
        tbprodutoQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbproduto t");
        tbprodutoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbprodutoQuery2.getResultList();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Num1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Num2 = new javax.swing.JLabel();
        Tel = new javax.swing.JLabel();
        Cidade2 = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Bairro2 = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Rua2 = new javax.swing.JLabel();
        Cidade1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Bairro1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CEP2 = new javax.swing.JLabel();
        UF2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Rua1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        CEP1 = new javax.swing.JLabel();
        jLabeNome = new javax.swing.JLabel();
        UF1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButtonFinalizarVenda = new javax.swing.JButton();
        jButtonAddProduto = new javax.swing.JButton();
        data_venda = new javax.swing.JFormattedTextField();
        campo_cpf_compra = new javax.swing.JFormattedTextField();
        quantidade = new javax.swing.JFormattedTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Endereço 1", "Endereço 2" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Numero:");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbprodutoList2, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codProduto}"));
        columnBinding.setColumnName("Cod Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricaoProduto}"));
        columnBinding.setColumnName("Descricao Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${categoriaProduto}"));
        columnBinding.setColumnName("Categoria Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorProduto}"));
        columnBinding.setColumnName("Valor Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estoqueProduto}"));
        columnBinding.setColumnName("Estoque Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caracteristicaProd}"));
        columnBinding.setColumnName("Caracteristica Prod");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel13.setText("Numero:");

        jLabelTel.setText("Telefone");

        jLabel14.setText("Cidade:");

        jLabelCPF.setText("CPF:");

        jLabel15.setText("CEP:");

        jLabel16.setText("Bairro");

        jLabel7.setText("Cidade:");

        jLabel8.setText("CEP:");

        jLabel1.setText("CPF:");

        jLabel17.setText("Rua:");

        jLabel18.setText("Estado:");

        jLabel9.setText("Bairro");

        jLabel2.setText("Endereco 1");

        jLabel3.setText("Endereco 2");

        jLabel10.setText("Rua:");

        jLabel4.setText("Endereço de entrega:");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabeNome.setText("Nome:");

        jLabel11.setText("Estado:");

        jLabelEmail.setText("Email");

        jLabel5.setText("Selecione Produto");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Data Venda");

        jLabel19.setText("Quantidade");

        jButtonFinalizarVenda.setText("Finalizar Venda");
        jButtonFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarVendaActionPerformed(evt);
            }
        });

        jButtonAddProduto.setText("Adicionar Produto");
        jButtonAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddProdutoActionPerformed(evt);
            }
        });

        try {
            data_venda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campo_cpf_compra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        quantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFinalizarVenda))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonAddProduto))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelEmail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelTel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelCPF)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabeNome)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(UF1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Cidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Bairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Rua1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(UF2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CEP2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Cidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Bairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Rua2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campo_cpf_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonBuscar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(data_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel5)))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButtonBuscar)
                        .addComponent(campo_cpf_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(data_venda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeNome)
                            .addComponent(Nome))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTel)
                            .addComponent(Tel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCPF)
                            .addComponent(CPF)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(CEP2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(UF2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(Cidade2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(Bairro2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(Rua2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(Num2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(CEP1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(UF1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(Cidade1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(Bairro1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(Rua1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(Num1)))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jButtonAddProduto)
                    .addComponent(quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonFinalizarVenda))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void consultar() {
        String sql = "select * from tbcliente where idcliente=?";
        try {
            pst = conexao1.prepareStatement(sql);
            pst.setString(1, campo_cpf_compra.getText());
            rs = pst.executeQuery(); // retorno da busca
            if (rs.next()) {
                Nome.setText(rs.getString(2));
                Email.setText(rs.getString(3));
                Tel.setText(rs.getString(4));
                CEP1.setText(rs.getString(6));
                UF1.setText(rs.getString(9));
                Cidade1.setText(rs.getString(8));
                Bairro1.setText(rs.getString(10));
                Rua1.setText(rs.getString(11));
                Num1.setText(rs.getString(12));
                CEP2.setText(rs.getString(13));
                UF2.setText(rs.getString(15));
                Cidade2.setText(rs.getString(14));
                Bairro2.setText(rs.getString(16));
                Rua2.setText(rs.getString(17));
                Num2.setText(rs.getString(18));
                CPF.setText(rs.getString(1));
            } else {
                JOptionPane.showMessageDialog(null, "Usuario nao cadastrado");
                Nome.setText("");
                Email.setText("");
                Tel.setText("");
                CEP1.setText("");
                UF1.setText("");
                Cidade1.setText("");
                Bairro1.setText("");
                Rua1.setText("");
                Num1.setText("");
                CEP2.setText("");
                UF2.setText("");
                Cidade2.setText("");
                Bairro2.setText("");
                Rua2.setText("");
                Num2.setText("");
                CPF.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void retornarUltimaChaveProduto(){
    
            String sql2= "select CHAVE_ from tbcomprados order by CHAVE_ desc limit 1";
                try {
                pst=conexao1.prepareStatement(sql2);
               
                rs = pst.executeQuery();
                if(rs.last()==true){
                UltimaChave= ( Integer.parseInt(rs.getString(1)));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
}
    
//    public void Atualizar(){
//      String sql = "select * from tbproduto";
//        try {
//            pst=conexao1.prepareStatement(sql);
//            rs=pst.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs)); //adicionei o rs2xml.jar nas bibliotecas para alimentar a tabela com os dados do resultset
//            
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    
    
    
    public void alterarEstoque(){
        int estoqueAtualizado;
        int indice = jTable1.getSelectedRow();
        String codigo_produto,valorColuna3;
        
        codigo_produto = java.lang.String.valueOf(jTable1.getValueAt(indice, 0));
        valorColuna3= java.lang.String.valueOf(jTable1.getValueAt(indice, 4));
        estoqueAtualizado= Integer.parseInt(valorColuna3) - Integer.parseInt(quantidade.getText()) ; 
        
        String sql4="UPDATE tbproduto SET estoque_produto=? WHERE cod_produto=?;";
        try {
            pst=conexao1.prepareStatement(sql4);
            pst.setString(1,Integer.toString(estoqueAtualizado));
            pst.setString(2,codigo_produto);
            pst.executeUpdate();
            pst.close();
           
        } catch (Exception e) {
       JOptionPane.showMessageDialog(null, e);
        }
        //Atualizar();
    }
    
    public void adicionarProduto() {
        alterarEstoque();
        if(paradaExecucao==0){
             retornarUltimaChaveProduto();
             last = UltimaChave;
             paradaExecucao=1;
        }
       
        int indice = jTable1.getSelectedRow();
        String descricao, valorUnitario;
        double valorParcial;
        
        valorUnitario = (String) (jTable1.getValueAt(indice, 3));
        valorParcial = (Double.parseDouble(valorUnitario) * Double.parseDouble(quantidade.getText()));
        
        
        total.add(valorParcial);
        descricao = (String) jTable1.getValueAt(indice, 1);
        String sql = "insert into tbcomprados(CPF_,VALORUNITARIO_, QUANTIDADE_, DESCRICAO_,CODVENDA_,VALORPARCIAL_,CHAVE_)"
                + "values(?,?,?,?,?,?,?)";
        try {
            pst = conexao1.prepareStatement(sql);
            pst.setString(1, CPF.getText());
            pst.setString(2, valorUnitario);
            pst.setString(3, quantidade.getText());
            pst.setString(4, descricao);
            UltimaChave++;
            pst.setString(5, Integer.toString(UltimaChave));
            pst.setString(6, Double.toString(valorParcial));
            last++;
            pst.setString(7, Integer.toString(last));
            pst.executeUpdate();
            pst.close();
            UltimaChave--;
            JOptionPane.showMessageDialog(null,"Produto Adicionado");    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void preencherVenda() {
        UltimaChave++;
        int status = 0, verificaErro = 0;
        String sql = "insert into tbvenda(cod_venda, cpf_cliente, data_venda,status_venda, "
                + "valor_total, cep_venda,"
                + "estado_venda,cidade_venda,bairro_venda, rua_venda, numero_venda)"
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
  
   
        try {
            pst = conexao1.prepareStatement(sql);
            pst.setString(1, Integer.toString(UltimaChave));
            pst.setString(2, CPF.getText());
            pst.setInt(3,(Integer.parseInt(data_venda.getText())));
            pst.setString(4, "pendente");
            double vTotal = 0; 
            for(double i: total){
                vTotal+=i;
            }
           
            pst.setString(5,Double.toString(vTotal));

            if (jComboBox1.getSelectedIndex() == 2 && CEP2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Endereço inexistente");
                verificaErro = 1;
            } else if (jComboBox1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um endereço válido");
                verificaErro = 1;
            }

            if (verificaErro == 0) {
                if (jComboBox1.getSelectedIndex() == 1) {
                    pst.setString(6, CEP1.getText());
                    pst.setString(7, UF1.getText());
                    pst.setString(8, Cidade1.getText());
                    pst.setString(9, Bairro1.getText());
                    pst.setString(10, Rua1.getText());
                    pst.setString(11, Num1.getText());
                    status = pst.executeUpdate();
                    pst.close();
                } else if (jComboBox1.getSelectedIndex() == 2) {
                    pst.setString(6, CEP2.getText());
                    pst.setString(7, UF2.getText());
                    pst.setString(8, Cidade2.getText());
                    pst.setString(9, Bairro2.getText());
                    pst.setString(10, Rua2.getText());
                    pst.setString(11, Num2.getText());
                    status = pst.executeUpdate();
                    pst.close();
                }
            }
            if (status > 0) {
                JOptionPane.showMessageDialog(null, "Cadastrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        total.clear();
    }


    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        consultar();


    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarVendaActionPerformed

        preencherVenda();
        dispose();

    }//GEN-LAST:event_jButtonFinalizarVendaActionPerformed

    private void jButtonAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddProdutoActionPerformed
        int indice = jTable1.getSelectedRow();
        String estoque= java.lang.String.valueOf(jTable1.getValueAt(indice, 4));
        if (Nome.getText().isEmpty() || quantidade.getText().isEmpty()
                || data_venda.getText().isEmpty() || jComboBox1.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "Necessário preencher campos obrigatorios, "
                    + "realizar pesquisa e selecionar produto!");

        } else if(Integer.parseInt(estoque) < Integer.parseInt(quantidade.getText())) {
                JOptionPane.showMessageDialog(null, "Estoque insuficiente!");
        } else {
            adicionarProduto();
          

    }//GEN-LAST:event_jButtonAddProdutoActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro1;
    private javax.swing.JLabel Bairro2;
    private javax.swing.JLabel CEP1;
    private javax.swing.JLabel CEP2;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade1;
    private javax.swing.JLabel Cidade2;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Num1;
    private javax.swing.JLabel Num2;
    private javax.swing.JLabel Rua1;
    private javax.swing.JLabel Rua2;
    private javax.swing.JLabel Tel;
    private javax.swing.JLabel UF1;
    private javax.swing.JLabel UF2;
    private javax.swing.JFormattedTextField campo_cpf_compra;
    private javax.swing.JFormattedTextField data_venda;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddProduto;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonFinalizarVenda;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabeNome;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField quantidade;
    private java.util.List<view.Tbproduto> tbprodutoList;
    private java.util.List<view.Tbproduto> tbprodutoList1;
    private java.util.List<view.Tbproduto> tbprodutoList2;
    private javax.persistence.Query tbprodutoQuery;
    private javax.persistence.Query tbprodutoQuery1;
    private javax.persistence.Query tbprodutoQuery2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
