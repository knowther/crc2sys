/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author johnn
 */
public class ConexaoBD {
    public  Statement stm;
    public  ResultSet rs;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String caminho = "jdbc:mysql://localhost:3306/dbclinica?useTimezone=true&serverTimezone=UTC";
    private String usuario = "root";
    private String senha = "JohnnyWesley123";
    public Connection con;
    
    public void conexao () {
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão Efeturada com Sucesso!!");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar ao Banco de Dados:\n"+ex.getMessage());
        }
    }
        public void execultaSql (String sql) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro execultaSql:\n"+ex.getMessage());
        }
        }
        
        
    public void desconecta (){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com Sucesso:");
        } catch (SQLException ex) {
           //JOptionPane.showMessageDialog(null, "Erro ao Fechar Conexão com Banco de Dados:\n"+ex.getMessage());
        }
    }
}
