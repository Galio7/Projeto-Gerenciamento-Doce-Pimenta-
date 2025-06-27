package DTO;

import java.io.Serializable;

public class CadProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int codProduto;
    private String nomeProduto;
    private String marcaProduto;
    private String fornecedorProd;
    private int quantProd;
    private double precoVenda;
    private String tipoProduto;

    public CadProdutoDTO() {
    }

    public CadProdutoDTO(int codProduto, String nomeProduto, String marcaProduto,
                         String fornecedorProd, int quantProd, double precoVenda,
                         String tipoProduto) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.fornecedorProd = fornecedorProd;
        this.quantProd = quantProd;
        this.precoVenda = precoVenda;
        this.tipoProduto = tipoProduto;
    }
    
    //getter and setter
    
    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getFornecedorProd() {
        return fornecedorProd;
    }

    public void setFornecedorProd(String fornecedorProd) {
        this.fornecedorProd = fornecedorProd;
    }

    public int getQuantProd() {
        return quantProd;
    }

    public void setQuantProd(int quantProd) {
        this.quantProd = quantProd;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "CadProdutoDTO{" + "codProduto=" + codProduto + ", nomeProduto='" + nomeProduto + '\''
                + ", marcaProduto='" + marcaProduto + '\'' + ", fornecedorProd='" + fornecedorProd + '\''
                + ", quantProd=" + quantProd + ", precoVenda=" + precoVenda + ", tipoProduto='" + tipoProduto + '\'' + '}';
    }

}
