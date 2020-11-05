/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
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
public class ControllerMedicos {
    ConnectionFactory conex = new ConnectionFactory();
    Medicos modMed = new Medicos();
    
    public void Salvar(Medicos modMed) {
    ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medicos(nome, CRM)values(?, ?");
            pst.setString(1, modMed.getNome());
            pst.setString(2, modMed.getCRM());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao Inserir Dados./nErro" +ex);
            Logger.getLogger(ControllerMedicos.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}


