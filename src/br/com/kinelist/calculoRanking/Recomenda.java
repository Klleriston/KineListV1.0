package br.com.kinelist.calculoRanking;

public class Recomenda {
    public void filtro(Ranking rank) {
        if(rank.getRank() >= 4) {
            System.out.println("Essa com toda certeza e uma boa escolha, voce vai se divertir muito !");
        } else if (rank.getRank() >=2) {
            System.out.println("Muito bem avaliado, um dos queridinhos da temporada");
        } else {
            System.out.println("Talvez voce possa gostar, da uma chancezinha ai vai");
        } 
    }
}
