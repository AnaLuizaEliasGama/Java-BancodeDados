/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Senai
 */
public class Fornecedor {
    private String id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String produto;
    private String[] colunas = new String[]{"ID", "NOME", "CNPJ", "TELEFONE", "PRODUTO"};

    public Fornecedor() {
    }
    
    public Fornecedor(String id, String nome, String cnpj, String telefone, String produto){
        this.id =id;
        this.nome =  nome;
        this.cnpj = cnpj;
        this.telefone =  telefone; 
        this.produto = produto;
    }

    public Fornecedor(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    
        
    }
