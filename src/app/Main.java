package app;

import entities.Arquivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String caminho;
        String opcao;
        boolean parar = false;
        boolean arquivoExiste = false;
        Scanner sc = new Scanner(System.in);
        Arquivo arq = new Arquivo();

        while(!parar) {
            System.out.print("""
            MENU:
            Caminho atual:\s""" + arq.getCaminho() +
            """
            
            0 - Sair do programa
            1 - Definir caminho
            =>\s""");

            opcao = sc.nextLine();

            switch (opcao) {
                case "0" -> {
                    System.out.println("Saindo do programa... Obrigado por testar!");
                    parar = true;
                }
                case "1" -> {
                    System.out.print("Digite o caminho do arquivo:\n=> ");
                    caminho = sc.nextLine();
                    arquivoExiste = arq.verificarExistencia(caminho);
                    if (arquivoExiste) {
                        System.out.println("O arquivo existe!\nCaminho setado para: " + caminho);
                    } else {
                        System.out.println("O arquivo não existe! Por favor corrija o diretório onde ele se encontra.");
                    }
                }
                case "2" -> {
                    if (!arquivoExiste) {
                        System.out.println("Execute a função '1' primeiro.");
                    } else {
                        // Sendo feito...
                    }
                }
                default -> System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
