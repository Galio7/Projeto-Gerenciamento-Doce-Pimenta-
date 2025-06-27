package DTO;

import java.io.Serializable;

public class ItensVendidosDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String tipoProduto;
    private String nomeProduto;
    private String marca;
    private int quantidadeVendida;
    private double precoUnitario;
    private double subtotalVenda;

    public ItensVendidosDTO() {
    }

    public ItensVendidosDTO(String tipoProduto, String nomeProduto, String marca,
                             int quantidadeVendida, double precoUnitario, double subtotalVenda) {
        this.tipoProduto = tipoProduto;
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.quantidadeVendida = quantidadeVendida;
        this.precoUnitario = precoUnitario;
        this.subtotalVenda = subtotalVenda;
    }

    // Getters e Setters
    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotalVenda() {
        return subtotalVenda;
    }

    public void setSubtotalVenda(double subtotalVenda) {
        this.subtotalVenda = subtotalVenda;
    }

    @Override
    public String toString() {
        return "ItensVendidosDTO{" + "tipoProduto='" + tipoProduto + '\'' + ", nomeProduto='" + nomeProduto + '\''
                + ", marca='" + marca + '\'' + ", quantidadeVendida=" + quantidadeVendida
                + ", precoUnitario=" + precoUnitario + ", subtotalVenda=" + subtotalVenda + '}';
    }
}
