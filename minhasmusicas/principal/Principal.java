package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelo.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelo.Musica;
import br.com.alura.minhasmusicas.modelo.PodCast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("kiss");
        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++){
            minhaMusica.curtir();
        }

        PodCast meuPodCast = new PodCast();
        meuPodCast.setTitulo("BolhaDev");
        meuPodCast.setApresentador("Marcos Mendes");
        for (int i = 0; i < 5000; i++){
            meuPodCast.reproduz();
        }
        for (int i = 0; i < 1000; i++){
            meuPodCast.curtir();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);
    }
}