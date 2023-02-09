package org.example.data.shelf;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

public class BigShelf extends CabinetItem {
    @Override
    public void addtoItemList(Items targy) {
        if(targy.equals(Items.PLASTIC_CEREAL_BOWL) || targy.equals(Items.GLASS_CEREAL_BOWL) || targy.equals(Items.GLASS_PLATE) || targy.equals(Items.PLASTIC_PLATE)){
            itemList.add(targy);
        }
        else {
            System.out.println("Cannot put in Big Shelf");
        }
    }

    @Override
    public void removeFromTargyakLista(Items targy) {
        if(targy.equals(Items.PLASTIC_CEREAL_BOWL) || targy.equals(Items.GLASS_CEREAL_BOWL) || targy.equals(Items.GLASS_PLATE) || targy.equals(Items.PLASTIC_PLATE)){
            itemList.remove(targy);
        }
    }

}
