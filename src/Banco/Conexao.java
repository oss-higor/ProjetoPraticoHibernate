/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;
import java.sql.*;
/**
 *
 * @author ADM
 */
public class Conexao {
    //metodo para estabelecer a conexao com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver"; //chama drive importado para as bibliotecas
        String url = "jdbc:mysql://localhost:3306/bancodedados_projetopratico";//o banco criado
        String user= "root";
        String senha="drd21tkh";
        //conexao entre o java e o banco de dados
        try {
            Class.forName(driver);//
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;
        } catch (Exception e) {
            
            return null;
        }
    }
}
