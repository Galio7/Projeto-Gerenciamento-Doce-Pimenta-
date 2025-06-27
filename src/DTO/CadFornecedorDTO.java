package DTO;

import java.io.Serializable;

public class CadFornecedorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nomeEmpresa;
    private String nomeFornecedor;
    private String fornecedorProd;
    private String cnpj;
    private String telefone;
    private String nomeEntregador;

    public CadFornecedorDTO() {
    }

    public CadFornecedorDTO(String nomeEmpresa, String nomeFornecedor, String fornecedorProd,
                             String cnpj, String telefone, String nomeEntregador) {
        this.nomeEmpresa = nomeEmpresa;
        this.nomeFornecedor = nomeFornecedor;
        this.fornecedorProd = fornecedorProd;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nomeEntregador = nomeEntregador;
    }
    
    
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

    @Override
    public String toString() {
        return "CadFornecedorDTO{" + "nomeEmpresa='" + nomeEmpresa + '\'' + ", nomeFornecedor='" + nomeFornecedor + '\''
                + ", fornecedorProd='" + fornecedorProd + '\'' + ", cnpj='" + cnpj + '\''
                + ", telefone='" + telefone + '\'' + ", nomeEntregador='" + nomeEntregador + '\'' + '}';
    }


}
