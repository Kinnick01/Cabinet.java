package org.example.data.polc;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Targy;

public class NagyPolc extends SzekrenyItem {
    @Override
    public void addToTargyakLista(Targy targy) {
        if(targy.equals(Targy.MUANYAG_MUZLIS_TAL) || targy.equals(Targy.UVEG_MUZLIS_TAL) || targy.equals(Targy.UVEG_TANYER) || targy.equals(Targy.MUANYAG_TANYER)){
            targyakLista.add(targy);
        }
        else {
            System.out.println("Cannot put in nagypolc");
        }
    }

    @Override
    public void removeFromTargyakLista(Targy targy) {
        if(targy.equals(Targy.MUANYAG_MUZLIS_TAL) || targy.equals(Targy.UVEG_MUZLIS_TAL) || targy.equals(Targy.UVEG_TANYER) || targy.equals(Targy.MUANYAG_TANYER)){
            targyakLista.remove(targy);
        }
    }
    // csak muzlis talak es tanyerokat tud
}
