package view;

import java.sql.*;
import Banco.Conexao;
import Dao.ProdutoDao;
import javax.swing.JOptionPane;
import model.ProdutosDiversos;

public class Produto extends javax.swing.JFrame {

    ProdutoDao proDao = new ProdutoDao();
    ProdutosDiversos prod = new ProdutosDiversos();

    Connection conexao1 = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int UltimaChave = 0;

    public Produto() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        conexao1 = Conexao.conector();
        jLabelCodigo_produto.setEditable(false);
        jLabelCodigo_produto.requestFocus();
        jLabelCaracteristica.setEditable(false);
        retornarUltimaChaveProduto();
        UltimaChave++;
        jLabelCodigo_produto.setText(Integer.toString(UltimaChave));
    }

    public void retornarUltimaChaveProduto() {

        String sql2 = "select cod_produto from tbproduto order by cod_produto desc limit 1";
        try {
            pst = conexao1.prepareStatement(sql2);

            rs = pst.executeQuery();
            if (rs.last() == true) {
                UltimaChave = (Integer.parseInt(rs.getString(1)));

            } else if (rs.last() == false) {
                JOptionPane.showMessageDialog(null, "nao pegou o ultimo");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescricao_produto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelCodigo_produto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValor_produto = new javax.swing.JFormattedTextField();
        jTextFieldEstoque_produto = new javax.swing.JFormattedTextField();
        jLabelCaracteristica = new javax.swing.JTextField();

        setTitle("PRODUTOS");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar Produto");

        jLabel2.setText("Código:");

        jTextFieldDescricao_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricao_produtoActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição: ");

        jLabel5.setText("Categoria:");

        jLabel6.setText("Valor:");

        jLabel7.setText("Estoque:");

        jButtonAlterar.setText("Alterar Cadastro");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Salvar Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelCodigo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelCodigo_produtoActionPerformed(evt);
            }
        });

        jButton2.setText("Listar produtos por nome");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Listar produtos existentes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Remédios", "Perfumaria", "Higiene Pessoal" }));

        jLabel4.setText("Característica Específica:");

        jTextFieldValor_produto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jTextFieldEstoque_produto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabelCaracteristica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLabelCaracteristicaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDescricao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelCaracteristica, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldValor_produto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldValor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelCaracteristica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        new AlterarProduto().setVisible(true);
        
//        prod.setCod_produto(jLabelCodigo_produto.getText());
//        prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
//        if (jComboBoxCategoria.getSelectedIndex() == 0) {
//            JOptionPane.showConfirmDialog(null, "Selecione uma categoria");
//        } else if (jComboBoxCategoria.getSelectedIndex() == 1) {
//            prod.setCategoria_produto("Remédios");
//            jLabelCaracteristica.setText("Genérico");
//        } else if (jComboBoxCategoria.getSelectedIndex() == 2) {
//            prod.setCategoria_produto("Perfumaria");
//            jLabelCaracteristica.setText("Importado");
//        } else if (jComboBoxCategoria.getSelectedIndex() == 3) {
//            prod.setCategoria_produto("Higiene Pessoal");
//            jLabelCaracteristica.setText("Infantil");
//        }
//        prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
//        prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));
//        if (proDao.alterar(prod)) {
//            jLabelCodigo_produto.setText(null);
//            jTextFieldDescricao_produto.setText(null);
//            jComboBoxCategoria.setSelectedItem(" ");
//            jTextFieldEstoque_produto.setText(null);
//            jTextFieldValor_produto.setText(null);
//            jLabelCaracteristica.setText(null);
//            JTconsulta_codigo.requestFocus();
//        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        
        jLabelCodigo_produto.setText(null);
        jTextFieldDescricao_produto.setText(null);
        jComboBoxCategoria.setSelectedItem(" ");
        jTextFieldEstoque_produto.setText(null);
        jTextFieldValor_produto.setText(null);
        jTextFieldEstoque_produto.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        prod.setCod_produto(jLabelCodigo_produto.getText());
        prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
        if (jComboBoxCategoria.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(null, "Selecione uma categoria");
        } else if (jComboBoxCategoria.getSelectedIndex() == 1) {
            prod.setCategoria_produto("Remédios");
            jLabelCaracteristica.setText("Genérico");
        } else if (jComboBoxCategoria.getSelectedIndex() == 2) {
            prod.setCategoria_produto("Perfumaria");
            jLabelCaracteristica.setText("Importado");
        } else if (jComboBoxCategoria.getSelectedIndex() == 3) {
            prod.setCategoria_produto("Higiene Pessoal");
            jLabelCaracteristica.setText("Infantil");
        }
        prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
        prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));
        prod.setCaracteristicaEspecifica(jLabelCaracteristica.getText());

        if (proDao.adicionar(prod)) {
            jLabelCodigo_produto.setText(null);
            jTextFieldDescricao_produto.setText(null);
            jComboBoxCategoria.setSelectedItem(" ");
            jTextFieldEstoque_produto.setText(null);
            jTextFieldValor_produto.setText(null);
            jTextFieldEstoque_produto.setText(null);
        }
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ListarProdutoNome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ListarProdutosExistentes().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldDescricao_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricao_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricao_produtoActionPerformed

    private void jLabelCodigo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelCodigo_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCodigo_produtoActionPerformed

    private void jLabelCaracteristicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLabelCaracteristicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCaracteristicaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLabelCaracteristica;
    private javax.swing.JTextField jLabelCodigo_produto;
    private javax.swing.JTextField jTextFieldDescricao_produto;
    private javax.swing.JFormattedTextField jTextFieldEstoque_produto;
    private javax.swing.JFormattedTextField jTextFieldValor_produto;
    // End of variables declaration//GEN-END:variables
}
