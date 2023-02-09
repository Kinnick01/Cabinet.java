package org.example.data.polc;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Targy;

public class KozepsoPolc extends SzekrenyItem {
    @Override
    public void addToTargyakLista(Targy targy) {
        if(!(targy.equals(Targy.FA_EVOESZKOZ) || targy.equals(Targy.FEM_EVOESZKOZ))){
            targyakLista.add(targy);
        }
        else {
            System.out.println("Cannot put in kozepsopolc");
        }
    }

    @Override
    public void removeFromTargyakLista(Targy targy) {
        if(!(targy.equals(Targy.FA_EVOESZKOZ) || targy.equals(Targy.FEM_EVOESZKOZ))){
            targyakLista.remove(targy);
        }
    }
    // mindent csak evoeszkozt nem

}
