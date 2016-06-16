
package view;

import java.sql.*;
import Banco.Conexao;
import Dao.ProdutoDao;
import javax.swing.JOptionPane;
import model.ProdutosDiversos;

public class Produto extends javax.swing.JFrame {
    ProdutoDao proDao = new ProdutoDao();
    ProdutosDiversos prod= new ProdutosDiversos();
    
    
    Connection conexao1=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    public Produto() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        conexao1=Conexao.conector();
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
        jTextFieldEstoque_produto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        JTconsulta_codigo = new javax.swing.JTextField();
        jLabelCodigo_produto = new javax.swing.JTextField();
        jTextFieldValor_produto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabelCaracteristica = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Informações Produto");

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

        jButtonAlterar.setText("Alterar");
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

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar Codigo");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        JTconsulta_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTconsulta_codigoActionPerformed(evt);
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

        jLabelCaracteristica.setText("..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1))
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldDescricao_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelCaracteristica, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValor_produto, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelCodigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(84, 84, 84)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButtonConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTconsulta_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTconsulta_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                    .addComponent(jTextFieldEstoque_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelCaracteristica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        prod.setCod_produto(jLabelCodigo_produto.getText());
        prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
        if (jComboBoxCategoria.getSelectedIndex() == 0) {
                    JOptionPane.showConfirmDialog(null, "Selecione uma categoria");
                } else {
                    if (jComboBoxCategoria.getSelectedIndex() == 1) {
                        prod.setCategoria_produto("Remédios");
                        jLabelCaracteristica.setText("Genérico");
                    } else if (jComboBoxCategoria.getSelectedIndex() == 2) {
                        prod.setCategoria_produto("Perfumaria");
                        jLabelCaracteristica.setText("Importado");
                    } else if (jComboBoxCategoria.getSelectedIndex() == 3) {
                        prod.setCategoria_produto("Higiene Pessoal");
                        jLabelCaracteristica.setText("Infantil");
                    }
                }
        prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
        prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));    
        if(proDao.alterar(prod)){
            jLabelCodigo_produto.setText(null);
            jTextFieldDescricao_produto.setText(null);
            jComboBoxCategoria.setSelectedItem(" ");
            jTextFieldEstoque_produto.setText(null);
            jTextFieldValor_produto.setText(null); 
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jLabelCodigo_produto.setText(null);
        jTextFieldDescricao_produto.setText(null);
        jComboBoxCategoria.setSelectedItem(" ");
        jTextFieldEstoque_produto.setText(null);
        jTextFieldValor_produto.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
                prod.setCod_produto(jLabelCodigo_produto.getText());
                prod.setDescricao_produto(jTextFieldDescricao_produto.getText());
                if (jComboBoxCategoria.getSelectedIndex() == 0) {
                    JOptionPane.showConfirmDialog(null, "Selecione uma categoria");
                } else {
                    if (jComboBoxCategoria.getSelectedIndex() == 1) {
                        prod.setCategoria_produto("Remédios");
                        jLabelCaracteristica.setText("Genérico");
                    } else if (jComboBoxCategoria.getSelectedIndex() == 2) {
                        prod.setCategoria_produto("Perfumaria");
                        jLabelCaracteristica.setText("Importado");
                    } else if (jComboBoxCategoria.getSelectedIndex() == 3) {
                        prod.setCategoria_produto("Higiene Pessoal");
                        jLabelCaracteristica.setText("Ifantil");
                    }
                }
                prod.setEstoque_produto(Integer.parseInt(jTextFieldEstoque_produto.getText()));
                prod.setValor_produto(Double.parseDouble(jTextFieldValor_produto.getText()));
                prod.setCaracteristicaEspecifica(jLabelCaracteristica.getText());
                
        if(proDao.adicionar(prod)){
                jLabelCodigo_produto.setText(null);
                jTextFieldDescricao_produto.setText(null);
                jComboBoxCategoria.setSelectedItem(" ");
                jTextFieldEstoque_produto.setText(null);
                jTextFieldValor_produto.setText(null);
       }
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        String campo_pesquisa = JTconsulta_codigo.getText();
        
        if(proDao.remover(campo_pesquisa)){
            jLabelCodigo_produto.setText(null);
            jTextFieldDescricao_produto.setText(null);
            jComboBoxCategoria.setSelectedItem(" ");
            jTextFieldEstoque_produto.setText(null);
            jTextFieldValor_produto.setText(null);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        //chamando metodo pra consultar
        String pesquisa = JTconsulta_codigo.getText();
        prod=proDao.consultar(pesquisa);
        jLabelCodigo_produto.setText(prod.getCod_produto());
        jTextFieldDescricao_produto.setText(prod.getDescricao_produto());
        jComboBoxCategoria.setSelectedItem(prod.getCategoria_produto());
        jTextFieldValor_produto.setText(Double.toString(prod.getValor_produto()));
        jTextFieldEstoque_produto.setText(Integer.toString(prod.getEstoque_produto()));
        
        
        
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void JTconsulta_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTconsulta_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTconsulta_codigoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new ListarProdutoNome().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ListarProdutosExistentes().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldDescricao_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricao_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricao_produtoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTconsulta_codigo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
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
    private javax.swing.JLabel jLabelCaracteristica;
    private javax.swing.JTextField jLabelCodigo_produto;
    private javax.swing.JTextField jTextFieldDescricao_produto;
    private javax.swing.JTextField jTextFieldEstoque_produto;
    private javax.swing.JTextField jTextFieldValor_produto;
    // End of variables declaration//GEN-END:variables
}
