/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import connection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Medicos;
/**
 *
 * @author johnn
 */
public class DAOMedicos {
    ConexaoBD conex = new ConexaoBD();
    Medicos modMed = new Medicos();
    
    public void Salvar(Medicos modMed) {
    conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome, CRM)values(?, ?)");
            pst.setString(1, modMed.getNome());
            pst.setString(2, modMed.getCRM());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Inserir Dados./n Erro:" +ex);
            Logger.getLogger(DAOMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
        conex.desconecta();
}
    
    public void Editar(Medicos mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE medicos set nome=?, CRM=? WHERE idmedicos=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCRM());
            pst.setInt(3, mod.getIdmedicos());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");
                    } 
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na Alteração dos dados!\nErro:"+ex);
        }
        
        
        conex.desconecta();
        
    }
    
    public Medicos buscaMedico(Medicos mod) {
        conex.conexao();
        conex.execultaSql("select *from medicos where nome like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setIdmedicos(conex.rs.getInt("idmedicos"));
            mod.setNome(conex.rs.getString("nome"));
            mod.setCRM(conex.rs.getString("CRM"));
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados médicos./nErro:" +ex);
        }
        
        conex.desconecta();
        return mod;
        
 
}

}

