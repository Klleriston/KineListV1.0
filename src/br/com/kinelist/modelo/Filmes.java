package br.com.kinelist.modelo;

import br.com.kinelist.calculoRanking.Ranking;

public class Filmes extends Titulos implements Ranking{
    private double bilheteria;

    public void setBilheteria(double bilheteria) {
        this.bilheteria = bilheteria;
    }

    public double getBilheteria() {
        return bilheteria;
    }

    @Override
    public void exibeFicha() {
        System.out.println(" --- Ficha tecnica --- ");
        System.out.println("Nome da obra: " + getName());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Estudio responsavel: " + getStudio());
        System.out.println("Bilheteria: " + getBilheteria());
    }


    public int getRank() {
        return (int)getAvaliacao() / 2;
    }
}
