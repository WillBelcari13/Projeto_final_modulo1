package model;

public abstract class Loja {
    private long Quantidade;
    private String Suplementos;
    private String Roupas;


    public Loja(String Suplementos, String Roupas, long Quantidade) {
        this.Suplementos = Suplementos;
        this.Roupas = Roupas;
        this.Quantidade = Quantidade;

    }

    public Loja() {

    }

    public String getSuplementos() {return Suplementos;}


    public void setSuplementos(String Suplementos) {
        this.Suplementos = Suplementos;
    }
    public String getRoupas() {return Roupas;}


    public void setRoupas(String Roupas) {
        this.Roupas = Roupas;
    }

    public Long getQuantidade() {return Quantidade;}


    public void setQuantidade(Long Quantidade) {
        this.Quantidade = Quantidade;

    }

    public void visualizarCarrinho() {

    }


}

