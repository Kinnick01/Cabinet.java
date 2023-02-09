package org.example.data.shelf;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

public class MiddleShelf extends CabinetItem {
    @Override
    public void addtoItemList(Items targy) {
        if(!(targy.equals(Items.WOODEN_SILVERWARE) || targy.equals(Items.METAL_SILVERWARE))){
            itemList.add(targy);
        }
        else {
            System.out.println("Cannot put in middle shelf");
        }
    }

    @Override
    public void removeFromTargyakLista(Items targy) {
        if(!(targy.equals(Items.WOODEN_SILVERWARE) || targy.equals(Items.METAL_SILVERWARE))){
            itemList.remove(targy);
        }
    }
    // mindent csak evoeszkozt nem

}
