package org.example.data.shelf;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

public class CupShelf extends CabinetItem {

    @Override
    public void addtoItemList(Items targy){
        if(targy.equals(Items.PLASTIC_CUP) || targy.equals(Items.GLASS_CUP)){
            itemList.add(targy);
        }
        else {
            System.out.println("Cannot put in Cup Shelf");
        }
    }

    @Override
    public void removeFromTargyakLista(Items targy) {
        if(targy.equals(Items.PLASTIC_CUP) || targy.equals(Items.GLASS_CUP)){
            itemList.remove(targy);
        }
    }
}
