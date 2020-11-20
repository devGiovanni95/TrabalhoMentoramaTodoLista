
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();

        System.out.println("Bem vindo ao sistema de TodoList");

        List<String> categoria = new ArrayList<String>();

        boolean continua = true;
        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();/*
             * foi retirada de cima de categoria.add pois ela esta morrendo
             * apos ser utilizada
             */

            switch (valorDecisao) {
                case "1": {
                    System.out.println("Digite o nome da categoria sem espaços ");
                    Scanner scanNomeCategoria = new Scanner(System.in);
                    String nomeCategoria = scanNomeCategoria.next();

                    categoria.add(nomeCategoria);
                    break;
                }

                case "2": {
                    for (String nome : categoria) {
                        System.out.println("Nome da categoria: " + nome);
                    }
                    break;
                }

                case "0": {
                    System.exit(0);
                }
                default: {
                    System.out.println("Opção invalida!!");
                    break;
                }
                case "3": {
                    System.out.println(categoria);
                    System.out.println("Qual Categoria voce deseja remover ? ");
                    System.out.println("Digite o nome da categoria desejada ");
  /*                  System.out.println(
                            "Lembrando que a primeira posição equivale sempre a 0, coleque a posição em numero:");
*/
                    Scanner remover = new Scanner(System.in);
                    String
                            remove = remover.next();

                    categoria.remove(remove);

                }
            }
        }
    }
}
