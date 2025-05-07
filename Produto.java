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
public class Produto {
    private String id;
    private String descricao;
    private String precoCusto;
    private String precoVenda; 
    private String[] colunas = new String[]{"ID", "DESCRICAO", "PRECOCUSTO", "PRECOVENDA"};

    public Produto() {
    }
    public Produto(String id, String descricao, String precoCusto, String precoVenda)
    {
        this. id =id;
        this.descricao = descricao;
        this.precoCusto =  precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
           
    }
    

