package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

import java.util.List;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdePaginas;


    public Livro() {
    }

    public Livro(String nome, double preco, int qtde, String autor, String tema, int qtdePaginas) {
        super(nome, preco, qtde);
        this.autor = autor;
        this.tema = tema;
        this.qtdePaginas = qtdePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }


    @Override
    public double calculaImposto() {
        if (getTema().equals("educativo")) {
            System.out.println("Livro educativo não tem imposto: " + this.getNome() + ".");
            return this.getPreco();
        } else {
            double valorImposto = (this.getPreco() * 0.1);
            System.out.println("R$ " + valorImposto + " de imposto sobre o livro " + this.getNome() + ".");
            return valorImposto;
        }
    }


}
