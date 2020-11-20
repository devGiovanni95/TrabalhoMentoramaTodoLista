
import java.util.Scanner;

public class Menu {
    /*    metodos */
    public void imprimeMenu() {
        System.out.println("Digite o numero do que deseja fazer");

        System.out.println("1) Adicionar categoria ");
        System.out.println("2) Listar todas as categorias ");
        System.out.println("0) Sair do programa ");
        System.out.println("3) Remover uma categoria");
    }

    public String decisaoUsuario() {
        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();

        return valorDecisao;
    }
}