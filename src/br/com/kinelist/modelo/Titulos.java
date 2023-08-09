package br.com.kinelist.modelo;

public class Titulos {
    private String name;
    private int anoDeLancamento;
    private String studio;
    private double avaliacao;

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    
    public String getName() {
        return name;
    }
    
    
    public String getStudio() {
        return studio;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void exibeFicha() {
        System.out.println(" --- Ficha tecnica --- ");
        System.out.println("Nome da obra: " + getName());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Estudio responsavel: " + getStudio());
    }
}
