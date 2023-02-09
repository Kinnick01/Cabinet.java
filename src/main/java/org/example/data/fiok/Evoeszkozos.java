package org.example.data.fiok;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Targy;

public class Evoeszkozos extends SzekrenyItem {
    @Override
    public void addToTargyakLista(Targy targy) {
        if(targy.equals(Targy.FA_EVOESZKOZ) || targy.equals(Targy.FEM_EVOESZKOZ)){
            targyakLista.add(targy);
        }
        else {
            System.out.println("Cannot put in evoeszkoz");
        }
    }

    @Override
    public void removeFromTargyakLista(Targy targy) {
        if(targy.equals(Targy.FA_EVOESZKOZ) || targy.equals(Targy.FEM_EVOESZKOZ)){
            targyakLista.remove(targy);
        }
    }
}
