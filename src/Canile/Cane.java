package Canile;

public class Cane {

    private String nome;
    private String razza;
    private int eta;
    private char sesso;

    public Cane(String nome, String razza, int eta, char sesso) {
        this.nome = nome;
        this.razza = razza;
        this.eta = eta;
        this.sesso = sesso;
    }

    public String getNome(){
        return nome;
    }

    public String getRazza(){
        return razza;
    }

    public int getEta(){
        return eta;
    }

    public char getSesso(){
        return sesso;
    }

    public String toString(){
        return this.getNome() + " " + this.getRazza() + " " + this.getEta() + " " + this.getSesso() + "\n";
    }
}
