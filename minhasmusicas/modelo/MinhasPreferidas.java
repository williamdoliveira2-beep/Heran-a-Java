package br.com.alura.minhasmusicas.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto");
        }
        else {
            System.out.println(audio.getTitulo() + " tambem é um dos que todos estão curtindo");
        }
    }
}
