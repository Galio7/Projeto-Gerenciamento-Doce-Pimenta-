package DAO;

import DTO.ItensVendidosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ItensVendidosDAO {
    public void salvar(ItensVendidosDTO dto) throws ClassNotFoundException {
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
    public java.util.List<ItensVendidosDTO> listarTodos() throws ClassNotFoundException {
        String sql = "SELECT tipo_produto, nome_produto, marca, quantidade, preco_unitario, subtotal FROM itens_vendidos";
        Connection conn = new ConexaoDAO().conectaBD();
        java.util.List<ItensVendidosDTO> itens = new java.util.ArrayList<>();
        try (PreparedStatement pstm = conn.prepareStatement(sql); java.sql.ResultSet rs = pstm.executeQuery()) {
            while (rs.next()) {
                ItensVendidosDTO dto = new ItensVendidosDTO();
                dto.setTipoProduto(rs.getString("tipo_produto"));
                dto.setNomeProduto(rs.getString("nome_produto"));
                dto.setMarca(rs.getString("marca"));
                dto.setQuantidadeVendida(rs.getInt("quantidade"));
                dto.setPrecoUnitario(rs.getDouble("preco_unitario"));
                dto.setSubtotalVenda(rs.getDouble("subtotal"));
                itens.add(dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar itens vendidos: " + erro.getMessage());
        }
        return itens;
    }
}
