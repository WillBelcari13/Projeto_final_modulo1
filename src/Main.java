import Repository.LojaRepository;
import controller.ControllerLoja;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nomeItem, marcaItem, nomeSuplemento, marcaSuplemento;
        Long validadeSuplemento, codigoItem, codigoSuplemento;
        Scanner leia = new Scanner(System.in);
        ControllerLoja controller = new ControllerLoja(); // Instanciando o controller

        int opcao;

        while (true) {

            System.out.println("+           Seja bem vindo a Suplementos Marombinhas!!      +");
            System.out.println("+               Selecione uma das opções abaixo:            +");
            System.out.println("+ 1. Cadastrar um item                                      +");
            System.out.println("+ 2. Exibir os produtos do nosso portifolio                 +");
            System.out.println("+ 3. Buscar por codigo do item                              +");
            System.out.println("+ 4. Informar a quantidade de produtos                      +");
            System.out.println("+ 5. Excluir um item                                        +");
            System.out.println("+ 6. Deletar um item                                        +");
            System.out.println("+ 7. Sair                                                   +");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite valores inteiros! ");
                leia.nextLine();
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    leia.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite o nome, tamanho e marca do item variado:");
                    nomeItem = leia.nextLine();
                    long tamanhoItem = leia.nextLong();
                    leia.nextLine(); // Limpar o buffer do scanner
                    marcaItem = leia.nextLine();
                    controller.escolherItensVariados(nomeItem, tamanhoItem, marcaItem);
                    break;
                case 2:
                    leia.nextLine(); // Limpar o buffer do scanner
                    System.out.println("Digite o nome, validade e marca do suplemento:");
                    nomeSuplemento = leia.nextLine();
                    validadeSuplemento = leia.nextLong();
                    leia.nextLine(); // Limpar o buffer do scanner
                    marcaSuplemento = leia.nextLine();
                    controller.escolherSuplementos(nomeSuplemento, validadeSuplemento, marcaSuplemento);
                    break;
                case 3:
                    controller.listarItensVariados();
                    break;
                case 4:
                    controller.listarSuplementos();
                    break;
                case 5:
                    System.out.println("Digite o código do item variado para cancelar:");
                    codigoItem = leia.nextLong();
                    controller.CancelarItensVariados(codigoItem);
                    break;
                case 6:
                    System.out.println("Digite o código do suplemento para cancelar:");
                    codigoSuplemento = leia.nextLong();
                    controller.CancelarSuplementos(codigoSuplemento);
                    break;
                case 7:
                    System.out.println("Saindo do sistema. Até mais!");
                    leia.close();
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}