
package view;
import Banco.Conexao;
import java.sql.*;
import javax.swing.JOptionPane;

public class StatusVenda extends javax.swing.JFrame {
    Connection conexao1 = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public StatusVenda() {
       conexao1 = Conexao.conector();
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bancodedados_projetopratico?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        tbvendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbvenda t");
        tbvendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbvendaQuery.getResultList();
        tbvendaQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbvenda t");
        tbvendaList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbvendaQuery1.getResultList();
        tbvendaQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT t FROM Tbvenda t");
        tbvendaList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : tbvendaQuery2.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendas = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Vendas");

        jLabel3.setText("Novo Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pendente", "Embalado", "Em Transporte", "Entregue" }));

        jButton1.setText("Confirmar Alteração");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Selecione a venda para alteração de Status");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tbvendaList2, jTableVendas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codVenda}"));
        columnBinding.setColumnName("Cod Venda");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVenda}"));
        columnBinding.setColumnName("Data Venda");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpfCliente}"));
        columnBinding.setColumnName("Cpf Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorTotal}"));
        columnBinding.setColumnName("Valor Total");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${statusVenda}"));
        columnBinding.setColumnName("Status Venda");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTableVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void pesquisa(){
        int status=0;
    int indice = jTableVendas.getSelectedRow();  
    String sql ="update tbvenda set status_venda=? where cod_venda=?"; 
   
    try {
           pst = conexao1.prepareStatement(sql);
           pst.setString(2, (String) jTableVendas.getValueAt(indice,0));
           
           if(jComboBoxStatus.getSelectedIndex()==0){
              JOptionPane.showMessageDialog(null, "Selecione um status");  
           }else{
               if(jComboBoxStatus.getSelectedIndex()==1){
                    pst.setString(1, "Pendente");
                     jTableVendas.setValueAt("Pendente",indice,4);
                    status = pst.executeUpdate();
               }else if(jComboBoxStatus.getSelectedIndex()==2){
                    pst.setString(1, "Embalado");
                    jTableVendas.setValueAt("Embalado",indice,4);
                     status = pst.executeUpdate();
               }else if(jComboBoxStatus.getSelectedIndex()==3){
                    pst.setString(1, "Em Transporte");
                      jTableVendas.setValueAt("Em Transporte",indice,4);
                    status = pst.executeUpdate();
               }else if(jComboBoxStatus.getSelectedIndex()==4){
                    pst.setString(1, "Entregue");
                      jTableVendas.setValueAt("Entregue",indice,4);
                   status = pst.executeUpdate();
               }
           }
            if (status > 0) {
                JOptionPane.showMessageDialog(null, "Status Alterado");
            }
          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    }
            
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       pesquisa();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVendas;
    private java.util.List<view.Tbvenda> tbvendaList;
    private java.util.List<view.Tbvenda> tbvendaList1;
    private java.util.List<view.Tbvenda> tbvendaList2;
    private javax.persistence.Query tbvendaQuery;
    private javax.persistence.Query tbvendaQuery1;
    private javax.persistence.Query tbvendaQuery2;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
