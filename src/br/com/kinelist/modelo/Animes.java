package br.com.kinelist.modelo;

import br.com.kinelist.calculoRanking.Ranking;

public class Animes extends Titulos implements Ranking {
    private int numeroDeEpisodios;

    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }

    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }

    @Override
    public void exibeFicha() {
        System.out.println(" --- Ficha tecnica --- ");
        System.out.println("Nome da obra: " + getName());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());            
        System.out.println("Estudio responsavel: " + getStudio());
        System.out.println("Numero de episodios: " + getNumeroDeEpisodios());
    }

    public int getRank() {
        if (getNumeroDeEpisodios() > 12) {
            return 4;
        } else {
            return 2;
        }
    }
}
