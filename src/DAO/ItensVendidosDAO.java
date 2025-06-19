package DAO;

import DTO.ItensVendidosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ItensVendidosDAO {
    public void salvar(ItensVendidosDTO dto) {
        String sql = "INSERT INTO itens_vendidos (tipo_produto, nome_produto, marca, quantidade, preco_unitario, subtotal) VALUES (?, ?, ?, ?, ?, ?)";
        Connection conn = new ConexaoDAO().conectaBD();

        try (PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, dto.getTipoProduto());
            pstm.setString(2, dto.getNomeProduto());
            pstm.setString(3, dto.getMarca());
            pstm.setInt(4, dto.getQuantidadeVendida());
            pstm.setDouble(5, dto.getPrecoUnitario());
            pstm.setDouble(6, dto.getSubtotalVenda());

            pstm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + erro.getMessage());
        }
    }
}
