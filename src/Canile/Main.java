package Canile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Benvenuto!\nInserisci il numero di cani presenti: ");

        int cani = in.nextInt();

        Canile canile = new Canile(cani);

        for (int i = 0; i < cani; i++){
            System.out.print("Dammi il nome: ");
            String nome = in.next();
            System.out.print("Dammi la razza: ");
            String razza = in.next();
            System.out.print("Dammi il eta: ");
            int eta = in.nextInt();
            System.out.print("Dammi il sesso: ");
            char sesso = in.next().charAt(0);
            canile.nuovoCane(nome,razza,eta,sesso);
        }

        System.out.println(canile.toString());

        /*System.out.print("Inserisci l'indice del cane che vuoi rimuovere: ");

        int rimuoviCane = in.nextInt();

        canile.togliCane(rimuoviCane);*/

        System.out.print("Inserisci il nome del cane che vuoi adottare: ");

        String rimuoviCane = in.next();

        while (!canile.togliCane(rimuoviCane)){
            System.out.println("Errore! Non esiste un cane con questo nome. \n");
            System.out.print("Inserisci il nome del cane che vuoi adottare: ");
            rimuoviCane = in.nextLine();
        }

        System.out.println("Cane adottato!");

        System.out.println(canile.toString());
    }
}
