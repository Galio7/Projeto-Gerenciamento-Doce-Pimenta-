package DAO;

import DTO.CadProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutoDao {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadProdutoDTO> lista = new ArrayList<>();
    
    public void cadastrarProduto(CadProdutoDTO objProdutoDto) throws ClassNotFoundException{
        String sql = "INSERT INTO produto (id_produto, nome_produto,"
                + " marca, idFornecedor, quantidade_produto, "
                + "preco_venda_padrao, tipo_produto)"
                + " values (?, ?, ?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objProdutoDto.getCodProduto());
            pstm.setString(2, objProdutoDto.getNomeProduto());
            pstm.setString(3, objProdutoDto.getMarcaProduto());
            pstm.setString(4, objProdutoDto.getFornecedorProd());
            pstm.setInt(5, objProdutoDto.getQuantProd());
            pstm.setDouble(6, objProdutoDto.getPrecoVenda());
            pstm.setString(7, objProdutoDto.getTipoProduto());
            
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + e);
            
        }
    }
    
    //utilizado no frame de estoque
    public ArrayList<CadProdutoDTO> PesquisarProduto() throws ClassNotFoundException{
            
        String sql = "select * from produto";
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                CadProdutoDTO objProdutoDTO = new CadProdutoDTO();
                objProdutoDTO.setCodProduto(rs.getInt("id_produto"));
                objProdutoDTO.setNomeProduto(rs.getString("nome_produto"));
                objProdutoDTO.setMarcaProduto(rs.getString("marca"));
                objProdutoDTO.setFornecedorProd(rs.getString("id_fornecedor"));
                objProdutoDTO.setQuantProd(rs.getInt("quantidade_produto"));
                objProdutoDTO.setPrecoVenda(rs.getDouble("preco_venda_padrao"));
                objProdutoDTO.setTipoProduto(rs.getString("tipo_produto"));
   
                lista.add(objProdutoDTO);
                
            }
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadProdutoDAO Pesquisar: " + erro);
        }
        
        return lista;
    }
    
}
