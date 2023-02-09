package org.example;

import org.example.data.fiok.Evoeszkozos;
import org.example.data.fiok.Mindenes;
import org.example.data.polc.KozepsoPolc;
import org.example.data.polc.NagyPolc;
import org.example.data.polc.PoharasPolc;
import org.example.data.targyak.Targy;
import org.example.logic.Szekreny;

public class Main {
    public static void main(String[] args) {

        Szekreny szekreny = new Szekreny();
        Targy pohar1 = Targy.UVEG_POHAR;
        Targy pohar3 = Targy.UVEG_POHAR;
        Targy pohar2 = Targy.MUANYAG_POHAR;
        Targy tal1 = Targy.UVEG_MUZLIS_TAL;
        Targy tal2 = Targy.MUANYAG_MUZLIS_TAL;
        Targy femEvoeszkoz = Targy.FEM_EVOESZKOZ;
        Targy faEvoeszkoz = Targy.FA_EVOESZKOZ;
        Targy tanyerUveg = Targy.UVEG_TANYER;
        Targy tanyerMuanyag = Targy.MUANYAG_TANYER;
        PoharasPolc poharasPolc = new PoharasPolc();
        NagyPolc nagyPolc = new NagyPolc();
        KozepsoPolc kozepsoPolc = new KozepsoPolc();
        Evoeszkozos evoeszkozos = new Evoeszkozos();
        Mindenes mindenes = new Mindenes();
        poharasPolc.addToTargyakLista(pohar1);
        poharasPolc.addToTargyakLista(pohar2);
        poharasPolc.addToTargyakLista(pohar3);
        nagyPolc.addToTargyakLista(tal1);
        nagyPolc.addToTargyakLista(tal2);
        evoeszkozos.addToTargyakLista(faEvoeszkoz);
        evoeszkozos.addToTargyakLista(femEvoeszkoz);

        szekreny.addToSzekreny(nagyPolc);
        szekreny.addToSzekreny(poharasPolc);
        szekreny.addToSzekreny(evoeszkozos);
        szekreny.addToSzekreny(kozepsoPolc);
        Targy searchItem = pohar1;
        System.out.println("Here's your szekreny " + searchItem + " capacity: ");
        System.out.println(szekreny.countItems(pohar1));


    }
}