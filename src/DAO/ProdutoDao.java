package DAO;

import DTO.CadProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ProdutoDao {
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarProduto(CadProdutoDTO objProdutoDto){
        String sql = "INSERT INTO produto (id_produto, nome_produto,"
                + " marca, idFornecedor, quantidade_produto, "
                + "preco_venda_padrao, tipo_produto)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProdutoDto.getCodProduto());
            pstm.setString(2, objProdutoDto.getNomeProduto());
            pstm.setString(3, objProdutoDto.getMarcaProduto());
            pstm.setString(4, objProdutoDto.getFornecedorProd());
            pstm.setString(5, objProdutoDto.getQuantProd());
            pstm.setString(6, objProdutoDto.getPrecoVenda());
            pstm.setString(7, objProdutoDto.getTipoProduto());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + e);
            
        }
    }
    
}
