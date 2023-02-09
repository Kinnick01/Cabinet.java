package org.example.data;

import org.example.data.items.Items;

import java.util.ArrayList;
import java.util.List;

public abstract class CabinetItem {
    protected List<Items> itemList;

    public CabinetItem() {
        this.itemList = new ArrayList<>();
    }

    public List<Items> getItemList() {
        return itemList;
    }

    public abstract void addtoItemList(Items targy);

    public abstract void removeFromTargyakLista(Items targy);

}
