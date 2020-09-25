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

    public boolean togliCane(int posizione){
        if (cani[posizione] != null){
            int i;
            for (i = posizione; i < caniPresenti-1; i++){
                cani[i] = new Cane(cani[i + 1].getNome(),cani[i + 1].getRazza(),cani[i + 1].getEta(),cani[i + 1].getSesso());
            }
            cani[i] = null;
            caniPresenti--;
            return true;
        }else {
            return false;
        }
    }

    public boolean togliCane(String nome){
        for (int i = 0; i < caniPresenti; i++){
            if (cani[i].getNome().equals(nome)){
                togliCane(i);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String ris = "Cani presenti: " + caniPresenti + "\n";
        ris = ris + "Nome | Razza | Eta | Sesso\n";
        for(int i = 0; i < caniPresenti; i++){
            ris = ris + cani[i].toString();
        }
        return ris;
    }
}
