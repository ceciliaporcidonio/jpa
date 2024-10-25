package com.seu_projeto;

import javax.persistence.*;

@Entity
@Table(name = "produtos") // Define o nome da tabela no banco de dados
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID auto-incrementado
    private Long id;

    @Column(nullable = false) // Nome do produto, obrigatório
    private String nome;

    @Column(nullable = false)
    private double preco;

    @Column(nullable = false)
    private int estoque;

    // Construtores
    public Produto() {}

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
