package br.com.gft.model;
import br.com.gft.model.Livro;
import java.util.Iterator;
import java.util.List;

public class Loja {

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videogames;
    private double total=0;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videogames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videogames = videogames;
    }


    public void listaLivros(){
        System.out.println("A loja " + this.getNome() + " possui estes livros para a venda:  ");
        Iterator<Livro> it = livros.iterator();
        while (it.hasNext()){
            Livro li = it.next();
            System.out.println("Título: " + li.getNome() + ", preço: " + li.getPreco() + ", quantidade: " + li.getQtde() + " em estoque.");

        }
    }

    public void listaVideogame( ){
        System.out.println("A loja " + this.getNome() + " possui estes video-games para a venda:");
        Iterator<VideoGame> vg = videogames.iterator();
        while (vg.hasNext()){
            VideoGame vid = vg.next();
            System.out.println("Video-Game : " + vid.getModelo() + ", preço: " + vid.getPreco() + ", quantidade: " + vid.getQtde() + " em estoque");

        }
    }



    public double calculaPatrimonio(){
        double total=0;
        Iterator<Livro> ite = livros.iterator();
        while(ite.hasNext()){
            Livro liv= ite.next();
            total += liv.getPreco()*liv.getQtde();
        }
        Iterator<VideoGame> iter = videogames.iterator();
        while (iter.hasNext()){
            VideoGame vide = iter.next();
            total += vide.getPreco()*vide.getQtde();
        }
        System.out.println("O Patrimonio da loja: " + this.getNome() + " é de R$: " + total);
        return total;


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

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideogames() {
        return videogames;
    }

    public void setVideogames(List<VideoGame> videogames) {
        this.videogames = videogames;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
