
package Banco;
import java.sql.*;


public class Conexao {
    //metodo para estabelecer a conexao com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null; // iniciar a variavel que estabelecera a conexao 
        String driver = "com.mysql.jdbc.Driver"; //chama drive adicionado JDBC.jar
        String url = "jdbc:mysql://localhost:3306/bancodedados_projetopratico";//o endereçamento do bd na maquina local
        String user= "root"; // usuario de acesso ao banco
        String senha="drd21tkh"; // senha de acesso ao banco
        //conexao entre o java e o banco de dados
        try {
            Class.forName(driver);//selecao do drive
            conexao = DriverManager.getConnection(url, user, senha);//parametros para estabelecer a conexao
            return conexao;//se a conexao for estabelecida é retornada
        } catch (Exception e) { //se nao foi possivel estabelecer a conexao, é retornado null
            
            return null;
        }
    }
}
