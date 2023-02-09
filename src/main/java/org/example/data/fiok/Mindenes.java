package org.example.data.fiok;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Targy;

public class Mindenes extends SzekrenyItem {
    @Override
    public void addToTargyakLista(Targy targy) {
        if(targy.equals(Targy.MUANYAG_TANYER) ||targy.equals(Targy.MUANYAG_MUZLIS_TAL) || targy.equals(Targy.FA_EVOESZKOZ)){
            targyakLista.add(targy);
        }
        else {
            System.out.println("Cannot put in mindenes");
        }
    }

    @Override
    public void removeFromTargyakLista(Targy targy) {
        if(targy.equals(Targy.MUANYAG_TANYER) ||targy.equals(Targy.MUANYAG_MUZLIS_TAL) || targy.equals(Targy.FA_EVOESZKOZ)){
            targyakLista.remove(targy);
        }
    }
}
