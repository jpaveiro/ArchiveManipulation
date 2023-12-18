package app;

import entities.GerenciadorDeArquivos;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao, novoDiretorio;
        boolean parar = false;
        GerenciadorDeArquivos manager = new GerenciadorDeArquivos();

        while (!parar) {
            System.out.print("\nDiretório: " + manager.getDiretorio() + "\n=> ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "0" -> {
                    System.out.println("Saindo do programa... Obrigado por testar!");
                    parar = true;
                }
                case "1" -> {
                    System.out.print("Especifique o caminho do diretório \n=> ");
                    novoDiretorio = scanner.nextLine();
                    manager.validarDiretorio(novoDiretorio);
                }
                case "2" -> {
                    System.out.println(2);
                }
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}