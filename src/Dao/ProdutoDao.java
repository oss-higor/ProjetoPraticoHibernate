
package Dao;
import java.sql.*;
import Banco.Conexao;
import javax.swing.JOptionPane;
import model.ProdutosDiversos;
import view.Produto;


public class ProdutoDao {  
    Connection conexao1=null; //setando como null as variaveis necessarias para manipulação entre java e banco
    PreparedStatement pst = null; //como fizemos sem o hibernate, essa variavel é responsavel por receber comando para o banco via string como parametro.
    ResultSet rs = null; // essa variavel é responsavel por retornar a CRUD do banco, ou seja as operações que foram indicadas no paramentro da string acima.
    // como nao fizemos totalmente pelo modelo MVC, em toda VIEW essas mesmas variaveis são necessarias para comunicar java:bd
    
     public ProdutoDao() {
     conexao1=Conexao.conector(); // dentro do construtor é estabelecida a conexao atraves do metodo "conector" que esta no pacote "Banco"
     }
    ProdutosDiversos prod =new ProdutosDiversos();
    
   
    public ProdutosDiversos consultar(String codprod){ //metodo para consultas do tipo ProdutosDiversos
        String sql= "select * from tbproduto where cod_produto=?"; // uma String recebendo o comando mySQL para pesquisar na tabela produto por codigo de produto
        try{  
           pst=conexao1.prepareStatement(sql); // le o comando da string
           pst.setString(1,codprod);//passa pro comando o que foi digitado em "codprod"
           rs=pst.executeQuery(); // executa a busca, jogando seu retorno para o ResultSet
        if (rs.next()) {// enquanto houver resultado
                prod.setCod_produto(rs.getString(1)); //é setado para o codigo do produto o retorno da coluna referente ao mesmo no banco
                prod.setDescricao_produto(rs.getString(2)); 
                prod.setCategoria_produto(rs.getString(3));
                prod.setValor_produto(Double.parseDouble(rs.getString(4)));
                prod.setEstoque_produto(Integer.parseInt(rs.getString(5)));
                prod.setCaracteristicaEspecifica(rs.getString(6)); // até essa linha é feito a setagem pelo retorno da pesquisa
                return prod;
                
            } else {
             JOptionPane.showMessageDialog(null,"Produto não cadastrado");
                prod.setCod_produto("");
                prod.setDescricao_produto("");
                prod.setCategoria_produto("");
              //  prod.setValor_produto(Double.parseDouble(""));
               // prod.setEstoque_produto(Integer.parseInt(""));
           
              
            }
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null,"");
        }
        
        return prod;
    } 

    public boolean adicionar(ProdutosDiversos prod){
             String sql= "insert into tbproduto(cod_produto, descricao_produto,categoria_produto,valor_produto,estoque_produto,caracteristica_prod)values(?,?,?,?,?,?)";
        try {
            pst=conexao1.prepareStatement(sql);
            pst.setString(1,prod.getCod_produto());
            pst.setString(2,prod.getDescricao_produto());
            pst.setString(3,prod.getCategoria_produto());
            pst.setString(4,Double.toString(prod.getValor_produto()));
            pst.setString(5,Integer.toString(prod.getEstoque_produto()));
            pst.setString(6, prod.getCaracteristicaEspecifica());
      
            if ((prod.getDescricao_produto().isEmpty())||(prod.getCategoria_produto().isEmpty())||(Double.toString(prod.getValor_produto()).isEmpty() )|| prod.getValor_produto()==0
                    ||(prod.getEstoque_produto()==0)||(Integer.toString(prod.getEstoque_produto())).isEmpty()) {
                JOptionPane.showMessageDialog(null,"Necessário preencher todos os campos!"); 
            } else {
            pst.executeUpdate();    
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Produto adicionado!");
                return true;
               }
           
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Produto adicionado!");
        }
         return false;
    }
    
    public boolean alterar(ProdutosDiversos prod){
        
        String sql="update tbproduto set descricao_produto=?,categoria_produto=?,valor_produto=?,"
                + "estoque_produto=?,caracteristica_prod=? where cod_produto=?";
        try{
            pst=conexao1.prepareStatement(sql);
            pst.setString(1,prod.getDescricao_produto());
            pst.setString(2,prod.getCategoria_produto());
            pst.setString(3,Double.toString(prod.getValor_produto()));
            pst.setString(4,Integer.toString(prod.getEstoque_produto()));
            pst.setString(5, prod.getCaracteristicaEspecifica()); 
            pst.setString(6,prod.getCod_produto());
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Produto Alterado");
                return true;
               }
           
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         return false;
    }
    
    public boolean remover(String codprod){
        int confirmar=JOptionPane.showConfirmDialog(null,"Certeza?","Atenção",JOptionPane.YES_NO_OPTION);
            if(confirmar==JOptionPane.YES_OPTION){
                String sql="delete from tbproduto where cod_produto=?";
                try {
                    pst=conexao1.prepareStatement(sql);
                    pst.setString(1,codprod);
                    int apagado=pst.executeUpdate();
                                               
                    if(apagado>0){
                        JOptionPane.showMessageDialog(null,"Produto Removido");
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null,"Produto não cadastrado");
                        return false;
                    }
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"teste");
                    
                }
                }
            return false;
    }
}
