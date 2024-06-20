package model;

public class ItensVariados extends Loja {
    private String Produto;
    private String Marca;
    private Long Tamanho;


    public ItensVariados(String Suplementos, String Roupas, long Quantidade, String produto, String marca, Long tamanho) {
        super(Suplementos, Roupas, Quantidade);
        Produto = produto;
        Marca = marca;
        Tamanho = tamanho;
    }

    public ItensVariados() {

    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Long getTamanho() {
        return Tamanho;
    }

    public void setTamanho(Long tamanho) {
        Tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "ItensVariados{" +
                "Produto='" + Produto + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Tamanho=" + Tamanho +
                '}';
    }
}
