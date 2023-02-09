package org.example.data.polc;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Targy;

public class PoharasPolc extends SzekrenyItem {

    @Override
    public void addToTargyakLista(Targy targy){
        if(targy.equals(Targy.MUANYAG_POHAR) || targy.equals(Targy.UVEG_POHAR)){
            targyakLista.add(targy);
        }
        else {
            System.out.println("Cannot put in poharas");
        }
    }

    @Override
    public void removeFromTargyakLista(Targy targy) {
        if(targy.equals(Targy.MUANYAG_POHAR) || targy.equals(Targy.UVEG_POHAR)){
            targyakLista.remove(targy);
        }
    }
}
