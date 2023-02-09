package org.example.data;

import org.example.data.targyak.Targy;

import java.util.ArrayList;
import java.util.List;

public abstract class SzekrenyItem {
    protected List<Targy> targyakLista;

    public SzekrenyItem() {
        this.targyakLista = new ArrayList<>();
    }

    public List<Targy> getTargyakLista() {
        return targyakLista;
    }

    public abstract void addToTargyakLista(Targy targy);

    public abstract void removeFromTargyakLista(Targy targy);

}
