package org.example.logic;

import org.example.data.SzekrenyItem;
import org.example.data.targyak.Anyag;
import org.example.data.targyak.Meret;
import org.example.data.targyak.Targy;

import java.util.ArrayList;
import java.util.List;

public class Szekreny {
    List<SzekrenyItem> szekrenyItems;

    public Szekreny() {
        this.szekrenyItems = new ArrayList<>();
    }

    public List<SzekrenyItem> getSzekrenyItems() {
        return szekrenyItems;
    }

    public void addToSzekreny(SzekrenyItem szekrenyItem){
        szekrenyItems.add(szekrenyItem);
    }

    public List<Targy> countItems(Targy targy){
        List<Targy> result = new ArrayList<>();
        for (SzekrenyItem polc: szekrenyItems) {
            for (Targy item: polc.getTargyakLista()) {
                if(item.equals(targy)){
                    result.add(item);
                }
            }
        }
        return result;
    }
}
