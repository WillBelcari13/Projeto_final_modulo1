package model;

public class Suplementos extends Loja {

    private String Nome;
    private String Marca;
    private Long Validade;


    public Suplementos(String Suplementos, String Roupas, long Quantidade, String nome, String marca, Long validade) {
        super(Suplementos, Roupas, Quantidade);
        Nome = nome;
        Marca = marca;
        Validade = validade;
    }

    public Suplementos() {

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Long getValidade() {
        return Validade;
    }

    public void setValidade(Long validade) {
        Validade = validade;
    }

    @Override
    public String toString() {
        return "Suplementos{" +
                "Nome='" + Nome + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Validade=" + Validade +
                '}';
    }
}

