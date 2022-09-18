package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtde, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtde);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        double imposto =0;
        String usado = null;
       if(this.isUsado){
           usado = "usado";
       }else{
           usado = "";
       }
        if(this.isUsado){
            imposto = (this.getPreco()*0.25);
            System.out.println("Imposto " + this.getNome()+ " " + this.getModelo() + " " + " " + usado + " R$ " + imposto + ".");

        }else{
            imposto = (this.getPreco()*0.45);
            System.out.println("Imposto " + this.getNome()+ " " + this.getModelo() + " " + " " + usado + " R$ " + imposto + ".");

        }
    return imposto;

}}
