package org.example.data.drawer;

import org.example.data.CabinetItem;
import org.example.data.items.Items;

public class TuppleWareDrawer extends CabinetItem {
    @Override
    public void addtoItemList(Items targy) {
        if(targy.equals(Items.PLASTIC_PLATE) ||targy.equals(Items.PLASTIC_CEREAL_BOWL) || targy.equals(Items.WOODEN_SILVERWARE)){
            itemList.add(targy);
        }
        else {
            System.out.println("Cannot put in mindenes");
        }
    }

    @Override
    public void removeFromTargyakLista(Items targy) {
        if(targy.equals(Items.PLASTIC_PLATE) ||targy.equals(Items.PLASTIC_CEREAL_BOWL) || targy.equals(Items.WOODEN_SILVERWARE)){
            itemList.remove(targy);
        }
    }
}
