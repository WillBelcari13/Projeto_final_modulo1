package controller;

import java.util.ArrayList;
import java.util.List;

import Repository.LojaRepository;

public class ControllerLoja implements LojaRepository {

    // Listas para armazenar os itens variados e os suplementos
    private List<String> itensVariados = new ArrayList<>();
    private List<String> suplementos = new ArrayList<>();



    @Override
    public void escolherItensVariados(String produto, long tamanho, String marca) {
        // Implementação para escolher itens variados
        System.out.println("Escolhendo itens variados: " + produto + ", " + tamanho + ", " + marca);
        itensVariados.add(produto); // Exemplo de adição à lista de itens variados
    }

    @Override
    public void escolherSuplementos(String nome, long validade, String marca) {
        // Implementação para escolher suplementos
        System.out.println("Escolhendo suplementos: " + nome + ", " + validade + ", " + marca);
        suplementos.add(nome); // Exemplo de adição à lista de suplementos
    }

    @Override
    public void listarItensVariados() {
        // Implementação para listar os itens variados escolhidos
        System.out.println("Listando itens variados escolhidos:");
        for (String item : itensVariados) {
            System.out.println(item);
        }
    }

    @Override
    public void listarSuplementos() {
        // Implementação para listar os suplementos escolhidos
        System.out.println("Listando suplementos escolhidos:");
        for (String suplemento : suplementos) {
            System.out.println(suplemento);
        }
    }

    @Override
    public void CancelarItensVariados(long produto) {
        // Implementação para cancelar itens variados
        System.out.println("Cancelando item variado com id: " + produto);
        // Lógica para remover o item da lista de itens variados
    }

    @Override
    public void CancelarSuplementos(long nome) {
        // Implementação para cancelar suplementos
        System.out.println("Cancelando suplemento com id: " + nome);
        // Lógica para remover o suplemento da lista de suplementos
    }
}