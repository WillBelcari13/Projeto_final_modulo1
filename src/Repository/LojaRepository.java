package Repository;

import java.util.List;

public interface LojaRepository {


    public void escolherItensVariados(String Produto, long Tamanho, String Marca);
    public void escolherSuplementos(String nome, long validade, String Marca);
    public void listarItensVariados();
    public void listarSuplementos();
    public void CancelarItensVariados(long Produto);
    public void CancelarSuplementos(long nome);

}
