package com.example;

public class Product {
    private String raca;
    private double valor;
    private int quantidade;
    public Product(final String raca, final double valor, final int quantidade) {
        this.raca = raca;
        this.valor = valor;
        this.quantidade = quantidade;

    }
/**
 * @param raca the raca to set
 */
public void setRaca(String raca) {
    this.raca = raca;
}
/**
 * @return the raca
 */
public String getRaca() {
    return raca;
}
    public double getValor() {
        return this.valor;
    }

    public void setValor(final double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(final int quantidade) {
        this.quantidade = quantidade;
    }
}