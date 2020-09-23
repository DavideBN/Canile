package Canile;

public class Canile {

    private int caniPresenti;
    private Cane [] cani;

    public Canile(int nCani){
        cani = new Cane[nCani];
    }

    public void nuovoCane(String nome,String razza,int eta, char sesso){
        cani[caniPresenti] = new Cane(nome,razza,eta,sesso);
        caniPresenti++;
    }

    public String toString(){
        String ris = "";
        ris = "Cani presenti: " + caniPresenti + "\n";
        ris = ris + "Nome | Razza | Eta | Sesso\n";
        for(int i = 0; i < caniPresenti; i++){
            ris = ris + cani[i].toString();
        }
        return ris;
    }
}
