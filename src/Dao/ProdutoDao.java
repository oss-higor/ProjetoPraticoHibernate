
package Dao;
import java.sql.*;
import Banco.Conexao;
import javax.swing.JOptionPane;
import model.ProdutosDiversos;
import view.Produto;
/**
 *
 * @author ADM
 */
public class ProdutoDao {
    Connection conexao1=null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
     public ProdutoDao() {
     conexao1=Conexao.conector();
     }
    ProdutosDiversos prod =new ProdutosDiversos();
    
   
    public ProdutosDiversos consultar(String codprod){
        String sql= "select * from tbproduto where cod_produto=?";
        try{   
           pst=conexao1.prepareStatement(sql); // le o comando da string
           pst.setString(1,codprod);//passa pro comando o que digitou no campo
           rs=pst.executeQuery(); // retorno da busca
        if (rs.next()) {
                prod.setCod_produto(rs.getString(1));
                prod.setDescricao_produto(rs.getString(2));
                prod.setCategoria_produto(rs.getString(3));
                prod.setValor_produto(Double.parseDouble(rs.getString(4)));
                prod.setEstoque_produto(Integer.parseInt(rs.getString(5)));
                return prod;
                
            } else {
                prod.setCod_produto("");
                prod.setDescricao_produto("");
                prod.setCategoria_produto("");
                prod.setValor_produto(Double.parseDouble(""));
                prod.setEstoque_produto(Integer.parseInt(""));
           
              
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Produto nao cadastrado");
        }
        
        return prod;
    } 

    public boolean adicionar(ProdutosDiversos prod){
     
        String sql= "insert into tbproduto(cod_produto, descricao_produto,categoria_produto,valor_produto,estoque_produto)values(?,?,?,?,?)";
        try {
            pst=conexao1.prepareStatement(sql);
            pst.setString(1,prod.getCategoria_produto());
            pst.setString(2,prod.getDescricao_produto());
            pst.setString(3,prod.getCategoria_produto());
            pst.setString(4,Double.toString(prod.getValor_produto()));
            pst.setString(5,Integer.toString(prod.getEstoque_produto()));
            
            if ((prod.getDescricao_produto().isEmpty())||(prod.getCategoria_produto().isEmpty())||(Double.toString(prod.getValor_produto()).isEmpty() )|| prod.getValor_produto()==0
                    ||(prod.getEstoque_produto()==0)||(Integer.toString(prod.getEstoque_produto())).isEmpty()) {
                JOptionPane.showMessageDialog(null,"Necessário preencher todos os campos!"); 
            } else {
            pst.executeUpdate();    
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Produto adicionado");
                return true;
               }
           
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         return false;
    }
    
    public boolean alterar(){
        String sql="update tbproduto set descricao_produto=?,categoria_produto=?,valor_produto=?,estoque_produto=? where cod_produto=?";
        try{
            pst=conexao1.prepareStatement(sql);
            pst.setString(1,prod.getCod_produto());
            pst.setString(2,prod.getDescricao_produto());
            pst.setString(3,prod.getCategoria_produto());
            pst.setString(4,Double.toString(prod.getValor_produto()));
            pst.setString(5,Integer.toString(prod.getEstoque_produto()));
           if ((prod.getDescricao_produto().isEmpty())||(prod.getCategoria_produto().isEmpty())||(Double.toString(prod.getValor_produto()).isEmpty() )|| prod.getValor_produto()==0
                    ||(prod.getEstoque_produto()==0)||(Integer.toString(prod.getEstoque_produto())).isEmpty()) {
                JOptionPane.showMessageDialog(null,"Necessário preencher todos os campos!");
            } else {
           pst.executeUpdate();    
            int status=pst.executeUpdate();
            if(status>0){
                JOptionPane.showMessageDialog(null,"Produto adicionado");
                return true;
               }
           
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
         return false;
    }
}
