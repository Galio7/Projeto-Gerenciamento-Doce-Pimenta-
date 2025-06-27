package DTO;

public class CadFornecedorDTO {
    
    private String nomeEmpresa;
    private String nomeFornecedor;
    private String fornecedorProd;
    private String cnpj;
    private String telefone;
    private String nomeEntregador;
    
    
    //getter and setter

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getFornecedorProd() {
        return fornecedorProd;
    }

    public void setFornecedorProd(String fornecedorProd) {
        this.fornecedorProd = fornecedorProd;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }
    
    
}
