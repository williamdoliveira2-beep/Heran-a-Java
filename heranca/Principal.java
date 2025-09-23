package br.com.william.screenmatch.heranca;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro modelo = new ModeloCarro("sivic");
        modelo.precoAno(2000, 3000, 4000);

        modelo.exibir();

    }
}
