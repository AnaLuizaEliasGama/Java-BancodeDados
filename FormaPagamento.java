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
public class FormaPagamento {
    private String id;
    private String formaPagamento;
    private String valorTotal;
    private String itens;
    private String[] colunas = new String []{"ID","FORMAPAGAMENTO", "VALORTOTAL", "ITENS"};

    public FormaPagamento() {
    }
    
    public FormaPagamento(String id, String formaPagamento, String valorTotal, string Itens){
        this.id = id;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        this.itens = itens;
        
        
        
    }

    public FormaPagamento(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
}