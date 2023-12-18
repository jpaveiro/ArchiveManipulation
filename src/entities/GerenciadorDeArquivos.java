package entities;

import java.io.File;

public class GerenciadorDeArquivos {

    private String diretorio;

    public String getDiretorio() { return diretorio; }

    public void validarDiretorio(String diretorio) {
        File arquivo = new File(diretorio);

        if(arquivo.isDirectory() && arquivo.exists()) {
            System.out.println("Diretório válido. Alterado com sucesso!");
            this.diretorio = diretorio;
        } else {
            System.out.println("Diretório inválido. Erro ao alterar!");
        }
    }
}
