package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public Connection conectaBD(){
        Connection conexao= null;
        
        try {
            String url= "jdbc:mysql://localhost:3306/BD_Loja_Doce_Pimenta?user=root&password=Nique@22";
            conexao= DriverManager.getConnection(url);
                    
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conexao;
    }
}