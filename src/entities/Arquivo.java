package entities;

import java.io.File;

public class Arquivo {
    private String caminho;

    public String getCaminho() {
        return caminho;
    }
    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
    public boolean verificarExistencia(String novoCaminho) {
        File arquivo = new File(novoCaminho);
        if (arquivo.exists()) {
            setCaminho(novoCaminho);
        }
        return arquivo.exists();
    }
}