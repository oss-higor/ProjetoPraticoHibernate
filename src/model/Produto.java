/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADM
 */
public class Produto {
    private String cod_produto;
    private String descricao_produto;
    private String categoria_produto;
    private double valor_produto;
    private int estoque_produto;
    private String consulta_codigo;

    public String getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(String cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public String getCategoria_produto() {
        return categoria_produto;
    }

    public void setCategoria_produto(String categoria_produto) {
        this.categoria_produto = categoria_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public int getEstoque_produto() {
        return estoque_produto;
    }

    public void setEstoque_produto(int estoque_produto) {
        this.estoque_produto = estoque_produto;
    }

    public String getConsulta_codigo() {
        return consulta_codigo;
    }

    public void setConsulta_codigo(String consulta_codigo) {
        this.consulta_codigo = consulta_codigo;
    }
    
}
