
package view;
import java.sql.*;
import Banco.Conexao;
import javax.swing.JOptionPane;
public class Cliente extends javax.swing.JInternalFrame {
    Connection conexao1=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Cliente
     */
    
    public Cliente() { //construtor para ligação com o bd
        initComponents();
        conexao1=Conexao.conector();
    }

    public void consultar(){
        String sql= "select * from tbcliente where idcliente=?";
        try {
            pst=conexao1.prepareStatement(sql); // le o comando da string
            pst.setString(1,consulta_cpf.getText());//passa pro comando o que digitou no campo
            rs=pst.executeQuery(); // retorno da busca
            if (rs.next()) {
                jTextFieldNome.setText(rs.getString(2));
                jTextFieldEmail.setText(rs.getString(3));
                jTextFieldSenha.setText(rs.getString(5));
                jTextFieldTel.setText(rs.getString(4));
                jTextFieldCep1.setText(rs.getString(6));
                jTextFieldEstado1.setText(rs.getString(9));
                jTextFieldCidade1.setText(rs.getString(8));
                jTextFieldBairro1.setText(rs.getString(10));
                jTextFieldRua1.setText(rs.getString(11));
                jTextFieldNumero1.setText(rs.getString(12));
                jTextFieldCep2.setText(rs.getString(13));
                jTextFieldEstado2.setText(rs.getString(15));
                jTextFieldCidade2.setText(rs.getString(14));
                jTextFieldBairro2.setText(rs.getString(16));
                jTextFieldRua2.setText(rs.getString(17));
                jTextFieldNumero2.setText(rs.getString(18));
                jTextFieldCpf.setText(rs.getString(1));
            } else {
                JOptionPane.showMessageDialog(null,"Usuario nao cadastrado");
                jTextFieldNome.setText(null);
                jTextFieldEmail.setText(null);
                jTextFieldSenha.setText(null);
                jTextFieldTel.setText(null);
                jTextFieldCep1.setText(null);
                jTextFieldEstado1.setText(null);
                jTextFieldCidade1.setText(null);
                jTextFieldBairro1.setText(null);
                jTextFieldRua1.setText(null);
                jTextFieldNumero1.setText(null);
                jTextFieldCep2.setText(null);
                jTextFieldEstado2.setText(null);
                jTextFieldCidade2.setText(null);
                jTextFieldBairro2.setText(null);
                jTextFieldRua2.setText(null);
                jTextFieldNumero2.setText(null);
        
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void adicionar(){
        int i=1;
        String sql= "insert into tbcliente(idcliente, nome_cliente,email_cliente, telefone_cliente, senha_cliente, cpf_cliente, cep_cliente, cidade_cliente, estado_cliente, bairro_cliente, rua_cliente, numero_cliente, cep2_cliente, cidade2_cliente, estado2_cliente, bairro2_cliente, rua2_cliente, numero2_cliente)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst=conexao1.prepareStatement(sql);
            pst.setString(1,jTextFieldCpf.getText());
            pst.setString(2,jTextFieldNome.getText());
            pst.setString(3,jTextFieldEmail.getText());
            pst.setString(4, jTextFieldTel.getText());
            pst.setString(5, jTextFieldSenha.getText());
            pst.setString(6, jTextFieldCpf.getText());
            pst.setString(7, jTextFieldCep1.getText());
            pst.setString(8, jTextFieldCidade1.getText());
            pst.setString(9, jTextFieldEstado1.getText());
            pst.setString(10, jTextFieldBairro1.getText());
            pst.setString(11, jTextFieldRua1.getText());
            pst.setString(12, jTextFieldNumero1.getText());
            pst.setString(13, jTextFieldCep2.getText());
            pst.setString(14, jTextFieldCidade2.getText());
            pst.setString(15, jTextFieldEstado2.getText());
            pst.setString(16, jTextFieldBairro2.getText());
            pst.setString(17, jTextFieldRua2.getText());
            pst.setString(18,jTextFieldNumero2.getText());   
            
            
            
            
            if ((jTextFieldCpf.getText().isEmpty())||(jTextFieldNome.getText().isEmpty())||(jTextFieldEmail.getText().isEmpty() )
                    ||(jTextFieldEstado1.getText().isEmpty())||(jTextFieldTel.getText().isEmpty())||(jTextFieldSenha.getText().isEmpty())||
                    (jTextFieldNumero1.getText().isEmpty())||(jTextFieldRua1.getText().isEmpty())||(jTextFieldBairro1.getText().isEmpty())||
                    (jTextFieldCep1.getText().isEmpty())||(jTextFieldCidade1.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null,"Necessário preencher campos obrigatórios!"); // por * nos campos obrigatorios
            } else {
           
   
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Cliente cadastrado");
                jTextFieldNome.setText(null);
                jTextFieldEmail.setText(null);
                jTextFieldSenha.setText(null);
                jTextFieldTel.setText(null);
                jTextFieldCep1.setText(null);
                jTextFieldEstado1.setText(null);
                jTextFieldCidade1.setText(null);
                jTextFieldBairro1.setText(null);
                jTextFieldRua1.setText(null);
                jTextFieldNumero1.setText(null);
                jTextFieldCep2.setText(null);
                jTextFieldEstado2.setText(null);
                jTextFieldCidade2.setText(null);
                jTextFieldBairro2.setText(null);
                jTextFieldRua2.setText(null);
                jTextFieldNumero2.setText(null);
                jTextFieldCpf.setText("");
            }
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"CPF existente");
    }
    }
    private void alterar(){
        String sql="update tbcliente set nome_cliente=?,email_cliente=?, telefone_cliente=?, senha_cliente=?, cep_cliente=?, cidade_cliente=?, estado_cliente=?, bairro_cliente=?, rua_cliente=?, numero_cliente=?, cep2_cliente=?, cidade2_cliente=?, estado2_cliente=?, bairro2_cliente=?, rua2_cliente=?, numero2_cliente=? where idcliente=?";
        try {
            pst=conexao1.prepareStatement(sql);
            
            pst.setString(1,jTextFieldNome.getText());
            pst.setString(2,jTextFieldEmail.getText());
            pst.setString(3, jTextFieldTel.getText());
            pst.setString(4, jTextFieldSenha.getText());
            pst.setString(5, jTextFieldCep1.getText());
            pst.setString(6, jTextFieldCidade1.getText());
            pst.setString(7, jTextFieldEstado1.getText());
            pst.setString(8, jTextFieldBairro1.getText());
            pst.setString(9, jTextFieldRua1.getText());
            pst.setString(10, jTextFieldNumero1.getText());
            pst.setString(11, jTextFieldCep2.getText());
            pst.setString(12, jTextFieldCidade2.getText());
            pst.setString(13, jTextFieldEstado2.getText());
            pst.setString(14, jTextFieldBairro2.getText());
            pst.setString(15, jTextFieldRua2.getText());
            pst.setString(16,jTextFieldNumero2.getText());  
            pst.setString(17,jTextFieldCpf.getText());
         
            if ((jTextFieldCpf.getText().isEmpty())||(jTextFieldNome.getText().isEmpty())||(jTextFieldEmail.getText().isEmpty() )
                    ||(jTextFieldEstado1.getText().isEmpty())||(jTextFieldTel.getText().isEmpty())||(jTextFieldSenha.getText().isEmpty())||
                    (jTextFieldNumero1.getText().isEmpty())||(jTextFieldRua1.getText().isEmpty())||(jTextFieldBairro1.getText().isEmpty())||
                    (jTextFieldCep1.getText().isEmpty())||(jTextFieldCidade1.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null,"Necessário preencher campos obrigatórios!"); // por * nos campos obrigatorios
            } else {
           
   
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Cliente alterado");
                jTextFieldNome.setText(null);
                jTextFieldEmail.setText(null);
                jTextFieldSenha.setText(null);
                jTextFieldTel.setText(null);
                jTextFieldCep1.setText(null);
                jTextFieldEstado1.setText(null);
                jTextFieldCidade1.setText(null);
                jTextFieldBairro1.setText(null);
                jTextFieldRua1.setText(null);
                jTextFieldNumero1.setText(null);
                jTextFieldCep2.setText(null);
                jTextFieldEstado2.setText(null);
                jTextFieldCidade2.setText(null);
                jTextFieldBairro2.setText(null);
                jTextFieldRua2.setText(null);
                jTextFieldNumero2.setText(null);
                jTextFieldCpf.setText(null);
            }
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    private void remover(){
        int confirmar=JOptionPane.showConfirmDialog(null,"Certeza?","Atenção",JOptionPane.YES_NO_OPTION);
            if(confirmar==JOptionPane.YES_OPTION){
                String sql="delete from tbcliente where idcliente=?";
                try {
                    pst=conexao1.prepareStatement(sql);
                    pst.setString(1,jTextFieldCpf.getText());
                    int apagado=pst.executeUpdate();
                                               
                    if(apagado>0){
                        JOptionPane.showMessageDialog(null,"Cliente Removido");
                    }
                    jTextFieldNome.setText(null);
                    jTextFieldEmail.setText(null);
                    jTextFieldSenha.setText(null);
                    jTextFieldTel.setText(null);
                    jTextFieldCep1.setText(null);
                    jTextFieldEstado1.setText(null);
                    jTextFieldCidade1.setText(null);
                    jTextFieldBairro1.setText(null);
                    jTextFieldRua1.setText(null);
                    jTextFieldNumero1.setText(null);
                    jTextFieldCep2.setText(null);
                    jTextFieldEstado2.setText(null);
                    jTextFieldCidade2.setText(null);
                    jTextFieldBairro2.setText(null);
                    jTextFieldRua2.setText(null);
                    jTextFieldNumero2.setText(null);
                    jTextFieldCpf.setText(null);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
                }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldCep1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldRua2 = new javax.swing.JTextField();
        jTextFieldCep2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextFieldEstado2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldNumero2 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldBairro2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldCidade2 = new javax.swing.JTextField();
        jTextFieldCidade1 = new javax.swing.JTextField();
        jTextFieldBairro1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldNumero1 = new javax.swing.JTextField();
        jTextFieldEstado1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldRua1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        consulta_cpf = new javax.swing.JTextField();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações do Cliente"));

        jLabel2.setText("Nome");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jTextFieldTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelActionPerformed(evt);
            }
        });

        jLabel4.setText("Tel");

        jTextFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenhaActionPerformed(evt);
            }
        });

        jLabel5.setText("Senha");

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

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setText("CPF");

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
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

        jTextFieldCep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCep1ActionPerformed(evt);
            }
        });

        jLabel14.setText("CEP");

        jLabel12.setText("Rua");

        jLabel25.setText("Endereço 2");

        jLabel22.setText("CEP");

        jLabel21.setText("Rua");

        jTextFieldRua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRua2ActionPerformed(evt);
            }
        });

        jTextFieldCep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCep2ActionPerformed(evt);
            }
        });

        jLabel23.setText("Estado");

        jTextFieldEstado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstado2ActionPerformed(evt);
            }
        });

        jLabel20.setText("Nº ");

        jTextFieldNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero2ActionPerformed(evt);
            }
        });

        jLabel24.setText("Bairro");

        jTextFieldBairro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairro2ActionPerformed(evt);
            }
        });

        jLabel19.setText("Cidade");

        jTextFieldCidade2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidade2ActionPerformed(evt);
            }
        });

        jTextFieldCidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCidade1ActionPerformed(evt);
            }
        });

        jTextFieldBairro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBairro1ActionPerformed(evt);
            }
        });

        jLabel18.setText("Cidade");

        jLabel17.setText("Bairro");

        jTextFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumero1ActionPerformed(evt);
            }
        });

        jTextFieldEstado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstado1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Nº ");

        jTextFieldRua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRua1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Estado");

        jLabel1.setText("Endereço 1");

        jButton2.setText("Consultar CPF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        consulta_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta_cpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consulta_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCep1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRua1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCep2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRua2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(119, 119, 119)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consulta_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldBairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldRua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldCidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldCep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextFieldEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jTextFieldBairro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldRua2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldCidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelActionPerformed

    private void jTextFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenhaActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldEmail.setText("");
        jTextFieldSenha.setText("");
        jTextFieldTel.setText("");
        jTextFieldCep1.setText("");
        jTextFieldEstado1.setText("");
        jTextFieldCidade1.setText("");
        jTextFieldBairro1.setText("");
        jTextFieldRua1.setText("");
        jTextFieldNumero1.setText("");
        jTextFieldCep2.setText("");
        jTextFieldEstado2.setText("");
        jTextFieldCidade2.setText("");
        jTextFieldBairro2.setText("");
        jTextFieldRua2.setText("");
        jTextFieldNumero2.setText("");
        jTextFieldCpf.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
         adicionar();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        remover();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldCep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCep1ActionPerformed

    private void jTextFieldRua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRua1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRua1ActionPerformed

    private void jTextFieldEstado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstado1ActionPerformed

    private void jTextFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero1ActionPerformed

    private void jTextFieldBairro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairro1ActionPerformed

    private void jTextFieldCidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidade1ActionPerformed

    private void jTextFieldCidade2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCidade2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCidade2ActionPerformed

    private void jTextFieldNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumero2ActionPerformed

    private void jTextFieldRua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRua2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRua2ActionPerformed

    private void jTextFieldCep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCep2ActionPerformed

    private void jTextFieldEstado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstado2ActionPerformed

    private void jTextFieldBairro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBairro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBairro2ActionPerformed

    private void consulta_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consulta_cpfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //chamando metodo pra consultar
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField consulta_cpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBairro1;
    private javax.swing.JTextField jTextFieldBairro2;
    private javax.swing.JTextField jTextFieldCep1;
    private javax.swing.JTextField jTextFieldCep2;
    private javax.swing.JTextField jTextFieldCidade1;
    private javax.swing.JTextField jTextFieldCidade2;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEstado1;
    private javax.swing.JTextField jTextFieldEstado2;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero1;
    private javax.swing.JTextField jTextFieldNumero2;
    private javax.swing.JTextField jTextFieldRua1;
    private javax.swing.JTextField jTextFieldRua2;
    private javax.swing.JTextField jTextFieldSenha;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
